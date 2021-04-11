package sk.stuba.oop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var okno = new JFrame();
        okno.setSize(300,300);
        okno.setVisible(true);

        var panel = new JPanel();
        okno.add(panel);

        var label = new JLabel("ahoj");
        panel.add(label);

        for(int i = 0; i < 10; i++) {
            panel.add(new JLabel("" + i));
        }
    }

}
