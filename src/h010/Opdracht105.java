package h010;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht105 extends Applet {
    Label label;
    String s, tekst;
    int aantal;
    Double eersteGetal;
    Double tweedeGetal;
    Double uitkomst;
    Double invoer;
    Double totaal;
    Button plusknop;
    Button Delen;
    String schermtekst;
    TextField eersteTekstvak;
    TextField tweedeTekstvak;


    public void init() {
        plusknop = new Button();
        plusknop.setLabel("+");
        add(plusknop);

        schermtekst = "...";
        eersteTekstvak = new TextField("", 20);
        label = new Label("Type je cijfer in" + "en druk op enter");
        add(label);
        plusknop.addActionListener( new Opdracht105.plusKnopListener() );
        setBackground(Color.green);
        add(eersteTekstvak);
        add(plusknop);
        Delen = new Button();
        Delen.setLabel("/");
        add(Delen);

        Delen.addActionListener( new Opdracht105.DelenKnopListener() );
        tweedeTekstvak = new TextField("", 20);
        add(tweedeTekstvak);



    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
        g.drawString("Is een voldoende vanaf 5.5",50,80);
        g.drawString("Is een onvoldoende als lager dan 5.5 is",50,100);
    }


    class plusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            eersteGetal=Double.parseDouble(eersteTekstvak.getText());
            tweedeGetal=Double.parseDouble(tweedeTekstvak.getText());
            uitkomst=eersteGetal+tweedeGetal;
            String s;
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
            String s;
            eersteTekstvak.setText("" +uitkomst);
            tweedeTekstvak.setText("");
            repaint();
        }
    }

}









