import java.awt.*;

public class pr_3_1 {
    public static void main(String[] args) {
    
        Frame f= new Frame();
        f.setLayout(new GridLayout(5,5,20,20));
        f.setVisible(true);
        f.setSize(500,500);
        for (int i = 0; i < 5 * 5; i++) f.add(new Label("Grid "+(i+1)));
    }
}
