package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenen6 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(100, 300, 10, 600);
        g.drawRect(100, 300, 10, 600);
        g.fillRect(100, 300, 300, 10);
        g.drawRect(100, 300, 300, 10);
        g.fillRect(390, 300, 10, 40);
        g.drawRect(390, 300, 10, 40);
        g.fillRect(370, 340, 50, 140);
        g.drawRect(370, 340, 50, 140);
        g.setColor(Color.red);
        g.fillOval(375, 345, 40, 40);
        g.drawOval(375, 345, 40, 40);
        g.setColor(Color.orange);
        g.fillOval(375, 390, 40, 40);
        g.drawOval(375, 390, 40, 40);
        g.setColor(Color.blue);
        g.fillOval(375, 435, 40, 40);
        g.drawOval(375, 435, 40, 40);
    }

}