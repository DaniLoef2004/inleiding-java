package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenen2 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(100, 300, 300, 400);
        g.drawLine(100, 300, 250, 160);
        g.drawLine(400, 300, 250, 160);
        g.drawRect(250, 700, 80, -140);
        g.drawRect(170, 350, 100, 100);
    }

}