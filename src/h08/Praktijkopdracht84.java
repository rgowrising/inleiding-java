package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht84 extends Applet {
    Button plusknop;
    Button resetknop;
    Button minKnop;
    Button KeerKnop;
    Button DelenKnop;
    double eersteGetal;
    double tweedeGetal;
    double uitkomst;
    TextField eersteTekstvak;
    TextField tweedeTekstvak;
    Label label;
    String schermtekst;


    public void init() {
        plusknop = new Button();
        plusknop.setLabel("+");
        add(plusknop);

        schermtekst = "...";
        eersteTekstvak = new TextField("", 20);
        label = new Label("Type iets in het  tekstvakje" + "en druk op enter");
        add(label);
        plusknop.addActionListener( new plusKnopListener() );

        add(eersteTekstvak);
        add(plusknop);
        tweedeTekstvak = new TextField("", 20);
        add(tweedeTekstvak);
        minKnop = new Button();
        minKnop.setLabel("-");
        add(minKnop);

        minKnop.addActionListener( new minKnopListener() );

        KeerKnop = new Button();
        KeerKnop.setLabel("*");
        add(KeerKnop);

        KeerKnop.addActionListener( new KeerKnopListener() );

        DelenKnop = new Button();
        DelenKnop.setLabel("/");
        add(DelenKnop);

        DelenKnop.addActionListener( new DelenKnopListener() );





    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }

    class plusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            eersteGetal=Double.parseDouble(eersteTekstvak.getText());
            tweedeGetal=Double.parseDouble(tweedeTekstvak.getText());
            uitkomst=eersteGetal+tweedeGetal;

            eersteTekstvak.setText("" +uitkomst);
            tweedeTekstvak.setText("");
            repaint();
        }
    }
    class minKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            eersteGetal=Double.parseDouble(eersteTekstvak.getText());
            tweedeGetal=Double.parseDouble(tweedeTekstvak.getText());
            uitkomst=eersteGetal-tweedeGetal;

            eersteTekstvak.setText("" +uitkomst);
            tweedeTekstvak.setText("");
            repaint();
        }
    }

    class KeerKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            eersteGetal=Double.parseDouble(eersteTekstvak.getText());
            tweedeGetal=Double.parseDouble(tweedeTekstvak.getText());
            uitkomst=eersteGetal*tweedeGetal;

            eersteTekstvak.setText("" +uitkomst);
            tweedeTekstvak.setText("");
            repaint();
        }
    }

    class DelenKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            eersteGetal=Double.parseDouble(eersteTekstvak.getText());
            tweedeGetal=Double.parseDouble(tweedeTekstvak.getText());
            uitkomst=eersteGetal/tweedeGetal;

            eersteTekstvak.setText("" +uitkomst);
            tweedeTekstvak.setText("");
            repaint();
        }
    }


}









