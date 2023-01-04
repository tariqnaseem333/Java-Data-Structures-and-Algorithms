package arraysIntroduction;

import java.util.Scanner;

public class PrintAllPairsOfArray {
	
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
	
	public static void printAllPairs( int[] arr ) {
		for( int i = 0; i < arr.length - 1; i++ ) {
			
			for ( int j = i + 1; j < arr.length; j++ ) {
				System.out.print("(" + arr[i] + "," + arr[j] + ")" + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int[] arr = takeInput();
		printAllPairs(arr);

	}

}
