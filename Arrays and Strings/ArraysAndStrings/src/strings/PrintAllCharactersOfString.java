package strings;

public class PrintAllCharactersOfString {
	
//	public static void printChars( String str ) {
//		
//		String[] strArr = str.split("");
//		
//		for( int i = 0; i < strArr.length; i++ ) {
//			System.out.print(strArr[i] + " ");
//		}
//		
//	}
	
	public static void printChars( String str ) {
		
		for( int i = 0; i < str.length(); i++ ) {
			System.out.println(str.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		
		String str = "Coding is fun";
		
		printChars(str);

	}

}
