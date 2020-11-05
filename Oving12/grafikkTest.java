import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame{
  public Vindu(String tittel){
    setTitle(tittel);
    setSize(200, 220);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tegning tegningen = new Tegning();
    add(tegningen);
  }
}

class Tegning extends JPanel{
  public void paintComponent(Graphics tegneflate){
    super.paintComponent(tegneflate);
    setBackground(Color.WHITE);
    tegneflate.setColor(Color.RED);
    tegneflate.drawString("Hei Hei", 75, 90);
    tegneflate.drawRect(50, 50, 90, 70);
  }
}

class grafikkTest{
  public static void main(String[] args){
    Vindu etVindu = new Vindu("Enkel grafikk");
    etVindu.setVisible(true);
  }
}
