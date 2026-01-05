package study20260105;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
//		Integer.parseInt ()  정수값으로 변경
//		Math.floor() 소수점 자르기
//		int num = (int) Math.floor(Math.random()*9)+7; // 1을 더해서 범위를 1~10까지 나오도록
//		
//		System.out.println(num);
		
		Scanner sc = new Scanner(System.in);
	
		
		int coin = (int)Math.floor(Math.random()*2)+1;
		// 1: 앞면, 2: 뒷면
		System.out.println("동전 앞면, 뒷면 맞추기");
		System.out.println("1 - 앞면, 2 - 뒷면 \n입력: ");
		int user = sc.nextInt();
		
		if(user == coin)
			System.out.println("맞추기 성공!");
		else
			System.out.println("맞추기 실패!");
		
		
	}

}
