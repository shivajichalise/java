import java.time.LocalDate; // import the LocalDate class

public class Account { // defining a class
  private int id = 0;
  private double balance = 0;
  private double annualInterestRate = 0;
  private LocalDate dateCreated;

  public Account() { // default constructor
    // this keyword refers to the current object in a method or constructor.
    this.dateCreated = LocalDate.now();
  }

  public Account(int id, double initialBalance) { // parameterized constructor
    this.id = id;
    this.balance = initialBalance;
    this.dateCreated = LocalDate.now();
  }

  public int getId() { // getter method for id
    return this.id;
  }

  public void setId(int id) { // setter method for id
    this.id = id;
  }

  public double getBalance() { // getter method for balance
    return this.balance;
  }

  public void setBalance(double initialBalance) { // setter method for balance
    this.balance = initialBalance;
  }

  public double getAnnualInterestRate() { // getter method for annual interest rate
    return this.annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) { // setter method for annual interest rate
    this.annualInterestRate = annualInterestRate;
  }

  public LocalDate getCreatedDate() { // getter method for account created date
    return this.dateCreated;
  }

  public double getMonthlyInterestRate() { // getter method for monthly interest rate
    return (this.annualInterestRate / 12);
  }

  public void withdraw(double amount) { // method to withdraw money
    if (!(amount > this.balance)) {
      this.balance -= amount; // this is Subtraction Assignment Operator and is equivalent to writing balance
                              // = balance - amount;
      System.out.println("Amount " + amount + " has been withdrawed. New balance is: " + this.balance);
      return;
    }
    System.out.println("Amount " + amount + " can't be withdrawed. Insufficient funds!");
  }

  public void deposit(double amount) {
    this.balance += amount; // this is Addition Assignment Operator and is equivalent to writing balance =
                            // balance + amount;
    System.out.println("Amount " + amount + " has been deposited. New balance is: " + this.balance);
  }

  public static void main(String[] args) { // main function
    Account a = new Account(1122, 20000); // initializing an Account object using parameterized constructor
    a.setAnnualInterestRate(4.5); // setting annual interest rate
    a.withdraw(2500); // withdrawing amount
    a.deposit(3000);

    System.out.println("Id is: " + a.getId());
    System.out.println("Current balance is: " + a.getBalance());
    System.out.println("Monthly interest rate is: " + a.getMonthlyInterestRate());
    System.out.println("Account was created on: " + a.getCreatedDate());
  }
}
