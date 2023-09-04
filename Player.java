package ASG;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Player {
    int y; // current y
    int dx; // change in x
    int x; // current x
    int dy;
    Image idle;
    public Player () {
        ImageIcon i = new  ImageIcon("Images/Knight.png");
        idle = i.getImage();
        y = 172;
        x = 10;
    }

    public void move() {
        x = x + dx;
        y = y + dy;
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

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            dx = -3;
        }
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            dx = 3;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            dy = -3;
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            dy = 3;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            dx = 0;
        }
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            dx = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            dy = 0;
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            dy = 0;
        }
    }

}
