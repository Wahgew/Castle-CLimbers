package ASG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {
    Player character;
    Image img; //Background
    Timer time;

    public Board () {
        character = new Player();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("Images/Pixel_Wall.jpg");
        img = i.getImage();
        time = new Timer(5,this);
        time.start();
    }

    public void actionPerformed(ActionEvent e) {
        character.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(img,0, 0, null);
            g2d.drawImage(character.getImage(), character.getX(), character.getY(), null);

    }

    // TODO: 8/28/2023 Keyboard inputs for WADS & Arrow keys
    private class AL extends KeyAdapter {
        public void KeyRelease(KeyEvent e) {
            character.keyReleased(e);
        }
        public void KeyPressed(KeyEvent e) {
            character.keyPressed(e);
        }
    }


}
