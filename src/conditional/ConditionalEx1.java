package conditional;

public class ConditionalEx1 {
	public static int job1(int a, int b, boolean Gamma) {
		if (Gamma) {
			return a + b;
		} else {
			return a * b;
		}
	}

	public static void main(String args[]) {
		// calling job1 in the method so i can input some
		// numbers
		
		if (a % 2 ==0 || b % 2 ==0) {
			return 0;
		}
		else {
			System.out.println(job1(4, 5, true));
		}
	}

}
