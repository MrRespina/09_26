package Practice;

import java.util.Random;

public class CMain4 {
	
	public static int getResult() {
		
		Random r = new Random();
		int i = r.nextInt(24)+1;		
		String res = null;
		
		System.out.println("현재 시각 = "+i+"시");
				
		switch(i) {
			case 9:
				res = "OK";
				break;
			case 14:
				res = "OK";
				break;
			case 18:
				res = "OK";
				break;
			default :
				System.out.println("9시,14시,18시 이외의 숫자가 나왔습니다.");
				break;
		}
		
		return ((res==null)?getResult():i);
		
	}
	
	public static void print(int i) {
		
		String tag="";
		if(i==9) {
			tag="입실";
		}else if(i==14) {
			tag="중간 확인";
		}else{
			tag="퇴실";
		}
		System.out.println("현재 "+i+"시 "+tag+" QR 찍는 시간입니다.");
		
	}
	
	public static void main(String[] args) {
		
		print(getResult());
		
	}
	
}
