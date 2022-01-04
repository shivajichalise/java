import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

class SwingHasA {
  public static void main(String[] args){
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


    JFrame f = new JFrame("Calculator");
    f.add(num1);
    f.add(num2);
    f.add(result);

    f.add(add);
    f.add(subtract);
    f.add(divide);
    f.add(multiply);
    
    f.add(num1Label);
    f.add(num2Label);
    f.add(resultLabel);

    f.setSize(900, 900);
    f.setLayout(null);    
    f.setVisible(true);
  }
}
