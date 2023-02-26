package strings;

public class ReverseEachWordOfString {
	
	public static String reverseEachWord(String input) {
		int n = input.length();

		String str = "";
		String revStr = "";
		for( int i = 0; i < n; i++ ) {
			str = input.charAt(i) + str;
			if( input.charAt(i) == ' ' || i == n-1) {
				revStr = revStr + str;
				str = " ";
			} 
		}
		String finalStr = revStr.trim();
		return finalStr;

	}

	public static void main(String[] args) {
		
		String input = "abc def ghi";
		String revStr = reverseEachWord(input);
		System.out.println(revStr);

	}

}
