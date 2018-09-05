package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

//        // HORIZONTALE LIJN
//        g.drawLine(50,120, 270, 120);
//
//        // SCHUINE LIJN 1
//        g.drawLine(50,50,120,100);
//
//        // SCHUINE LIJN 2
//        g.drawLine(100,50,50, 10);
//        g.drawRect(20, 20, 100, 100);
//        g.drawArc(20, 20, 50, 50, 120, 100);
//        g.drawRoundRect(20, 20, 100, 75, 50, 100);

        // Verticale lijn 1
        g.drawLine(100,50,100,100);
        // Verticale lijn 2
        g.drawLine(200,100,200,50);

        // Horizontale lijn 1
        g.drawLine(200,100,100,100);
        // Horizontale lijn 2
        g.drawLine(100,50,200,50);

        g.drawRect(80,50,20,300);































    }
}