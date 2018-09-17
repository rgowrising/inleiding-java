package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht83 extends Applet {
Button knop1;
Button knop2;
Button knop3;
Label label;
TextField tekstvak;
double getal;
double totaal;
    public void init(){
        tekstvak = new TextField("Klik op mij", 20);
        add(tekstvak);
        label = new Label("Type iets in het  tekstvakje");
        add(label);
        // Knop 1
         knop1 = new Button();
        knop1.setLabel("Oke");
        knop1.addActionListener(new Opdracht83.KnopListener());
        add(knop1);
        totaal = 0;


    } public void paint(Graphics g) {
        g.drawString("Prijs incusief BTW:" + totaal, 50, 60);

    }  class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            totaal = getal * 1.21;
            repaint();
        }

    }


}
