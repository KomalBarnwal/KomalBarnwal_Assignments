package Question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class minMaxFinderTest {
	static minMaxFinder MinMaxFinder;
	
	@BeforeAll
	static void setup() {
		MinMaxFinder = new minMaxFinder();
	}

	@Test
	@DisplayName("Case 01")
	void testMinMax01() {
		assertArrayEquals(new int[] {3,56} ,MinMaxFinder.findMinMax(new int[] {56, 34, 7,3, 54, 3, 34, 34, 53}));
	}
	
	@Test
	@DisplayName("Case 02")
	void testMinMax02() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> MinMaxFinder.findMinMax(new int[] {}));
	}

}
