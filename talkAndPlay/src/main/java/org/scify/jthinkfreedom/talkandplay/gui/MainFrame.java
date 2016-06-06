package org.scify.jthinkfreedom.talkandplay.gui;

import java.awt.Color;
import org.scify.jthinkfreedom.talkandplay.gui.users.ProfilePanel;
import org.scify.jthinkfreedom.talkandplay.gui.users.CreateUserScreen;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.scify.jthinkfreedom.talkandplay.gui.grid.GridFrame;
import org.scify.jthinkfreedom.talkandplay.models.User;
import org.scify.jthinkfreedom.talkandplay.services.UserService;
import org.scify.jthinkfreedom.talkandplay.utils.ConfigurationHandler;

public class MainFrame extends javax.swing.JFrame {

    private static final int STEP = 6;

    private int profilePaginationCounterStart = 0;
    private int profilePaginationCounterEnd = STEP;

    private ConfigurationHandler configurationHandler;
    private List<ProfilePanel> profilesPanel;
    private UserService userService;

    public MainFrame() {
        initComponents();
    }

    public MainFrame(ConfigurationHandler configurationHandler) {
        this.configurationHandler = configurationHandler;
        this.userService = new UserService();
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        contentPane = new javax.swing.JPanel();
        nextProfileButton = new javax.swing.JButton();
        previousProfileButton = new javax.swing.JButton();
        profileCountLabel = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        addProfileButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        configureButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Talk&Play");

        contentPane.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.setPreferredSize(new java.awt.Dimension(800, 720));

        nextProfileButton.setBackground(new java.awt.Color(255, 255, 255));
        nextProfileButton.setFont(nextProfileButton.getFont().deriveFont(nextProfileButton.getFont().getStyle() & ~java.awt.Font.BOLD));
        nextProfileButton.setForeground(new java.awt.Color(51, 51, 51));
        nextProfileButton.setText(">");
        nextProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextProfileButtonActionPerformed(evt);
            }
        });

        previousProfileButton.setBackground(new java.awt.Color(255, 255, 255));
        previousProfileButton.setFont(previousProfileButton.getFont().deriveFont(previousProfileButton.getFont().getStyle() & ~java.awt.Font.BOLD));
        previousProfileButton.setForeground(new java.awt.Color(51, 51, 51));
        previousProfileButton.setText("<");
        previousProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousProfileButtonActionPerformed(evt);
            }
        });

        profileCountLabel.setFont(profileCountLabel.getFont().deriveFont(profileCountLabel.getFont().getSize()+2f));
        profileCountLabel.setText("n προφίλ");

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));

        addProfileButton.setBackground(new java.awt.Color(255, 255, 255));
        addProfileButton.setFont(addProfileButton.getFont().deriveFont(addProfileButton.getFont().getSize()+2f));
        addProfileButton.setForeground(new java.awt.Color(51, 51, 51));
        addProfileButton.setText("Νέο προφίλ");
        addProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProfileButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/tp_logo_small.png"))); // NOI18N

        configureButton.setBackground(new java.awt.Color(255, 255, 255));
        configureButton.setFont(configureButton.getFont().deriveFont(configureButton.getFont().getSize()+2f));
        configureButton.setForeground(new java.awt.Color(51, 51, 51));
        configureButton.setText("Ρυθμίσεις");
        configureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("© SciFY 2016");

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addComponent(configureButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addProfileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousProfileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextProfileButton)
                        .addGap(10, 10, 10))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))))
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(0, 612, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(profileCountLabel)))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addGap(47, 47, 47)
                .addComponent(profileCountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextProfileButton)
                    .addComponent(previousProfileButton)
                    .addComponent(addProfileButton)
                    .addComponent(configureButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousProfileButtonActionPerformed
        if (profilePaginationCounterStart - STEP >= 0) {
            profilePaginationCounterStart -= STEP;
            profilePaginationCounterEnd -= STEP;
            repaintProfiles();
        }
    }//GEN-LAST:event_previousProfileButtonActionPerformed

    private void nextProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextProfileButtonActionPerformed
        if (profilePaginationCounterEnd < profilesPanel.size()) {
            profilePaginationCounterEnd += STEP;
            profilePaginationCounterStart += STEP;
            repaintProfiles();
        }
    }//GEN-LAST:event_nextProfileButtonActionPerformed

    private void addProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProfileButtonActionPerformed
        CreateUserScreen cus = new CreateUserScreen(this);
        cus.setLocationRelativeTo(null);
        cus.setVisible(true);
    }//GEN-LAST:event_addProfileButtonActionPerformed

    private void configureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureButtonActionPerformed
        // TODO add your handling code here:
        addProfileButton.setEnabled(false);
        configureButton.setEnabled(false);

        ConfigurationFrame configurationFrame = new ConfigurationFrame(this);
        configurationFrame.setLocationRelativeTo(null);
        configurationFrame.setVisible(true);
        configurationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        configurationFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                addProfileButton.setEnabled(true);
                configureButton.setEnabled(true);
            }
        });
    }//GEN-LAST:event_configureButtonActionPerformed

    private void initCustomComponents() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        profilePaginationCounterStart = 0;
        profilePaginationCounterEnd = STEP;

        // Fill the profile panel according to pagination
        profilesPanel = new ArrayList<>();
        for (final User profile : configurationHandler.getProfiles()) {
            ProfilePanel profilePanel = new ProfilePanel(this, profile);
            final MainFrame currentFrame = this;

            profilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    GridFrame imagesFrame;
                    try {
                        imagesFrame = new GridFrame(profile.getName());
                        imagesFrame.setLocationRelativeTo(null);
                        imagesFrame.setTitle("Talk&Play");
                        imagesFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        imagesFrame.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            profilesPanel.add(profilePanel);
        }

        repaintProfiles();
        pack();
    }

    public void removeUser(User selectedUser) {
        repaintProfiles();
        for (ProfilePanel p : profilesPanel) {
            if (p.getUser().equals(selectedUser)) {
                profilesPanel.remove(p);
                break;
            }
        }
        repaintProfiles();
    }

    public void repaintProfiles() {
        profilePanel.removeAll();
        if (!profilesPanel.isEmpty()) {
            profileCountLabel.setText(profilesPanel.size() + " προφίλ");
            for (int i = profilePaginationCounterStart; i < profilePaginationCounterEnd; i++) {
                try {
                    profilePanel.add(profilesPanel.get(i), gbc);
                } catch (IndexOutOfBoundsException e) {
                    // Do nothing
                }
            }
        }
        JPanel addUserPanel = new JPanel();
        addUserPanel.setLayout(new BoxLayout(addUserPanel, BoxLayout.PAGE_AXIS));
        addUserPanel.setBackground(Color.white);
        
        JLabel textLabel = new JLabel("Πρόσθεσε νέο χρήστη");
        final JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/add-icon.png")));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        addUserPanel.add(imageLabel);
        addUserPanel.add(textLabel);
        profilePanel.add(addUserPanel);
        
          imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent arg0) { 
                imageLabel.setIcon(new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/add-icon.png")));
            }           
            @Override
            public void mouseEntered(MouseEvent arg0) {
                    imageLabel.setIcon(new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/add-icon-hover.png")));
            }           
        });

        pack();
        profilePanel.repaint();
    }

    public void updateProfilesPanel(User user, String oldName) {
        System.out.println("user: " + user.getName() + ", " + oldName);

        for (ProfilePanel p : profilesPanel) {
            if (p.getUser().getName().equals(oldName)) {
                p.repaintPanel(user);
                break;
            }
        }
        repaintProfiles();
    }

    public void removeFromProfilesPanel(String removeProfile) {
        for (ProfilePanel p : profilesPanel) {
            if (p.getUser().getName().equals(removeProfile)) {
                profilesPanel.remove(p);
                break;
            }
        }
        repaintProfiles();
    }

    public List<ProfilePanel> getProfilesPanel() {
        return profilesPanel;
    }

    private GridBagConstraints gbc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProfileButton;
    private javax.swing.JButton configureButton;
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton nextProfileButton;
    private javax.swing.JButton previousProfileButton;
    private javax.swing.JLabel profileCountLabel;
    private javax.swing.JPanel profilePanel;
    // End of variables declaration//GEN-END:variables
}
