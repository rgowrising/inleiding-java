package h04;

import java.applet.Applet;
import java.awt.*;

// Stap 1: voeg 'extends Applet' toe
public class Template extends Applet {

    // Stap 2: maak de methode init()
    public void init() {
        // Hier komt code
    }

    // Stap 3: maak de methode paint()
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(45, 130, 10, 150);
        g.drawRect(15,30,90,100);
//        g.fillRect(20, 130, 100, 50);
        g.setColor(Color.red);
        g.drawOval(43, 50, 30, 30);
        g.drawArc(20, 20, 100, 50, 90, 45);
        g.setColor(Color.green);
        g.drawOval(43,90,30,30);









    }

}
