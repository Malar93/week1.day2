package week1.day2;

public class MyCalculator {
	public static void main (String [] args) {
		
	//calculator output//
		
	Calculator cal = new Calculator();
	//...addition..//
	
	int addition = cal.addNumbers(5, 8, 9);
	System.out.println("A + B + C = "+ addition);
	
	//...subtraction...//
	int subtraction = cal.subNumbers(9, 5);
	System.out.println("A - B = " + subtraction);
	
	//...multiplication...//
	double multiplication = cal.mulNumbers(2, 8);
	System.out.println("A * B = " + multiplication);
	
	//...division...//
	float division = cal.divideNumbers(7, 9);
	System.out.println("A / B = " + division);
	
	
	
	}	

}
