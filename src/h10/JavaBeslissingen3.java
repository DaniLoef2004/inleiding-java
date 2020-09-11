package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class JavaBeslissingen3 extends Applet {
    TextField tekstvak, tekstvakJaar;
    Label label;
    String s, maand, aantalDagen;
    int dag, jaar;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Maandnummer:");
        tekstvak.addActionListener( new tekstvakListener() );
        maand = "";
        add(label);
        add(tekstvak);
        tekstvakJaar = new TextField("", 20);
        label = new Label("Jaarnummer:");
        tekstvakJaar.addActionListener( new tekstvakJaarListener() );
        add(label);
        add(tekstvakJaar);

    }

    public void paint(Graphics g) {
        g.drawString("maand: " + maand, 50, 60 );
        g.drawString("Aantal dagen: " + aantalDagen, 50, 75 );
    }



    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    maand = "Januari";
                    aantalDagen = "31";
                    break;
                case 2:
                    maand = "februari";
                    aantalDagen = "28";
                    break;
                case 3:
                    maand = "maart";
                    aantalDagen = "31";
                    break;
                case 4:
                    maand = "april";
                    aantalDagen = "30";
                    break;
                case 5:
                    maand = "mei";
                    aantalDagen = "31";
                    break;
                case 6:
                    maand = "juni";
                    aantalDagen = "30";
                    break;
                case 7:
                    maand = "july";
                    aantalDagen = "31";
                    break;
                case 8:
                    maand = "augustus";
                    aantalDagen = "30";
                    break;
                case 9:
                    maand = "september";
                    aantalDagen = "31";
                    break;
                case 10:
                    maand = "oktober";
                    aantalDagen = "30";
                    break;
                case 11:
                    maand = "november";
                    aantalDagen = "31";
                    break;
                case 12:
                    maand = "december";
                    aantalDagen = "30";
                    break;
                default:
                    maand = "Sinds wanneer zijn er meer dan 12 maanden? Je bent net zo nutteloos als een rubberen snavel bij een specht.";
                    break;
            }
        }
    }
    class tekstvakJaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakJaar.getText();
            jaar = Integer.parseInt( s);
            if ( ((jaar % 4 == 0 && !(jaar % 100 == 0)) && dag == 2) || jaar % 400 == 0 ){
                aantalDagen = "29";
                repaint();

            }
        }
    }
    }
