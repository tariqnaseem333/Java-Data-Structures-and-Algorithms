package arraysIntroduction;

import java.util.Scanner;

public class PairSum {
	
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
	
    public static int pairSum(int arr[], int x) {
        int count = 0;
    	
        for( int i = 0; i < arr.length - 1; i++ ) {
            for( int j = i+1; j< arr.length; j++ ) {
                    if( arr[i] + arr[j] == x ) {
                        count++;
                    }
            } 
        }
        return count;
    }
	
	public static void main(String[] args) {
		
//		Pair of elements in array which sum to x
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	            int[] input = takeInput();
	            int x = scanner.nextInt();
	            System.out.println(pairSum(input, x));
	            t--;
	        }
	}

}
