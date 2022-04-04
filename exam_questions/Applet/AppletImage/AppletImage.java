import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;

public class AppletImage extends Applet{
  Image img;
  
  public void init(){
    img = getImage(getCodeBase(), "pic.jpg");  
  }

  public void paint(Graphics g){
    g.drawImage(img, 30,30,this);
  }
}
