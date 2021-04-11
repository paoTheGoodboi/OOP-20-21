package sk.stuba.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var okno = new JFrame();
        okno.setSize(300,300);
        okno.setVisible(true);

        var panel = new JPanel();
        okno.add(panel);

        var paneLayout = new GridLayout(5,4);
        panel.setLayout(paneLayout);

        var label = new JLabel("ahoj");
        panel.add(label);

        var panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2));

        for(int i = 0;  i < 4; i++) {
            panel2.add(new JLabel("" + i));
        }

        for(int i = 0; i < 10; i++) {
            if(i == 8) {
                panel.add(panel2);
            }else {
                panel.add(new JLabel("" + i));
            }
        }
    }

}
