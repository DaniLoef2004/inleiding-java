package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaBeslissingen5 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    double cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Voer je cijfer in:");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer > 5.4)  {
                tekst = "Een " + cijfer + ", je hebt een voldoende!";
            }
            else {
                tekst = "Een " + cijfer + ", je hebt een onvoldoende :(";
            }
            repaint();
        }
    }
}
