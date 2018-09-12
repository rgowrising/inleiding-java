package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;


public class Opdracht5 extends Applet {


    @Override
    public void paint(Graphics g) {
        g.drawLine(100, 600, 400, 600);
        g.drawLine(100, 300, 100, 600);
        g.drawArc(10, 20, 40, 60, 80, 100);
        g.drawString("Valerie", 100, 650);
        g.drawString("Jeroen", 210, 650);
        g.drawString("Hans", 310, 650);
        g.drawString("0", 70, 600);

        g.drawString("20", 70, 550);
        g.drawString("40", 70, 500);
        g.drawString("60", 70, 450);
        g.drawString("80", 70, 400);
        g.drawString("100", 70, 350);
        // Staaf van Valerie
        g.setColor(Color.BLACK);
        g.drawRect(100, 500, 100, 100);
        g.setColor(Color.BLUE);
        g.fillRect(100, 500, 100, 100);
        // Staaf van Jeroen
        g.drawRect(200, 350, 100, 250);
        g.setColor(Color.green);
        g.fillRect(200, 350, 100, 250);
        // Staaf van Hans
        g.drawRect(300, 400, 100, 200);
        g.setColor(Color.red);
        g.fillRect(300, 400, 100, 200);

    }



}
