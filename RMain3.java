package Practice;

public class RMain3 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.printf("%d x %d = %02d  ", i, j, (i * j));

			}
			
			System.out.println("");

		}
		
		System.out.println("==============================================================================================================");
		for(int i = 2;i<=9;i++) {
			System.out.print("     "+i+"단    ");
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

				System.out.printf("%d x %d = %02d  ", j, i, (i * j));

			}

			System.out.println();

		}

	}

}
