package h012;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht122 extends Applet {

    Button[] buttons = new Button[25];

    public void init() {
        for (int teller = 0; teller < 25 ; teller++) {
            Button knop = new Button();
            buttons[teller] = knop;
            knop.setLabel("knop");
            add(knop);
        }

        buttons[4].addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hallo, ik doe het");
        }
    }
}
