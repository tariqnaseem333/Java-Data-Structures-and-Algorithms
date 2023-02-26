package strings;

import java.util.Scanner;

public class AllSubstringsOfString_Alternative {

	public static void printSubstrings(String str) {
		int n = str.length();

		for( int i = 0; i < n; i++ ) {
			int p = 0;
			for( int j = i+1; j <= n; j++ ) {
				String str1 = str.substring(p, j);
				System.out.println(str1);
				p++;
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		printSubstrings(str);

	}


}
