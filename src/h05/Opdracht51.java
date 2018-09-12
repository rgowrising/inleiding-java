package h05;
import java.awt.*;
import java.applet.*;

public class Opdracht51 extends Applet{

    Color mainColor;

    public void init() {
        mainColor = Color.magenta;
        mainColor = Color.green;

    }


    public void paint(Graphics g) {


        g.drawLine(20, 20, 120, 20);
        g.drawString("Lijn", 50, 40 );
        g.drawRect(20, 80, 100, 50);
        g.drawString("Rechthoek", 35, 160 );
        g.drawRoundRect(20,190,120,60,10,90);
        g.drawString("Afgeronde rechthoek", 30, 280 );
        g.setColor(Color.black);
        g.drawRect(160, 20, 130, 60);
        g.drawString("Gevulde rechthoek met ovaal", 160, 110 );
        g.setColor(mainColor);
        g.fillOval(160, 20, 130, 60);
        g.fillOval(160,140,130,60);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",180,220);
        g.setColor(Color.magenta);
        g.fillArc(420,20,100,90,15,32);
        g.setColor(Color.black);
        g.drawOval(385,20,133,60);
        g.drawString("Ovaal met taartpunt",385,100);






    }

}



