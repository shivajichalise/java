import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Exception;

class SwingCalc implements ActionListener{
  JTextField num1, num2, result;
  JButton add, subtract;
  
  SwingCalc(){
    num1 = new JTextField();
    num1.setBounds(150, 100, 200, 30);

    num2 = new JTextField();
    num2.setBounds(150, 150, 200, 30);

    result = new JTextField();
    result.setBounds(150, 200, 200, 30);

    add = new JButton("Add");
    add.setBounds(50, 250, 100, 50);

    subtract = new JButton("Subtract");
    subtract.setBounds(150, 250, 100, 50);
  
    JLabel num1JLabel, num2JLabel, resultJLabel;
    num1JLabel = new JLabel();
    num1JLabel.setText("Number 1: ");
    num1JLabel.setBounds(50, 100, 200, 30);
    
    num2JLabel = new JLabel();
    num2JLabel.setText("Number 2: ");
    num2JLabel.setBounds(50, 150, 200, 30);
    
    resultJLabel = new JLabel();
    resultJLabel.setText("Result: ");
    resultJLabel.setBounds(50, 200, 200, 30);

    add.addActionListener(this);    
    subtract.addActionListener(this);
    
    JFrame f = new JFrame("Calculator");
    f.add(num1);
    f.add(num2);
    f.add(result);

    f.add(add);
    f.add(subtract);
    
    f.add(num1JLabel);
    f.add(num2JLabel);
    f.add(resultJLabel);

    f.setSize(900, 900);
    f.setLayout(null);    
    f.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e){
    String number1 = num1.getText();
    String number2 = num2.getText();
    double c = 0.0;
    
    try{
      double a = Double.parseDouble(number1);
      double b = Double.parseDouble(number2);
      if (e.getSource() == add){    
          c = a + b;    
      } else if (e.getSource() == subtract){    
          c = a - b;    
      } 
             
      String outcome = String.valueOf(c);
      result.setText(outcome);
      } catch (Exception error) {
        result.setText("Give valid Input");
      } 

	}
  
  public static void main(String[] args) {
    new SwingCalc();
  }
}
