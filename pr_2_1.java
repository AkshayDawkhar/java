import java.awt.*;

public class pr_2_1 {
    public static void main(String[] args) {
        Frame f= new Frame();
//        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500,500);
        List l= new List();
        String s[]={"Mumbai","Pune","Junner","Ale","Kochi","Kota","Assim","Kuran","Kolkata","Jin"};
    
        for (String sa:s) l.add(sa);
        f.add(l);
    }
}
