public class stringBuilderQ1 {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("StringBuffer ");
		StringBuilder str2 = new StringBuilder("is a peer class of String ");
		StringBuilder str3 = new StringBuilder("that provides much of ");
		StringBuilder str4 = new StringBuilder("the functionality of strings");
		
		str1.append(str2);
		System.out.println(str1);
		
		str3.append(str4);
		System.out.println(str3);
		
		str1.append(str3);
		System.out.println(str1);
	}
}

