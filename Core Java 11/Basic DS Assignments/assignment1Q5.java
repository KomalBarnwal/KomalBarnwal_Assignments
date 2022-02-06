import java.util.Scanner;
class TaxAmount{
	double tax=0;
    public double calculateTaxAmount(int ctc){
    	//SlabA
    	if(ctc>0 && ctc<=180000) {
    		System.out.println("Tax amount is:"+tax);
    	}
    	//SlabB
    	else if(ctc>181001 && ctc<=300000) {
    		System.out.println("Tax amount is:"+tax);
    	}
    	//SlabC
    	else if(ctc>300001 && ctc<=500000) {
    		System.out.println("Tax amount is:"+tax);
    	}
    	//SlabD
    	else if(ctc>500001 && ctc<=1000000) {
    		System.out.println("Tax amount is:"+tax);
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
