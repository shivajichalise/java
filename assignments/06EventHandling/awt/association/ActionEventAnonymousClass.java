import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Exception;

class ActionEventAnonymousClass{
  
  TextField num1, num2, result;
  double c = 0.0;
  
  Button add, subtract, divide, multiply;
  
  ActionEventAnonymousClass(){
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


    add.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number1 = num1.getText();
        String number2 = num2.getText();
        try{
          double a = Double.parseDouble(number1);
          double b = Double.parseDouble(number2);
          c = a + b;
          String outcome = String.valueOf(c);
          result.setText(outcome);
        } catch (Exception error) {
          result.setText("Give valid Input");
        } 
      }
    });    
   
    subtract.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number1 = num1.getText();
        String number2 = num2.getText();
        
        try{
          double a = Double.parseDouble(number1);
          double b = Double.parseDouble(number2);
          c = a - b;
          String outcome = String.valueOf(c);
          result.setText(outcome);
        } catch (Exception error) {
          result.setText("Give valid Input");
        } 
      }
    });    

    divide.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number1 = num1.getText();
        String number2 = num2.getText();
        
        try{
          double a = Double.parseDouble(number1);
          double b = Double.parseDouble(number2);
          c = a / b;
          String outcome = String.valueOf(c);
          result.setText(outcome);
        } catch (Exception error) {
          result.setText("Give valid Input");
        } 
      }
    });   

    multiply.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String number1 = num1.getText();
        String number2 = num2.getText();
        
        try{
          double a = Double.parseDouble(number1);
          double b = Double.parseDouble(number2);
          c = a * b;
          String outcome = String.valueOf(c);
          result.setText(outcome);
        } catch (Exception error) {
          result.setText("Give valid Input");
        } 
      }
    });    
   
    Frame f = new Frame("Calculator");
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
  
  public static void main(String[] args) {
    new ActionEventAnonymousClass();
  }
}

