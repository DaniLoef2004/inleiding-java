package h05;

import java.awt.*;
import java.applet.*;

public class JavaVariabelen2 extends Applet {

    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int HoogteValerie;
    int HoogteJeroen;
    int HoogteHans;

    public void init() {

        gewichtValerie = 20;
        gewichtJeroen = 80;
        gewichtHans = 43;

        HoogteValerie = (-5 * gewichtValerie);
        HoogteJeroen = (-5 * gewichtJeroen);
        HoogteHans = (-5 * gewichtHans);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(100, 700, 600, 700);
        g.drawLine(100, 700, 100, 100);
        g.drawString("0", 85, 700 );
        g.drawString("20", 80, 600 );
        g.drawString("40", 80, 500 );
        g.drawString("60", 80, 400 );
        g.drawString("80", 80, 300 );
        g.drawString("100", 75, 200 );
        g.drawString("120", 75, 100 );
        g.setColor(Color.green);
        g.fillRect(120, 700, 100, HoogteValerie);
        g.setColor(Color.orange);
        g.fillRect(240, 700, 100, HoogteJeroen);
        g.setColor(Color.cyan);
        g.fillRect(360, 700, 100, HoogteHans);
        g.setColor(Color.black);
        g.drawString("Valerie", 150, 720 );
        g.drawString("Jeroen", 270, 720 );
        g.drawString("Hans", 395, 720 );
    }
    }

