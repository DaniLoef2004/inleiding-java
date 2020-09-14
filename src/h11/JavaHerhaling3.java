package h11;

import java.awt.*;
import java.applet.*;

public class JavaHerhaling3 extends Applet {

    public void paint(Graphics g) {
        int eersteGetal = 1;
        int tweedeGetal = 1;
        int antwoord = 0;
        int afstand = 30;

        for(int aantalGetallen = 0; aantalGetallen < 25; aantalGetallen++) {
            eersteGetal = tweedeGetal + antwoord;
            tweedeGetal = antwoord;
            antwoord = eersteGetal;

            g.drawString("" + antwoord, afstand , 100);


            afstand += 40;
        }
    }
}