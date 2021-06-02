import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawLine extends MyImage{

    public DrawLine(Point pressed, Point released, Color color) {
        super(pressed, released, color);
        drawImage(pressed,released);
    }

    @Override
    public void drawImage(Point pointPressed, Point pointReleased) {

        int x1,y1,x2,y2,positionX, positionY,x,y;
        x = pointReleased.x - pointPressed.x;
        y = pointReleased.y - pointPressed.y;
        int widthImage = Math.abs(x);
        int heightImage = Math.abs(y);

        if(x < 0 && y > 0 ) {
            x1 = widthImage;
            y1 = 0;

            x2 = 0;
            y2 = heightImage;

            positionX = pointPressed.x - widthImage;
            positionY = pointPressed.y;
        }else if(x < 0 && y < 0) {
            x1 = widthImage;
            y1 = heightImage;

            x2 = 0;
            y2 = 0;

            positionX = pointPressed.x - widthImage;
            positionY = pointPressed.y - heightImage;
        }else if (x > 0 && y < 0) {
            x1 = 0;
            y1 = heightImage;

            x2 = widthImage;
            y2 = 0;

            positionX = pointPressed.x;
            positionY = pointPressed.y - heightImage;
        }
        else {
            x1 = 0;
            y1 = 0;
            x2 = widthImage;
            y2 = heightImage;

            positionX = pointPressed.x;
            positionY = pointPressed.y;
        }

        this.image = new BufferedImage(widthImage+1,heightImage+1,BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = image.getGraphics();
        graphics.setColor(color);
        graphics.drawLine(x1,y1,x2,y2);
        this.x = positionX;
        this.y = positionY;

    }
}
