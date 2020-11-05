/*
Øving 7
Program som tegner en smiley

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 7: Oppg. 9.11.2 og 10.9.1
*/

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;


class Vindu extends JFrame {
  public Vindu(String tittel){
    setTitle(tittel);
    setSize(1000, 1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tegning tegningen = new Tegning();
    add(tegningen);
  }
}

class Tegning extends JPanel {
  public void paintComponent(Graphics tegneflate){
    super.paintComponent(tegneflate);
    Color himmel = new Color(51, 153, 255);
    setBackground(himmel);
    Color ansikt = new Color(255,224,189);
    tegneflate.setColor(ansikt);
    tegneflate.drawOval(250, 200, 500, 550);
    tegneflate.fillOval(250, 200, 500, 550);
    tegneflate.fillRect(480, 745, 50, 20);
    tegneflate.fillOval(278, 720, 87, 300);
    tegneflate.setColor(Color.BLACK);
    tegneflate.fillOval(340, 300, 140, 100);
    tegneflate.fillOval(525, 300, 140, 100);
    tegneflate.drawArc(370, 490, 270, 200, 0, -180);
    tegneflate.drawLine(370, 590, 640, 590);
    tegneflate.drawArc(460, 400, 25, 100, 90, -160);
    tegneflate.drawArc(525, 400, 25, 100, 90, 160);
    tegneflate.drawArc(475, 487, 60, 20, 0, -180);
    tegneflate.setColor(Color.WHITE);
    tegneflate.fillOval(535, 335, 50, 50);
    tegneflate.fillOval(420, 335, 50, 50);
    tegneflate.fillOval(350, 760, 300, 400);
    tegneflate.fillOval(270, 762, 100, 300);
    tegneflate.setColor(ansikt);
    tegneflate.fillRect(291, 763, 62, 34);
    Font timesNew = new Font("Monospaced", Font.BOLD, 100);
    tegneflate.setFont(timesNew);
    tegneflate.setColor(Color.YELLOW);
    tegneflate.drawString("#", 400, 660);
    tegneflate.drawString("#", 450, 660);
    tegneflate.drawString("#", 500, 660);
    tegneflate.drawString("#", 550, 660);
  }
}

class Smiley{
  public static void main(String[] args){
    Vindu etVindu = new Vindu("Super fett SMILEY");
    etVindu.setVisible(true);
  }
}
