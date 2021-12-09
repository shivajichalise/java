class Animal{
	String type;
	Animal(){
		type = "Wild";
		System.out.println("At first all animals were wild animals");
	}
	
	// you cannot be overight final method
	final void breaths(){
		System.out.println("Animal Breaths");
	} 
}
