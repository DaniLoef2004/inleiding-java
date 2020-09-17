package h12;

import java.applet.*;
import java.awt.*;

public class JavaTabellen2 extends Applet{

    Button knop;
    int knoppen[];
    int teller;

    public void init() {
        knoppen = new int[26];
        for (teller = 0; teller < knoppen.length; teller++) {
            knop = new Button();
            knop.setLabel("" + teller);
            add(knop);

        }
    }
}
