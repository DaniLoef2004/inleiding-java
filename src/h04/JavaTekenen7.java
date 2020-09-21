package h04;

        import java.awt.*;
        import java.applet.*;

public class JavaTekenen7 extends Applet {

    public void paint(Graphics g) {
        g.drawRoundRect(20, 20, 50, 50, 10, 10);
        g.fillOval(30, 30, 10, 10);
        g.fillOval(50, 30, 10, 10);
        g.fillOval(30, 50, 10, 10);
        g.fillOval(50, 50, 10, 10);
    }
}