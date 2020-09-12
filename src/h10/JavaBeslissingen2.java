package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaBeslissingen2 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    int nieuwGetal, hoogGetal, laagGetal;
    boolean nieuw;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        nieuw = true;
    }

    public void paint(Graphics g) {
        g.drawString(hoogGetal + " Is het hoogste getal.", 50, 60);
        g.drawString(laagGetal + " Is het laagste getal.", 50, 75);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            nieuwGetal = Integer.parseInt(s);
            if (nieuw) {
                hoogGetal = nieuwGetal;
                laagGetal = nieuwGetal;
                nieuw = false;
                repaint();

            } else {
                if (nieuwGetal > hoogGetal) {
                    hoogGetal = nieuwGetal;
                    repaint();
                }
                if (nieuwGetal < laagGetal) {
                    laagGetal = nieuwGetal;
                    repaint();
                }
            }

        }
    }
}