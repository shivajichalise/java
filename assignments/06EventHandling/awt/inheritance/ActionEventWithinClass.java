import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Exception;

class ActionEventWithinClass extends Frame implements ActionListener{
  TextField num1, num2, result;
  Button add, subtract, divide, multiply;
  
  ActionEventWithinClass(){
    num1 = new TextField();
    num1.setBounds(150, 100, 200, 30);

    num2 = new TextField();
    num2.setBounds(150, 150, 200, 30);

    result = new TextField();
    result.setBounds(150, 200, 200, 30);

    add = new Button("Add");
    add.setBounds(50, 250, 100, 50);

    subtract = new Button("Subtract");
    subtract.setBounds(150, 250, 100, 50);
    
    divide = new Button("Divide");
    divide.setBounds(250, 250, 100, 50);
    
    multiply = new Button("Multiply");
    multiply.setBounds(350, 250, 100, 50);
  
    Label num1Label, num2Label, resultLabel;
    num1Label = new Label();
    num1Label.setText("Number 1: ");
    num1Label.setBounds(50, 100, 200, 30);
    
    num2Label = new Label();
    num2Label.setText("Number 2: ");
    num2Label.setBounds(50, 150, 200, 30);
    
    resultLabel = new Label();
    resultLabel.setText("Result: ");
    resultLabel.setBounds(50, 200, 200, 30);

    add.addActionListener(this);    
    subtract.addActionListener(this);
    divide.addActionListener(this);
    multiply.addActionListener(this);
    
    add(num1);
    add(num2);
    add(result);

    add(add);
    add(subtract);
    add(divide);
    add(multiply);
    
    add(num1Label);
    add(num2Label);
    add(resultLabel);

    setSize(900, 900);
    setLayout(null);    
    setVisible(true);
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
      } else if (e.getSource() == divide) {
          // try{
            c = a / b;
          // } catch (ArithmeticException error) {
          //   result.setText("Cannot " + error.getMessage());
          //   return;
          // }
      } else if (e.getSource() == multiply){    
          c = a * b;    
      }
      } catch (Exception error) {
        result.setText("Give valid Input");
      } 

      String outcome = String.valueOf(c);
      result.setText(outcome);
	}
  
  public static void main(String[] args) {
    new ActionEventWithinClass();
  }
}

