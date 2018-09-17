package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht81 extends Applet {
    Button okKnop, resetKnop, KnopListener, TextField, tekstvak, setText;
    String tekst;
    public void init() {
        okKnop = new Button();
        okKnop.setLabel("Oke");
        add(okKnop);
        resetKnop = new Button();
        resetKnop.setLabel("Reset");
        add (resetKnop);
        KnopListener kl = new KnopListener();
        resetKnop.addActionListener( kl );
        tekst = "Doet deze knop wel iets?";
    }
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = "";
            repaint();
        }
    }
}
