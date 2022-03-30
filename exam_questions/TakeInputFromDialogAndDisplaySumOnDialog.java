import javax.swing.*;

class Dialog {

  Dialog() {
    JFrame f = new JFrame();
    String num1 = JOptionPane.showInputDialog(f, "Enter first number:");
    Double number1 = Double.parseDouble(num1);

    String num2 = JOptionPane.showInputDialog(f, "Enter second number:");
    Double number2 = Double.parseDouble(num2);

    Double res = number1 + number2;
    JOptionPane.showMessageDialog(f, "Sum is: " + res);
  }

  public static void main(String[] args) {
    new Dialog();
  }

}
