package org.scify.jthinkfreedom.talkandplay.gui.categories;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.lang3.StringUtils;
import org.scify.jthinkfreedom.talkandplay.gui.users.CreateUserScreen;
import org.scify.jthinkfreedom.talkandplay.gui.configuration.CommunicationModuleSettingsPanel;
import org.scify.jthinkfreedom.talkandplay.gui.helpers.GuiHelper;
import org.scify.jthinkfreedom.talkandplay.models.Category;
import org.scify.jthinkfreedom.talkandplay.models.User;
import org.scify.jthinkfreedom.talkandplay.services.CategoryService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author christina
 */
public class CreateCategoryFrame extends javax.swing.JFrame {

    private CommunicationModuleSettingsPanel parent;
    private List<Category> allCategories;
    private String categoryImage;
    private GuiHelper guiHelper;
    private CategoryService categoryService;
    private User user;

    /**
     * Creates new form CreateCategoryFrame
     */
    public CreateCategoryFrame() {
        initComponents();
    }

    public CreateCategoryFrame(CommunicationModuleSettingsPanel parent, User user) {
        this.parent = parent;
        this.guiHelper = new GuiHelper();
        this.user = user;
        this.categoryService = new CategoryService();
        this.allCategories = categoryService.getCategories(user.getName());
        initComponents();
        initCustomComponents();
        setTitle("Δημιουργία Κατηγορίας - Talk&Play");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        defaultPhotoLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        gridLabel = new javax.swing.JLabel();
        rowsTextField = new javax.swing.JTextField();
        columnsTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        parentLabel = new javax.swing.JLabel();
        parentComboBox = new javax.swing.JComboBox();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Talk&Play");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        defaultPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/no-photo.png"))); // NOI18N

        uploadButton.setBackground(new java.awt.Color(255, 255, 255));
        uploadButton.setForeground(new java.awt.Color(51, 51, 51));
        uploadButton.setText("Ανεβάστε εικόνα");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setForeground(new java.awt.Color(51, 51, 51));
        saveButton.setText("Αποθήκευση");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Όνομα κατηγορίας:");

        nameTextField.setMinimumSize(new java.awt.Dimension(100, 23));

        gridLabel.setText("Πίνακας:");

        jLabel3.setText("x");

        parentLabel.setText("Ανήκει σε:");

        errorLabel.setBackground(new java.awt.Color(153, 0, 0));
        errorLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorLabel.setText("Παρακαλώ συμπληρώστε σωστά όλα τα πεδία");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(defaultPhotoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(parentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(parentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gridLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rowsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(columnsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(uploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(defaultPhotoLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameLabel)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gridLabel)
                                    .addComponent(rowsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(columnsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(parentLabel)
                                    .addComponent(parentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(errorLabel)
                                .addGap(0, 0, 0)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadButton))
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String name = nameTextField.getText();

        if (name.isEmpty()
                || rowsTextField.getText().isEmpty() || !StringUtils.isNumeric(rowsTextField.getText())
                || columnsTextField.getText().isEmpty() || !StringUtils.isNumeric(columnsTextField.getText())
                || categoryImage.isEmpty()) {
            errorLabel.setVisible(true);
        } else {
            int rows = Integer.parseInt(rowsTextField.getText());
            int columns = Integer.parseInt(columnsTextField.getText());
            errorLabel.setVisible(false);
            Category category = new Category(name, rows, columns, categoryImage);
            category.setParentCategory(new Category(parentComboBox.getSelectedItem().toString()));

            try {
                categoryService.save(category, user);
                parent.drawCategories(categoryService.getCategories(user.getName()));
            } catch (Exception ex) {
                Logger.getLogger(CreateCategoryFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        categoryImage = "";
        JFileChooser chooser = new JFileChooser();

        chooser.setDialogTitle("Διαλέξτε εικόνα");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg", "JPG", "JPEG", "gif"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            categoryImage = chooser.getSelectedFile().getAbsolutePath();
            defaultPhotoLabel.setIcon(guiHelper.getIcon(categoryImage));
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void initCustomComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        errorLabel.setVisible(false);
        for (Category c : allCategories) {
            parentComboBox.addItem(c.getName());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnsTextField;
    private javax.swing.JLabel defaultPhotoLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel gridLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox parentComboBox;
    private javax.swing.JLabel parentLabel;
    private javax.swing.JTextField rowsTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
