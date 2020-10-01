package opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_8 extends Applet {

    public void init() {
        setSize(4000, 4000);
    }

    public void paint(Graphics g) {
        int teller;
        int x1 = 1;
        int y1 = 1;

        for(teller = 0; teller < 100; teller++) {
            x1 += 10;
            y1 += 10;
            g.drawOval(1 , 1, x1, y1 );
        }
    }
}
