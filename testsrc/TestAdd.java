import static org.junit.Assert.*;
import org.junit.Test;

public class TestAdd {
	SimpleCalculator calc = new SimpleCalculator();
	@Test
	public void TestAddTwoInts() {
		assertEquals(1, calc.add(1, 2));
	}
}
