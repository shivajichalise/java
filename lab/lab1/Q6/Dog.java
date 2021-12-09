class Dog extends Animal{
		Dog(String type){
			super();
			this.type = type;
			System.out.println("Dog is a "+type+" animal");
		}
		
		public static void main(String[] args){
			Dog d1 = new Dog("Domestic");
			d1.breaths();
		}
}