package arraysIntroduction;

import java.util.Scanner;

public class TripletSum {
	
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
	
    public static int findTriplet(int[] arr, int x) {
    	int count = 0;
    	
        for( int i = 0; i < arr.length - 2; i++ ) {
            for( int j = i+1; j< arr.length - 1; j++ ) {
                for( int k = j+1; k< arr.length; k++ ) {
                    if( arr[i] + arr[j] + arr[k]== x ) {
                        count++;
                    }
            	} 
            } 
        }
        return count;
    }
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	            int[] input = takeInput();
	            int x = scanner.nextInt();
	            System.out.println(findTriplet(input, x));
	            t--;
	        }
	}

}
