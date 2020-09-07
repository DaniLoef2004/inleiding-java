package h02;

import java.awt.*;
import java.applet.*;

public class JavaTekenenPraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //Lijn

        g.drawLine(50, 50, 250, 50);
        g.drawString("Lijn", 135, 65 );

        //Rechthoek

        g.drawRect(50, 70, 200, 100);
        g.drawString("Rechthoek", 120, 185 );

        //Afgeronde driehoek

        g.drawRoundRect(50, 190, 200, 100, 30, 30);
        g.drawString("Afgeronde driehoek", 100, 305 );

        //Gevulde rechthoek met ovaal

        g.setColor(Color.magenta);
        g.fillRect(260, 70, 200, 100);
        g.setColor(Color.black);
        g.drawOval(260, 70, 200, 100);
        g.drawString("Gevulde rechthoek met ovaal", 280, 185 );

        //Gevulde ovaal

        g.setColor(Color.magenta);
        g.fillOval(260, 190, 200, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 320, 305 );

        //Taartpunt met ovaal eromheen

        g.setColor(Color.magenta);
        g.fillArc(470, 70, 200, 100, 0, 45);
        g.setColor(Color.black);
        g.drawOval(470, 70, 200, 100);
        g.drawString("Taartpunt met ovaal eromheen", 480, 185 );

        //Cirkel

        g.drawOval(520, 190, 100, 100);
        g.drawString("Cirkel", 554, 305);
    }

}