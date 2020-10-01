package opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_7 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        int teller;
        int x1 = 5;
        int y1 = 5;
        int x2 = 300;
        int y2 = 300;

        for(teller = 0; teller < 50; teller++) {
            x1 += 10;
            y1 += 10;
            x2 -= 5;
            y2 -= 5;
            g.drawOval(x2 , y2, x1, y1 );
        }
    }
}