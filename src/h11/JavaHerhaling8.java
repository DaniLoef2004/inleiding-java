package h11;

import java.awt.*;
import java.applet.*;

public class JavaHerhaling8 extends Applet {

    @Override
    public void init() {
        setSize(600, 600);
    }

    public void paint(Graphics g) {

        int x = 30;
        int y = 30;
        int aantal = 100;
        int lengte = 5;
        int breedte = 5;

        for (int teller = 0;teller < aantal; teller++) {

            g.drawOval(x, y, breedte, lengte);
            lengte +=5;
            breedte +=5;

        }

    }

}
