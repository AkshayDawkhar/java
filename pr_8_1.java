import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pr_8_1 extends JFrame implements KeyListener {
//    JFrame jf = new JFrame();
    
    JLabel l;

    pr_8_1(){

        l=new JLabel();
        setVisible(true);
        setSize(500,500);
        add(l);
        addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    l.setText("typed"+e.getKeyChar());

    }

    public void keyPressed(KeyEvent e){
        System.out.println("pressed");
        l.setText("pressed"+e.getKeyCode());

    }

    @Override
    public void keyReleased(KeyEvent e) {
    l.setText("Released");

    }

    public static void main(String[] args) {
        new pr_8_1();

    }
}
