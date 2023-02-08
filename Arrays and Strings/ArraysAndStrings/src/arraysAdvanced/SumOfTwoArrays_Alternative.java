package arraysAdvanced;

import java.util.Scanner;

public class SumOfTwoArrays_Alternative {

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

	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		int k = Math.max(arr1.length, arr2.length); //k is the current index output array
		while(i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			i -= 1;
			j -= 1;
			k -= 1;
		}
		while(i >= 0) {
			int sum = arr1[i] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			i -= 1;
			k -= 1;
		}
		while(j >= 0) {
			int sum = arr2[j] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			j -= 1;
			k -= 1;
		}
		output[0] = carry;
	}


	public static void main(String[] args) {

		//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while( t > 0 ) {
			int[] arr1 = takeInput();
			int[] arr2 = takeInput();

			int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

			sumOfTwoArrays(arr1, arr2, output);
			printArray(output);
			t--;
		}

	}

}
