package Practice;

import java.util.Random;

public class CMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int i = r.nextInt(6)+1;
		int res = 6;
		
		switch(i) {
			case 1:
				res=1;
				break;
			case 2:
				res=2;
				break;
			case 3:
				res=3;
				break;
			case 4:
				res=4;
				break;
			case 5:
				res=5;
				break;
		}
		
		System.out.println("당신이 뽑은 주사위 숫자는 "+res+"입니다.");

	}
	

}
