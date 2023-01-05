package arraysIntroduction;

import java.util.Scanner;

public class IntersectionOfTwoArrays {
	
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
	
    public static void intersections(int arr1[], int arr2[]) {
    	
        for( int i = 0; i < arr1.length; i++ ) {
            for( int j = 0; j < arr2.length; j++ ) {
                if( arr1[i] == arr2[j] ) {
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.print(arr1[i] + " ");
					break;
                }
            }
        }
    }
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
	        while(t > 0) {
	            int[] input1 = takeInput();
	            int[] input2 = takeInput();
	            intersections(input1, input2);
	            System.out.println();
	            t--;
	        }
	}
}
