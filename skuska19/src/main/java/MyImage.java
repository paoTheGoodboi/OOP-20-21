import java.awt.*;
import java.awt.image.BufferedImage;

abstract class MyImage {
    protected BufferedImage image;
    protected int x;
    protected int y;
    protected Point pressed, released;
    protected Color color;

    public MyImage(Point pressed, Point released, Color color) {
        this.pressed = pressed;
        this.released = released;
        this.color = color;
    }

    abstract void drawImage(Point pointPressed, Point pointReleased);
}
