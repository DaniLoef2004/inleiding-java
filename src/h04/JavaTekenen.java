package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 400, 270, 400);
        g.drawLine(50, 400, 165, 150);
        g.drawLine(270, 400, 165, 150);
    }
}
