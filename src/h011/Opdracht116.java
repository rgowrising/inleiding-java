package h011;
import java.awt.*;
import java.applet.*;
public class Opdracht116 extends Applet {

    public void init() {
//    setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.drawOval(20, 25, 20, 20);
        g.drawOval(15, 20, 30, 30);
        g.drawOval(10, 15, 40, 40);
        g.drawOval(5, 10, 50, 50);
        g.drawOval(0, 5, 60, 60);
    }

}
