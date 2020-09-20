package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaMultimedia extends Applet {

    Button deelKnop = new Button();
    String deling;

    //Array voor het soort kaart

    String soortKaart[] = {"schoppen", "klaver", "harten", "ruiten"};

    //Array voor welke kaart uit bovengenoemde soort is

    String nummerKaart[] = {"twee", "drie", "vier", "vijf", "zes", "zeven",
            "acht", "negen", "tien", "boer", "aas", "vrouw", "heer"};

    //init voor het maken van een knopen en String "deling" een waarde te geven.

    public void init() {

        deling = "";

        deelKnop.setLabel( "delen" );
        deelKnop.addActionListener(new deelKnop());
        add(deelKnop);
    }

    //voor het schrijven van de deling in het scherm en de groote van de applet bepalen

    public void paint(Graphics g) {
        setSize(300,300);
        g.drawString("" + deling, 50, 60 );
    }

    //dit zorgt ervoor dat wanneer de knop wordt gedrukt de random math wordt uitgevoerd.
    //de random.math wordt dan vermenigvuldigt met de groote van de 2 arrays.

    private class deelKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String m = soortKaart[(int) (Math.random()* soortKaart.length)];
            String z = nummerKaart[(int) (Math.random()* nummerKaart.length)];
            deling = m + " " + z;
            repaint();
        }
    }
}