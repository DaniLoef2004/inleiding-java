package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaHerhalingPraktijkopdracht2 extends Applet {
    Button knop;
    TextField tekstvak;
    int teller;
    int teller1;
    int y;
    String vrouw, man, tafel;

    public void init() {
        tekstvak = new TextField("", 40);
        knop = new Button("Volgende tafel");
        knop.addActionListener(new knopListener());
        add(knop);
        vrouw = "";
        man = "";
        teller = 0;
        teller1 = 0;
    }

    class knopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            teller1++;
            repaint();
        }
    }
    public void paint(Graphics g) {
        y = 60;
        for (int teller = 1; teller <= 10; teller++) {
            y += 20;
            tafel = teller1 * teller + "";
            g.drawString(teller + " X " + teller1 + " = " + tafel, 50, y);

        }


    }
}

