package ru.mirea.dz8;

import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CreateImg extends JFrame {
    public CreateImg() {
        setSize(new Dimension(1920, 1080));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Image image = new ImageIcon("C:\\Users\\druzh\\Desktop\\hlp.jpg").getImage();
                g2.drawImage(image, 5, 6, this);

            }
        };
        this.getContentPane().add(p);

    }
}