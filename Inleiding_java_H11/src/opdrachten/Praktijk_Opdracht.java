package opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijk_Opdracht extends Applet {
    TextField tekstvak1;
    Label label;
    Button knop;
    String antwoord;
    int cijfer, teller = 1;
    int y = 10;

    public void init() {
        setSize(200, 2000);

        label = new Label("vul een getal in:");
        tekstvak1 = new TextField("", 10);
        knop = new Button();
        knop.setLabel("OK");
        knop.addActionListener(new KnopListener());

        add(knop);
        add(label);
        add(tekstvak1);
    }

    public void paint(Graphics g) {
        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawString("" +teller*cijfer, 10, y);
        }
    }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                antwoord = tekstvak1.getText();
                cijfer = Integer.parseInt(antwoord);
                repaint();
                }
            }
        }