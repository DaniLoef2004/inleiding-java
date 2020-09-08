package h02;

import java.awt.*;
import java.applet.*;

public class JavaVariabelen extends Applet{

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        setBackground(Color.white);
        g.setColor(lijnkleur);

        //Lijn

        g.drawLine(50, 50, breedte, 50);
        g.drawString("Lijn", 135, 65 );

        //Rechthoek

        g.drawRect(50, 70, breedte, hoogte);
        g.drawString("Rechthoek", 120, 185 );

        //Afgeronde driehoek

        g.drawRoundRect(50, 190, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde driehoek", 100, 305 );

        //Gevulde rechthoek met ovaal

        g.setColor(opvulkleur);
        g.fillRect(260, 70, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(260, 70, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 280, 185 );

        //Gevulde ovaal

        g.setColor(opvulkleur);
        g.fillOval(260, 190, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 320, 305 );

        //Taartpunt met ovaal eromheen

        g.setColor(opvulkleur);
        g.fillArc(470, 70, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(470, 70, breedte, hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 480, 185 );

        //Cirkel

        g.drawOval(520, 190, 100, 100);
        g.drawString("Cirkel", 554, 305);
    }
}