import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Frame;

class Shapes extends Frame {
  Shapes() {
    setSize(400, 400);
    setVisible(true);
  }

  public void paint(Graphics g) {
    g.drawRect(50, 60, 20, 20);

    int pentaX[] = { 100, 100, 200, 250, 200 };
    int pentaY[] = { 200, 100, 100, 150, 200 };
    Polygon pentagon = new Polygon(pentaX, pentaY, pentaX.length);
    g.drawPolygon(pentagon);

    int hexaX[] = { 100, 200, 300, 400, 300, 200 };
    int hexaY[] = { 500, 400, 400, 500, 600, 600 };
    Polygon hexagon = new Polygon(hexaX, hexaY, hexaX.length);
    g.drawPolygon(hexagon);

    g.drawOval(100, 200, 300, 200);
    g.drawOval(100, 400, 100, 100);

  }

  public static void main(String[] args) {
    new Shapes();
  }
}
