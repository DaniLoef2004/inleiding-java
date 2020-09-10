package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaKnoppenEnTekstvakken3 extends Applet {

        Button knopOk;
        double tekstInclusiefBTW;
        TextField tekstvak;
        Label label;
        double getal;
        double totaal;

        public void init() {

                tekstvak = new TextField("", 20);
                label = new Label("Prijs exclusief BTW");
                add(label);
                add(tekstvak);


                knopOk = new Button("Ok");
                knopOkListener kol= new knopOkListener();
                knopOk.addActionListener(kol);
                add(knopOk);

        }

        public void paint(Graphics g) {
                g.drawString("Prijs inclusief BTW: €" + tekstInclusiefBTW, 50, 75);

        }

        public void optellen() {
                double tijdelijkgetal = getal * 1.21;
                totaal = tijdelijkgetal;
                repaint();
        }

        class knopOkListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        String s = tekstvak.getText();
                        getal = Double.parseDouble(s);
                        double tijdelijkgetal = getal * 1.21;
                        tekstInclusiefBTW = tijdelijkgetal;
                        optellen();
                }
        }
}