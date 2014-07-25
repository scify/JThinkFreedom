/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scify.jthinkfreedom.sensors;

import com.leapmotion.leap.Controller;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture;
import com.leapmotion.leap.Listener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexisz
 */
public class LeapMotionSensor extends SensorAdapter<Frame> implements Runnable {

    private class LeapListener extends Listener {

        private Frame curFrame;

        @Override
        public void onInit(Controller controller) {
            System.out.println("Leap controller initialized.");
        }

        @Override
        public void onConnect(Controller controller) {
            System.out.println("Leap controller connected");
            controller.enableGesture(Gesture.Type.TYPE_SCREEN_TAP);
            controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
            controller.enableGesture(Gesture.Type.TYPE_SWIPE);
            controller.enableGesture(Gesture.Type.TYPE_KEY_TAP);
        }

        @Override
        public void onDisconnect(Controller controller) {
            System.out.println("Leap controller disconnected");
        }

        @Override
        public void onExit(Controller controller) {
            System.out.println("Leap controller exited.");
        }

        @Override
        public void onFrame(Controller controller) {
            curFrame = controller.frame();
        }

        public Frame getFrame() {
            return curFrame;
        }
    }

    //private Thread tDataReader;
    private Controller controller;
    private LeapListener lp;
    private Thread tDataReader;

    public LeapMotionSensor() {
        super();
        lp = new LeapListener();
        controller = new Controller();
        controller.addListener(lp);
        tDataReader = new Thread(this);
    }

    @Override
    public Frame getData() {
        if(lp.getFrame()!=null) {
        return lp.getFrame();
        }
        //return an empty frame if not initialized yet
        return new Frame();
    }

    @Override
    public void start() {
        bRunning = true;
        tDataReader.start();
    }
    
    @Override
    public void stop() {
        bRunning = false;
    }
    
    @Override
    public void run() {
        while (isRunning()) {
            updateStimuli();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(LeapMotionSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
