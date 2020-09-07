package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenen5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 50, 0, 360);
    }
}