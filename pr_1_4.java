import java.awt.*;

public class pr_1_4 {
    public static void main(String[] args) {
      
            Frame f= new Frame();
            f.setLayout(new FlowLayout());
            f.setVisible(true);
            f.setSize(500,500);
        String[] s = {"Marathi","Hindi","English","Sanskrit"};
        List l= new List();
        for (String sa:s
             ) l.add(sa);
            
        
        f.add(l);
        }
}
