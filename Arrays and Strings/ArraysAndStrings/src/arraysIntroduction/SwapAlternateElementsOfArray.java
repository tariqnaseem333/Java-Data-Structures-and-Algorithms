package arraysIntroduction;

import java.util.Scanner;

public class SwapAlternateElementsOfArray {
	
	public static int[] takeInput() {
//		Taking Input n from the user
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
//		Declaring the array based on n
		int arr[] = new int[n];
		
//		Storing elements in the array
		for( int i = 0; i < n; i++ ) {
			System.out.println("Enter Element at " + i + "th index");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		int n = arr.length;
//		Printing the elements of an array
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}
	
	public static void swapAlternate( int[] arr ) {
        int c;
        for( int i = 0; i < arr.length - 1; i = i + 2 ) {
            c = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = c;
        }
	}
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	    		int[] arr = takeInput();
	            swapAlternate(arr);
	            printArray(arr);
	            t--;
	        }
		
		
	}

}
