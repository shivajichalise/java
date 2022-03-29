import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;

public class HorizontalButtonsUsingBoxLayout extends JFrame {

  HorizontalButtonsUsingBoxLayout() {
    JButton btn1 = new JButton("JButton 1");
    btn1.setAlignmentX(Component.CENTER_ALIGNMENT);

    JButton btn2 = new JButton("JButton 2");
    btn2.setAlignmentX(Component.CENTER_ALIGNMENT);

    JButton btn3 = new JButton("JButton 3");
    btn3.setAlignmentX(Component.CENTER_ALIGNMENT);

    JButton btn4 = new JButton("Long Named Button 4");
    btn4.setAlignmentX(Component.CENTER_ALIGNMENT);

    JButton btn5 = new JButton("5");
    btn5.setAlignmentX(Component.CENTER_ALIGNMENT);

    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    setSize(500, 500);
    setVisible(true);
  }

  public static void main(String[] args) {
    new HorizontalButtonsUsingBoxLayout();
  }
}
