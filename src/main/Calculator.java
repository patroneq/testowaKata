package main;

public class Calculator {

	private static final String DELIMITER = ",|\n";

	public int calculate(String input) {
		String[] numbers = input.split(DELIMITER);
		
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);
		}
		else {
			return getSum(numbers);
		}
	}

	private int getSum(String[] numbers) {
		int sum = 0;
		for (String number : numbers) {
			sum += stringToInt(number);
		}
		return sum;
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
