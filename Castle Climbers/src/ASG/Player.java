package ASG;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Player {
    int y; // current x
    int dx; // change in x
    int x; // current y
    Image idle;
    public Player () {
        ImageIcon i = new  ImageIcon("Images/Knight.png");
        idle = i.getImage();
        y = 10;
        x = 172;
    }

    public void move() {
        x = x + dx;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Image getImage() {
        return idle;
    }

    // TODO: 8/28/2023 Create Key Movement for WASD & Arrow Keys.
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
    }

}

