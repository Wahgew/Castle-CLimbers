package ASG;

import java.awt.*;

public interface Renderable extends Comparable<Object>{
    void draw(Graphics2D g);
    int getLayer();

    @Override
    default int compareTo(Object o) {
        Renderable object = (Renderable) o;

        if(getLayer() < object.getLayer()) {
            return -1;
        } else if (getLayer() > object.getLayer()) {
            return 1;
        } else
            return 0;
    }
}
