import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
//import java.awt.event.KeyListener;
import javax.swing.*;

//import javax.swing.JLabel;
public class pr_8_2 extends JFrame implements KeyListener {
    HashMap<Integer, String> mp = new HashMap<Integer, String>() {{
        put(KeyEvent.VK_DOWN, "Down");
        put(KeyEvent.VK_LEFT, "Left");
        put(KeyEvent.VK_RIGHT, "Right");
        put(KeyEvent.VK_UP, "Up");
        put(KeyEvent.VK_F1, "F1");
        put(KeyEvent.VK_F2, "F2");
        put(KeyEvent.VK_F3, "F3");
        put(KeyEvent.VK_F4, "F4");
    }};
    JLabel l = new JLabel("");

    pr_8_2() {
        add(l);
        l.setBounds(100, 100, 200, 200);
        setLayout(null);
        setVisible(true);
        setSize(300, 300);
        addKeyListener(this);
        requestFocus();
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyPressed(KeyEvent e) {
        l.setText(mp.get(e.getKeyCode())+" is pressed");
    }

    public static void main(String[] args) {
        new pr_8_2();
    }
}