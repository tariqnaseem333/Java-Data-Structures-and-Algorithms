package arraysIntroduction;

import java.util.Scanner;

public class UniqueElementAlternative {
	
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
		int uniqueValue = -1;
        for( int i = 0; i < arr.length; i++ ) {
            uniqueValue = arr[i];
            for( int j = 0; j < arr.length; j++ ) {
                if( i == j ) {
                    continue;
                }
                if( arr[i] == arr[j] ) {
                    uniqueValue = -1;
                    break;
                }
            }
            if( uniqueValue != -1 ) {
                return uniqueValue;
            }
        }
        return uniqueValue;
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
