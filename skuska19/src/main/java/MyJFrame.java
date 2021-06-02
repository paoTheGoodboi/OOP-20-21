import javax.swing.*;

public class MyJFrame extends JFrame {
    private MyJPanel myJPanel;

    public MyJFrame() {
        this.myJPanel = new MyJPanel();

        this.setSize(500,500);
        this.add(myJPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
