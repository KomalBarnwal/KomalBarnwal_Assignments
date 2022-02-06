
public class stringBufferQ1 {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("StringBuffer ");
		StringBuffer str2 = new StringBuffer("is a peer class of String ");
		StringBuffer str3 = new StringBuffer("that provides much of ");
		StringBuffer str4 = new StringBuffer("the functionality of strings");
		
		str1.append(str2);
		System.out.println(str1);
		
		str3.append(str4);
		System.out.println(str3);
		
		str1.append(str3);
		System.out.println(str1);

	}

}
