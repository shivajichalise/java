import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

class SwingIsA extends JFrame {
    public static void main(String[] args) {

    SwingIsA a = new SwingIsA();
    
    JTextField num1, num2, result;
    num1 = new JTextField();
    num1.setBounds(150, 100, 200, 30);

    num2 = new JTextField();
    num2.setBounds(150, 150, 200, 30);

    result = new JTextField();
    result.setBounds(150, 200, 200, 30);

    JButton add, subtract, divide, multiply;
    add = new JButton("Add");
    add.setBounds(50, 250, 100, 50);

    subtract = new JButton("Subtract");
    subtract.setBounds(150, 250, 100, 50);
    
    divide = new JButton("Divide");
    divide.setBounds(250, 250, 100, 50);
    
    multiply = new JButton("Multiply");
    multiply.setBounds(350, 250, 100, 50);
  
    JLabel num1Label, num2Label, resultLabel;
    num1Label = new JLabel();
    num1Label.setText("Number 1: ");
    num1Label.setBounds(50, 100, 200, 30);
    
    num2Label = new JLabel();
    num2Label.setText("Number 2: ");
    num2Label.setBounds(50, 150, 200, 30);
    
    resultLabel = new JLabel();
    resultLabel.setText("Result: ");
    resultLabel.setBounds(50, 200, 200, 30);

    a.add(num1);
    a.add(num2);
    a.add(result);

    a.add(add);
    a.add(subtract);
    a.add(divide);
    a.add(multiply);
    
    a.add(num1Label);
    a.add(num2Label);
    a.add(resultLabel);

    a.setSize(900, 900);
    a.setLayout(null);    
    a.setVisible(true);
  }
}

