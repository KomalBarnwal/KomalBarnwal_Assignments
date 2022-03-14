import java.util.Scanner;
class TaxAmount{
	double tax=0;
    public double calculateTaxAmount(int ctc){
    	//SlabA
    	if(ctc>0 && ctc<=180000) {
    		System.out.println("This Annual amount is for SlabA: "+ctc+" and the tax for SlabA is :"+tax);
    	}
    	//SlabB
    	else if(ctc>181001 && ctc<=300000) {
    		tax=0.1*ctc;
    		System.out.println("This Annual amount is for SlabB: "+ctc+" and the tax for SlabB is :"+tax);
    	}
    	//SlabC
    	else if(ctc>300001 && ctc<=500000) {
    		tax=0.2*ctc;
    		System.out.println("This Annual amount is for SlabC: "+ctc+" and the tax for SlabC is :"+tax);
    	}
    	//SlabD
    	else if(ctc>500001 && ctc<=1000000) {
    		tax=0.3*ctc;
    		System.out.println("This Annual amount is for SlabD: "+ctc+" and the tax for SlabD is :"+tax);
    	}
    	return tax;
    }
}

public class assignment1Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ctc=sc.nextInt();
		System.out.println("Enter ctc amount:");
		TaxAmount TA = new TaxAmount();
		TA.calculateTaxAmount(ctc);

	}

}
