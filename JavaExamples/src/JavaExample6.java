//A Java example about for loops
public class JavaExample6 {

	public static void main(String[] args) {
		int temp = 1;
		temp++; //temp = temp + 1
		System.out.println("Temp variable is now " + temp);
		temp--; //temp = temp - 1
		System.out.println("Temp vaaible is now " + temp);
		
		//Loop #1:
		System.out.println("Loop #1: ");
		for(int i = 0; i < 5; i++ ) {
			System.out.println("i is now " + i);
		}
		
		//Loop #2:
		System.out.println("Loop #2: ");
		String[] names = {"Adam", "Ava", "Paul", "Emily"};
		for(int i = 0; i < names.length; i++) {
			System.out.println("Name on index " + i + " = " + names[i]);
		}
		
		//Loop #3:
		System.out.println("Loop #3: ");
		for(int i = 0; i < names.length;) {
			System.out.println("Name on index " + i + " = " + names[i]);
			i++;
		}
	}

}
