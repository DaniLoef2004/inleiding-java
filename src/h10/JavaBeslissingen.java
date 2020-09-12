package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaBeslissingen extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int nieuwGetal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "0";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst + " Is het hoogste getal.", 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            nieuwGetal = Integer.parseInt(s);
            int result = Integer.parseInt(tekst);


            if ((nieuwGetal > result)) {
                tekst = nieuwGetal + "";
                repaint();
            }

        }
    }
}