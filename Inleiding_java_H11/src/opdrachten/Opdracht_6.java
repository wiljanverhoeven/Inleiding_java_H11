package opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x1 = 5;
        int y1 = 5;
        int x2 = 100;
        int y2 = 100;

        for(teller = 0; teller < 5; teller++) {
            x1 += 20;
            y1 += 20;
            x2 -= 10;
            y2 -= 10;
            g.drawOval(x2 , y2, x1, y1 );
        }
    }
}