package sk.stuba.oop;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {

    public Okno() throws HeadlessException {
        super();
        this.setVisible(true);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
