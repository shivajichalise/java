import java.awt.Graphics;
import java.awt.Button;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Audio extends Applet{
  Button play, pause;
  AudioClip audio;

  public void init(){
  audio = getAudioClip(getCodeBase(), "heartofgold.wav");

   play = new Button("Play");
   play.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
        audio.play();       
     }
   });

   pause = new Button("Pause"); 
   pause.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
        audio.stop();       
     }
   });

   add(play);
   add(pause);
  }

  public void paint(Graphics g){

  }
}
