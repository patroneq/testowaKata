package main;

public class Calculator {

	public int calculate(String input) {
		String[] numbers = input.split(",|\n");
		
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
		return stringToInt(numbers[0]) + stringToInt(numbers[1]);
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
