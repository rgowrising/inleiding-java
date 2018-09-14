package h06;
import java.awt.*;
import java.applet.Applet;
public class Opdracht63 extends Applet {
    int getal1; int getal2, resultaat;
    public void init() {
        getal1 = 2147483647;
        getal2 = 1;
        resultaat = getal1 + getal2;
    }
    public void paint(Graphics g) {
        g.drawString("Resultaat =" + resultaat,20,30);

    }
}
