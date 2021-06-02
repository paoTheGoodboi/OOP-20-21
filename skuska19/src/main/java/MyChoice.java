import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyChoice extends Choice implements ItemListener {
    Color color;
    JLabel colorLabel;

    public MyChoice(JLabel colorLabel) {
        this.add("Cierna");
        this.add("Cervena");
        this.add("Modra");
        color = Color.BLACK;
        this.addItemListener(this);
        this.colorLabel = colorLabel;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getItem());

        if(e.getItem() == "Cierna") {
            this.color = Color.BLACK;
        }else if(e.getItem() == "Cervena") {
            this.color = Color.RED;
        }else if(e.getItem() == "Modra") {
            this.color = Color.BLUE;
        }
        colorLabel.setForeground(color);
        colorLabel.setText((String) e.getItem());
    }
}
