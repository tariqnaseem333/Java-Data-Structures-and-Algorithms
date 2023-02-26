package strings;

import java.util.Scanner;

public class AllSubstringsOfString {
	
	public static void printSubstrings(String str) {
		int n = str.length();

		for( int i = 0; i < n; i++ ) {
			for( int j =i+1; j <= n; j++ ) {
				String str1 = str.substring(i, j);
				System.out.print(str1 + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		printSubstrings(str);

	}

}
