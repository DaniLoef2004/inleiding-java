package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaKnoppenEnTekstvakken extends Applet {

    Button knop;
    Button resetknop;
    String schermtekst;
    TextField tekstvak;
    Label label;

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("Type hier iets");
        add(label);
        add(tekstvak);

        schermtekst = "";
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);

        resetknop = new Button("Reset");
        KnopListener2 kl2 = new KnopListener2();
        resetknop.addActionListener(kl2);
        add(resetknop);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();

        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            schermtekst = "";
            repaint();
        }
    }
}