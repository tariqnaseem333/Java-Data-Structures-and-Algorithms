package arraysAdvanced;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	
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
	
	public static void printArray(int[] arr) {
		int n = arr.length;
//		Printing the elements of an array
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}
	
    public static int[] mergeSort(int[] arr1, int[] arr2) {
    	int n = arr1.length;
        int m = arr2.length;

        int[] arr3 = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;
        while( i < n && j < m ) {
            if( arr1[i] <= arr2[j] ) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else if (arr2[j] <= arr1[i]) {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        } 

        if( i != n ) {
            for( int a = i; a < n; a++ ) {
                arr3[k] = arr1[a];
                k++;
            }
        } else if( j != m ) {
            for (int a = j; a < m; a++) {
                arr3[k] = arr2[a];
                k++;
            }
        }

        return arr3;
    }   
	
	public static void main(String[] args) {
		
//		Taking input t test cases
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
			int arr1[] = takeInput();
			int arr2[] = takeInput();
			int arr3[] = mergeSort(arr1, arr2);
			printArray(arr3);
			t--;
		}
		
	}

}
