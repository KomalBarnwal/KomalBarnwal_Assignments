import java.util.HashSet;

class employee
{
	private int eId;
	private String name;
	private double salary;
	private String department;
	public employee(int eId, String name, double salary, String department)
	{
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void showDetails()
	{
		System.out.println("employee id: "+eId);
		System.out.println("employee name: "+name);
		System.out.println("employee's salary: "+salary);
		System.out.println("department: "+department);
	}	
}
public class genericsQ1 {

	public static void main(String[] args) {
		HashSet<employee> e = new HashSet<>();
		e.add(new employee(2203, "Prakash", 60000,"Cyber Security"));
		e.add(new employee(2289, "Shiven", 45000,"Operations Department"));
		e.add(new employee(2223, "Anurag", 55000,"Sales Department"));
		e.add(new employee(2246, "Boby", 35900,"Marketing Management"));
		e.add(new employee(2254, "Kirti", 46500,"HR"));
		e.add(new employee(2209, "Jasleen", 65000,"Web Development"));
		e.add(new employee(2654, "Jyoti", 45500,"Finance Department"));
		
		for (employee emp : e)
		{
			emp.showDetails();
			System.out.println("\n");
		}
	}
}
