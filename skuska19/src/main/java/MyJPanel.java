import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyJPanel extends JPanel{
    private MyJButton myJButton1;
    private MyJButton myJButton2;
    private MyJButton myJButton3;
    protected JLabel colorLabel;
    @Getter
    private MyChoice colorChoice;
    private JPanel jPanel;
    protected MyMouseAdapter mouseAdapter;
    protected boolean linePlus;
    protected boolean choose;
    @Getter
    private ArrayList<ImageAndPosition> imageList;
    protected ImageAndPosition preview;

    public MyJPanel() {
        this.imageList = new ArrayList<>();
        this.colorLabel = new JLabel("Cierna");
        this.myJButton1 = new MyJButton("Plus", this);
        this.myJButton2 = new MyJButton("Usecka", this);
        this.myJButton3 = new MyJButton("Zvolit", this);
        this.jPanel = new JPanel(new GridLayout(1,0));

        this.colorChoice = new MyChoice(this);
        this.mouseAdapter = new MyMouseAdapter(this);


        this.setLayout(new BorderLayout());
        this.jPanel.add(myJButton1);
        this.jPanel.add(myJButton2);
        this.jPanel.add(myJButton3);
        this.jPanel.add(colorLabel);
        this.jPanel.add(colorChoice);
        this.add(jPanel, BorderLayout.PAGE_START);
        this.addMouseListener(mouseAdapter);
        this.addMouseMotionListener(mouseAdapter);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("start");
        for(ImageAndPosition imagePos : imageList) {
//            System.out.println("kreslim");
            g.drawImage((Image) imagePos.image,imagePos.x,imagePos.y,null);
        }
        if(preview != null) {
            g.drawImage((Image) preview.image,preview.x,preview.y,null);
        }
        System.out.println("koniec");
    }

}
