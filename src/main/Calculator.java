package main;

public class Calculator {

	private static final String DELIMITER = ",|\n";

	public int calculate(String input) throws Exception {
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

	private int getSum(String[] numbers) throws Exception {		
		findNegativeNumbers(numbers);		
		int sum = add(numbers);
		return sum;
	}

	private int add(String[] numbers) {
		int sum = 0;
		for (String number : numbers) {
			if (stringToInt(number) > 1000) {
				break;
			}
			sum += stringToInt(number);
		}
		return sum;
	}

	private void findNegativeNumbers(String[] numbers) throws Exception {
		for (String number : numbers) {
			if (stringToInt(number) < 0) {
				throw new Exception("Negative input");
			}
		}
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
