package strings;

public class IntroductionToStrings {

	public static void main(String[] args) {
		
//		Ist way of storing collection of characters
		char arr[] = { 'C', 'o', 'd', 'i', 'n', 'g' };
		
//		2nd way of storing collection of characters using String
		String str1 = "Coding";
		
//		For finding length of String
		System.out.println( str1.length() );
		
//		For accessing a particular character
		System.out.println( str1.charAt(2) );
		
//		For creating empty string
		String str2 = "";
		System.out.println( str2.length() );
		
//		Concatenate 2 Strings using +
		String str3 = " is fun";
		System.out.println(str1 + str3);
		
//		Another way of concatenating 2 Strings
		String str4 = str1.concat(str3);
		System.out.println(str4);
		
//		For comparing 2 Strings
		String str5 = "Hello";
		String str6 = "hello";
//		It will compare the string values
		System.out.println( str5.equals(str6) );
//		It will compare the string references
		System.out.println( str5 == str6 );
//		It will compare the string lexicographically
		System.out.println( str5.compareTo(str6) );
		
//		If String contains this char or not
		System.out.println( str1.contains("ing") );

	}

}
