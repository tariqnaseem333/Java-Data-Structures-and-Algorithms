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
		int n = arr1.length;
		int m = arr2.length;
		int f = output.length;

		int carry = 0;
		int sum = 0;
		int i = n-1;
		int j = m-1;
		int k = f-1;
		while( i >=0 && j >= 0 ) {
			sum = arr1[i] + arr2[j] + carry;
			if( sum > 9 ) {
				output[k] = sum%10;
				carry = sum / 10;
			} else {
				output[k] = sum;
				carry = 0;
			}
			i--;
			j--;
			k--;
		}

		while( i >= 0 ) {
			sum = arr1[i] + carry;
			if (sum > 9) {
				output[k] = sum % 10;
				carry = sum / 10;
			} else {
				output[k] = sum;
				carry = 0;
			}
			i--;
			k--;
		}

		while (j >= 0) {
			sum = arr2[j] + carry;
			if (sum > 9) {
				output[k] = sum % 10;
				carry = sum / 10;
			} else {
				output[k] = sum;
				carry = 0;
			}
			j--;
			k--;
		}

		while( k >= 0 ) {
			output[k] = carry;
			k--;
		}
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
