package h04;

import java.applet.Applet;
import java.awt.*;

// Stap 1: voeg 'extends Applet' toe
public class opdracht45 extends Applet {

    // Stap 2: maak de methode init()
    public void init() {

    }

    // Stap 3: maak de methode paint()
    public void paint(Graphics g) {

        g.drawOval(50,20, 100, 150);
        g.drawArc(20, 20, 100, 50, 90, 45);
        setBackground(Color.blue);
        g.fillArc(50, 20, 100, 150, 90, 45);
        g.setColor(Color.yellow);
        setBackground(Color.magenta);




    }

}













