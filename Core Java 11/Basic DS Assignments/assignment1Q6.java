import java.util.Scanner;
class Login{
	String userId = "Ajay",password = "password";
	Scanner sc = new Scanner(System.in);
	int count = 0;
	public String getUser()
	{
	    System.out.println("Enter userID ");
	    String user = sc.next();
	    return user;
    }
	public String getPassword()
	{
	    System.out.println("Enter Password");
	    String pwd = sc.next();
	    return pwd;
	}
	public String loginUser(String user, String pwd) 
	{
	    user = getUser();
	    pwd = getPassword();
	    if(user.equals(user)&& pwd.equals(password))
	    {
	    	return "welcome"+" "+user;
	    }
	    	count++;
	    	if(count<3)
	    	{
	    	    System.out.println("Wrong credentials, enter the right credentials.");
	    	    loginUser(user,pwd);
	    	    if(user.equals(userId) && pwd.equals(password));
	    	    {
	    	    	return "welcome"+" "+user;
	    	    }
	    	}
		return "You have entered worng credentials, Kindly enter right credentials"+"\n"+"Contact Admin";
       }
}
	public class assignment1Q6 {
		
	public static void main(String[] args) 
	{
		Login user = new Login();
		String userID = " ",password="";
		System.out.println(user.loginUser(userID, password));

	}
}
