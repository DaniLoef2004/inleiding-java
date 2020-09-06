package h02;

import java.awt.*;
import java.applet.*;

public class JavaApplets extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Dani Loef", 50, 60 );
    }
}