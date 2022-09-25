import javax.swing.*;
import javax.swing.tree.*;
public class pr_7_2 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode down=new DefaultMutableTreeNode("download");
        DefaultMutableTreeNode desk=new DefaultMutableTreeNode("Desktop");
        root.add(down);
        root.add(desk);
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("Java.zip");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("python3.zip");
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("vscode.exe");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("picture");
        green.add(new DefaultMutableTreeNode("home.png"));
        green.add(new DefaultMutableTreeNode("tour.png"));
        green.add(new DefaultMutableTreeNode("mom.png"));
        green.add(new DefaultMutableTreeNode("dad.png"));
        down.add(red); down.add(blue); down.add(black); down.add(green);
//        down.add(desk);
//        DefaultMutableTreeNode down2=new down;
//        desk.add(down2);
        JTree jt=new JTree(root);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
    }}
