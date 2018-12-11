package h012;
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Opdracht121 extends Applet {
double salaris[];
int random;
int gemiddelde;
int aantal;
int optelsom;

    public void init() {
salaris = new double[10];
        for (int teller = 0; teller < salaris.length; teller ++) {
            random = (int) (Math.random() * 10 + 20 + 25 + 30);
            optelsom = optelsom + random;
            aantal = teller + 1;
            gemiddelde = optelsom / aantal;
            salaris[teller] = random * teller + 10;

    }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }

        for (int teller = 0; teller < salaris.length; teller ++) {
    g.drawString("Het gemiddelde is:" +gemiddelde , 100, 20 * teller + 20);
        }
    }

    }








