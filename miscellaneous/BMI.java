import java.util.Scanner; // importing scanner class
// The Scanner class is used to get user input

public class BMI {
  public static double weight;
  public static double height;

  public static double calculateBMI(double weight, double height) { // method to calculate BMI
    double bmi = weight / (height * height); // bmi calculation formula
    return bmi;
  }

  public static void BMIHealth(double bmi) { // methods that checks health according to bmi provided
    if (bmi < 18.5) {
      System.out.println("You're Underweight");
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      System.out.println("Your weight is healthy");
    } else if (bmi >= 25.0 && bmi <= 29.9) {
      System.out.println("You're overweight");
    } else {
      System.out.println("You're obese");
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // Scanner object is initialized with System.in that'll allow us to take input
                                        // 
                                        // from user

    System.out.println("Enter your weight in kg: ");
    weight = s.nextDouble(); // Reads a double value from the user

    System.out.println("Enter your height in meter: ");
    height = s.nextDouble();

    System.out.println("Your BMI is: " + calculateBMI(weight, height));

    BMIHealth(calculateBMI(weight, height));

    s.close(); // closing scanner to prevent memory leak
  }
}
