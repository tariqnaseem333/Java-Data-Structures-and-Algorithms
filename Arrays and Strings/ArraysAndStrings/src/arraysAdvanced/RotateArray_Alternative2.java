package arraysAdvanced;

import java.util.Scanner;

public class RotateArray_Alternative2 {
	
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

        int[] arr2 = new int[d];
        for( int i = 0; i < d; i++ ) {
            arr2[i] = arr[i];
        }  

        for( int j = d; j < n; j++ ) {
            arr[j-d] = arr[j];
        }

        int a = 0;
        for( int k = n-d; k < n; k++ ) {
            arr[k] = arr2[a];
            a++;
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
