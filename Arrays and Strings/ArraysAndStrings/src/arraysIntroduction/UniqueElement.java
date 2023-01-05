package arraysIntroduction;

import java.util.Scanner;

public class UniqueElement {
	
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
	
    public static int findUnique(int[] arr){
    	
    	boolean isUnique;
    	
		for( int i = 0; i < arr.length; i++ ) {
			
			isUnique = true;
			
			for( int j = 0; j < arr.length; j++ ) {
				if( i == j ) {
					continue;
				} else {
					if( arr[i] == arr[j] ) {
						isUnique = false;
						break;
					}
				}
			}
			
			if(isUnique) {
				return arr[i];
			}
			
		}
		return -1;
    }
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	            int[] input = takeInput();
	            System.out.println(findUnique(input));
	            t--;
	        }
		
		
	}

}
