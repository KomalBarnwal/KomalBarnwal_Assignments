
public class stringBuilderQ2 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("It is used to _ at the specified index position.");
		StringBuilder s2 = new StringBuilder("insert text");
		s1.delete(14,15);
		s1.insert(14,s2);
		System.out.println(s1);

	}

}
