import java.util.Scanner;

class Product {
  String name;
  double price;

  Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
}

public class OnlineStore {

  public static double totalAmount = 0.0;
  long a;
  int b;
  double c;

  public static void listProducts(Product[] products) {
    int i = 1;
    for (Product p : products) {
      System.out.println(i + " " + p.name + ":" + p.price);
      i++;
    }
    System.out.println(i + " Exit");
    System.out.println('\n');
  }

  public static void main(String[] args) {

    Scanner scannerBuy = new Scanner(System.in);
    Scanner scannerProduct = new Scanner(System.in);
    Scanner scannerQuantity = new Scanner(System.in);
    String choice = null;

    Product p1 = new Product("Airpod", 248.5);
    Product p2 = new Product("iPhone", 1199.5);
    Product p3 = new Product("iPad", 248.5);
    Product p4 = new Product("M1 Macbook Air", 998.5);

    Product[] products = { p1, p2, p3, p4 };

    do {
      listProducts(products);
      System.out.println("Enter the number of the product you want to buy: ");

      int selectedProduct = scannerProduct.nextInt();
      if (selectedProduct == 5) {
        break;
      }

      selectedProduct--;

      int quantity;
      double quantityd;

      switch (selectedProduct) {
        case 0:
          System.out.println("Enter the quantity you want to buy: ");
          quantity = scannerQuantity.nextInt();
          quantityd = Double.valueOf(quantity);

          totalAmount += quantityd * products[0].price;
          break;
        case 1:
          System.out.println("Enter the quantity you want to buy: ");
          quantity = scannerQuantity.nextInt();
          quantityd = Double.valueOf(quantity);

          totalAmount += quantityd * products[1].price;
          break;
        case 2:
          System.out.println("Enter the quantity you want to buy: ");
          quantity = scannerQuantity.nextInt();
          quantityd = Double.valueOf(quantity);

          totalAmount += quantityd * products[2].price;
          break;
        case 3:
          System.out.println("Enter the quantity you want to buy: ");
          quantity = scannerQuantity.nextInt();
          quantityd = Double.valueOf(quantity);

          totalAmount += quantityd * products[3].price;
          break;
        case 4:
          break;
        default:
          System.out.println("Choose a valid option.");
      }

      System.out.println("Do you want to buy anything? Enter y for yes and q to exit: ");
      choice = scannerBuy.nextLine();
    } while (choice.equals("y"));

    System.out.println("Your total amount is: " + totalAmount);

    scannerBuy.close();
    scannerProduct.close();
    scannerQuantity.close();
  }
}
