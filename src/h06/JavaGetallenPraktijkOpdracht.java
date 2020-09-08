package h06;

import java.awt.*;
import java.applet.*;


public class JavaGetallenPraktijkOpdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;
    int gemiddelde2;
    double gemiddelde3;
    double gemiddelde4;

    public void init() {

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde2 = (int)(gemiddelde * 10);
        gemiddelde3 = gemiddelde2;
        gemiddelde4 = gemiddelde3 / 10;

    }

    public void paint(Graphics g) {
        g.drawString("het gemiddelde is: " + gemiddelde4, 20, 20);
    }
}