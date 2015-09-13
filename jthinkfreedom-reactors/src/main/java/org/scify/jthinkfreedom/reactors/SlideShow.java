/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scify.jthinkfreedom.reactors;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author xrousakis
 */
public class SlideShow extends javax.swing.JFrame {

    private String currentIcon;
    private final String ImagesPath;
    private final ArrayList<String> contentsNames;
    private int currentImage;
    private final int numberOfImages;

    /**
     * Creates new form SlideShow
     */
    public SlideShow(String imagesPath) {
        contentsNames = new ArrayList();
        currentImage = 0;
        this.ImagesPath = imagesPath;
        File folder = new File(imagesPath);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                contentsNames.add(listOfFiles[i].getName());
            }
        }
        numberOfImages = contentsNames.size();
        initComponents();
        
        //setLayout(null);
        
        ImageIcon icon = null;
        icon = new ImageIcon(imagesPath + "/" + contentsNames.get(currentImage));
        ImageLabel.setIcon(icon);
        currentImage++;

    }
     
   
    public boolean imageValidation(String imageName) {
        return true;
    }

    public void setMaximizedLabel() {
          //ImageLabel.setSize(this.getSize());
    }
    
    public void SwitchPic() {
        ImageIcon icon = null;
        if (numberOfImages - 1 < currentImage) {
            currentImage = 0;
        }
        icon = new ImageIcon(ImagesPath + "/" + contentsNames.get(currentImage));
        ImageLabel.setIcon(icon);
        currentImage++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    // End of variables declaration//GEN-END:variables
}