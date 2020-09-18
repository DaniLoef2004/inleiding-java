package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaTabellenPraktijkopdracht extends Applet {

    int index;
    int teller;

    Button knop;

    TextField naamTekstvak;
    TextField telefoonTekstvak;

    String voornaam[];
    String telefoonnummer[];
    String error;

    Label voornaamLabel;
    Label telefoonnummerLabel;

    boolean foutmelding;

    public void init() {
        error = "";
        foutmelding = false;
        index = 0;
        teller = 0;

        voornaam = new String[10];
        telefoonnummer = new String[10];

        voornaamLabel = new Label("Vul uw voornaam in");
        add(voornaamLabel);
        naamTekstvak = new TextField("", 20);
        add(naamTekstvak);

        telefoonnummerLabel = new Label("Vul uw telefoonnummer in");
        add(telefoonnummerLabel);
        telefoonTekstvak = new TextField("", 20);
        add(telefoonTekstvak);

        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new OkKnopListener());
    }

    class OkKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            voornaam[index] = naamTekstvak.getText();
            telefoonnummer[index] = telefoonTekstvak.getText();

            if (!voornaam[index].equals("") && !telefoonnummer[index].equals("")) {
                if (index == 10) {
                    for (teller = 0; teller < voornaam.length; teller++) {
                        voornaam[teller] = "";
                    }
                    for (teller = 0; teller < telefoonnummer.length; teller++) {
                        voornaam[teller] = "";
                    }
                }
                index++;
            }
            else {
                foutmelding = true;
                error = "Foute input!!!!!!";
            }
            naamTekstvak.setText("");
            telefoonTekstvak.setText("");
            repaint();
        }
    }

    public void paint(Graphics g) {
        int y = 30;
        if (foutmelding == false) {
            if (index < 10) {
                g.drawString(index + " van de 10 nummers", 50, 50);
            }
            if (index == 10) {
                for (int teller = 0; teller < index;teller++) {
                    y += 70;
                    g.drawString("nummer " + teller + ":", 50, y );
                    g.drawString("Voornaam: " + voornaam[teller], 50, y + 15);
                    g.drawString("Telefoonnummer" + telefoonnummer[teller], 50, y + 30);
                }
                index = 0;
            }
        } else {
            g.drawString("Aantal ingevoerd: " + index + "/10", 50, 50);
            g.drawString("" + error, 50, 70);
            foutmelding = false;
        }
    }
}