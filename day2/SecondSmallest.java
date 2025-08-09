package week1.day2;

public class SecondSmallest {

	
	public static void main(String[] args) {
	  
	   int[] arr = {5, 2, 8, 1, 9, 3};

    // Initialize first and second smallest
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallest) {
            // Update both smallest and second smallest
            secondSmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
            // Update only second smallest
            secondSmallest = arr[i];
        }
    }

    // Print the result
    System.out.println("Second smallest number is: " + secondSmallest);
}
}


