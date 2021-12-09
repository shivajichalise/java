class Constructor{
	Integer id;
	String name;
	
	Constructor(){
		id = 1;
		name = "Shivaji Chalise";
		System.out.println("Default Constructor Called");
	}
	
	Constructor(Integer id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Parameterized Constructor Called");
	}
	
	Constructor(Constructor c){
		id = c.id;
		name = c.name;
		System.out.println("Copy Constructor Called");
	}
	
	public static void main(String[] args){
		Constructor c1 = new Constructor();
		Constructor c2 =  new Constructor(2, "Ramu Kaka");
		Constructor c3 = new Constructor(c1);
	}
	
}
