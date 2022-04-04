import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class AppletGraphics extends Applet{
  public void paint(Graphics g) {
    String str = "Pokhara University";
    g.setFont(new Font("serif", Font.BOLD, 20));
    g.setColor(Color.RED);
    g.drawString(str, 10, 20);
    g.setColor(Color.GREEN);
  }
}
