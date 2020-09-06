package h02;

import java.awt.*;
import java.applet.*;

public class JavaAppletsVragen extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Wat is machinetaal?", 30, 40);
        g.setColor(Color.gray);
        g.drawString("Machinetaal is de taal die wordt doorgegeven aan de processor.", 30, 75);
        g.setColor(Color.gray);
        g.drawString("Dit wordt altijd weergeven in nullen en enen.", 30, 87);
        g.setColor(Color.gray);
        g.drawString("Dit is omdat een processor de normal code niet begrijpt.", 30, 99);
        g.setColor(Color.gray);
        g.drawString("Deze getallen bestaan vaak uit 8,16,32,64 en 86 cijfers/bits.", 30, 111);
        g.setColor(Color.black);
        g.drawString("Welke drie hulpmiddelen heb je nodig om te programmeren?", 30, 146);
        g.setColor(Color.gray);
        g.drawString("1. Een tekstverwerker.", 30, 181);
        g.setColor(Color.gray);
        g.drawString("2. Een compiler.", 30, 193);
        g.setColor(Color.gray);
        g.drawString("3. Een Linker.", 30, 205);
        g.setColor(Color.black);
        g.drawString("Hoe herken je opdrachten in de broncode?", 30, 250);
        g.setColor(Color.gray);
        g.drawString("Een opdracht wordt altijd afgesloten met een puntkomma, netzoals deze.", 30, 295);
        g.setColor(Color.black);
        g.drawString("Waartoe dienen de import-opdrachten?", 30, 340);
        g.setColor(Color.gray);
        g.drawString("Deze worden gebruikt om voorgedefinieerde codes op te halen.", 30, 375);
        g.setColor(Color.gray);
        g.drawString("Deze codes zijn dus door een ander geschreven.", 30, 387);
        g.setColor(Color.black);
        g.drawString("Wat is een methode?", 30, 427);
        g.setColor(Color.gray);
        g.drawString("Een methode is een aantal opdrachten met een naam erboven.", 30, 472);
        g.setColor(Color.gray);
        g.drawString("Deze worden aangegeven met ronde haakjes achter de naam.", 30, 485);
    }
}