package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaBeslissingenEindopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, Rating, Error;
    int dag;

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("Maandnummer:");
        tekstvak.addActionListener(new tekstvakListener());
        Rating = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("maand: " + Rating, 50, 60);
        g.drawString("Aantal dagen: " + Error, 50, 75);
    }


    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    Rating = "Slecht";
                    break;
                case 2:
                    Rating = "Slecht";
                    break;
                case 3:
                    Rating = "Slecht";
                    break;
                case 4:
                    Rating = "Onvoldoende";
                    break;
                case 5:
                    Rating = "Matig";
                    break;
                case 6:
                    Rating = "Voldoende";
                    break;
                case 7:
                    Rating = "Voldoende";
                    break;
                case 8:
                    Rating = "Goed";
                    break;
                case 9:
                    Rating = "Goed";
                    break;
                case 10:
                    Rating = "Goed";
                    break;
                default:
                    Rating = "";
                    Error = "Je hebt een fout nummer ingevoerd!!!";
                    break;
            }
            repaint();
        }
    }
}
