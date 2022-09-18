import javax.swing.*;
import java.awt.*;

class pr_6_1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
//        JComboBox jc=;
        jf.add(new JComboBox(new String[]{"pune", "mumbai","Delhi","Nagpur","jamu"}));
    }
}