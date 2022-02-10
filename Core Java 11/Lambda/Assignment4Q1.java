@FunctionalInterface
interface Arithmetic{
	double operations(double num1, double num2);
}

public class Assignment4Q1 {
//	  public double addition(int num1,int num2){}
//    public double subtraction(int num1,int num2){}
//    public double multiplication(int num1,int num2){}
//    public double division(int num1,int num2){}
	public static void main(String[] args) {
	
		//addition
		Arithmetic addition = (num1,num2) -> (num1+num2);
		System.out.println("Addition = " +addition.operations(13,5));
		
		//subtraction
		Arithmetic subtraction = (num1,num2) -> (num1-num2);
		System.out.println("Subtraction = " +subtraction.operations(13,5));
		
		//multiplication
		Arithmetic multiplication = (num1,num2) -> (num1*num2);
		System.out.println("Multiplication = " +multiplication.operations(13,5));
		
		//multiplication
		Arithmetic division = (num1,num2) -> (num1/num2);
		System.out.println("Division = " +division.operations(13,5));
	}
}
