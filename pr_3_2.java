import java.awt.*;

public class pr_3_2 {
    public static void main(String[] args) {
        
        Frame f= new Frame();
        f.setLayout(new GridLayout(3,3,20,20));
        f.setVisible(true);
        f.setSize(500,500);
        for (int i = 0; i < 9; i++) f.add(new Button("Button "+(i+1)));
    }
}