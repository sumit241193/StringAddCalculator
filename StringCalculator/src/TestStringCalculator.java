import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringCalculator {
	
	// For Checking Empty String
	@Test
	public void emptyString()
	{
		AppStringCalculator calc=new AppStringCalculator();
		assertEquals(calc.add(""), 0);
	}

}
