class MyCheckedException extends Exception {
  MyCheckedException() {
    System.out.println("Age not enough brah");
  }
}

class CheckedException {
  public static void check(int a) throws MyCheckedException {
    if (a < 18) {
      throw new MyCheckedException();
    }
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 18;
    try {
      check(a);
      check(b);
    } catch (MyCheckedException e) {

    }
  }
}
