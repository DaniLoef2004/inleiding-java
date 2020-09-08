package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenen4 extends Applet {

    public void init() {
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
        g.fillRect(120, 500, 100, 199);
        g.drawRect(120, 500, 100, 199);
        g.setColor(Color.orange);
        g.fillRect(240, 200, 100, 499);
        g.drawRect(240, 200, 100, 499);
        g.setColor(Color.cyan);
        g.fillRect(360, 300, 100, 399);
        g.drawRect(360, 300, 100, 399);
        g.setColor(Color.black);
        g.drawString("Valerie", 150, 720 );
        g.drawString("Jeroen", 270, 720 );
        g.drawString("Hans", 395, 720 );
    }

}