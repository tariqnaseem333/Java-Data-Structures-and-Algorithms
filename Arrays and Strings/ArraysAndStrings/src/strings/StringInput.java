package strings;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		String str;
//		str = s.next();
//		System.out.println( str + " " + str.length() );
//		String str2 = s.nextLine();
//		System.out.println( str2 + " " + str2.length() );
		
//		int i = s.nextInt();
//		System.out.println( i + " " );
//		String str2 = s.nextLine();
//		System.out.println( str2 + " " + str2.length() );
		
//		String str;
//		str = s.nextLine();
//		System.out.println( str + " " + str.length() );
		
//		You can convert String to corresponding character Array with the help
//		of toCharArray() Method
		String str = "Hello";
		char[] cArray = str.toCharArray();
		for(int i = 0; i < cArray.length; i++ ) {
			System.out.println(cArray[i]);
		}
		
		
	}

}
