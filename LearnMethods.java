package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		//CarName//
		
			System.out.println("Rolls Royce");
			LearnMethods obj = new LearnMethods();
			long ownerPhoneNumber = obj.getOwnerPhoneNumber();
			System.out.println("Owner Phone Number:"+ ownerPhoneNumber);
			
			int carRegNumber = obj.getCarRegNumber();
			System.out.println("Car Reg Number:"+ carRegNumber);
			
			String carVariant = obj.getCarVariant();
			System.out.println(carVariant);
			
			int multiplyNumbers = obj.multiplyTwoNumbers(6, 3);
			System.out.println(multiplyNumbers);
		
	}
	public long getOwnerPhoneNumber() {
	long ownerPhoneNumber = 7448553231L;
	return ownerPhoneNumber;
	}
	private int getCarRegNumber() {
		int carRegNumber = 657854;
			return carRegNumber;
	}
	public String getCarVariant() {
		return "Phontom";
	}
	public int multiplyTwoNumbers(int a, int b) {
	return a*b;
	}
	}
	




	


	


