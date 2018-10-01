package h05;
import java.awt.*;
import java.applet.*;

public class Opdracht52 extends Applet {

    int gewicht;
    int hoogte;

    public void init() {
        setSize(1024,768);
        int Valeriegewicht;
        gewicht = 10*10;
        hoogte = 600 - gewicht;
//
        int Jeroengewicht;
        gewicht =180*10;
        hoogte = 600 - gewicht;

        int hansgewicht;
        gewicht = 20*10;
        hoogte = 600 - gewicht;
    }

    public void paint(Graphics g) {

        g.drawLine(100,600,400,600);
        g.drawLine(100,300,100,600);
        g.drawArc(10,20,40,60,80,100);
        g.drawString("Valerie", 100, 650 );
        g.drawString("Jeroen", 210, 650 );
        g.drawString("Hans", 310, 650 );
        g.drawString("0", 70, 600 );

        g.drawString("20", 70, 550 );
        g.drawString("40", 70, 500 );
        g.drawString("60", 70, 450 );
        g.drawString("80", 70, 400 );
        g.drawString("100", 70, 350 );
        g.drawString("120",70,300);
        // Staaf van Valerie

        g.setColor(Color.BLACK);
        g.fillRect(100, hoogte, 100, gewicht);
        g.setColor(Color.white);
        // Staaf van Jeroen

        g.drawRect(200, 350, 100, 250);
        g.setColor(Color.green);
        g.fillRect(200, hoogte, 100, gewicht);
        // Staaf van Hans

        g.drawRect(300, 400, 100, 200);
        g.setColor(Color.red);
        g.fillRect(300, hoogte, 100, gewicht);
    }


}
