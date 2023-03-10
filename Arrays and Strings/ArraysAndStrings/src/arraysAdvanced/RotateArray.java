package arraysAdvanced;

import java.util.Scanner;

public class RotateArray {
	
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
	
    public static void rotateArray(int[] arr, int d) {
    	int n = arr.length;

        for( int i = 0; i < d; i++ ) {
            int temp = arr[0];
            for( int j = 1; j < n; j++ ) {
                arr[j-1] = arr[j];
            }
            arr[n-1] = temp;
        }
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
