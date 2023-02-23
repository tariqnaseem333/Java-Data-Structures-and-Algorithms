package strings;

import java.util.Scanner;

public class CountWordsInString {
	
	public static int countWords(String str) {	
		int n = str.length();

		if( str.equals("") ) {
			return 0;
		}

		int count = 1;
		for( int i = 0; i < n; i++ ) {
			if( str.charAt(i) == ' ' ) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    String str = scanner.nextLine();
	    System.out.println(countWords(str));

	}

}
