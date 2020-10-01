package opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_9 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int x2 = 25;
        int x3 = 0;
        int x4 = 25;
        int x5 = 0;
        int x6 = 25;
        int x7 = 0;
        int x8 = 25;

        for(teller = 0; teller < 4; teller++) {
            x += 50;
            x2 += 50;
            x3 += 50;
            x4 += 50;
            x5 += 50;
            x6 += 50;
            x7 += 50;
            x8 += 50;
            g.setColor(Color.black);
            g.drawRect(50, 5, 200, 195);
            g.fillRect(x , 5, 25, 25 );
            g.fillRect(x2 , 30, 25, 25 );
            g.fillRect(x3 , 55, 25, 25 );
            g.fillRect(x4 , 80, 25, 25 );
            g.fillRect(x5 , 105, 25, 25 );
            g.fillRect(x6 , 125, 25, 25 );
            g.fillRect(x7 , 150, 25, 25 );
            g.fillRect(x8 , 175, 25, 25 );
        }
    }
}