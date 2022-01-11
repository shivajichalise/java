import java.lang.Exception;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalcUsingLayoutManagers extends JFrame implements ActionListener {
  JLabel header, footer, num1Label, num2Label, resultLabel;
  JPanel calcDisplay, calcOptions, optionLeft, optionRight;
  JButton subtract, divide, multiply;
  Button add;
  JTextField num1, num2, result;

  CalcUsingLayoutManagers() {

    setLayout(new BorderLayout(10, 10));
    setSize(400, 400);
    setVisible(true);

    header = new JLabel("Calculator");
    footer = new JLabel("assigment 007");

    calcDisplay = new JPanel(new GridLayout(3, 2, 5, 5));
    calcDisplay.setBackground(Color.gray);

    num1Label = new JLabel("Number 1: ");
    num1Label.setFont(new Font("Arial", Font.TRUETYPE_FONT, 22));

    num2Label = new JLabel("Number 2: ");
    num2Label.setFont(new Font("Arial", Font.TRUETYPE_FONT, 22));

    resultLabel = new JLabel("Result: ");
    resultLabel.setFont(new Font("Arial", Font.TRUETYPE_FONT, 22));

    num1 = new JTextField();
    num1.setFont(new Font("Arial", Font.TRUETYPE_FONT, 22));

    num2 = new JTextField();
    num2.setFont(new Font("Arial", Font.TRUETYPE_FONT, 22));

    result = new JTextField();
    result.setFont(new Font("Arial", Font.TRUETYPE_FONT, 22));

    calcDisplay.add(num1Label);
    calcDisplay.add(num1);
    calcDisplay.add(num2Label);
    calcDisplay.add(num2);
    calcDisplay.add(resultLabel);
    calcDisplay.add(result);

    add = new Button("+");
    add.setPreferredSize(new Dimension(50, 644));
    add.setBackground(Color.RED);
    add.setForeground(new Color(255, 255, 255));

    subtract = new JButton("-");
    subtract.setPreferredSize(new Dimension(50, 210));
    subtract.setBackground(Color.RED);
    subtract.setForeground(new Color(255, 255, 255));

    divide = new JButton("/");
    divide.setPreferredSize(new Dimension(50, 210));
    divide.setBackground(Color.RED);
    divide.setForeground(new Color(255, 255, 255));

    multiply = new JButton("*");
    multiply.setPreferredSize(new Dimension(50, 210));
    multiply.setBackground(Color.RED);
    multiply.setForeground(new Color(255, 255, 255));

    calcOptions = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 25));
    // calcOptions.setBackground(Color.red);

    optionLeft = new JPanel();
    optionLeft.setLayout(new BoxLayout(optionLeft, BoxLayout.Y_AXIS));
    // optionLeft.setBackground(Color.green);
    optionLeft.add(add);

    optionRight = new JPanel(new GridLayout(3, 1, 10, 5));
    // optionRight.setBackground(Color.green);
    optionRight.add(subtract);
    optionRight.add(divide);
    optionRight.add(multiply);

    add.addActionListener(this);
    subtract.addActionListener(this);
    divide.addActionListener(this);
    multiply.addActionListener(this);

    calcOptions.add(optionLeft);
    calcOptions.add(optionRight);

    add(header, BorderLayout.NORTH);
    add(footer, BorderLayout.SOUTH);
    add(calcDisplay, BorderLayout.CENTER);
    add(calcOptions, BorderLayout.EAST);

  }

  public void actionPerformed(ActionEvent e) {
    String number1 = num1.getText();
    String number2 = num2.getText();
    double c = 0.0;

    try {
      double a = Double.parseDouble(number1);
      double b = Double.parseDouble(number2);
      if (e.getSource() == add) {
        c = a + b;
      } else if (e.getSource() == subtract) {
        c = a - b;
      } else if (e.getSource() == divide) {
        // try{
        c = a / b;
        // } catch (ArithmeticException error) {
        // result.setText("Cannot " + error.getMessage());
        // return;
        // }
      } else if (e.getSource() == multiply) {
        c = a * b;
      }

      String outcome = String.valueOf(c);
      result.setText(outcome);
    } catch (Exception error) {
      result.setText("Give valid Input");
    }

  }

  public static void main(String[] args) throws Exception {
    new CalcUsingLayoutManagers();
  }
}
