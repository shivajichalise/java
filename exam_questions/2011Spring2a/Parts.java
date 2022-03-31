public class Parts {
  public int sno;
  public String name;
  public String model;
  public int price;

  Parts(int sn, String n, String m, int p) {
    sno = sn;
    name = n;
    model = m;
    price = p;
  }

  public void calcCommission(Parts obj) {
    System.out.println("\nCommission: " + obj.price * 0.1);
  }
}
