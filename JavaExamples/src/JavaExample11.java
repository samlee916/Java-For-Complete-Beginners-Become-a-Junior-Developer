//A Java example of summing arrays
public class JavaExample11 {

    public static void main(String[] args) {

        int[] inputArray = {10, 15, 85, 46, 12, 28, 36, 34, 2, 28, 47, 66};

        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i]; // sum += inputArray[i]
        }

        System.out.println("Sum of Array : " + sum);
        System.out.println("Average Of Array : " + (sum / inputArray.length));
    }
    
}