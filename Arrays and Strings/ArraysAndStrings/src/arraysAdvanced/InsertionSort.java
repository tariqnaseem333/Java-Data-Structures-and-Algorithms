package arraysAdvanced;

import java.util.Scanner;

public class InsertionSort {

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
			int currElem = arr[i];
			int index = 0;

			for( int j = i-1; j >= 0; j-- ) {
				if (currElem < arr[j]) {
					arr[j+1] = arr[j];
				} else {
					index = j+1;
					break;
				}
			}

			arr[index] = currElem;
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
