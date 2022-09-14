import java.awt.*;

public class pr_4_3 {
    public static void main(String[] args) {
        Frame f= new Frame("GridBagLayout in java Example");
        f.setSize(1500,1500);
        f.setVisible(true);
        f.setLayout(new GridBagLayout());
        
        GridBagConstraints GBC= new GridBagConstraints();
        GBC.fill=GridBagConstraints.HORIZONTAL;
        GBC.gridx=0;
        GBC.gridy=0;
        f.add(new Label("Name"),GBC);
        GBC.gridx=1;
        GBC.gridy=0;
        GBC.gridwidth=2;
        f.add(new TextField(),GBC);
        GBC.gridx=0;
        GBC.gridy=1;
        f.add(new Label("Comments"),GBC);
        GBC.gridx=1;
        GBC.gridy=1;
        GBC.gridwidth=2;
        f.add(new TextArea(),GBC);
        GBC.gridx=1;
        GBC.gridy=2;
        GBC.gridwidth=1;
        f.add(new Button("submit"),GBC);
    }
}
