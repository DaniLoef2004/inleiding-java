package h11;

import java.awt.*;
import java.applet.*;

public class JavaHerhaling5 extends Applet {

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int hoeveelheidVierkanten = 5;

        for (int vierkant = 0; vierkant < hoeveelheidVierkanten; vierkant++){
            g.drawRect(x, y, 20, 20);
            x += 20;
            y += 20;
        }
    }
}