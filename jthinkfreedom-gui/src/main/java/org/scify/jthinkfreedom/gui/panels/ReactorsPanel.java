/* 
 * Copyright 2014 SciFY.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scify.jthinkfreedom.gui.panels;

import java.util.List;
import javax.swing.DefaultListModel;
import org.scify.jthinkfreedom.gui.ConfigurationGUI;
import org.scify.jthinkfreedom.skeleton.sensors.SensorAdapter;
import org.scify.jthinkfreedom.skeleton.stimuli.StimulusAdapter;
import org.scify.jthinkfreedom.skeleton.stimuli.StimulusAnnotation;

/**
 *
 * @author peustr
 */
public class ReactorsPanel extends javax.swing.JPanel {

    private DefaultListModel combosListModel;

    /**
     * Creates new form ReactorsPanel
     */
    public ReactorsPanel() {
        initComponents();
        initControls();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        combosPanel = new javax.swing.JPanel();
        combosScroll = new javax.swing.JScrollPane();
        combosList = new javax.swing.JList();
        reactorsPanel = new javax.swing.JPanel();
        reactorsScroll = new javax.swing.JScrollPane();
        reactorsList = new javax.swing.JList();

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setPreferredSize(new java.awt.Dimension(100, 40));

        titleLabel.setText("Configuration");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setPreferredSize(new java.awt.Dimension(100, 40));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(startButton)
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(startButton))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        combosPanel.setBackground(new java.awt.Color(255, 255, 255));

        combosScroll.setViewportView(combosList);

        javax.swing.GroupLayout combosPanelLayout = new javax.swing.GroupLayout(combosPanel);
        combosPanel.setLayout(combosPanelLayout);
        combosPanelLayout.setHorizontalGroup(
            combosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combosScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        combosPanelLayout.setVerticalGroup(
            combosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combosScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        reactorsPanel.setBackground(new java.awt.Color(255, 255, 255));

        reactorsScroll.setViewportView(reactorsList);

        javax.swing.GroupLayout reactorsPanelLayout = new javax.swing.GroupLayout(reactorsPanel);
        reactorsPanel.setLayout(reactorsPanelLayout);
        reactorsPanelLayout.setHorizontalGroup(
            reactorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reactorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reactorsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        reactorsPanelLayout.setVerticalGroup(
            reactorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reactorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reactorsScroll)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(combosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(reactorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reactorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initControls() {
        combosListModel = new DefaultListModel();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ConfigurationGUI gui = (ConfigurationGUI) getTopLevelAncestor();
        gui.back();
    }//GEN-LAST:event_backButtonActionPerformed

    public void generateConfiguration(List<Class<? extends SensorAdapter>> selectedSensors,
            List<Class<? extends StimulusAdapter>> selectedStimuli) {
        combosListModel.clear();
        for (Class<? extends SensorAdapter> curSensor : selectedSensors) {
            for (Class<? extends StimulusAdapter> curStimulus : selectedStimuli) {
                StimulusAnnotation sa = curStimulus.getAnnotation(StimulusAnnotation.class);
                if (sa != null && curSensor.getCanonicalName().equals(sa.sensorClass())) {
                    combosListModel.addElement(curSensor.getSimpleName() + " + " + curStimulus.getSimpleName());
                }
            }
        }
        combosList.setModel(combosListModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JList combosList;
    private javax.swing.JPanel combosPanel;
    private javax.swing.JScrollPane combosScroll;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JList reactorsList;
    private javax.swing.JPanel reactorsPanel;
    private javax.swing.JScrollPane reactorsScroll;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
