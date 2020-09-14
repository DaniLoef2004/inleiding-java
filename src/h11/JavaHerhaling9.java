package h11;

import java.applet.Applet;
import java.awt.*;

public class JavaHerhaling9 extends Applet {

    public void init() {
        setSize(2560, 1440);
    }

    public void paint(Graphics g) {
        int x, y = 50, breedte = 100, hoogte = 100;
        setBackground(Color.gray);

        for (int i = 0; i < 8; i++) {

            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if((kolom + i )%2 == 0 ){
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
        }
    }
}