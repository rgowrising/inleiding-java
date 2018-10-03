package h011;
import java.awt.*;
import java.applet.*;
public class Opdracht118 extends Applet {

    public void init() {
    setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
        int width = 10;
        int height = 10;

        for (int i = 0; i < 100; i++) {

            g.drawOval(x, y, width, height);
            width = width + 5;
            height = height + 5;
        }
    }
}
