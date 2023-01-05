package arraysIntroduction;

import java.util.Scanner;

public class SortBinaryArray {
	
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
	
    public static void sortZeroesAndOne(int[] arr) {
    	int count = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == 1  ) {
                count++;
                arr[i] = 0;
            }
        }
        
        for( int i = arr.length - count; i < arr.length; i++ ) {
            arr[i] = 1;
        }
    }
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	            int[] input = takeInput();
	            sortZeroesAndOne(input);
	            printArray(input);
	            t--;
	        }
		
		
	}

}
