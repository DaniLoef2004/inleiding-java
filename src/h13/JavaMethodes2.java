package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaMethodes2 extends Applet {

    int breedte;
    int hoogte;
    int aantalVerticaal;
    int aantalHorizontaal;
    int aantalSteenHorizontaal;
    int aantalSteenVerticaal;

    Color steenkleur;
    Color voegKleur;

    boolean tekenmuur;

    public void init() {

        tekenmuur = true;
        voegKleur = Color.BLACK;
        breedte = 40;
        hoogte = 30;
        aantalSteenHorizontaal = 25;
        aantalSteenVerticaal = 20;
        steenkleur = Color.red;
        repaint();
    }

    public void paint(Graphics g) {
        tekenMuur(g);
    }

    public void tekenMuur(Graphics g) {
        int x = 50;
        int y = 50;
        if (tekenmuur) {
            for (aantalVerticaal = 0; aantalVerticaal < aantalSteenVerticaal; aantalVerticaal++) {
                for (aantalHorizontaal = 0; aantalHorizontaal < aantalSteenHorizontaal; aantalHorizontaal++) {
                    g.setColor(steenkleur);
                    g.fillRect(x, y, breedte, hoogte);
                    g.setColor(voegKleur);
                    g.drawRect(x, y, breedte, hoogte);
                    x += breedte;
                }
                y += hoogte;
                x = 50;
            }
        }
    }
}