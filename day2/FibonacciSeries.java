package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//declare the variables with values
		int range = 8, firstNum = 0, secNum = 1, sum;
         
		//printing first and second number
		System.out.println(firstNum);
		System.out.println(secNum);
		
		//Iteration
		for (int i=2; i<range; i++) {
		
			//Interchanging
			sum=firstNum + secNum;
			firstNum = secNum;                                                          
			secNum = sum;
			
		
			System.out.println(sum);
		}	
	}
}
