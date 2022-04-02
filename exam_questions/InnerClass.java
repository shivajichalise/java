class InnerClass {
  private static String msg = "Top level";

  private static class InnerClass1 {
    public static void print() {
      System.out.println("InnerClass1 : " + msg);
    }
  }

  private class InnerClass2 {
    public void print() {
      System.out.println("InnerClass2 : " + msg);
    }
  }

  public static void main(String[] a) {
    InnerClass.InnerClass1.print();

    InnerClass ic = new InnerClass();
    InnerClass.InnerClass2 ic2 = ic.new InnerClass2();
    ic2.print();
  }
}
