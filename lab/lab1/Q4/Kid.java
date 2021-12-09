// Java does not exactly support multiple Inheritance but we can achieve such functionality through Interfaces
 
interface Papa{
	default void print(){
		System.out.println("Papa: Ram");
	}
}

interface Mama{
	default void print(){
		System.out.println("Mama: Sita");
	}
}
 
class Kid implements Papa, Mama{
	public void print(){
		Papa.super.print();
		Mama.super.print();
	}
 
    public static void main(String args[]){
        Kid k = new Kid();
		System.out.println("Kids parents name is: \n");
		k.print();
    }
}