package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class JavaTabellen3 extends Applet {

    int getallen[] = new int[5];

    TextField[] tekstvakken = new TextField[6];
    Label label;

    Button knop;

    public void init() {

        for (int teller = 1; teller < 6; teller++) {
            label = new Label("Nummer " + teller);
            add(label);
            tekstvakken[teller] = new TextField("", 20);
            add(tekstvakken[teller]);

        }
        knop = new Button("Sorteren!");
        add(knop);
        knop.addActionListener (new TekstvakkenListener());
    }

    class TekstvakkenListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String getal;
            for (int cijfer = 0; cijfer < tekstvakken.length; cijfer++) {
                getal = tekstvakken[cijfer].getText();
                getallen[cijfer] = Integer.parseInt(getal);
            }
            Arrays.sort(getallen);
            repaint();
        }
    }
    public void paint(Graphics g) {
        for (int teller2 = 0; teller2 < getallen.length; teller2++) {
            g.drawString("" + getallen[teller2], 20 * teller2 + 105, 200);
        }
    }
}