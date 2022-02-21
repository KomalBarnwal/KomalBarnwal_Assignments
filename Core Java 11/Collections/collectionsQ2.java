import java.util.HashSet;
import java.util.Iterator;
public class collectionsQ2 {
	public static void main(String[] args) {
		HashSet<String> product = new HashSet<String>();
		
		product.add("Pen");
		product.add("Pencil");
		product.add("Notebooks");
		product.add("Book");
		product.add("Sticky Notes");
		product.add("Pen");                  //duplicate input
		product.add("Markers");
		product.add("Book");                 //duplicate input
		product.add("Diary");
		product.add("Note Pad");
		product.add("Sketch Pen");
		product.add("Diary");                //duplicate input
		product.add("Tool Box");
		
		Iterator<String> IT = product.iterator();
	    while (IT.hasNext()) 
	    {
			String string =IT.next();
			System.out.println(string);
			
		}
	}
}