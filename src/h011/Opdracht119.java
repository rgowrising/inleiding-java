package h011;
import java.awt.*;
import java.applet.*;
public class Opdracht119 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int cijfer;
        int y = 0;

        for(cijfer = 1; cijfer < 11; cijfer++) {
            y += 20;
            g.drawString("Rocky" + cijfer, 105, y );
        }
        }
    }

