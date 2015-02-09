package org.scify.jthinkfreedom.gui.forms;

import java.awt.GridBagConstraints;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.scify.jthinkfreedom.leap.stimuli.CircularGestureStimulus;
import org.scify.jthinkfreedom.leap.stimuli.FingerTrackStimulus;
import org.scify.jthinkfreedom.leap.stimuli.KeyTapGestureStimulus;
import org.scify.jthinkfreedom.leap.stimuli.ScreenTapGestureStimulus;
import org.scify.jthinkfreedom.leap.stimuli.SwipeGestureStimulus;
import org.scify.jthinkfreedom.skeleton.reactors.ReactorAdapter;
import org.scify.jthinkfreedom.skeleton.stimuli.StimulusAdapter;
import org.scify.jthinkfreedom.webcam.stimuli.RedObjectTrackStimulus;

/**
 *
 * @author peustr
 */
public class StimulusPanel extends JPanel {

    private static final int GRID_X_LIMIT = 2; // Zero based indexing

    private ConfigurationScreen parent;
    private Map<StimulusAdapter, Icon> stimuli;

    /**
     * Creates new form StimulusPanel
     */
    public StimulusPanel() {
        initComponents();
    }

    public StimulusPanel(ConfigurationScreen parent) {
        this.parent = parent;
        initComponents();
        initStimulusPanels();
        initCustomComponents();
    }

    public void transitionToSensors() {
        parent.renderSensorPanel();
    }

    public void activateSaveButton() {
        parent.getSaveButton().setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        byLabel = new javax.swing.JLabel();
        stimulusPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        byLabel.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        byLabel.setText("By...");

        stimulusPanel.setBackground(new java.awt.Color(255, 255, 255));
        stimulusPanel.setPreferredSize(new java.awt.Dimension(84, 220));
        stimulusPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(byLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stimulusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stimulusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(byLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initStimulusPanels() {
        stimuli = new HashMap<>();
        stimuli.put(new RedObjectTrackStimulus(), new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/track_64x64.png")));
        stimuli.put(new CircularGestureStimulus(), new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/circle_64x64.png")));
        stimuli.put(new FingerTrackStimulus(), new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/ftrack_64x52.png")));
        stimuli.put(new KeyTapGestureStimulus(), new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/keytap_37x64.png")));
        stimuli.put(new ScreenTapGestureStimulus(), new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/screentap_64x64.png")));
        stimuli.put(new SwipeGestureStimulus(), new ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/gui/resources/swipe_64x64.png")));
    }

    private void initCustomComponents() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        for (Map.Entry<StimulusAdapter, Icon> entry : stimuli.entrySet()) {
            stimulusPanel.add(new MinorComponent(entry.getKey(), this, entry.getKey().getDescription(), entry.getValue()), gbc);
            gbc.gridx++;
            if (gbc.gridx > GRID_X_LIMIT) {
                gbc.gridx = 0;
                gbc.gridy++;
            }
        }
    }

    public void updateBreadcrumbs(String addition) {
        parent.updateBreadcrumbs(addition);
    }
    
    public void setStimulusClass(StimulusAdapter sa) {
        parent.setStimulus(sa);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel byLabel;
    private javax.swing.JPanel stimulusPanel;
    // End of variables declaration//GEN-END:variables
}
