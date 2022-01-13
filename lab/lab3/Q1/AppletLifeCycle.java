import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet{

	public void init(){
		System.out.println("Initialized!");
	}

	public void start(){
		System.out.println("STAND! started");
	}

	public void paint(Graphics g){
    g.drawString("Ora Ora Ora Ora painting", 25, 50);
	}

	public void stop(){
		System.out.println("The WORLD! stopped");
	}
	
	public void destroy(){
		System.out.println("omae wa mou shindeiru destruction");
	}	
}
