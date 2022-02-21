package Question3;

class insufficientFundsExpcetion extends Exception{
	public insufficientFundsExpcetion(String string) {
		super(string);
	}
}

public class bankTesting {
	private int balance = 20000;
	public void withdraw(int amount) throws insufficientFundsExpcetion {
		if (amount > balance) {
			throw new insufficientFundsExpcetion("Insufficient balance");
		}
		balance = balance - amount;
	}

}
