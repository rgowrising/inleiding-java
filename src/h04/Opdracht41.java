package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        // HORIZONTALE LIJN
        g.drawLine(50,50, 100, 50);

        // SCHUINE LIJN 1
        g.drawLine(50, 50,75,10);

        // SCHUINE LIJN 2
        g.drawLine(100,50,75,10);



    }
}