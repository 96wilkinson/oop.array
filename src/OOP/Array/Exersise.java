package OOP.Array;

public class Exersise {
	public static void main(String[] args) {
		int[] numbersExersise2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < numbersExersise2.length; i++) {
			System.out.print(" " + numbersExersise2[i]+ " ");

		}

		for (int j = 0; j < numbersExersise2.length; j++) {
			numbersExersise2[j] = numbersExersise2[j] * 10;
		}

		for (int i : numbersExersise2) {
			System.out.print("" + i + " ");
		}

	}
}
