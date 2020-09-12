package h11;

import java.awt.*;
import java.applet.*;


public class JavaHerhaling extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 20;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x , 30, x, 250 );
        }
    }
}
