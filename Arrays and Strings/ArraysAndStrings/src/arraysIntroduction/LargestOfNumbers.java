package arraysIntroduction;

import java.util.Scanner;

public class LargestOfNumbers {
	
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
	
	public static int largest( int[] arr ) {
		
		int max = Integer.MIN_VALUE;
		
		for ( int i = 0; i < arr.length; i++ ) {
			if ( arr[i] > max ) {
				max = arr[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = takeInput();
		
		int lar = largest(arr);
		
		System.out.println(lar);		

	}

}
