class Dog extends Animal{
	Dog(String name){
		this.name = name;
	}
	
	public void sound(){
		System.out.println("My dog "+name+ " barks");
	}
}