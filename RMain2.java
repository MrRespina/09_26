package Practice;

import java.util.Random;

public class RMain2 {

	public static void main(String[] args) {

		int i = 0, j = 0, x = 0, y = 1, sum = 0, check = 0, result = 0;

		while (i < 10) {

			i++;
			sum += i;
			System.out.print(i + " ");

		}
		System.out.println("= " + sum);

		Random r = new Random();

		while (j < 5) {

			i = 0;
			j++;
			System.out.print((i = r.nextInt(10) + 1) + " ");

		}
		System.out.println();

		while (check != 9) {

			System.out.print((check = r.nextInt(10) + 1) + " ");

		}
		System.out.println();

		do {
			System.out.print((x = r.nextInt(10) + 1) + " ");
		} while (x != 9);
		System.out.println("");

		while (y <= 1000) {

			if (y % 15 == 0) {
				result=y;	
				System.out.print(result+" ");
			}
			y++;

		}
		System.out.println("");
		System.out.println(result);

	}

}
