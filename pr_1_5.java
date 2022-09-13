import java.awt.*;

public class pr_1_5 {
    public static void main(String[] args) {
        
        Frame f= new Frame();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500,500);
        String[] s = {"OK","RESET","CANCEL"};
        List l= new List();
        for (String sa:s
        ) f.add(new Button(sa));
        
        
        
    }
}
