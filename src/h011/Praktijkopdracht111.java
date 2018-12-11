package h011;
import java.awt.*;
import java.applet.*;
public class Praktijkopdracht111 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int y = 2;

        for(teller = 2; teller < 11; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }

    }
}
