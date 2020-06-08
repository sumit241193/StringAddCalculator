import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStringCalculator {
	
	private AppStringCalculator calc;
	
	@Before
	public void init()
	{
		calc=new AppStringCalculator();
	}
	
	
	@Test
	public void emptyString()
	{
		
		assertEquals(calc.add(""), 0);
	}
	
	@Test
	public void singleValue()
	{
		assertEquals(calc.add("1"),1);
	}
	
	@Test
	public void twoNumberComma()
	{
		assertEquals(calc.add("1,2"),3);
	}
	
	@Test
	public void testNewLineDelimiter()
	{
		assertEquals(calc.add("1\n2,3"),6);
	}
	
	@Test
	public void specifiedDelimiter()
	{
		assertEquals(calc.add("//;\n1;2"),3);
	}
	
	@Test(expected=Exception.class)
	public void negativeNumber()
	{
		calc.add("-5");
	}
}
