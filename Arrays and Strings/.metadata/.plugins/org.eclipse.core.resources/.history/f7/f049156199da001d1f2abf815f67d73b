package arraysAdvanced;

import java.util.Scanner;

public class SumOfTwoArrays {
	
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
        int p = output.length;

        int k = p-1;
        int sum = output[k];
        for( int i = n-1, j = m-1; i >= 0 || j >= 0; i--, j-- ) {
            if( i < 0 ) {
                sum = arr2[j] + output[k];
            } else if( j < 0 ) {
                sum = arr1[i] + output[k];
            } else {
                sum = arr1[i] + arr2[j] + output[k];
            }
            if( sum > 9 ) {
                output[k] = sum%10;
                k--;
                output[k] = sum/10;
            } else {
                output[k] = sum;
                k--;
            }
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
