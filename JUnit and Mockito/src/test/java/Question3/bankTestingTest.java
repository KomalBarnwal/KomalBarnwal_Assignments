package Question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bankTestingTest {

	@Test
	void BalanceWithdrawtest() {
		bankTesting withdrawAmount = new bankTesting();
		assertThrows(insufficientFundsExpcetion.class,
				() -> withdrawAmount.withdraw(25000),"Throw an exception that balance is less than withdrawl amount");
	}

}
