import java.awt.*;

public class pr_5_1 {
    public static void main(String[] args) {
        String []color= {"red","pink","Green","yellow","Black"};
        Frame f = new Frame();
        f.setSize(500,500);
        f.setVisible(true);
        MenuBar mb=new MenuBar();
        f.setMenuBar(mb);
        Menu m = new Menu("Colors");
        MenuItem []mi= new MenuItem[5];
        for (int i = 0; i < 5; i++) {
        
        mi[i]= new MenuItem(color[i]);
        m.add(mi[i]);
            
        }
        mi[4].setEnabled(false);
        mb.add(m);
        
    }
}
