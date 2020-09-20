package h13;

import java.awt.*;
import java.applet.*;

public class JavaMethodesEindopdracht extends Applet {

    public void paint(Graphics g) {

        for (int rij = 2; 2 + 25 * rij < getHeight(); rij++) {
            for (int teller = 0; 2 + 52 * (teller - 1) < getWidth(); teller++) {
                if (rij % 2 == 0 ) {
                    boom(g,2 + 82 * teller, 0 + 40 * rij, 50, 50);
                } else {
                    boom(g,-40 + 82 * teller, 0 + 40 * rij, 50, 50);
                }

            }
        }
    }
    void boom( Graphics g, int x, int y, int breedte, int hoogte) {

        Color customColor = new Color(157,127,97);

        g.setColor(customColor);
        g.fillRect(x+1,y,breedte/3,hoogte);

        g.setColor(Color.black);
        g.drawRect(x+1,y,breedte/3,hoogte);

        g.setColor(Color.green);
        g.fillOval(x-breedte/3,y-hoogte/2,breedte,hoogte);

        g.setColor(Color.black);
        g.drawOval(x-breedte/3,y-hoogte/2,breedte,hoogte);
    }
}