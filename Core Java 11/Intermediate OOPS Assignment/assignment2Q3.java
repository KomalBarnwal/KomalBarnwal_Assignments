import java.util.*;
class CurrentAccount extends assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return (totalDeposits+creditLimit);
    }
}
class SavingsAccount extends assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return (fixedDepositAmount+totalDeposits);
    }
}
public class assignment2Q3 {
     public int getCash(){
    	return 0;
    }
	public int totalCashInBank(ArrayList<Integer> cash){
		 int sum = 0;
			for( int i=0;i<cash.size();i++) {
				sum+=cash.get(i);
			}
			return sum;
	}
    
    public static void main(String[] args) {
    	ArrayList<Integer> cash=new ArrayList<>();
    	assignment2Q3 ob=new assignment2Q3();
    	
    	ob=new CurrentAccount();
    	cash.add(ob.getCash());
    	
    	ob=new SavingsAccount();
    	cash.add(ob.getCash());
    	
    	ob=new assignment2Q3();
    	System.out.print("total cash in the bank = "+ob.totalCashInBank(cash));
    	
    }

}