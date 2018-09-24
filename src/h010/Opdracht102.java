package h010;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht102 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int inputgetal;
    int maxgetal;
    int mingetal;
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal en druk op enter");
        tekstvak.addActionListener( new Opdracht102.TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        maxgetal = 0;
        mingetal = 0;
    }
    public void paint(Graphics g) {
        g.drawString("" + maxgetal, 50, 60 );
        g.drawString("" + mingetal, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            inputgetal = Integer.parseInt( s);

            if ( inputgetal > maxgetal) {
                maxgetal = inputgetal;
            } else if ( inputgetal > mingetal) {
                   mingetal = inputgetal;
            }
            repaint();


        }


    }

}
