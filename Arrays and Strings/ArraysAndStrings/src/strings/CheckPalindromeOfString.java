package strings;

import java.util.Scanner;

public class CheckPalindromeOfString {
	
	public static boolean checkPalindrome( String str ) {
		boolean isPalindrome = false;
		int n = str.length();
		
		if( n == 0 || n == 1 ) {
			return true;
		}
		
		for( int i = 0; i < n/2; i++ ) {
			if( str.charAt(i) == str.charAt(n-i-1) ) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
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
