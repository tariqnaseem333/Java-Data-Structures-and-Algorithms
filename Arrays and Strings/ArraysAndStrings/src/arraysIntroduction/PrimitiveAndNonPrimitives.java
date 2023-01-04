package arraysIntroduction;

public class PrimitiveAndNonPrimitives {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
//		Printing the elements of an array
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");	
		}
	}
	
	public static void increment( int i ) {
		i++;
	}
	
	public static void incrementArray( int[] input ) {
		System.out.println(input);
		input = new int[7];
		System.out.println(input);
		for( int i = 0; i < input.length; i++ ) {
			input[i] = input[i] + 1;
		}
	}

	public static void main(String[] args) {
		
//		int i = 10;
//		increment(i);
//		System.out.println(i);
		
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr);
		incrementArray(arr);
		printArray(arr);

	}

}
