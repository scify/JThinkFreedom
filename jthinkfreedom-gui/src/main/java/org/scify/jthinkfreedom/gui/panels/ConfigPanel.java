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

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.scify.jthinkfreedom.gui.ConfigurationGUI;
import org.scify.jthinkfreedom.gui.ReflectionUtils;
import org.scify.jthinkfreedom.skeleton.sensors.SensorAdapter;
import org.scify.jthinkfreedom.skeleton.stimuli.StimulusAdapter;
import org.scify.jthinkfreedom.skeleton.stimuli.StimulusAnnotation;

/**
 *
 * @author peustr
 */
public class ConfigPanel extends javax.swing.JPanel {

    private DefaultListModel sensorsListModel, stimuliListModel;
    private List<Class<? extends SensorAdapter>> sensors, selectedSensors;
    private List<Class<? extends StimulusAdapter>> stimuli, filteredStimuli, selectedStimuli;

    /**
     * Creates new form ConfigPanel
     */
    public ConfigPanel() {
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
        nextButton = new javax.swing.JButton();
        sensorsPanel = new javax.swing.JPanel();
        sensorsScroll = new javax.swing.JScrollPane();
        sensorsList = new javax.swing.JList();
        stimuliPanel = new javax.swing.JPanel();
        stimuliScroll = new javax.swing.JScrollPane();
        stimuliList = new javax.swing.JList();

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

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addComponent(nextButton)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        sensorsPanel.setBackground(new java.awt.Color(255, 255, 255));

        sensorsScroll.setViewportView(sensorsList);

        javax.swing.GroupLayout sensorsPanelLayout = new javax.swing.GroupLayout(sensorsPanel);
        sensorsPanel.setLayout(sensorsPanelLayout);
        sensorsPanelLayout.setHorizontalGroup(
            sensorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sensorsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        sensorsPanelLayout.setVerticalGroup(
            sensorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sensorsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        stimuliPanel.setBackground(new java.awt.Color(255, 255, 255));

        stimuliScroll.setViewportView(stimuliList);

        javax.swing.GroupLayout stimuliPanelLayout = new javax.swing.GroupLayout(stimuliPanel);
        stimuliPanel.setLayout(stimuliPanelLayout);
        stimuliPanelLayout.setHorizontalGroup(
            stimuliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stimuliPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stimuliScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        stimuliPanelLayout.setVerticalGroup(
            stimuliPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stimuliPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stimuliScroll)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(sensorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(stimuliPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sensorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stimuliPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        ConfigurationGUI gui = (ConfigurationGUI) getTopLevelAncestor();
        gui.getReactorsPanel().generateConfiguration(selectedSensors, selectedStimuli);
        gui.next();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void initControls() {
        sensorsListModel = new DefaultListModel();
        stimuliListModel = new DefaultListModel();
        sensors = ReflectionUtils.getSensors();
        selectedSensors = new ArrayList();
        stimuli = ReflectionUtils.getStimuli();
        filteredStimuli = new ArrayList();
        selectedStimuli = new ArrayList();

        for (Class curSensor : sensors) {
            sensorsListModel.addElement(curSensor.getSimpleName());
        }
        sensorsList.setModel(sensorsListModel);
        sensorsList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] indices = sensorsList.getSelectedIndices();
                selectedSensors.clear();
                for (int i : indices) {
                    selectedSensors.add(sensors.get(i));
                }

                filteredStimuli.clear();
                stimuliListModel.clear();
                for (Class<? extends SensorAdapter> curSensor : selectedSensors) {
                    for (Class<? extends StimulusAdapter> curStimulus : stimuli) {
                        StimulusAnnotation sa = curStimulus.getAnnotation(StimulusAnnotation.class);
                        if (sa != null && curSensor.getCanonicalName().equals(sa.sensorClass())) {
                            filteredStimuli.add(curStimulus);
                            stimuliListModel.addElement(curStimulus.getSimpleName());
                        }
                    }
                }
            }
        });
        stimuliList.setModel(stimuliListModel);
        stimuliList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] indices = stimuliList.getSelectedIndices();
                selectedStimuli.clear();
                for (int i : indices) {
                    selectedStimuli.add(filteredStimuli.get(i));
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JList sensorsList;
    private javax.swing.JPanel sensorsPanel;
    private javax.swing.JScrollPane sensorsScroll;
    private javax.swing.JList stimuliList;
    private javax.swing.JPanel stimuliPanel;
    private javax.swing.JScrollPane stimuliScroll;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
