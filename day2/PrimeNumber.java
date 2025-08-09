package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		//declared variable and assigned a value
		int input = 13;
		boolean flag = false;
		//interation
		for (int i=2; i<=input/2; i++) {
			//dividing input with i
			if (input%2==0) {
				flag=true;
				break;
			}
		}
		//checking the flag
		if (!flag) {
			System.out.println(input+" is a Prime Number");
			
		}else {
			System.out.println(input+" is not a Prime Number");
			
		}
	}
}
