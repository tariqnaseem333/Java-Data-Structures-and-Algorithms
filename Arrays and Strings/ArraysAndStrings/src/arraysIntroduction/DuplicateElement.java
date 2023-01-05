package arraysIntroduction;

import java.util.Scanner;

public class DuplicateElement {
	
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
	
    public static int duplicateNumber(int[] arr){
    	for( int i = 0; i < arr.length - 1; i++ ) {
            for( int j = i + 1; j < arr.length; j++ ) {
                if( arr[i] == arr[j] ) {
                    return arr[i];
                }
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
	            System.out.println(duplicateNumber(input));
	            t--;
	        }
	}

}
