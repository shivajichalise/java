import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

class NepalFlag extends JFrame {
  NepalFlag() {
    setSize(400, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void paint(Graphics g) {
    // Flag Outline
    final int SIZE = 50;
    int tri1X[] = { 100, 100, (100 + SIZE) };
    int tri1Y[] = { 100, (100 + SIZE), (100 + (SIZE / 2)) };

    Polygon tri1 = new Polygon(tri1X, tri1Y, tri1X.length);
    g.setColor(Color.RED);
    g.fillPolygon(tri1);
    g.drawPolygon(tri1);

    int tri2X[] = { 100, 100, (100 + SIZE) };
    int tri2Y[] = { tri1Y[1], (tri1Y[1] + SIZE), (100 + SIZE + (SIZE / 2)) };
    Polygon tri2 = new Polygon(tri2X, tri2Y, tri2X.length);
    g.setColor(Color.RED);
    g.fillPolygon(tri2);
    g.drawPolygon(tri2);

    g.drawLine(100, tri2Y[1], 100, tri2Y[1] + SIZE);
    // Flag Outline

    // Moon
    g.setColor(Color.WHITE);
    g.fillArc(105, (100 + (SIZE / 4)), 20, 15, 0, -180);
    // g.fillArc(int x, int y, int width, int length, int startAngle, int arcAngle)
    // Moon

    // Sun
    g.fillOval(110, (100 + SIZE + (SIZE / 3)), 10, 10);
    // Sun
  }

  public static void main(String[] args) {
    new NepalFlag();
  }

}
