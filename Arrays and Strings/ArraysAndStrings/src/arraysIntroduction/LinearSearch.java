package arraysIntroduction;

import java.util.Scanner;

public class LinearSearch {
	
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
	
    public static int linearSearch(int arr[], int x) {
        int index = -1;
        for( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == x ) {
                index = i;
                break;
            }
        }  
		return index;
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		t = No. of test cases
        int t = scanner.nextInt();
		
        while( t > 0 ) {
        	
		int[] arr = takeInput();
		
		int searchElement = scanner.nextInt();
		
		int index = linearSearch( arr, searchElement );
		System.out.println(index);
		
		t--;
        }

	}

}
