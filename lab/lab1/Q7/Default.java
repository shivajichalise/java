interface Test
{
    public void square(int a);
  
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  
class Default implements Test
{
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        Default d = new Default();
        d.square(4);
        d.show();
    }
}
