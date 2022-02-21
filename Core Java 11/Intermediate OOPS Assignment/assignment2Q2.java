
import  java.util.*;

class Manager extends assignment2Q2 {
    @Override
    public  int getSalary(int salary) {
        int incentive = 5000;
        return (salary+incentive);
        
    }
}

class Labour extends assignment2Q2 {
	
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return (salary+overtime);
    }	
}

public class assignment2Q2 {
	int salary = 10000;
	
    public int getSalary(int salary){
    	return salary;
    }

    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    
         int sum = 0;
		 for( int i=0;i<employeeSalaries.size();i++) {
			sum+=employeeSalaries.get(i);
		}
		return sum;
    }
	
	public static void main(String[] args) {
		
	  ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();
	  
         assignment2Q2 ob;
       
         ob=new Manager();
         employeeSalaries.add(ob.getSalary(10000));
         
         ob=new Labour();
         employeeSalaries.add(ob.getSalary(10000));
         
         
         ob=new assignment2Q2();
         System.out.println("Total Salary of employees = "+ob.totalEmployeesSalary(employeeSalaries));
	}

}