package strings;

public class UnderstandingStringsStorage {

	public static void main(String[] args) {
		
//		A new String "Hello" will be created in String Pool
		String str = "Hello";
//		It will check if "Hello" is already there in String Pool
//		If yes, then refer to that else create new "Hello" in String Pool
		String str1 = "Hello";
		
//		It will create new String Object in heap every time you
//		use new keyword regardless of if "Hello" is in String Pool or not
		String str2 = new String("Hello");

	}

}
