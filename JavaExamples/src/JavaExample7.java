//A Java example about while loops
public class JavaExample7 {

	public static void main(String[] args) {
		int temp = 0;
		
		//1:
		while(temp < 5 ) {
			temp++;
		}
		System.out.println(temp);
		
		//2:
		int arr[] = {10, 20, 30, 40, 50, 60};
		int i = 0;
		while(i < arr.length) {
			System.out.println("Number on index " + i + " = " + arr[i]);
			i++;
		}

	}

}
