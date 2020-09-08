package h06;

import java.awt.*;
import java.applet.*;

public class JavaGetallen3 extends Applet {
    double Totaalbedrag;
    double AantalMensen;
    double Geld;


    public void init() {
        Totaalbedrag = 113;
        AantalMensen = 4;
        Geld = Totaalbedrag / AantalMensen;
    }

    public void paint(Graphics g) {
        g.drawString("Dani: €" + Geld, 20, 20);
        g.drawString("Jan: €" + Geld, 20, 35);
        g.drawString("Ali: €" + Geld, 20, 50);
        g.drawString("Jeannette: €" + Geld, 20, 65);
    }
}