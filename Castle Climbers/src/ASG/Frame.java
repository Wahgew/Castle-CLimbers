package ASG;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Castle Climbers");
        frame.add(new Board());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(480,480));

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();

        Rectangle screenBounds = defaultScreen.getDefaultConfiguration().getBounds();

        int x = screenBounds.x + (screenBounds.width - frame.getWidth()) / 2;
        int y = screenBounds.y + (screenBounds.height - frame.getHeight()) / 2;

        frame.setLocation(x,y);
        //frame.setLocation(365,1200);
        frame.pack();
        frame.setVisible(true);
    }
}
