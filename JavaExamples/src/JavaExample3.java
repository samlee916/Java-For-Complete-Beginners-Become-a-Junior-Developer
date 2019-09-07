//An example of using if conditions
public class JavaExample3 {

	public static void main(String[] args) {
		int biggerNumber = 90;
		int smallerNumber = 20;
		
		System.out.println("#1: If");
		if (biggerNumber != smallerNumber) {
			System.out.println(biggerNumber + " is not equal to " + smallerNumber);
		}
		
		System.out.println("#2: If Else");
		if(biggerNumber == smallerNumber) {
			System.out.println(biggerNumber + " is equal to " + smallerNumber);
		} else {
			System.out.println("Error");
		}
		
		System.out.println("#3: Else If");
		if(biggerNumber > smallerNumber) {
			System.out.println(biggerNumber + " is bigger than " + smallerNumber);
		} else if(biggerNumber != smallerNumber) {
			System.out.println(biggerNumber + " is not equal to " + smallerNumber);
		} else {
			System.out.println("Error");
		}
		
	}

}
