package h06;
import java.awt.*;
import java.applet.Applet;
public class Opdracht61 extends Applet {
    double a, b, c, uitkomst;
    public void init() {
        a = 113;
        b = 0;
        c = 4;
        uitkomst = (a + b) / c;
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Ali        28,25 ", 20, 60 );
        g.drawString("Jan        28,25",20,80 );
        g.drawString("Jeannette  28,25",20,100);
        g.drawString("Ik         28,25",20,120);

    }

}