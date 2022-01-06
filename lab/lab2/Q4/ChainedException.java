import java.io.IOException;
import java.lang.ArithmeticException;

class ChainedException{
  public static void test() throws Throwable{
    try{
      int a = 10/0;
    }catch(Exception e){
     throw e.initCause(new IOException("Can't work with infinite value."));
    }
  }

  public static void main(String[] args){
    try{
      test();
    } catch(Throwable t){
      System.out.println("Error: "+t.getMessage());
      System.out.println("Error cause: "+t.getCause());
    }
  }
}
