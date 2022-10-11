import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class pr_7_1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        DefaultMutableTreeNode india=new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode maha=new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode guj=new DefaultMutableTreeNode("Gujrath");
        india.add(maha);
        india.add(guj);
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("Nagpur");
        maha.add(red); maha.add(blue); maha.add(black); maha.add(green);
        JTree jt=new JTree(india);
        f.add(jt);
        f.setSize(200,200);

        f.setVisible(true);
    }}
