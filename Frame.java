package ASG;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Frame extends JFrame {
    private static double frameWidth = 450;
    private static double frameHeight = 700;
    private static String frameName;
        public Frame(String frameName, double frameWidth, double frameHeight) {
            super(frameName);

            Frame.frameName = frameName;
            Frame.frameWidth = frameWidth;
            Frame.frameHeight = frameHeight;
        }

    public void packFrame() {
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public static double getFrameWidth() {
        return frameWidth;
    }

    public static double getFrameHeight() {
        return frameHeight;
    }

    public static String getFrameName() {
        return frameName;
    }

    private void frameProperties() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }