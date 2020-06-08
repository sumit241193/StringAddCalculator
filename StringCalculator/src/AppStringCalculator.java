
public class AppStringCalculator {
	
	private String delimiter=",|\n";

	public int add(String number) {

		String[] values = number.split(this.delimiter);

		if (isEmpty(number))
			return 0;

		if (number.length() == 1)
			return strToInt(number);
		else

			return doSum(values);

	}
	
	private int doSum(String [] num)
	{
		int sum=0;
		for(String item:num)
		{
			sum+=Integer.parseInt(item);
		}
		return sum;
	}

	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	private int strToInt(String number) {
		return Integer.parseInt(number);
	}
	
	

}
