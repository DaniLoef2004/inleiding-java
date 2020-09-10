package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaKnoppenEnTekstvakkenEindopdracht extends Applet {

    Button knopKeer;
    Button knopDelen;
    Button knopPlus;
    Button knopMin;
    double getal;
    double getal2;
    TextField tekstvak;
    TextField tekstvak2;


    public void init() {

        tekstvak = new TextField("", 15);
        add(tekstvak);

        tekstvak2 = new TextField("", 15);
        add(tekstvak2);




        knopKeer = new Button("*");
        knopKeerListener kkl = new knopKeerListener();
        knopKeer.addActionListener(kkl);
        add(knopKeer);

        knopDelen = new Button("/");
        knopDelenListener kdl = new knopDelenListener();
        knopDelen.addActionListener(kdl);
        add(knopDelen);

        knopPlus = new Button("+");
        knopPlusListener kpl = new knopPlusListener();
        knopPlus.addActionListener(kpl);
        add(knopPlus);

        knopMin = new Button("-");
        knopMinListener kml = new knopMinListener();
        knopMin.addActionListener(kml);
        add(knopMin);

    }


    class knopKeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String g = tekstvak2.getText();
            getal2 = Double.parseDouble(g);
            double antwoord = (getal * getal2);
            double d = antwoord;
            String str = Double.toString(d);
            tekstvak2.setText("");
            tekstvak.setText(str);
            repaint();
        }
    }

    class knopDelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String g = tekstvak2.getText();
            getal2 = Double.parseDouble(g);
            double antwoord = (getal / getal2);
            double d = antwoord;
            String str = Double.toString(d);
            tekstvak2.setText("");
            tekstvak.setText(str);
            repaint();
        }
    }

    class knopPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String g = tekstvak2.getText();
            getal2 = Double.parseDouble(g);
            double antwoord = (getal + getal2);
            double d = antwoord;
            String str = Double.toString(d);
            tekstvak2.setText("");
            tekstvak.setText(str);
            repaint();
        }
    }

    class knopMinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String g = tekstvak2.getText();
            getal2 = Double.parseDouble(g);
            double antwoord = (getal - getal2);
            double d = antwoord;
            String str = Double.toString(d);
            tekstvak2.setText("");
            tekstvak.setText(str);
            repaint();
        }
    }
}