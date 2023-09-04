package ASG;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Render extends JPanel {
    private static ArrayList<Renderable> renderables = new ArrayList<Renderable>();
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;


        for(Renderable object: renderables) {
            object.draw(g2d);
        }
    }

    public static void addRenderables(Renderable object) {
        renderables.add(object);
        Collections.sort(renderables); // uses compareTo
    }

    public static void removeRenderables(Renderable object) {
        renderables.remove(object);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension((int)Frame.getFrameWidth() + 1, (int)Frame.getFrameHeight() + 1);
    }
}
