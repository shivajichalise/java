import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import javax.swing.JFrame;

class NepalFlag extends JFrame{
	NepalFlag(){
		super("Nepal Flag.");
		setSize(900,500);
		setVisible(true);
	}

	public void paint(Graphics g){
		Color crimson = new Color(221,12,57);

		int xNepalFlagBlue[] = {20,200,80,200,20};
		int yNepalFlagBlue[] = {130,230,230,340,340};
		
		Polygon border = new Polygon(xNepalFlagBlue,yNepalFlagBlue,xNepalFlagBlue.length);
		g.setColor(Color.BLUE);
		g.fillPolygon(border);

		int xNepalFlagCrimson[] = {26,170,65,180,30};
		int yNepalFlagCrimson[] = {142,224,224,332,332};
		
		Polygon internal = new Polygon(xNepalFlagCrimson,yNepalFlagCrimson,xNepalFlagCrimson.length);
		g.setColor(crimson);
		g.fillPolygon(internal);

		g.setColor(Color.WHITE);
		g.fillArc(35,165,60,50,0,-180);

		g.setColor(crimson);
		g.fillArc(34,175,62,30,0,-180);


		g.setColor(Color.WHITE);
		
		int xNepalFlagStar[] = {55,60,65,75,70,75,65,60,55,45,50,45};
		int yNepalFlagStar[] = {270,255,270,270,280,290,290,305,290,290,280,270};

		g.fillPolygon(xNepalFlagStar,yNepalFlagStar,xNepalFlagStar.length);
	}
	
	public static void main(String[] args){
		new NepalFlag();
	}
}
