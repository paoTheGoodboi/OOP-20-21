package sk.stuba.oop;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas {

    private boolean imageWasDrawn;

    private Image image;

    public MyCanvas() {
        super();

        this.imageWasDrawn = false;
        this.image = new BufferedImage(300,300, BufferedImage.TYPE_INT_BGR);
        var ramGraphics = image.getGraphics();

        ramGraphics.setColor(Color.GRAY);
        ramGraphics.fillRect(100,150,100,100);
        ramGraphics.setColor(Color.RED);
        ramGraphics.fillPolygon(new int[] {100,200, 150}, new int[] {150, 150, 50}, 3);

        ramGraphics.setColor(Color.BLUE);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ramGraphics.fillRect(110 + 45 * i, 160 + 45 * j, 35, 35);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        if (!this.imageWasDrawn) {
            g.drawImage(image,0,0,null);
            this.imageWasDrawn = true;
        }
    }
}
