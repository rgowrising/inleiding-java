package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht47 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.drawRoundRect(90, 90, 150, 150, 50, 50);
        g.fillOval(95, 168, 60, 60);
        g.fillOval(170,168,60,60);
        g.fillOval(175,100,60,60);
        g.fillOval(95,100,60,60);
        g.setColor(Color.black);







    }

}

