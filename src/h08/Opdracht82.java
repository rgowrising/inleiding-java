package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht82 extends Applet {

    Button Knop1;
    Button Knop2;
    Button Knop3;
    Button Knop4;
    int totaal;

    public void init() {
        // Knop 1
        Knop1 = new Button();
        Knop1.setLabel("1");
        Knop1.addActionListener(new KnopListener());
        add(Knop1);

        // Knop 2
        Knop2 = new Button();
        Knop2.setLabel("2");
        add(Knop2);

        // Knop 3
        Knop3 = new Button();
        Knop3.setLabel("3");
        add(Knop3);

        // Knop 4
        Knop4 = new Button();
        Knop4.setLabel("4");
        add(Knop4);

        totaal = 0;

    }

    public void paint(Graphics g) {
        {
            g.drawString("Aantal:" + totaal, 50, 60);
            g.drawString("Vrouw",20,20);
            g.drawString("Man",20,60);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal++;
            repaint();
        }
    }
}