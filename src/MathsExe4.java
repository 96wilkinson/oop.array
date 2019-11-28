
public class MathsExe4 {

	public static void main(String args[]) {
		int a = 20;
		int b = 25;

		int sum = a + b;
		int multi = a * b;
		int subtraction = a - b;
		float division = a / b;
		System.out.println("The sum is: " + sum);
		System.out.println("The multiplication is: " + multi);
		System.out.println("The subtraction is: " + subtraction);

		if (a >= b) {
			System.out.println("The division is: " + division);
		} else {
			System.out.println("a is smaller than b");
		}
	}
}
