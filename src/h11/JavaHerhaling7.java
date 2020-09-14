package h11;

import java.awt.*;
import java.applet.*;

public class JavaHerhaling7 extends Applet {

    @Override
    public void init() {
        setSize(700, 700);
    }

    public void paint(Graphics g) {

        int x = 300;
        int y = 300;
        int aantal = 50;
        int lengte = 5;
        int breedte = 5;

        for (int teller = 0;teller < aantal; teller++) {

            g.drawOval(x, y, breedte, lengte);
            x -= 5;
            y -= 5;
            lengte +=10;
            breedte +=10;

        }

    }

}
