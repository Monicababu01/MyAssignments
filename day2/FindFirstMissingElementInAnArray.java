package week1.day2;
import java.util.Arrays;

public class FindFirstMissingElementInAnArray {
	
	

	
	    public static void main(String[] args) {
	        // Input array
	        int[] arr = {1, 2, 3, 4, 7, 6, 8};

	        // Step 1: Sort the array
	        Arrays.sort(arr); // Now arr becomes {1, 2, 3, 4, 6, 7, 8}

	        // Step 2: Loop through the array
	        for (int i = 0; i < arr.length; i++) {
	            // Here we expect each number to be i+1
	            if (arr[i] != i + 1) {
	                System.out.println("Missing number is: " + (i + 1));
	                break; // stop loop once missing number is found
	            }
	        }
	    }
	}

	
	


