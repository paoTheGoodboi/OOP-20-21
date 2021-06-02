import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJButton extends JButton implements ActionListener {
    private MyJPanel myJPanel;

    public MyJButton(String text, MyJPanel myJPanel) {
        super(text);
        this.myJPanel = myJPanel;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Plus")) {
            myJPanel.linePlus = true;
            myJPanel.choose = false;
        }else if(e.getActionCommand().equals("Usecka")) {
            myJPanel.linePlus = false;
            myJPanel.choose = false;
        }else if(e.getActionCommand().equals("Zvolit")) {
            myJPanel.choose = true;
        }
    }
}
