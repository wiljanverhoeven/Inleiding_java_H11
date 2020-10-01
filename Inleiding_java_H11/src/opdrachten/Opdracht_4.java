package opdrachten;

import java.awt.*;
import java.applet.*;


public class Opdracht_4 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int y = 10;

        while(teller < 10) {
            y += 20;
            g.drawString("" +teller*3, 10, y );
            teller++;
        }
    }
}
