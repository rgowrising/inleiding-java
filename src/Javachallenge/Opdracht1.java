package Javachallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdracht1 extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    int hoogte;
    int gewicht;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Label label;
    Button knop;
    String s1;
    String s;

   public void init () {
       // Instantiëren
       Valerie = 20*10;
       hoogte = 600 - gewicht;
       gewicht = 100 - hoogte;
       setSize(1000,800);
       tekstvak = new TextField("", 20);
       label = new Label("Valerie");
       tekstvak = new TextField("", 5);
       tekstvak.addActionListener( new tekstvakListener() );


       label = new Label("Valerie" );

       add( label );
       add( tekstvak );
       tekstvak.addActionListener( new tekstvakListener() );
       add(label);
       add(tekstvak);
       s = "";
       s1 = "";
       tekstvak2 = new TextField("", 5);



       label = new Label("Hans" );




       label = new Label("Jeroen" );

       add( label );
       add( tekstvak );
       knop = new Button();
       knop.setLabel("Toon");
       knop.addActionListener(new Opdracht1.tekstvakListener());
       add(knop);
   }
    public void paint(Graphics g) {

        g.drawLine(100,600,400,600);
        g.drawLine(100,280,100,600);
        g.drawString("Valerie", 100, 650 );
        g.drawString("Jeroen", 210, 650 );
        g.drawString("Hans", 310, 650 );
        g.drawString("0", 70, 600 );

        g.drawString("20", 70, 550 );
        g.drawString("40", 70, 500 );
        g.drawString("60", 70, 450 );
        g.drawString("80", 70, 400 );
        g.drawString("100", 70, 350 );
        g.drawString("120",70,300);
        // Staaf van Valerie
        Valerie = 60*20;
        g.setColor(Color.BLACK);
        g.fillRect(100, 500, 100, 100);
        g.setColor(Color.white);
        // Staaf van Jeroen
        Jeroen=20*10;
        g.drawRect(200, 350, 100,hoogte *gewicht + hoogte );
        g.setColor(Color.green);
        g.fillRect(200, 350, 100, 250);
        // Staaf van Hans
        Hans=20*10;
        g.drawRect(300, 400, 100, 200);
        g.setColor(Color.red);
        g.fillRect(300, 400, 100, 200);
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            hoogte = Integer.parseInt(s);
            repaint();
        }
    }
}