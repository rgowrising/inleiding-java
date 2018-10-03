package h011;
import java.awt.*;
import java.applet.*;
public class Opdracht117 extends Applet {

    public void init() {
        setSize(1000,800);
    }

    public void paint(Graphics g) {

        int x = 400;
        int y = 400;
        int width = 10;
        int height = 10;

        for (int i = 0; i < 50; i++) {

            g.drawOval(x, y, width, height);
            x = x - 5;
            y = y - 5;
            width = width + 10;
            height = height + 10;

        }


//        g.drawOval(20, 25, 20, 20);
//        g.drawOval(15, 20, 30, 30);
//        g.drawOval(10, 15, 40, 40);
//        g.drawOval(5, 10, 50, 50);
//        g.drawOval(0, 5, 60, 60);
//        g.drawOval(-5,0,70,70);
//        g.drawOval(-10,-5,80,80);
//        g.drawOval(-15,-10,90,90);
//        g.drawOval(-20,-15,100,100);
//        g.drawOval(-25,-20,110,110);
//        g.drawOval(-30,-25,120,120);
//        g.drawOval(-35,-30,130,130);
//        g.drawOval(-40,-35,140,140);
//        g.drawOval(-45,-40,150,150);
//        g.drawOval(-50,-45,160,160);
//        g.drawOval(-55,-50,170,170);
//        g.drawOval(-60,-55,180,180);
//        g.drawOval(-65,-60,190,190);
//        g.drawOval(-70,-65,200,200);
//        g.drawOval(-75,-70,210,210);
//        g.drawOval(-80,-75,220,220);
//        g.drawOval(-85,-80,230,230);
//        g.drawOval(-90,-85,240,240);
//        g.drawOval(-95,-90,250,250);
//        g.drawOval(-100,-95,250,250);
//        g.drawOval(-105,-100,260,260);






    }
}
