import java.util.Comparator;
import java.util.TreeMap;
enum gender{male, female}

class Contact{
	public long PhoneNo;
	public String name;
	public String email;
	gender G;
	public Contact(String name, String email, gender G)
	{
		this.name = name;
		this.email = email;
		this.G = G;
	}
}
class compare implements Comparator<Contact>
{
	public int compare(Contact C1, Contact C2)
	{
		return 0;
	}
}
public class collectionsQ1 {

	public static void main(String[] args) {
		TreeMap <Long, Contact> tm = new TreeMap <Long, Contact>();
		Contact C1 = new Contact("Yashika","yashi@gmail.com",gender.female);
		tm.put(8943762234l, C1);
		tm.put(8378383372l, new Contact("Pranjal","pranjal54@gmail.com",gender.male));
		tm.put(9987367483l, new Contact("Naina","naina3@gmail.com",gender.female));
		tm.put(9908978473l, new Contact("Mrinal","mb0628@gmail.com",gender.female));
		tm.put(9876567876l, new Contact("John","johny@gmail.com",gender.male));
		tm.put(6546738222l, new Contact("Ishika","ishi@gmail.com",gender.female));
		tm.put(7564765663l, new Contact("Bob","bb2612@gmail.com",gender.male));
		tm.put(8898895120l, new Contact("Shristi","shristi43@gmail.com",gender.female));
		tm.put(8989342314l, new Contact("Manikant","kantmani01@gmail.com",gender.male));
		tm.put(8745333621l, new Contact("Kisan","kisankr@gmail.com",gender.male));
		tm.put(8309876321l, new Contact("Raj","raj76@gmail.com",gender.male));
		tm.put(9983567832l, new Contact("Rahul","rahul02@gmail.com",gender.male));
		tm.put(6207514488l, new Contact("Yashmin","yash09@gmail.com",gender.female));
		tm.put(9060728629l, new Contact("Aisha","aish@gmail.com",gender.female));
		tm.put(7860562805l, new Contact("Ankit","anki@gmail.com",gender.male));
		
		System.out.println("Keys: ");
		System.out.println(tm.keySet());
		System.out.println("Values: ");
		System.out.println(tm.values());
		System.out.println("Pair:");
		System.out.println(tm);
	}
}
