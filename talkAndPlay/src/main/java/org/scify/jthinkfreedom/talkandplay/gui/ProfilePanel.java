package org.scify.jthinkfreedom.talkandplay.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JOptionPane;
import org.scify.jthinkfreedom.talkandplay.models.Configuration;
import org.scify.jthinkfreedom.talkandplay.models.User;

/**
 *
 * @author peustr
 */
public class ProfilePanel extends javax.swing.JPanel {

    private MainFrame parent;
    private User profile;

    /**
     * Creates new form ProfilePanel
     */
    public User getUser(){
       return profile;
    }
    
    public ProfilePanel() {
        initComponents();
    }

    public ProfilePanel(MainFrame parent, User profile) {
        this.parent = parent;
        this.profile = profile;
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

        nameLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        deleteLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        selectLabel.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(51, 51, 255));
        selectLabel.setText("Select");
        selectLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectLabelMouseEntered(evt);
            }
        });

        deleteLabel.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        deleteLabel.setForeground(new java.awt.Color(239, 8, 8));
        deleteLabel.setText("Delete");
        deleteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/no-photo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel)
                .addGap(0, 82, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(nameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteLabel)
                        .addGap(18, 18, 18)
                        .addComponent(selectLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteLabel)
                    .addComponent(selectLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLabelMouseClicked
        // Clear all panels and change background color
        for (ProfilePanel panel : parent.getProfiles()) {
            panel.setBackground(new Color(255, 255, 255));
        }
        setBackground(new Color(246, 199, 159));
        // Display configurations on the panel bellow
        parent.getConfigurations().clear();
        for (Configuration config : profile.getConfigurations()) {
            //an diiourgithike tora na xanadiavasei to xml?
            parent.getConfigurations().add(new ConfigurationPanel(config));
        }
        parent.setSelectedUser(profile);
    }//GEN-LAST:event_selectLabelMouseClicked

    private void selectLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLabelMouseEntered
        originalFont = selectLabel.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        selectLabel.setFont(originalFont.deriveFont(attributes));
    }//GEN-LAST:event_selectLabelMouseEntered

    private void selectLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLabelMouseExited
        selectLabel.setFont(originalFont);
    }//GEN-LAST:event_selectLabelMouseExited

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
        //int confirmation = 0;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this user profile ? ","Warning",0);
        if(dialogResult == JOptionPane.YES_OPTION){
            parent.removeUser(profile);
            
        }
            
    }//GEN-LAST:event_deleteLabelMouseClicked

    private void initCustomComponents() {
        nameLabel.setText(profile.getName());
        imageLabel.setIcon(profile.getPhoto());
    }

    public User getProfile() {
        return profile;
    }

    public void setProfile(User profile) {
        this.profile = profile;
    }

    private Font originalFont;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel selectLabel;
    // End of variables declaration//GEN-END:variables
}
