package opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 5;

        for(teller = 0; teller < 10; teller++) {
            x += 10;
            g.drawLine(x , 300, x, 10 );
        }
    }
}