package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    public MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);

    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
        label.setBackground(Color.green);
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
        label.setBackground(Color.blue);
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
        label.setBackground(Color.orange);
    }

    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.yellow);
    }

    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.red);
    }
}
