package Practice;

import java.util.Scanner;

public class CMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		try {
			
			System.out.print("정수 입력 : ");
			int i = s.nextInt();
			
			if(i<10) {
				if(i%2==0) {
					System.out.println("짝수!");
				}else {
					System.out.println("홀수!");
				}
			}else if(i<=15) {
				System.out.println("Hello!");
			}else if(i<20) {
				System.out.println("안녕하십니까.");
			}else {
				System.out.println("20 미만의 정수를 입력해주세요.");
			}
			
		}catch(Exception e) {
			System.out.println("올바른 정수를 입력해주세요.");
		}
		
		s.close();
		
	}

}
