import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

public class Shapes extends JFrame {

	Shapes() {
		setSize(350, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		// circle
		g.fillOval(50, 50, 60, 60);

		// Oval
		g.setColor(Color.RED);
		g.fillOval(200, 50, 100, 60);

		// triangle
		g.setColor(Color.BLUE);
		int[] triangleX = { 150, 190, 150 };
		int[] triangleY = { 90, 150, 150 };
		Polygon triangle = new Polygon(triangleX, triangleY, triangleX.length);
		g.fillPolygon(triangle);

		// hexagon
		g.setColor(Color.CYAN);
		int[] hexagonX = { 190, 260, 300, 260, 190, 150 };
		int[] hexagonY = { 200, 200, 270, 350, 350, 270 };
		Polygon hexagon = new Polygon(hexagonX, hexagonY, hexagonX.length);
		g.fillPolygon(hexagon);

		// pentagon
		g.setColor(Color.GREEN);
		int[] pentagonX = { 90, 160, 200, 160, 90 };
		int[] pentagonY = { 400, 400, 470, 550, 550 };

		Polygon pentagon = new Polygon(pentagonX, pentagonY, pentagonX.length);
		g.fillPolygon(pentagon);
	}

	public static void main(String[] args) {
		new Shapes();
	}

}
