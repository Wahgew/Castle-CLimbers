package ASG;

import java.io.IOException;
public class GameRunTime {
    public static void main(String[] args) throws IOException {
        Frame frame = new Frame("Castle Climbers", Frame.getFrameWidth(), Frame.getFrameHeight());
        Render rending = new Render();
        Updater updating = new Updater();

        frame.addKeyListener(new Controls()); // Movement
        frame.add(rending); // Rendering Objects
        frame.packFrame(); // packing the frame or window size
        frame.setVisible(true);

        new Player(100,100);

        boolean runGame = true;

        FPS.calcStartTime();
        while(runGame) {
            updating.update();
            rending.repaint();
            FPS.calcDeltaTime();
        }

    }
}
