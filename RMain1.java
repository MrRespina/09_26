package Practice;

import java.util.Random;

public class RMain1 {

	public static void main(String[] args) {

		Random r = new Random();
		int x, sum = 0, fact = 1, sum2 = 0;

		for (int i = 1; i <= 20; i++) {

			System.out.print(i + " ");

		}
		System.out.println();

		for (int i = 1; i <= 21; i += 2) {

			System.out.print(i + " ");

		}
		System.out.println();

		for (int i = 2; i <= 22; i += 2) {

			System.out.print(i + " ");

		}
		System.out.println();

		for (int i = 5; i >= 1; i--) {

			System.out.print(i + " ");

		}
		System.out.println();

		for (int i = 0; i < 5; i++) {

			x = r.nextInt(10) + 1;
			System.out.print(x + " ");

		}
		System.out.println();

		for (int i = 1; i <= 10; i++) {

			sum += i;
			System.out.print((i >= 10) ? i + " = " : i + " + ");

		}
		System.out.print(sum);
		System.out.println("");

		for (int i = 1; i <= 7; i++) {

			fact = fact * i;
			System.out.print((i >= 7) ? i + " = " : i + " * ");

		}
		System.out.println(fact);

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 || i % 5 == 0) {

				sum2 = sum2 + i;
				System.out.print((i >= 50) ? i + " = " : i + " + ");

			}

		}
		System.out.print(sum2);

	}

}
