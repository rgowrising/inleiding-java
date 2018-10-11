package h011;
import java.awt.*;
import java.applet.*;
public class Opdracht11schaakbord extends Applet {
    int y;
    int x;
    int breedte;
    int hoogte;

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        g.drawRect(29, 29, 241, 241);
        y = 30;
        x = 30;
        breedte = 30;
        hoogte = 30;
        for (int r = 0; r < 2; r++) {
            for (int j = 0; j < 2 ; j++) {
                for (int i = 0; i < 4; i++) {
                    for (int kolom = 0; kolom < 8; kolom++) {
                        System.out.println("In de for-loop");
                        if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                            System.out.println("In de if");
                            g.setColor(Color.black);
                            g.fillRect(x, y, breedte, hoogte);
                        } else {
                            System.out.println("In de else");
                            g.setColor(Color.white);
                            g.fillRect(x, y, breedte, hoogte);
                        }
                        x += breedte;
                    }
                    x = 30;
                    y += hoogte;

                    for (int kolom = 0; kolom < 8; kolom++) {
                        if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                            g.setColor(Color.white);
                            g.fillRect(x, y, breedte, hoogte);
                        } else {
                            g.setColor(Color.black);
                            g.fillRect(x, y, breedte, hoogte);
                        }
                        x += breedte;
                    }

                    x = 30;
                    y = 90;
                }
                x = 30;
                y = 150;
            }
            x = 30;
            y = 210;
        }

    }
}
