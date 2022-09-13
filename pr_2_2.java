import java.awt.*;

public class pr_2_2 {
    public static void main(String[] args) {
        Frame f= new Frame();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500,500);
        List l= new List(3,true);
        String s[]={"Time now","Sakal","Kesari"};
    
        for (String sa:s) l.add(sa);
        f.add(l);
        
    }
}
