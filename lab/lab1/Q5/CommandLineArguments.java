class CommandLineArguments{
	public static void main(String[] args){
		Integer num1 = Integer.parseInt(args[0]);
		Integer num2 = Integer.parseInt(args[1]);
		
		Integer sum = num1+num2;
		System.out.println("Sum of the given two numbers is: "+ sum);
		
		Integer difference = num1-num2;
		System.out.println("Sum of the given two numbers is: "+ difference);
	}
}