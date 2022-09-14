import java.awt.*;

public class pr_4_2 {
    public static void main(String[] args) {
        Frame f= new Frame("GridBag Layout Example");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new GridBagLayout());
    
        GridBagConstraints CBC= new GridBagConstraints();
        CBC.fill=GridBagConstraints.HORIZONTAL;
        CBC.gridx=0;
        CBC.gridy=0;
        f.add(new Button("Button one"),CBC);
        CBC.gridx=1;
        CBC.gridy=0;
        f.add(new Button("Button two"),CBC);
        CBC.gridx=0;
        CBC.gridy=1;
        CBC.ipady=20;
        f.add(new Button("Button three"),CBC);
        CBC.gridx=1;
        CBC.gridy=1;
        f.add(new Button("Button four"),CBC);
        CBC.gridx=0;
        CBC.gridy=2;
        CBC.gridwidth=2;
        f.add(new Button("Button five"),CBC);
    }
}
