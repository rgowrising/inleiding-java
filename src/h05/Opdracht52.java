package h05;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht52 extends Applet {

    // Globale variabelen
    int Valeriegewicht;
    int Valeriehoogte;
    int Hansgewicht;
    int Hanshoogte;
    int Jeroengewicht;
    int Jeroenhoogte;
    Button knop;
    String schermtekst;
    String input;
    String s;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    float invoer;
    Label label;
    Label label2;
    Label label3;

    public void init() {
        setSize(1024,768);
        label = new Label("Hans");
        tekstvak2 = new TextField("", 20);
        tekstvak2.addActionListener( new Tekstvak2Listener() );
        label2 = new Label("Valerie");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new TekstvakListener() );
        label3 = new Label("Jeroen");
        tekstvak3 = new TextField("",20);
        tekstvak3.addActionListener( new Tekstvak3Listener() );
        add(tekstvak3);
        add(label3);
        add(tekstvak);
        add(label);
        add(tekstvak2);
        add(label2);
        Valeriegewicht = 10*10;
        Jeroengewicht =10*10;
        Hansgewicht = 10*20;
        schermtekst = "";
        knop = new Button("Toon");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        Valeriehoogte = 600 - Valeriegewicht;
//
        Jeroenhoogte = 600 - Jeroengewicht;
//
        Hanshoogte = 600 - Hansgewicht;

        g.drawString(schermtekst, 50, 60 );
        g.drawLine(100,600,400,600);
        g.drawLine(100,300,100,600);
        g.drawString("Valerie", 100, 650 );
        g.drawString("Jeroen", 210, 650 );
        g.drawString("Hans", 310, 650);
        g.drawString("0", 70, 600 );

        g.drawString("20", 70, 550 );
        g.drawString("40", 70, 500 );
        g.drawString("60", 70, 450 );
        g.drawString("80", 70, 400 );
        g.drawString("100", 70, 350 );
        g.drawString("120",70,300);
        // Staaf van Valerie

        g.setColor(Color.BLACK);
        g.fillRect(100, Valeriehoogte, 100, Valeriegewicht);
        g.setColor(Color.white);
        // Staaf van Jeroen

        g.drawRect(200, 350, 100, 250);
        g.setColor(Color.green);
        g.fillRect(200, Jeroenhoogte, 100, Jeroengewicht);
//         Staaf van Hans

        g.drawRect(300, 400, 100, 200);
        g.setColor(Color.red);
        g.fillRect(300, Hanshoogte, 100, Hansgewicht);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            String input1 = tekstvak.getText();
            Valeriegewicht = Integer.parseInt(input1);
            tekstvak.setText(" ");

            String input2 = tekstvak2.getText();
            Hansgewicht = Integer.parseInt(input2);
            tekstvak2.setText(" ");

            String input3 = tekstvak3.getText();
            Jeroengewicht = Integer.parseInt(input3);
            tekstvak3.setText(" ");

            repaint();

        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input1 = tekstvak.getText();
            Valeriegewicht = Integer.parseInt( input1 );

            Valeriehoogte = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }
    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input2  = tekstvak2.getText();
            Hansgewicht = Integer.parseInt( input2 );

            Hanshoogte = Integer.parseInt(tekstvak2.getText());
            repaint();
        }
    }
    class Tekstvak3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input3 = tekstvak3.getText();
            Jeroengewicht = Integer.parseInt(input3);
            Jeroenhoogte = Integer.parseInt(tekstvak3.getText());
            repaint();
        }
    }
}
