abstract class Persistence {
    abstract public String persist();
    
}
class FilePersistence extends Persistence{
  
    public String persist() {
    	return "File Persistence";
    }
}
class DatabasePersistence extends Persistence{
    
    public String persist() {
    	return "Database Persitence";
    }
}

public class assignment2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persistence obj = new FilePersistence();
		Persistence obj1 = new DatabasePersistence();
		System.out.println(obj.persist());
		System.out.println(obj1.persist());
	}

}