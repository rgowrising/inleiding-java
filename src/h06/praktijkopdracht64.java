package h06;
import java.awt.*;
import java.applet.Applet;
public class praktijkopdracht64 extends Applet {
    double getal1;
    double getal2, resultaat, getal3,getal4;

    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;
        getal4 = 3;
        resultaat = ( getal1 + getal2 + getal3) / getal4;
    }

    public void paint(Graphics g) {
        g.drawString("resultaat ="+resultaat,20,20);


    }


}
