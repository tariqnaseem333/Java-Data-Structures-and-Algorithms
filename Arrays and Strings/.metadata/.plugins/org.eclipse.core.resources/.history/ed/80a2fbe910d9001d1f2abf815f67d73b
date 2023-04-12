package arraysIntroduction;

import java.util.Scanner;

public class ArrayElementSum {
	
	public static int[] takeInput() {
		
//		Taking Input n from the user
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
//		Declaring the array based on n
		int arr[] = new int[n];
		
//		Storing elements in the array
		for( int i = 0; i < n; i++ ) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static int sum(int[] arr) {    
        int n = arr.length;
        
//      Calculating the sum of elements of an array   
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            sum = sum + arr[i];
        } 
        
        return sum;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		t = No. of test cases
        int t = scanner.nextInt();

        while(t > 0) {
            int[] arr = takeInput();
            System.out.println( sum(arr) );
            t--;
        }
		

	}

}