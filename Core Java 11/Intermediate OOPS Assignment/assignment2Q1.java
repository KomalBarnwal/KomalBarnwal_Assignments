class SingletonInheritanceCheck
{
	public static SingletonInheritanceCheck SIC = null;
	private SingletonInheritanceCheck()
	{
		System.out.println("Instance created");
	}
	public static SingletonInheritanceCheck getInstance()
	{
		if(SIC == null)
		{
			SIC = new SingletonInheritanceCheck();
			System.out.println("Success: New object created with id:" +SIC);
		}
		else
		{
			System.out.println("Error: No more object can be created");
		}
		return SIC;
	}
}
public class assignment2Q1 {

	public static void main(String[] args) 
	{
		SingletonInheritanceCheck SIC = SingletonInheritanceCheck.getInstance();   
		SingletonInheritanceCheck SIC1 = SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck SIC2 = SingletonInheritanceCheck.getInstance();
	}

}
