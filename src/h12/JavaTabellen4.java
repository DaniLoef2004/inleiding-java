package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class JavaTabellen4 extends Applet{
    boolean found;
    int[] salary = {100, 200, 500, 400, 300,400,150,900};
    TextField field;
    Button Okbutton;
    int find;


    public void init() {
        setSize (400,600);
        field = new TextField ("",40);
        add (field);
        Okbutton = new Button ("OK");
        Okbutton.addActionListener(new okbuttonListener());
        add (Okbutton);
        find = 0;
        found = false;

    }

    public void paint(Graphics g) {
        if (found) {
            g.drawString("De waarde " + find + " is gevonden" , 20, 50);
        }
        else {
            g.drawString("De waarde " + find + " is niet gevonden." , 20, 50);
        }
    }
    class okbuttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String getal = field.getText ();
            find = Integer.parseInt (getal);
            int index = 0;
            while (index < salary.length ){
                if ( salary [index] == find){
                    found = true;
                    break;
                }
                index++;

            }
            field.setText ("");
            repaint ();
        }
    }
}