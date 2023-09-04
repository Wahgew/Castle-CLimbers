package ASG;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Player implements Renderable, Updateable{
    private static double width = 75;
    private static double height = 75;
    private double x;
    private double y;
    private int layer = 1;
    private static BufferedImage knight;
    private double speed = 200;

    public Player(double x, double y) throws IOException {
        this.x = x;
        this.y = y;

        knight = ImageIO.read(new File("Images/tempKnight.png")); //tempKnight.png
        Render.addRenderables(this);
        Updater.addUpdatables(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Player.width = width;
    }

    public static void setHeight(double height) {
        Player.height = height;
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(knight, (int)x, (int)y, (int)width, (int)height, null);
    }

    @Override
    public int getLayer() {
        return layer;
    }

    @Override
    public void update() {
        if(Controls.keys[Controls.RIGHT]){
            x += speed * FPS.getDeltaTime();
        }

        if(Controls.keys[Controls.LEFT]) {
            x -= speed * FPS.getDeltaTime();
        }
        if(Controls.keys[Controls.UP]) {
            y -= speed * FPS.getDeltaTime();
        }

        if(Controls.keys[Controls.DOWN]) {
            y += speed * FPS.getDeltaTime();
        }
    }
}