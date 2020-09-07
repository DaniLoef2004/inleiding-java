package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenen3 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.fillRect(100, 300, 20, 600);
        g.drawRect(100, 300, 20, 600);
        g.setColor(Color.red);
        g.fillRect(120, 300, 300, 80);
        g.drawRect(120, 300, 300, 80);
        g.setColor(Color.white);
        g.fillRect(120, 380, 300, 80);
        g.drawRect(120, 380, 300, 80);
        g.setColor(Color.blue);
        g.fillRect(120, 460, 300, 80);
        g.drawRect(120, 460, 300, 80);

    }

}