class Address{
  public String country;
  public Integer stateNumber;
  public Integer zipCode;
  public String addressLine;
}

class Founder{
  public String fullName;
  public String dateOfBirth;
  public String email;
  public Long phoneNumber;
 
  Founder(String name, String dob, String email, Long phone){
    this.fullName = name;
    this.dateOfBirth = dob;
    this.email = email;
    this.phoneNumber = phone;
  }
}

class Employee{
  public String fullName;
  public String email;
  public String dateOfBirth;
  public Long phoneNumber;

  Employee(String name, String email, String dob, Long phone){
    this.fullName = name;
    this.email = email;
    this.dateOfBirth = dob;
    this.phoneNumber = phone;
  }
}

class Company{
  public String name;
  
  public static void main(String[] args){
    Address address = new Address();
    address.country = "Nepal";
    address.stateNumber = 04;
    address.zipCode = 33700;
    address.addressLine = "Srijana Chowk - 8, Pokhara";
    
    Founder[] founders;
    founders = new Founder[2];

    founders[0] = new Founder("Haldiram Kafle", "1997-10-26", "kaflehaldiram@gmail.com", 9876543210L);
    founders[1] = new Founder("Ram Pyari Dhakal", "1999-10-20", "rampyari@gmail.com", 9867453210L);

    Employee[] employees;
    employees = new Employee[3];

    employees[0] = new Employee("Ramakant Wagle", "wagleramakant@gmail.com", "1999-01-11", 123456789L);
    employees[1] = new Employee("Harshit Baniya","harshit@gmail.com","1999-01-12",1234534829L);
    employees[2] = new Employee("Gunkesari Pokharel","gunkesari@gmail.com","1999-02-17",123452719L);

    Company xyzSolutions = new Company();
    xyzSolutions.name = "XYZ Solutions Pvt Ltd";  

    System.out.println("Company Name: "+xyzSolutions.name);
    System.out.println("-----Address-----\n");
    System.out.println("Country: "+address.country+"\n");
    System.out.println("State: "+address.stateNumber+"\n");
    System.out.println("Zip Code: "+address.zipCode+"\n");
    System.out.println("Address Line: "+address.addressLine+"\n");
    
    System.out.println("-----Founders of the Company-----\n");

    for(int i=0; i<founders.length; i++){
      System.out.println("Name: "+founders[i].fullName+"\n");
      System.out.println("DOB: "+founders[i].dateOfBirth+"\n");
      System.out.println("Email: "+founders[i].email+"\n");
      System.out.println("Phone: "+founders[i].phoneNumber+"\n");
    }

    System.out.println("-----Employees of the Company-----\n");
    for(int i=0; i<employees.length; i++){
      System.out.println("Name: "+employees[i].fullName+"\n");
      System.out.println("DOB: "+employees[i].dateOfBirth+"\n");
      System.out.println("Email: "+employees[i].email+"\n");
      System.out.println("Phone: "+employees[i].phoneNumber+"\n");
    }
  }
}
