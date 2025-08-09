package week1.day2;

public class NegativetoPositive {
	
	public static void main(String[] args) {
		//declare variable
		int number = -40;
		
		//to check whether the number is in positive or negative
		if (number<0) {
			//chaning the negative num to positive num by Math 
			int positive_number = Math.abs(number);
			System.out.println("The number "+number+" is converted to "+positive_number);
			
		}else {
			System.out.println("The given number is positive number");
		}
	}

}
