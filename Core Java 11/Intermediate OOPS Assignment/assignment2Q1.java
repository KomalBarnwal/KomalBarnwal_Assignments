class SingletonInheritanceCheck
{
	public static SingletonInheritanceCheck SIC = null;
	SingletonInheritanceCheck()
	{
		System.out.println("Instance created");
	}
	public static SingletonInheritanceCheck getInstance()
	{
		if(SIC == null)
		{
			SIC = new SingletonInheritanceCheck();
		}
		return SIC;
	}
}
public class assignment2Q1 {

	public static void main(String[] args) 
	{
		SingletonInheritanceCheck SIC = SingletonInheritanceCheck.getInstance();        
        SingletonInheritanceCheck SIC1 = new SingletonInheritanceCheck();
	}

}