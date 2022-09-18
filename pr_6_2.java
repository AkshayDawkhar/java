import javax.swing.*;
import java.awt.*;

public class pr_6_2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
//        jf.setLayout(new FlowLayout());
        jf.setSize(500,500);
        jf.setVisible(true);
        
        JScrollPane jsp=new JScrollPane();
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jsp.add(new JTextArea(20,20));
        jf.add(jsp);
    }
}
