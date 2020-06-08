
public class AppStringCalculator {
	
	private String delimiter=",|\n";

	public int add(String number) {

		

		if (isEmpty(number))
			return 0;

		if (number.length() == 1)
			return strToInt(number);
		else
			if(number.startsWith("//"))
			{
				String[] inputs = number.split("\n",2);
				delimiter = inputs[0].substring(2);
				number=inputs[1];
			}
			String[] values = number.split(this.delimiter);
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
