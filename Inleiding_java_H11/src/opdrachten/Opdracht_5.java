package opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 5;
        int y = 5;

        for(teller = 0; teller < 5; teller++) {
            x += 20;
            y += 20;
            g.drawRect(x , y, 20, 20 );
        }
    }
}