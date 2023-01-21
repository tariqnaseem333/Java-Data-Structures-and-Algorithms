package arraysAdvanced;

import java.util.Scanner;

public class BinarySearch {
	
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
	
	public static int binarySearch(int[] arr, int elem) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while( start <= end ) {
            mid = ( start + end ) / 2;
            if ( elem > arr[mid] ) {
                start = mid + 1;
            } else if ( elem < arr[mid] ) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
		
	}

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
			System.out.println("Enter the element you want to Search: ");
			int elem = scanner.nextInt();
			int index = binarySearch(arr, elem);
			System.out.println("Index is: " + index);
			t--;
		}
		
	}

}
