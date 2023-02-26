package strings;

public class StringsImmutablity {
	
	public static void main(String[] args) {
		
		String str = new String("abc");
		String str1 = "abc";
		
//		Since, Strings are immutable.Therefore,
//		changing character of a String is not allowed in Java
//		str.setCharAt(1) = 'n';
		
		
//		It's allowed in Java. Because it will create new String "abcdef"
//		and Made str1 refer to that now
		str1 = str1 + "def";
		
//		It's allowed in Java. Because it will create new String "def"
//		and Made str1 refer to that now
		str1 = "def";

	}

}
