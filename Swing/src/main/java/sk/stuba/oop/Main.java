package sk.stuba.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var okno = new JFrame();
        okno.setSize(300,300);
        okno.setVisible(true);

        okno.add(new MyCanvas());
    }

}
