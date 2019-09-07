//A Java example of using switch statements
public class JavaExample4 {

	public static void main(String[] args) {
		int switchedInt = 5;
		int result = 0;
		
		//Example 1: will jump to case 5 because of the value of switchedInt
		switch(switchedInt) {
		case 0: 
			result = 10 * 0;
			break;
		case 2:
			result = 10 * 2;
			break;
		case 3:
			result = 10 * 5;
			break;
		default:
			result = 10;
		
		}
		System.out.println("Result is " + result);

		//Example 2: will jump to case + because of the char value
		char operation = '+';
		result = 0;
		switch(operation) {
		case '+':
			result = 10 + 5;
			break;
		case '-':
			result = 10 - 5;
			break;
		case '*':
			result = 10 * 5;
			break;
		default:
			result = 10;
		
		}
		System.out.println("Result is " + result);
	}

}
