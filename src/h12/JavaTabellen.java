package h12;

import java.awt.*;
import java.applet.*;

public class JavaTabellen extends Applet {

    double gemiddelde;

    int teller;
    int getal[];
    int optellen;
    int beginGetal;
    int eindNummer;

    public void init() {
        optellen = 563;
        beginGetal = 43;
        eindNummer = 0;
        getal = new int[10];
        for (teller = 0; teller < getal.length; teller++) {
            getal[teller] = optellen * teller + beginGetal;
            eindNummer += getal[teller];
        }
    }

    public void paint(Graphics g) {
        gemiddelde = eindNummer / getal.length;
        for (teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 15 * teller + 15);
            g.drawString ("Het gemiddelde is: " + gemiddelde, 110, 15);
        }
    }
}