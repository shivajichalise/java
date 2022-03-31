class Main {
  public static void main(String[] args) {
    PartsVAT p1 = new PartsVAT(1, "Brake Shoe", "Ntorq", 500);
    PartsVAT p2 = new PartsVAT(2, "Air Filter", "Ntorq", 600);

    p1.calcCommission(p1);
    p1.calcVat(p1);

    p2.calcCommission(p2);
    p2.calcVat(p2);
  }
}
