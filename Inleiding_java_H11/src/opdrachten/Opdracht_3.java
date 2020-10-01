package opdrachten;

import java.awt.*;
import java.applet.*;


public class Opdracht_3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 0;
        int teller = 0;

        while(teller < 21) {
            x += 35;
            g.drawString(""+c, x,10);
            c = a+b;
            a = b;
            b = c;
            teller++;
        }
    }
}
