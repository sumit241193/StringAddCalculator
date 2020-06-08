
public class AppStringCalculator {
	
	private String delimiter=",|\n";
	private String input;
	
	public AppStringCalculator()
	{}
	
	
	
	public AppStringCalculator(String delimiter, String input) {
		this.delimiter = delimiter;
		this.input = input;
	}

	

	public int add(String number) throws Exception {

		

		if (isEmpty(number))
			return 0;

		
		else {
			AppStringCalculator appstr = parseDelimiter(number);
			String[] values = appstr.input.split(appstr.delimiter);
			return doSum(values);
			

	}
	}



	private AppStringCalculator parseDelimiter(String number) {
		AppStringCalculator appstr;
		if(number.startsWith("//"))
		{
			String[] inputs = number.split("\n",2);
			
			
			appstr = new AppStringCalculator(inputs[0].substring(2),inputs[1]);
		}
		else
			appstr = new AppStringCalculator(",|\n",number);
		return appstr;
	}
	
	private int doSum(String [] num) throws Exception
	{
		int sum=0;
		for(String item:num)
		{
			if(Integer.parseInt(item)<0) throw new Exception("Negative not allowed");
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
