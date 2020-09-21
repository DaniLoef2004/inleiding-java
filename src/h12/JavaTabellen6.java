
package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaTabellen6 extends Applet {
    boolean gevonden;
    int[] nummers = {32,4,3,54,234,46,3,6,233,3,464,5,5,476,2,335,5453,63,532,63,76,2,7,2,74,373,72,523,6347,266,43};
    int vind, hoeVaak;
    Button okKnop;
    TextField tekstvak;

    public void init() {
        hoeVaak = 0;
        vind = 0;
        gevonden = false;
        tekstvak = new TextField("", 30);
        add(tekstvak);
        okKnop = new Button("Ok");
        add(okKnop);
        okKnop.addActionListener( new OkKnopListener());
    }

    class OkKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String getal = tekstvak.getText();
            vind = Integer.parseInt(getal);
            int index = 0;
            while(index < nummers.length) {
                if(nummers[index] == vind) {
                    gevonden = true;
                    hoeVaak ++;
                }
                index ++;
            }
            tekstvak.setText("");
            repaint();
        }
    }


    public void paint(Graphics g) {
        if(gevonden) {
            g.drawString("Het nummer  " + vind + " is " + hoeVaak + " keer gevonden!!", 20, 50);
            gevonden = false;
            hoeVaak = 0;
        }else {
            g.drawString("Het nummer " + vind + " is niet gevonden :(", 20, 50);
        }
    }
}