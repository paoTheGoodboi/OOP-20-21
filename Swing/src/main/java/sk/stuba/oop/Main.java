package sk.stuba.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private JPanel panel;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        var okno = new JFrame();
        okno.setSize(300,300);
        okno.setVisible(true);

        this.panel = new JPanel();
        okno.add(panel);

        var button = new JButton("Klik");

        panel.add(button);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Klikol si ma");
        this.panel.removeAll();
        this.panel.repaint();

    }
}
