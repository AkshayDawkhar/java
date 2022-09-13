import java.awt.*;

public class pr_1 {
    public static void main(String[] args) {
        Frame jf = new Frame();
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(null);
        CheckboxGroup ch = new CheckboxGroup();
        String s[]={"pizza","burger","coke","chips"};
        Checkbox []c= new Checkbox[4];
        int x=10;
        for (int i = 0; i < 4; i++) {
            c[i]=new Checkbox(s[i]);
            c[i].setBounds(x+=60,30,50,50);
            jf.add(c[i]);
        }
        Checkbox ch1=new Checkbox("1",ch,false);
        ch1.setBounds(30,60,50,50);
        Checkbox ch2=new Checkbox("2",ch,false);
        ch2.setBounds(30,ch1.getY()+60,50,50);
        jf.add(ch1);
        jf.add(ch2);
    }
}
