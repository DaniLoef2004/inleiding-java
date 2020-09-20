package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.Random;

public class JavaMultimediaEindopdracht extends Applet {

    //Variabele voor de afbeelding en voor de weg daar na toe

    private Image pepe;
    private URL pad;

   //Label maar dan zonder hoofdletters

    Label label;

    //Variabele naar tekstvak omdat dat makkelijker is

    TextField tekstvak;

    //makkelijke double voor math.random

    double random;

    //Geeft aan hoeveel rijen met pepe's er zijn

    int aantalRijen;

    //geeft het aantal pepes in total aan

    int pepeAantal;

    //Het getal dat de processor gaat gebruiken

    int computerGetal;

    //het x coordinaat

    int x;

    //het y coordinaat

    int y;

    //het getal dat de speler invoerd

    int spelerGetal;

    //de knop om het spel op te starten

    Button speelKnop;

    //een boolean voor als er een verkeerde invoer wordt gedetecteerd.

    boolean foutmelding;

    //een boolean om aan te geven of de knop ingedrukt is of niet

    boolean geklikt;

    //een boolean om te laten weten of het spel klaar is of niet

    boolean klaar;

    //een boolean die laat weten of het spel gestart wordt of niet

    boolean start;

    //een string die laat weten wat er gedaan moet worden wanneer de foutmelding true wordt

    String error;

    //het bericht wat verschijnt wanneer je of gewonnen of verloren hebt

    String eindBericht;

    public void init() {

        //foutmelding is normaal false

        foutmelding = false;

        //geklikt is normaal false

        geklikt = false;

        //klaar is normaal false

        klaar = false;

        //start is normaal false

        start = false;

        //het aantal pepes dat in het scherm verschijnt

        pepeAantal = 23;

        //het aantal rijen met pepes dat in het scherm verschijnt

        aantalRijen = 6;

        //standaard lege string voor de error

        error = "";

        //een label voor bij het tekstvak waar je de getallen invoer

        label = new Label("Neem 1, 2 of 3 pepes.");

        //maakt het label daadwerkelijk aan

        add(label);

        //een tekstvak waar je de getallen invoert.

        tekstvak = new TextField("", 3);

        //maakt het tekstvak daadwerkelijk aan

        add(tekstvak);

        //een knop waarmee je het spel begint

        speelKnop = new Button("Begin!");

        //een actionlistener voor de knop

        speelKnop.addActionListener(new speelKnopLuisteraar());

        //voegt de knop daadwerkelijk toe.

        add(speelKnop);

        //De route naar de afbeelding en de afbeelding zelf zijn hier aangegeven

        pad = JavaMultimediaEindopdracht.class.getResource("./Pictures/");
        pepe = getImage(pad, "090.jpg");
    }

    class speelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //neemt alle mogelijkheden door op volgorde.

            try {

                //als het spel klaar is

                if (klaar == true) {

                    //het spel opnieuw te beginnen

                    speelKnop.setLabel("Begin!");
                    pad = JavaMultimediaEindopdracht.class.getResource("./Pictures/");
                    pepe = getImage(pad, "090.jpg");
                    pepeAantal = 23;
                    klaar = false;
                }
                if (klaar == false) {

                    //kijken of de speler heeft verloren

                    error = "";
                    if (start == false) {
                        spelerGetal = Integer.parseInt(tekstvak.getText());
                    }
                    if (spelerGetal == 1 || spelerGetal == 2 || spelerGetal == 3) {
                        if (pepeAantal != 0) {
                            if (spelerGetal >= pepeAantal) {
                                spelerGetal = pepeAantal;
                                eindBericht = "Je hebt zojuist verloren tegen een programma dat een 16 jarig kind in 37 minuten heeft gemaakt.";
                                klaar = true;
                                start = true;
                                speelKnop.setLabel("Volgende keer beter geluk");
                            }
                        }

                        //opnieuw aangeven wat het aantal is

                        pepeAantal = pepeAantal - spelerGetal;

                        //kijken of de speler heeft gewonnen

                        if (pepeAantal != 0) {
                            if (computerGetal >= pepeAantal) {
                                computerGetal = pepeAantal;
                                eindBericht = "Goed gedaan!";;
                                klaar = true;
                                start = true;
                                speelKnop.setLabel("Kun je het tweemaal op rij?");
                            }
                        }
                        if (klaar == false) {

                           //alle mogelijkheden van de processor, spreken wel voor zich

                            if (pepeAantal % 4 == 1) {
                                random = Math.random();
                                computerGetal = new Random().nextInt(3) + 1;
                                pad = JavaMultimediaEindopdracht.class.getResource("./Pictures/");
                                pepe = getImage(pad, "090.jpg");
                            } else {
                                pad = JavaMultimediaEindopdracht.class.getResource("./Pictures/");
                                pepe = getImage(pad, "090.jpg");
                            }
                            if (pepeAantal % 4 == 2) {
                                computerGetal = 1;

                            }
                            if (pepeAantal % 4 == 3) {
                                computerGetal = 2;
                            }
                            if (pepeAantal % 4 == 0) {
                                computerGetal = 3;

                            }
                            if (start == true) {
                                start = false;
                                computerGetal = 0;
                                pepeAantal = 23;
                                pad = JavaMultimediaEindopdracht.class.getResource("./Pictures/");
                                pepe = getImage(pad, "090.jpg");
                            }
                        }
                        pepeAantal = pepeAantal - computerGetal;
                        geklikt = true;
                        tekstvak.setText("");
                        repaint();

                        //ggeft aan wanneer er een verkeerd getal is ingevoerd

                    } else {
                        spelerGetal = 0;
                        foutmelding = true;
                        geklikt = true;
                        error = "De variable klopt niet.";
                        tekstvak.setText("");
                        repaint();
                    }
                }
            } catch(NumberFormatException exc){
                foutmelding = true;
                geklikt = true;
                error = "De variable klopt niet.";
                tekstvak.setText("");
                repaint();
            }
        }
    }

    public void paint(Graphics g) {
        if (klaar == false) {
            aantalRijen = 6;
            x = 50;
            y = 40;
            if (foutmelding == false) {
                if (geklikt == true) {
                    g.drawString("do processor hield " + computerGetal + " pepes weg", 50, 50);
                }
                g.drawString("Pepe aantal: " + pepeAantal + " . Het is jouw beurt nu.", 50, 70);
                for (int pepes = 0; pepes < (pepeAantal); pepes++) {
                    if (pepes % 4 == 0) {
                        x = 50;
                        y += 50;
                    }
                    g.drawImage(pepe, x, y, 40, 40, this);
                    x += 50;
                }
            } else {
                g.drawString("" + error, 50, 50);
                for (int pepes = 0; pepes < (pepeAantal); pepes++) {
                    if (pepes % 4 == 0) {
                        x = 50;
                        y += 50;
                    }
                    if (spelerGetal <= pepeAantal) {
                        g.drawImage(pepe, x, y, 40, 40, this);
                        x += 50;
                    }
                }
                foutmelding = false;
            }
        }
        if (klaar == true) {
            if (pepeAantal <= 0) {
                g.drawString("" + eindBericht, 50, 50);
                x = 50;
                y = 80;
                tekstvak.setText("");
            }
        }
    }
}