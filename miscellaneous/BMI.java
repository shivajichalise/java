import java.util.Scanner;

public class BMI {
  public static double weight;
  public static double height;

  public static double calculateBMI(double weight, double height) {
    double bmi = weight / (height * height);
    return bmi;
  }

  public static void BMIHealth(double bmi) {
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
    Scanner s = new Scanner(System.in);

    System.out.println("Enter your weight in kg: ");
    weight = s.nextDouble();

    System.out.println("Enter your height in meter: ");
    height = s.nextDouble();

    System.out.println("Your BMI is: " + calculateBMI(weight, height));

    BMIHealth(calculateBMI(weight, height));

    s.close();
  }
}
