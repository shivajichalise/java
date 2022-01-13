import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Exception;

class CheckEvenOdd implements ActionListener{
  TextField num1, result;
  Button check;
  
  CheckEvenOdd(){
    num1 = new TextField();
    num1.setBounds(150, 100, 200, 30);

    result = new TextField();
    result.setBounds(150, 200, 200, 30);

    check = new Button("Check");
    check.setBounds(50, 250, 100, 50);
  
    Label num1Label, resultLabel;
    num1Label = new Label();
    num1Label.setText("Number: ");
    num1Label.setBounds(50, 100, 200, 30);
    
    resultLabel = new Label();
    resultLabel.setText("Result: ");
    resultLabel.setBounds(50, 200, 200, 30);

    check.addActionListener(this);    
    
    Frame f = new Frame("Calculator");
    f.add(num1);
    f.add(result);

    f.add(check);
    
    f.add(num1Label);
    f.add(resultLabel);

    f.setSize(900, 900);
    f.setLayout(null);    
    f.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e){
    String number1 = num1.getText();
    String c;
    
    try{
      double a = Double.parseDouble(number1);
      
      if(a%2 == 0){
        c = "Even";
      }else{
        c = "Odd";
      }

      String outcome = c;
      result.setText(outcome);
      } catch (Exception error) {
        result.setText("Give valid Input");
      } 

	}
  
  public static void main(String[] args) {
    new CheckEvenOdd();
  }
}
