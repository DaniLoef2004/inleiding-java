package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaKnoppenEnTekstvakken2 extends Applet {

    Button knopMannen;
    Button knopVrouwen;
    Button knopVrouwenLeerlingen;
    Button knopMannenLeerlingen;
    double tekstMannen;
    double tekstVrouwen;
    double tekstMannenLeerlingen;
    double tekstVrouwenLeerlingen;
    TextField tekstvak;
    Label label;
    double getal;
    double totaal;

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("Type hier iets");
        add(label);
        add(tekstvak);


        knopMannen = new Button("     Mannen     ");
        knopMannenListener kml = new knopMannenListener();
        knopMannen.addActionListener(kml);
        add(knopMannen);

        knopVrouwen = new Button("     Vrouwen     ");
        knopVrouwenListener kvl = new knopVrouwenListener();
        knopVrouwen.addActionListener(kvl);
        add(knopVrouwen);

        knopMannenLeerlingen = new Button("Mannen leerlingen");
        knopMannenLeerlingenListener kmll = new knopMannenLeerlingenListener();
        knopMannenLeerlingen.addActionListener(kmll);
        add(knopMannenLeerlingen);

        knopVrouwenLeerlingen = new Button("Vrouwen leerlingen");
        knopVrouwenLeerlingenListener kvll = new knopVrouwenLeerlingenListener();
        knopVrouwenLeerlingen.addActionListener(kvll);
        add(knopVrouwenLeerlingen);

    }

    public void paint(Graphics g) {
        g.drawString("Mannen: " + tekstMannen, 50, 75);
        g.drawString("Vrouwen: " + tekstVrouwen, 50, 90);
        g.drawString("Mannen leerlingen: " + tekstMannenLeerlingen, 50, 105);
        g.drawString("Vrouwen Leerlingen: " + tekstVrouwenLeerlingen, 50, 120);
        g.drawString("Totaal: " + totaal, 50, 135);
    }

    public void optellen() {
        double tijdelijkgetal = tekstMannen + tekstVrouwen + tekstMannenLeerlingen + tekstVrouwenLeerlingen;
        totaal = tijdelijkgetal;
        repaint();
    }

    class knopMannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            double tijdelijkgetal = getal + tekstMannen;
            tekstMannen = tijdelijkgetal;
            optellen();
        }
    }

    class knopVrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            double tijdelijkgetal = getal + tekstVrouwen;
            tekstVrouwen = tijdelijkgetal;
            optellen();
        }
    }

    class knopMannenLeerlingenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            double tijdelijkgetal = getal + tekstMannenLeerlingen;
            tekstMannenLeerlingen = tijdelijkgetal;
            optellen();
        }
    }

    class knopVrouwenLeerlingenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            double tijdelijkgetal = getal + tekstVrouwenLeerlingen;
            tekstVrouwenLeerlingen = tijdelijkgetal;
            optellen();
        }
    }
}