package h06;
import java.awt.*;
import java.applet.Applet;
public class Opdracht62 extends Applet {
    double a, b, c, uitkomst1,uur,dag,jaar,uitkomst2,uitkomst3;
    public void init() {
        uur = (1*60) *60;
        dag = (1* uur) * 24;
        jaar = (1 *dag) * 365;
        uitkomst1 = uur;
        uitkomst2 = dag;
        uitkomst3 = jaar;
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst1, 20, 20);
        g.drawString("Seconden in een uur",20,40);
        g.drawString("De uitkomst is: " + uitkomst2, 20, 60);
        g.drawString("Seconden in een dag",20,80);
        g.drawString("De uitkomst is:" + uitkomst3,20,100);
        g.drawString("Seconden in een jaar",20,120);


    }
}
