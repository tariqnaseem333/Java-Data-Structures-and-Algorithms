package arraysAdvanced;

import java.util.Scanner;

public class PushZerosToEndOfArray_Alternative {
	
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
	
    public static void pushZerosToEndOfArray(int[] arr) {
    	int n = arr.length;

        int minIndex = 0;

        for( int i = 0; i < n; i++ ) {
            if( arr[i] != 0 ) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                minIndex++;
            }
        }
    }  
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
			int arr[] = takeInput();
			pushZerosToEndOfArray(arr);
			printArray(arr);
			t--;
		}
		
	}

}
