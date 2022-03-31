class PartsVAT extends Parts {
  PartsVAT(int sn, String n, String m, int p) {
    super(sn, n, m, p);
  }

  public void calcVat(Parts obj) {
    System.out.println("\nVAT: " + obj.price * 0.13);
  }
}

