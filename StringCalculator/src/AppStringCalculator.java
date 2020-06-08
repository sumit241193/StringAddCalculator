
public class AppStringCalculator {

	public int add(String number) {

		String[] values = number.split(",");

		if (isEmpty(number))
			return 0;

		if (number.length() == 1)
			return strToInt(number);
		else

			return Integer.parseInt(values[0]) + Integer.parseInt(values[1]);

	}

	private boolean isEmpty(String number) {
		return number.isEmpty();
	}

	private int strToInt(String number) {
		return Integer.parseInt(number);
	}

}
