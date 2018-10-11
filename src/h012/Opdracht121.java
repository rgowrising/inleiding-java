package h012;
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Opdracht121 extends Applet {
    Double[] getal = {7.0, 8.5, 4.5, 5.5, 9.0,4.0,3.5,6.5,5.0,2.0};
    TextField tekstvak;

    public void init() {
        Arrays.sort(getal);
        tekstvak = new TextField("", 20);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawString("", 50, 20 );
        }
    }
}





