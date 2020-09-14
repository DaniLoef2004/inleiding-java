package h11;

import java.awt.*;
import java.applet.*;

public class JavaHerhaling6 extends Applet {

 public void paint(Graphics g) {

     int x = 200;
     int y = 200;
     int aantal = 5;
     int lengte = 10;
     int breedte = 10;

     for (int teller = 0;teller < aantal; teller++) {

         g.drawOval(x, y, breedte, lengte);
         x -= 10;
         y -= 10;
         lengte +=20;
         breedte +=20;

     }

 }

}
