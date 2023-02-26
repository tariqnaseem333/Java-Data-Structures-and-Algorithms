package strings;

public class ReverseEachWordOfString_Alternative {
	
	public static String reverseEachWord(String input) {
		int n = input.length();

		int currentWordStart = 0;
		String ans = "";
		int i = 0;
		for( ; i < n; i++ ) {
			if( input.charAt(i) == ' ' ) {
				
//				Reversing Current Word
				int currentWordEnd = i - 1;
				String revCurrentWord = "";
				for( int j = currentWordStart; j <= currentWordEnd; j++ ) {
					revCurrentWord = input.charAt(j) + revCurrentWord;
				}
				
//				Adding the current reverse Word to ans
				ans = ans + revCurrentWord + " ";
				currentWordStart = i + 1;
			} 
			
		}
		
//		For Adding Last Reverse Word
		int currentWordEnd = i - 1;
		String revCurrentWord = "";
		for( int j = currentWordStart; j <= currentWordEnd; j++ ) {
			revCurrentWord = input.charAt(j) + revCurrentWord;
		}
		ans = ans + revCurrentWord;
		
		return ans;

	}

	public static void main(String[] args) {
		
		String input = "abc def ghi";
		String revStr = reverseEachWord(input);
		System.out.println(revStr);

	}

}
