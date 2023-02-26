package strings;

import java.util.Scanner;

public class AllSubstringsOfString_Alternative {

	public static void printSubstrings(String str) {
		int n = str.length();

//		for( int i = 0; i < n; i++ ) {
//			int p = 0;
//			for( int j = i+1; j < n; j++ ) {
//				String str1 = str.substring(p, j+1);
//				System.out.println(str1);
//				p++;
//			}
//		}
		
		for( int i = 1; i <= n; i++ ) {
//			Printing all substrings with length = i
			for( int j = 0; j < n-i+1; j++ ) {
				String str1 = str.substring(j, i+j);
				System.out.println(str1);
			}
		}

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		printSubstrings(str);

	}


}
