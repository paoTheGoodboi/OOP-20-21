import java.awt.*;

public class ImageAndPosition {

    protected Image image;
    protected int x;
    protected int y;

    public ImageAndPosition(Point pressed, Point released, MyJPanel myJPanel) {
        MyImage myImage;

        if(myJPanel.linePlus) {
            myImage = new DrawPlus(pressed,released,myJPanel.getColorChoice().color);
        }else {
            myImage = new DrawLine(pressed,released,myJPanel.getColorChoice().color);
        }

        this.image = myImage.image;
        this.x = myImage.x;
        this.y = myImage.y;

    }
}
