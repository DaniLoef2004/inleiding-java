package h14;

        import java.applet.Applet;
        import java.applet.AudioClip;
        import java.awt.*;
        import java.awt.event.*;
        import java.util.*;
        import java.net.URL;

public class JavaMultimedia2 extends Applet {

    //Een Array voor het soort kaart

    String kleuren[] = {"Ruiten", "Klaver", "Harten", "Schoppen"};

    //een Array voor welke kaart uit bovengenoemde soort het is

    String cijfers[] = { "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "koningin", "koning", "aas"};

    //de array met een deck, maar 1 kaart minder.

    String[] nieuwDeck;

    //De array die laat zien dat het een deck van in totaal 52 kaarten is.

    String[] deck = new String[52];

    //Arrays van alle spelers en dat ze 13 kaarten elk krijgen.

    String[] speler1 = new String[13];
    String[] speler2 = new String[13];
    String[] speler3 = new String[13];
    String[] speler4 = new String[13];

    //De weg naar het bestand en het bestand zelf een variable geven.

    private URL pad;
    private AudioClip sound;

    //het aantal rijen (spelers), en het aantal kaarten dat ieder krijgt.

    int aantalRijen;
    int aantalKaarten;

//Dit wordt gebruikt om het aantal spelers later aan te geven.

    int speler;

//Dit om aan te geven dat er 52 kaarten zijn

    int index;

    //het Y coordinaat om aan te geven waar de kaarten neergezet moeten worden.

    int y;

    //De knop die het delen activeerd.

    Button deelKnop;

    //Deze boolean wordt positief wanneer de knop wordt ingedrukt.

    boolean geklikt;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void init() {

        //De weg naar het audiobestand en de benaming van het audiobestand zelf.

        pad = JavaMultimedia2.class.getResource("./Recordings/");
        sound = getAudioClip(pad, "005c05a0-fb8e-11ea-824b-35976a3b83aa.wav");

        //Het aantal rijen aan kaarten en het aantal kaarten wat er per rij is.

        aantalRijen = 4;
        aantalKaarten = 13;

        //Standaard waarde van de index moet altijd 0 zijn.

        index = 0;

        //Standaard waarde van geklikt moet false zijn, zodat diet niet automatisch wordt aangezien.

        geklikt = false;

        //de knop benamen en, de actionlistener en het toevoegen hiervan.

        deelKnop = new Button("Deel Kaart");
        deelKnop.addActionListener(new DeelKnopLuisteraar());
        add(deelKnop);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String trekKaart() {

        //het random generen van een kaart

        int random = new Random().nextInt(deck.length);
        String getrokkenKaart = deck[random];
        nieuwDeck = new String [deck.length - 1];
        int hulpindex = 0;
        for (int vulDeck = 0; vulDeck < deck.length; vulDeck++) {
            if (vulDeck != random) {
                nieuwDeck[hulpindex] = deck[vulDeck];
                hulpindex++;
            }
        }

        //Vervangen met de nieuwe lijst, maar exclusief de ene kaart.

        deck = nieuwDeck;

        //deze kaart terugroepen

        return getrokkenKaart;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    class DeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //Laat weten dat het deck uit 52 identieke kaarten bestaat.

            deck = new String[52];

            //Laat weten hoeveel kaarten al zijn gebruikt, standaardwaarde is 0.

            index = 0;

            //Hij pakt een willekeurige kleur / soort zolang deze nog beschikbaar is.

            for (int kleur = 0; kleur < kleuren.length; kleur++) {
                String kleurString = kleuren[kleur];

                //Hij pakt een willekeurig cijfer bij zogenoemde kleur wanneer deze nog beschikbaar is.

                for (int cijfer = 0; cijfer < cijfers.length; cijfer++) {
                    String cijferString = cijfers[cijfer];
                    String kaart = kleurString + " " + cijferString;

                    //Slaat als het waren deze generieke kaarten op.

                    deck[index] = kaart;
                    index++;
                }
            }
            index = 0;

            //geeft aan dat er op de knop geklikt is.

            geklikt = true;

            //Gaat alle aangemaakte kaarten verdelen.

            if (index < deck.length) {
                for (int verdelen = 0; verdelen < aantalKaarten; verdelen++) {

                    speler1[verdelen] = trekKaart();
                    speler2[verdelen] = trekKaart();
                    speler3[verdelen] = trekKaart();
                    speler4[verdelen] = trekKaart();
                    index++;
                }
            }
            repaint();
        }
    }


    //Zolang geklikt true is schrijft die de gegeven kaarten uit en played die het geluid als laatste, spreekt voor zichzelf.

    public void paint(Graphics g) {
        y = 80;
        int x = 80;
        speler = 1;
        if (geklikt == true) {
            for (int spelers = 0; spelers < 4; spelers++) {
                g.drawString("Speler " + speler, x, 60);
                speler++;
                x += 120;
            }
            for (int uitdelen = 0; uitdelen < aantalKaarten; uitdelen++) {
                g.drawString("" + speler1[uitdelen], 80, y);
                g.drawString("" + speler2[uitdelen], 200, y);
                g.drawString("" + speler3[uitdelen], 320, y);
                g.drawString("" + speler4[uitdelen], 440, y);
                y +=20;
                sound.play();
            }
        }
    }
}