package strings;

public class StringBufferVsString {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("abc");
		
////		StringBuffer is mutable which means that you can
////		add remove or change value of chars in String
//		str.setCharAt(1, 'g');
//		System.out.println(str);
		
////		You can add chars at the end of String
//		str.append("def");
//		System.out.println(str);
		
//		If you want to change your string a lot then,
//		StringBuffer might be a better option not string
//		Because every time you change it will create new string which
//		is more time consuming
		String s = "d";
		for( int i = 0; i < 5; i++ ) {
			s = s + 'z';
		}
		System.out.println(s);
		
//		
		

	}

}
