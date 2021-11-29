public class GarbageCollection{
    public static void main(String[] args){
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();
          
        g1 = null;
        System.gc();
          
        g2 = null;
        Runtime.getRuntime().gc();
    }
}
