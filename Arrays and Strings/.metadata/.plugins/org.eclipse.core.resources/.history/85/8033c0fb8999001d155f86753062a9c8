package arraysAdvanced;

import java.util.Scanner;

public class SelectionSort_Alternative {
	
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
	
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
    	for( int i = 0; i < n-1; i++ ) {
//    		Insert element at ith Position
    		
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for( int j = i; j < n; j++ ) {
                if( arr[j] < min  ) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            
//            Swap element at min Index with ith element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
    }   
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
			int arr[] = takeInput();
			selectionSort(arr);
			printArray(arr);
			t--;
		}
		
	}

}
