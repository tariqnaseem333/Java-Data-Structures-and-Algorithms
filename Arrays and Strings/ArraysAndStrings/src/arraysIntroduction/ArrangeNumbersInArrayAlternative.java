package arraysIntroduction;

import java.util.Scanner;

public class ArrangeNumbersInArrayAlternative {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
//		Printing the elements of an array
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");	
		}
	}
	
    public static void arrange(int[] arr, int n) {
    	int length;
    	if( n % 2 == 0 ) {
    		length = n / 2;
    	} else {
    		length = ( n / 2 ) + 1;
    	}
        int p = 1;
        for( int i = 0; i < length ; i++ ) {
            
            arr[i] = p;
            
            if ( i != (n-i-1) ) {
            	p++;
            }
            
            arr[n-i-1] = p;
            p++;
  
        }
    }

	public static void main(String[] args) {
		
//		Populate the array in the range: 1,3,5,.......,6,4,2
		
		Scanner scanner = new Scanner(System.in);
//		t = No. of test cases
        int t = scanner.nextInt();
		
        while( t > 0 ) {
        	
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            arrange(arr, n);
    		printArray(arr); 
		
    		t--;
        }

	}

}
