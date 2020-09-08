package h06;

import java.awt.*;
import java.applet.*;

public class JavaGetallen3 extends Applet {
    double seconde;
    double uur;
    double dag;
    double jaar;


    public void init() {
        seconde = 1;
        uur = seconde * 3600;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Een uur is " + uur + " seconde.", 20, 20);
        g.drawString("Een dag is " + dag + " seconde", 20, 35);
        g.drawString("Een jaar is " + jaar + " seconde", 20, 50);
    }
}