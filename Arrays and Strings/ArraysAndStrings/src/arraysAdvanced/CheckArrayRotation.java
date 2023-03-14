package arraysAdvanced;

import java.util.Scanner;

public class CheckArrayRotation {
	
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
	
    public static int checkArrayRotation(int[] arr) {
        int n = arr.length;
        int count = 0;

        int i = 0;
        while( i < n-1 ) {
            if( arr[i] > arr[i+1] ) {
                count = i+1;
                return count;
            } 
            i++;
        }

        return count;
    }   
	
	public static void main(String[] args) {
		
//		Array is rotated in right hand direction
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
			int arr[] = takeInput();
			int turns = checkArrayRotation(arr);
			System.out.println(turns);
			t--;
		}
		
	}

}
