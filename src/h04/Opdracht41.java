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

        g.drawLine(100,200,200,50);
        g.drawLine(300,200,200,50);
        g.drawLine(100,200,300,200);
        g.drawLine(100,200,100,400);
        g.drawLine(300,200,300,400);
        g.drawLine(100,400,300,400);
        g.drawLine(150,300,150,400);
        g.drawLine(100,300,150,300);
        g.drawLine(220,220,280,220);
        g.drawLine(220,240,280,240);
        g.drawLine(220,220,280,220);


















    }
}