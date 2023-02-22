package arraysAdvanced;

import java.util.Scanner;

public class RotateArray_Alternative {

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

	private static void swapElements(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	private static void reverseArray(int[] arr, int start, int end){
		while(start < end) {
			swapElements(arr, start, end);
			start += 1;
			end -= 1;
		}
	}

	public static void rotateArray(int[] arr, int d) {
	  	int n = arr.length;

        if( n == 0 ) {
            return;
        }

        if( d >= n ) {
            d = d%n;
        }

        reverseArray( arr, 0, n-1 );
        reverseArray(arr, 0, n-d-1);
        reverseArray(arr, n-d, n-1);
	}   

	public static void main(String[] args) {

		//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while( t > 0 ) {
			int arr[] = takeInput();
			int d = scanner.nextInt();
			rotateArray(arr, d);
			printArray(arr);
			t--;
		}

	}

}
