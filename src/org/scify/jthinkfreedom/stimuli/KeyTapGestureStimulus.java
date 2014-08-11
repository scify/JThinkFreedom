package org.scify.jthinkfreedom.stimuli;

import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture;
import static com.leapmotion.leap.Gesture.State.STATE_STOP;

/**
 *
 * @author alexisz
 */
public class KeyTapGestureStimulus extends LeapMotionStimulus {

    public KeyTapGestureStimulus() {
        super();
    }

    @Override
    public boolean shouldReact(Frame info) {
        for (Gesture g : info.gestures()) {
            if (g.type() == Gesture.Type.TYPE_KEY_TAP && g.state() == STATE_STOP) {
                return true;
            }
        }
        return false;
    }

}
