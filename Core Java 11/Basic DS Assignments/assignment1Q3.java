import java.util.*;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double rate){
    	double SI = (principalAmount*time*rate)/100;
    	System.out.println("Simple Intrest is: ");
    	return SI;
    }
    public double compoundInterest(double principalAmount,int time,double rate){
    	double CI = principalAmount * Math.pow((1.0+ rate /100),time)-principalAmount;
    	System.out.println("Compound Intrest is: ");
    	return CI;
    }
}
public class assignment1Q3 {
	public static void main(String[] args) {
		double P,R;
		int T;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		P = scan.nextDouble();
		System.out.println("Enter the Time in years: ");
		T = scan.nextInt();
		System.out.println("Enter the Rate of Intrest: ");
		R = scan.nextDouble();
		SiCi sc = new SiCi();
		System.out.println(sc.simpleInterest(P,T,R));
		System.out.println(sc.compoundInterest(P,T,R));
	}
}
