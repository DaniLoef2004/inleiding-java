package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaHerhalingPraktijkopdracht extends Applet {

    TextField tekstvak;

    String tafelfout;
    String tafel;
    String errorBericht;

    Label label;

    Button okKnop;

    int getal;
    int cijfer;
    int y;

    boolean geklikt;
    boolean error;


    public void init() {
        tafelfout = "";
        geklikt = false;
        cijfer = 0;
        getal = 0;
        setSize(600, 500);
        label = new Label("De tafel:");
        add(label);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        okKnop = new Button("ok");
        okKnop.addActionListener(new OkListener());
        add(okKnop);
    }

    public void paint(Graphics g) {
        if (geklikt) {
            if (!error) {
                y = 60;
                for (int teller = 1; teller <= 10; teller++) {
                    y += 20;
                    tafel = cijfer * teller + "";
                    g.drawString(teller + " X " + cijfer + " = " + tafel, 50, y);
                }
            } else {
                g.drawString("" + errorBericht, 50, 60);
                error = false;
            }
        }
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                cijfer = Integer.parseInt(tekstvak.getText());
                if (cijfer >= 1 && cijfer <= 10) {
                    getal = cijfer + getal;
                    tekstvak.setText("");
                }
                geklikt = true;
                repaint();
            } catch (NumberFormatException exc) {
                error = true;
                geklikt = true;
                errorBericht = "Voer een getal tussen de 1 en 10 in.";
                tekstvak.setText("");
                repaint();
            }
        }
    }
}