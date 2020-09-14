package h11;

import java.awt.*;
import java.applet.*;

public class JavaHerhaling4 extends Applet {

    public void paint(Graphics g) {

        int tafelDrie = 3;
        int antwoord = 0;
        int afstand = 30;

        for(int aantalGetallen = 0; aantalGetallen < 11; aantalGetallen++) {
            antwoord = tafelDrie * aantalGetallen;

            g.drawString("" + antwoord, afstand , 100);

            afstand += 40;
        }
    }
}