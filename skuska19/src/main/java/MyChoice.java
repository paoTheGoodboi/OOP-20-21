import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyChoice extends Choice implements ItemListener {
    protected Color color;
    protected JLabel colorLabel;
    protected MyJPanel myJPanel;

    public MyChoice(MyJPanel myJPanel) {
        this.add("Cierna");
        this.add("Cervena");
        this.add("Modra");
        this.myJPanel = myJPanel;
        color = Color.BLACK;
        this.addItemListener(this);
        this.colorLabel = myJPanel.colorLabel;
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

        if(myJPanel.mouseAdapter.selected && myJPanel.mouseAdapter.selectedImage != null) {
                myJPanel.mouseAdapter.selectedImage.firstColor = color;
                myJPanel.mouseAdapter.changeColor(true);
        }

        colorLabel.setForeground(color);
        colorLabel.setText((String) e.getItem());
    }
}
