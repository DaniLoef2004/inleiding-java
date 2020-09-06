package h02;

import java.awt.*;
import java.applet.*;

public class AppletTest extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("James is a Nazi", 50, 60 );
    }
}