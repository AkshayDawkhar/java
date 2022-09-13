import java.awt.*;

public class pr_1_2 {
    public static void main(String[] args) {
        Frame f= new Frame();
        f.setLayout(new GridLayout(3,1,120,120));
        f.setVisible(true);
        f.setSize(500,500);
        
        
        f.add(new TextArea("enter name"));
        f.add(new Label("massage"));
        f.add(new TextField("name"));
        f.add(new Button("submit"));
    }
}