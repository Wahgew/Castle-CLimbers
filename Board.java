package ASG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {
    Player character;
    Image img; //Background
    Timer time;
    JLabel scoreDisplay = new JLabel();

    public Board () {
        character = new Player();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("Images/Pixel_Wall.jpg");
        img = i.getImage();
        time = new Timer(5,this);
        time.start();
        setScoreDisplay();
    }


    public void setScoreDisplay () {
        scoreDisplay.setForeground(new Color(0xE10C0C));
        scoreDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        scoreDisplay.setBounds(220, 650, 100, 50);
        add(scoreDisplay);
    }
    private void updateScoreDisplay() {
        int playerScore = 23;
        scoreDisplay.setText("Score: " + playerScore);
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        character.move();
        updateScoreDisplay();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(img,0, 0, null);
            g2d.drawImage(character.getImage(), character.getX(), character.getY(), null);
            scoreDisplay.paint(g2d);
    }

    // TODO: 8/28/2023 Keyboard inputs for WADS & Arrow keys
    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            character.keyReleased(e);
        }
        public void keyPressed(KeyEvent e) {
            character.keyPressed(e);
        }
    }
}