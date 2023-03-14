package strings;

public class StringComparison {

	public static void main(String[] args) {
		
//		int[] arr1 = { 1, 2 };
//		int[] arr2 = { 1, 2 };
//		if( arr1 == arr2 ) {
//			System.out.println("Both are equal");
//		} else {
//			System.out.println("They are not equal");
//		}	
////		When we compare like this, there references will be compared
////		not the content that's why they are not equal
//		System.out.println(arr1 + " " + arr2);
		
		
//		Since, they both refer to same string "abc" in String Pool 
//		Therefore, their references will be same. They are equal
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		if( str1 == str2 ) {
			System.out.println("Both are equal");
		} else {
			System.out.println("They are not equal");
		}
		if( str1 == str3 ) {
			System.out.println("Both are equal");
		} else {
			System.out.println("They are not equal");
		}
//		It will compare the string's content
		if( str1.equals(str3) ) {
			System.out.println("Both are equal");
		} else {
			System.out.println("They are not equal");
		}
		
	}

}
