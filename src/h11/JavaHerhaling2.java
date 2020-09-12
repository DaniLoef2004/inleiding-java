package h11;

import java.awt.*;
import java.applet.*;


public class JavaHerhaling2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 20;

        for(teller = 10; teller < 21; teller++) {
            y += 20;
            g.drawString("" + teller, 20, y);
        }
    }
}
