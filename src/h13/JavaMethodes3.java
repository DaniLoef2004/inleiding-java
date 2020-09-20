package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaMethodes3 extends Applet {
    Button steenknop;
    Button betonknop;
    boolean beton;
    boolean steen;

    public void init() {

        steenknop = new Button("Muur van steen");
        SteenListener sl = new SteenListener();
        steenknop.addActionListener(sl);
        add(steenknop);

        betonknop = new Button("Muur van beton");
        BetonListener bl = new BetonListener();
        betonknop.addActionListener(bl);
        add(betonknop);
    }

    public void paint(Graphics g) {
        if (steen == true) {
            g.setColor(Color.red);

            for (int rij = 2; 2 + 25 * rij < getHeight(); rij++) {
                for (int kolom = 0; 2 + 52 * (kolom - 1) < getWidth(); kolom++) {

                    if (rij % 2 == 0) {
                        g.setColor(Color.red);
                        g.fillRect(2 + 52 * kolom, 2 + 22 * rij, 50, 20);
                    } else {
                        g.setColor(Color.red);
                        g.fillRect(-25 + 52 * kolom, 2 + 22 * rij, 50, 20);
                    }
                }
            }
        } else if (beton == true){
            g.setColor(Color.gray);

            for (int rij = 2; 2 + 25 * rij < getHeight(); rij++) {
                for (int kolom = 0; 2 + 52 * (kolom - 1) < getWidth(); kolom++) {

                    if (rij % 2 == 0) {
                        g.setColor(Color.GRAY);
                        g.fillRect(2 + 82 * kolom, -32 + 42 * rij, 80, 40);
                    } else {
                        g.setColor(Color.GRAY);
                        g.fillRect(-25 + 82 * kolom, -32 + 42 * rij, 80, 40);
                    }
                }
            }
        }
    }

    //Zegt wat er gebeurd wanneer er op de knop "steenListener" gedrukt wordt.

    class SteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            beton = false;
            steen = true;
            repaint();
        }
    }

    //Zegt wat er gebeurd wanneer er op de knop "BetonListener" gedrukt wordt.

    class BetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            steen = false;
            beton= true;
            repaint();
        }
    }
}