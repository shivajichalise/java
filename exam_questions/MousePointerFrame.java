import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class MousePointerFrame extends Frame implements MouseListener, MouseMotionListener {

  static JTextField tfield1, tfield2;

  MousePointerFrame() {
  }

  public static void main(String[] args) {
    MousePointerFrame m = new MousePointerFrame();

    JFrame f = new JFrame();
    JPanel p = new JPanel();
    p.setLayout(null);

    f.addMouseListener(m);
    f.addMouseMotionListener(m);

    tfield1 = new JTextField();
    tfield1.setBounds(50, 100, 200, 30);

    tfield2 = new JTextField();
    tfield2.setBounds(50, 150, 200, 30);

    p.add(tfield1);
    p.add(tfield2);

    f.add(p);
    f.setSize(400, 400);
    f.setVisible(true);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    tfield1.setText("Mouse Entered the Frame");
  }

  @Override
  public void mouseExited(MouseEvent e) {
    tfield1.setText("Mouse Leaved the Frame");
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    tfield2.setText("X: " + e.getX() + " Y: " + e.getY());
  }

  @Override
  public void mouseDragged(MouseEvent e) {
  }
}
