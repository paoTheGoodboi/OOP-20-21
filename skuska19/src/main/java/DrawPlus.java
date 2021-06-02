import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawPlus extends MyImage{

    public DrawPlus(Point pressed, Point released, Color color) {
        super(pressed, released, color, "Plus");
        drawImage(pressed,released);
    }

    @Override
    public void drawImage(Point pointPressed, Point pointReleased) {

        int positionX, positionY,x,y;
        x = pointReleased.x - pointPressed.x;
        y = pointReleased.y - pointPressed.y;
        int widthImage = Math.abs(pointReleased.x - pointPressed.x);
        int heightImage = Math.abs(pointReleased.y - pointPressed.y);
        int euclid = (int)Math.sqrt(Math.pow(widthImage,2.0) + Math.pow(heightImage,2.0));

        if(x < 0 && y > 0 ) {

            positionX = pointPressed.x - widthImage;
            positionY = pointPressed.y;
        }else if(x < 0 && y < 0) {

            positionX = pointPressed.x - widthImage;
            positionY = pointPressed.y - heightImage;
        }else if (x > 0 && y < 0) {

            positionX = pointPressed.x;
            positionY = pointPressed.y - heightImage;
        }
        else {

            positionX = pointPressed.x;
            positionY = pointPressed.y;
        }

        this.image = new BufferedImage(euclid+1,euclid+1,BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = image.getGraphics();
        graphics.setColor(color);
        graphics.fillRect(0, euclid/3,euclid, euclid/3);
        graphics.fillRect(euclid/3,0,euclid/3,euclid);

        this.x = positionX;
        this.y = positionY;
    }

}
