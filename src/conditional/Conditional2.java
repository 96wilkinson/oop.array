package conditional;

public class Conditional2 {
	public static void job2(int A) {

		if (A > 2000) {
			System.out.print("A");

			if (A > 6000) {
				System.out.print("C");
			} else {
				System.out.print("B");

				if (A > 4000) {
					System.out.print("D");
				}

				else {
					System.out.print("E");
				}

			}
		} else {
			System.out.print(1);

			if (A > 100) {
				System.out.print(3);

				if (A > 600) {
					System.out.print(4);

					if (A > 500) {
						System.out.print(6);
					} else {
						System.out.print(7);
					}
				} else {
					System.out.print(5);
				}
			} else {
				System.out.print(2);
			}
		}
	}

	public static void main(String args[]) {
		// calling job1 in the method so i can input some
		// numbers
		job2(2500);
	}

}
