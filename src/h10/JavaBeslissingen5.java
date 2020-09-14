package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaBeslissingen5 extends Applet {

    TextField tekstvak;
    String beoordeling;
    String geslaagd;
    Button knop;
    double getal;
    double cijfer;
    double gemiddelde;
    int aantalCijfers;

    public void init() {

        tekstvak = new TextField("", 10);
        add(tekstvak);
        knop = new Button("Ok");
        knop.addActionListener( new knopListener() );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(beoordeling, 45, 70 );
        g.drawString(geslaagd, 45, 90 );

    }

    class knopListener implements ActionListener	{

        public void actionPerformed( ActionEvent e ) {

            cijfer = Double.parseDouble(tekstvak.getText());
            aantalCijfers++;
            getal =  cijfer + getal;
            gemiddelde = getal / aantalCijfers;
            tekstvak.setText("");
            if (gemiddelde > 5.5){
                geslaagd = gemiddelde + " Je bent geslaagd!";
            }

            if (gemiddelde < 5.5){
                geslaagd = gemiddelde + " Je bent gezakt.";
            }

            if (cijfer > 5.5){
                beoordeling = cijfer + " Je hebt een voldoende!!!!";
            }

            if (cijfer < 5.5){
                beoordeling = cijfer + " Je hebt een onvoldoende :(";
            }

            if (cijfer > 10){
                cijfer = 10;
            }
            repaint();
        }
    }
}