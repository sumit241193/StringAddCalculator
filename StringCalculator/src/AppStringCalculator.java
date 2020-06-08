
public class AppStringCalculator {

	public int add(String number) {
		if(isEmpty(number))
			return 0;
		
		return	strToInt(number);
	}



	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	
	
	private int strToInt(String number) {
		return Integer.parseInt(number);
	}

}
