package strings;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str;
//		str = s.next();
//		System.out.println( str + " " + str.length() );
//		String str2 = s.nextLine();
//		System.out.println( str2 + " " + str2.length() );
		
		int i = s.nextInt();
		System.out.println( i + " " );
		String str2 = s.nextLine();
		System.out.println( str2 + " " + str2.length() );
		
//		str = s.nextLine();
//		System.out.println( str + " " + str.length() );

	}

}
