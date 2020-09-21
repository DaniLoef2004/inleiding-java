package h13;

import java.awt.*;
import java.applet.*;

public class JavaMethodes extends Applet {

    public void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x3, y3, x1, y1);
        g.drawLine(x2, y2, x3, y3);

    }

    public void paint(Graphics g) {
        tekenDriehoek(g, 300, 400, 15, 400, 157, 100);
    }
}