import java.util.ArrayList;
import java.util.regex.Pattern;

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
			String starting=inputs[0];
			
			
			appstr = new AppStringCalculator(parseStarting(starting),inputs[1]);
		}
		else
			appstr = new AppStringCalculator(",|\n",number);
		return appstr;
	}



	private String parseStarting(String starting) {
		String delimiter=starting.substring(2);
		if(delimiter.startsWith("[")) {
			delimiter=delimiter.substring(1, delimiter.length()-1);
		}
		return Pattern.quote(delimiter);
	}
	
	private int doSum(String [] num) throws Exception
	{
		int sum = checkNegativeNumber(num);
		return sum;
	}



	private int checkNegativeNumber(String[] num) throws Exception {
		int sum=0;
		ArrayList<String> arr=new ArrayList<>();
		for(String item:num)
		{
			if(Integer.parseInt(item)<0) {
				arr.add(item);
				
			}
			
			else if(Integer.parseInt(item)>1000)
			{
				return checkNumberMoreThan1000(item);
			}
			else
			{
			sum+=Integer.parseInt(item);
			}
			
			
		
		}
		
		showError(arr);
		return sum;
	}



	private int checkNumberMoreThan1000(String item) {
		char char0 = item.charAt(0);
		char char1=item.charAt(item.length()-1);
		
		return Character.getNumericValue(char0)+Character.getNumericValue(char1);
	}



	private void showError(ArrayList<String> arr) throws Exception {
		if(arr.size()>0)
		{
			StringBuffer str=new StringBuffer();
			
			for(String item:arr)
				str.append(item+",");
			
			str.replace(str.length()-1, str.length(),"");
			
			String errorshow=str.toString();
			
			throw new Exception("Negative not allowed: "+errorshow);
		}
	}

	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	private int strToInt(String number) {
		return Integer.parseInt(number);
	}
	
	

}
