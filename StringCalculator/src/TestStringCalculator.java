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
	public void emptyString() throws Exception
	{
		
		assertEquals(calc.add(""), 0);
	}
	
	@Test
	public void singleValue() throws Exception
	{
		assertEquals(calc.add("1"),1);
	}
	
	@Test
	public void twoNumberComma() throws Exception
	{
		assertEquals(calc.add("1,2"),3);
	}
	
	@Test
	public void testNewLineDelimiter() throws Exception
	{
		assertEquals(calc.add("1\n2,3"),6);
	}
	
	@Test
	public void specifiedDelimiter() throws Exception
	{
		assertEquals(calc.add("//;\n1;2"),3);
	}
	
	@Test(expected=Exception.class)
	public void negativeNumber() throws Exception
	{
		calc.add("-5");
	}
}
