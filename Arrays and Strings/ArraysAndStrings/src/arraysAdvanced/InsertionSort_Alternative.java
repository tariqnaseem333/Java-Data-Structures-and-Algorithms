package arraysAdvanced;

import java.util.Scanner;

public class InsertionSort_Alternative {

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

	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for( int i = 1; i < n; i++ ) {
			int temp = arr[i];
			
			int j = i -1;
			while( j>=0 && arr[j]>temp ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {

		//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while( t > 0 ) {
			int arr[] = takeInput();
			insertionSort(arr);
			printArray(arr);
			t--;
		}

	}

}
