package Practice;

import java.util.Random;

public class Rmain3_Pr {
	
	public static int getNumber() {

		Random r = new Random();
		int i = r.nextInt(10)+1;
		System.out.println("랜덤한 수의 값 : "+i);
		
		return i;
		
	}
	
	public static void printCalc() {
		
		int num = getNumber();
		int num2 = getNumber();
		
		if(num2>num) {
			
			int change = num2;
			num2 = num;
			num = change;
			System.out.println(num+" , "+num2+" > "+num2+" , "+num);
			
		}
		
		for(int i = 0;i<=num;i++) {
			
			for(int j = num2;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		printCalc();
		
	}

}
