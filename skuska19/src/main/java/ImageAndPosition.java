import java.awt.*;

public class ImageAndPosition {

    protected Image image;
    protected int x;
    protected int y;
    protected Point pressed, released;
    protected Color firstColor;
    protected String shape;

    public ImageAndPosition(Point pressed, Point released, MyJPanel myJPanel) {
        MyImage myImage;
        this.pressed = pressed;
        this.released = released;
        this.firstColor = myJPanel.getColorChoice().color;
        if(myJPanel.linePlus) {
            myImage = new DrawPlus(pressed,released,firstColor);
        }else {
            myImage = new DrawLine(pressed,released,firstColor);
        }

        this.shape = myImage.shape;
        this.image = myImage.image;
        this.x = myImage.x;
        this.y = myImage.y;

    }
}
