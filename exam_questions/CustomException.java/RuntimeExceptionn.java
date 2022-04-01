class MyRuntimeException extends RuntimeException {
  public MyRuntimeException(String msg) {
    super(msg);
  }
}

class RuntimeExceptionn {
  public static void check(int a) {
    if (a < 18) {
      throw new MyRuntimeException("yooo WTF?");
    }
  }

  public static void main(String[] args) {
    int a = 7;
    int b = 19;
    check(a);
    check(b);
  }
}
