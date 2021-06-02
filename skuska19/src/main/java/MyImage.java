import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

abstract class MyImage extends JComponent {
    protected BufferedImage image;
    protected int x;
    protected int y;
    protected Point pressed, released;
    protected Color color;
    protected String shape;

    public MyImage(Point pressed, Point released, Color color, String shape) {
        this.pressed = pressed;
        this.released = released;
        this.color = color;
        this.shape = shape;
    }

    abstract void drawImage(Point pointPressed, Point pointReleased);
}
