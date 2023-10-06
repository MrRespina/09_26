package Practice;

import java.util.Random;

public class CMain2 {

	public static void main(String[] args) {

		System.out.println("주사위 던지기!");
		int i = new Random().nextInt(6) + 1;

		/*
		if (i == 1) {
			System.out.println("1이 나왔습니다.");
		} else if (i == 2) {
			System.out.println("2가 나왔습니다.");
		} else if (i == 3) {
			System.out.println("3이 나왔습니다.");
		} else if (i == 4) {
			System.out.println("4가 나왔습니다.");
		} else if (i == 5) {
			System.out.println("5가 나왔습니다.");
		}else {
			System.out.println("6이 나왔습니다.");
		}
		*/
		
		int res=1;
		if (i == 1) {
			res=1;
		} else if (i == 2) {
			res=2;
		} else if (i == 3) {
			res=3;
		} else if (i == 4) {
			res=4;
		} else if (i == 5) {
			res=5;
		}else {
			res=6;
		}
		System.out.println("주사위 "+res+"이(가) 나왔습니다.");
		

	}

}
