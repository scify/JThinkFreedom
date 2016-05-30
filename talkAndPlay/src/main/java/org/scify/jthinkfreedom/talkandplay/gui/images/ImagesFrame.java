package org.scify.jthinkfreedom.talkandplay.gui.images;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import org.scify.jthinkfreedom.talkandplay.gui.helpers.GuiHelper;
import org.scify.jthinkfreedom.talkandplay.models.Category;
import org.scify.jthinkfreedom.talkandplay.models.Tile;
import org.scify.jthinkfreedom.talkandplay.models.User;

/**
 *
 * @author christina
 */
public class ImagesFrame extends javax.swing.JFrame {

    private User user;
    private GuiHelper guiHelper;
    private int currentPanel;
    int selected;
    protected ArrayList<JPanel> panelList;

    protected final int BORDER_SIZE = 5;
    protected final int IMAGE_PADDING = 10;

    /**
     * Creates new form ImagesFrame
     */
    public ImagesFrame() {
        initComponents();
    }

    public ImagesFrame(User user) throws IOException {
        this.user = user;
        this.guiHelper = guiHelper;
        this.panelList = new ArrayList<>();
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        imagesPanel.setBackground(new java.awt.Color(255, 255, 255));
        imagesPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imagesPanelLayout = new javax.swing.GroupLayout(imagesPanel);
        imagesPanel.setLayout(imagesPanelLayout);
        imagesPanelLayout.setHorizontalGroup(
            imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagesPanelLayout.setVerticalGroup(
            imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/tp_logo_small.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 984, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(imagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initCustomComponents() throws IOException {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        drawImages(user.getCategories().get(0), true);
    }

    /**
     * Draw the subcategories or images for the current selected category
     *
     * @param category
     * @param isRootPanel
     * @throws IOException
     */
    private void drawImages(Category category, boolean isRootPanel) throws IOException {
        imagesPanel.removeAll();
        panelList = new ArrayList<>();

        GridLayout gridLayout = new GridLayout(category.getRows(), category.getColumns(), IMAGE_PADDING, IMAGE_PADDING);
        imagesPanel.setLayout(gridLayout);

        if (category.getParentCategory() == null && isRootPanel) {
            JPanel imagePanel = createCategoryItem(category);
            imagePanel.setBackground(Color.white);
            imagesPanel.add(imagePanel);
        } else if (category.getSubCategories().size() > 0) {

            for (Category cat : category.getSubCategories()) {
                JPanel imagePanel = createCategoryItem(cat);
                imagesPanel.add(imagePanel);
            }
            imagesPanel.add(createBackItem(category));
        } else if (category.getTiles().size() > 0) {

            for (Tile tile : category.getTiles()) {
                JPanel imagePanel = createTileItem(tile);
                imagesPanel.add(imagePanel);
            }
            imagesPanel.add(createBackItem(category));
        } else {
            imagesPanel.add(createBackItem(category));
        }
        imagesPanel.revalidate();
        imagesPanel.repaint();

        setTimer();
    }

    private void setTimer() {
        selected = 0;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("selected " + selected + " size " + panelList.size());

                if (selected == 0) {
                    panelList.get(panelList.size() - 1).setBorder(null);
                    panelList.get(selected).setBorder(BorderFactory.createLineBorder(Color.BLUE, BORDER_SIZE));
                    selected++;
                } else if (selected == panelList.size() - 1) {
                    panelList.get(selected - 1).setBorder(null);
                    panelList.get(selected).setBorder(BorderFactory.createLineBorder(Color.BLUE, BORDER_SIZE));
                    selected = 0;
                } else if (selected < panelList.size() - 1 && selected > 0) {
                    panelList.get(selected - 1).setBorder(null);
                    panelList.get(selected).setBorder(BorderFactory.createLineBorder(Color.BLUE, BORDER_SIZE));
                    selected++;
                }
            }
        }, user.getRotationSpeed() * 1000, user.getRotationSpeed() * 1000);
    }

    /**
     * Create the JPanel that holds a category
     *
     * @param category
     * @return
     * @throws IOException
     */
    private JPanel createCategoryItem(final Category category) throws IOException {
        JPanel panel = createImagePanel(category.getImage(), category.getName());
        panelList.add(panel);
        imagesPanel.add(panel);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                    try {
                        drawImages(category, false);
                    } catch (IOException ex) {
                        Logger.getLogger(ImagesFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        return panel;
    }

    /**
     * Create the JPanel that holds a tile
     *
     * @param tile
     * @return
     * @throws IOException
     */
    private JPanel createTileItem(final Tile tile) throws IOException {
        JPanel panel = createImagePanel(tile.getImage(), tile.getName());
        panelList.add(panel);
        imagesPanel.add(panel);
        final ImagesFrame currentFrame = this;

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                    JOptionPane.showMessageDialog(currentFrame,
                            "A sound is played",
                            "Meow",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        return panel;
    }

    /**
     * Create the JPanel that holds the back button
     *
     * @param category
     * @return
     * @throws IOException
     */
    private JPanel createBackItem(final Category category) throws IOException {
        JPanel panel = createImagePanel("/home/christina/Desktop/talkandplay/back-arrow.png", "Πίσω");
        panelList.add(panel);
        imagesPanel.add(panel);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2 && !evt.isConsumed()) {

                    try {
                        if (category.getParentCategory() == null) {
                            drawImages(category, true);
                        } else {
                            drawImages(category.getParentCategory(), false);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ImagesFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        return panel;
    }

    /**
     * Create an image with its label
     *
     * @param imagePath
     * @param text
     * @return
     * @throws IOException
     */
    private JPanel createImagePanel(String imagePath, String text) throws IOException {
        JPanel panel = new JPanel(new BorderLayout());

        java.awt.Image image = ImageIO.read(new File(imagePath));
        ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        JLabel imgLabel = new JLabel(imageIcon);
        JLabel txtLabel = new JLabel(text);
        txtLabel.setFont(new Font("Courier New", Font.PLAIN, 40));

        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(imgLabel, BorderLayout.CENTER);
        panel.add(txtLabel, BorderLayout.NORTH);
        txtLabel.setHorizontalAlignment(JLabel.CENTER);

        return panel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel imagesPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
