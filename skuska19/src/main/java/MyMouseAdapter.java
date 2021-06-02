import lombok.Getter;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyMouseAdapter extends java.awt.event.MouseAdapter {
    private MyJPanel myJPanel;
    private boolean selected;
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
        if(!myJPanel.choose) {
            this.clickedImageList = new ArrayList<>();
            ArrayList<ImageAndPosition> imageList = myJPanel.getImageList();
            ArrayList<ImageAndPosition> clickedImageList = new ArrayList<>();
            int x = e.getX();
            int y = e.getY();

            for (ImageAndPosition imagePos : imageList) {
                if (x > imagePos.x && x < imagePos.x + imagePos.image.getWidth(null) && y > imagePos.y && y < imagePos.y + imagePos.image.getHeight(null)) {
                    clickedImageList.add(imagePos);
                    this.selected = true;
                }else if(clickedImageList.isEmpty()) {
                    this.selected = false;
                }
            }

            if(!clickedImageList.isEmpty()) {
                if(counter > clickedImageList.size()) {
                    this.counter = 0;
                }else {
                    this.counter++;
                }
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
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
}
