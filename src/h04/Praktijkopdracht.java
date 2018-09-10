package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.drawLine(50,50,100,50);
        g.drawRect(50,150,150,100);
        g.drawOval(300,150,50,50);
        g.drawRoundRect(150,300,200,100,90,90);
        g.drawOval(375, 300, 75, 100);
        g.drawString("Lijn", 50, 65 );
        g.drawString("Rechthoek", 50, 300 );
        g.drawString("cirkel" ,300,250);
        g.drawString("Ovaal" ,375,450);
        g.drawString("Afgeronde rechthoek",150,450);



















    }



}
