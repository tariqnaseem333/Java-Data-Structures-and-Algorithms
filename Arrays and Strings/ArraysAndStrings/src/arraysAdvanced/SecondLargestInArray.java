package arraysAdvanced;

import java.util.Scanner;

public class SecondLargestInArray {
	
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
	
    public static int secondLargest(int[] arr) {
    	 int n = arr.length;
         int max = Integer.MIN_VALUE;
         int count = 2;

         for( int j = 0; j < count && j < n; j++ ) {
             int previousMax = max;
             max = Integer.MIN_VALUE;
             int index = 0;
             for( int i = 0; i < n; i++ ) {
                 if( arr[i] >= max ) {
                     max = arr[i];
                     index = i;
                 }
             }
             arr[index] = Integer.MIN_VALUE;
             if( previousMax == max ) {
                 count++;
             }
         }

         if( count >= n || n <= 1 ) {
             return Integer.MIN_VALUE;
         } else {
             return max;
         }

    	
    }   
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
			int arr[] = takeInput();
			int secLar = secondLargest(arr);
			System.out.println(secLar);
			t--;
		}
		
	}

}
