package strings;

import java.util.Scanner;

public class CheckPalindromeOfString_Alternative {
	
	public static boolean checkPalindrome( String str ) {
		boolean isPalindrome = false;

		if( str.length() == 0 || str.length() == 1 ) {
			return true;
		}
		
		int start = 0;
		int end = str.length() - 1;
		while( start < end ) {
			if( str.charAt(start) == str.charAt(end) ) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}

		return isPalindrome;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		boolean isPalindrome = checkPalindrome(str);
		System.out.println(isPalindrome);

	}

}
