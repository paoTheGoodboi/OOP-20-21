import lombok.Getter;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyMouseAdapter extends java.awt.event.MouseAdapter {
    private MyJPanel myJPanel;
    protected boolean selected = false;
    protected ImageAndPosition selectedImage;
    private ArrayList<ImageAndPosition> clickedImageList;
    private int counter;
    @Getter
    private Point released, pressed, dragged;

    public MyMouseAdapter(MyJPanel myJPanel) {
        this.myJPanel = myJPanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.out.println("mouse clicked");
        if(myJPanel.choose) {
            this.clickedImageList = new ArrayList<>();
            ArrayList<ImageAndPosition> imageList = myJPanel.getImageList();
            ArrayList<ImageAndPosition> clickedImageList = new ArrayList<>();
            int x = e.getX();
            int y = e.getY();
            System.out.println("choose");
            for (ImageAndPosition imagePos : imageList) {
                System.out.println("dada");
                if (x > imagePos.x && x < imagePos.x + imagePos.image.getWidth(null) && y > imagePos.y && y < imagePos.y + imagePos.image.getHeight(null)) {
                    clickedImageList.add(imagePos);
                    System.out.println("trafil");
                    this.selected = true;
                }else if(clickedImageList.isEmpty()) {
                    this.selected = false;
                }
            }

            if(!clickedImageList.isEmpty()) {
                if(counter >= clickedImageList.size()) {
                    this.counter = 0;
                }
                if(counter < clickedImageList.size()) {
                    System.out.println(counter + "  " + clickedImageList.size());
                    this.selectedImage = clickedImageList.get(counter);
                    changeColor(false);
                    this.counter++;
                }
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        changeColor(true);
        this.pressed = e.getPoint();
        System.out.println("pressed " + e.getX() + " " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        if(!myJPanel.choose) {
            this.released = e.getPoint();
            System.out.println("released " + e.getX() + " " + e.getY());
            ImageAndPosition iap = new ImageAndPosition(pressed,released,myJPanel);
            if(iap.image != null) {
                myJPanel.getImageList().add(iap);
                myJPanel.preview = null;
                myJPanel.repaint();
            }

            System.out.println((released.x - pressed.x) + " " + (released.y - pressed.y));
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        if(!myJPanel.choose) {
            this.dragged = e.getPoint();
            myJPanel.preview = new ImageAndPosition(pressed,dragged,myJPanel);
            myJPanel.repaint();
            System.out.println(e.getPoint());
        }




    }

    protected void changeColor(Boolean firstColor) {
        Color color;
        if(selectedImage != null) {
            if(firstColor) {
                color = selectedImage.firstColor;
            }else {
                color = Color.YELLOW;
            }
            if(selectedImage.shape.equals("Plus")) {
                DrawPlus drawPlus = new DrawPlus(selectedImage.pressed, selectedImage.released, color);
                selectedImage.image = drawPlus.image;
            }else {
                DrawLine drawLine = new DrawLine(selectedImage.pressed, selectedImage.released, color);
                selectedImage.image = drawLine.image;
            }
            myJPanel.repaint();
        }
    }
}
