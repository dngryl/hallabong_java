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
	
		
//		int coin = (int)Math.floor(Math.random()*2)+1;
//		// 1: 앞면, 2: 뒷면
//		System.out.println("동전 앞면, 뒷면 맞추기");
//		System.out.println("1 - 앞면, 2 - 뒷면 \n입력: ");
//		int user = sc.nextInt();
//		
//		if(user == coin)
//			System.out.println("맞추기 성공!");
//		else
//			System.out.println("맞추기 실패!");
//		
//		int dice = (int)Math.floor(Math.random()*6)+1;
//		
//		System.out.println("주사위 맞추기 게임");
//		System.out.println("1~6 중에 하나 입력: ");
//		int user = sc.nextInt();
//		
//		if (user == dice)
//			System.out.println("맞추기 성공");
//		else 
//			System.out.println("맞추기 실패");			
		
		
		//컴퓨터 주사위
//		int com = (int)Math.floor(Math.random()*6)+1;
//		
//		//나의 주사위
//		int user = (int)Math.floor(Math.random()*6)+1;
//		
//		System.out.println(com+" : "+user);
//		
//		// 내가 컴퓨터 보다 큰가? 작은가? 아니면 비겼는가?
//		if (com < user || (user== 1 && com == 6)) {
//			if(user == 6 && com ==1)
//				System.out.println("나의 패!");
//			else
//				System.out.println("나의 승!");
//		}else if (com == user) 
//			System.out.println("비겼습니다.");
//		else 
//			System.out.println("나의 패!");
		
		
		
		
		// 컴퓨터와 함께하는 가위바위보 게임
		// 1: 가위, 2: 바위, 3: 보자기
		
		// 컴퓨터의 가위바위보는 랜덤으로
		// 나의 가위바위보 값은 키보드로 입력
		// 내가 이겼는지, 졌는지, 비겼는지 출력하세요.
		
		
		System.out.print("1: 가위, 2: 바위, 3: 보자기 1~3 중 하나를 입력하세요.: ");
		int user = sc.nextInt();
		int com = (int)Math.floor(Math.random()*3)+1;
		
		System.out.println("컴퓨터: "+ com + " 나: "+ user);
		
		//내가 작성
//		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
//				System.out.println("내가 이겼습니다.");
//		}else if ((com == 1 && user == 3) || (com == 2 && user == 1) || (user == 3 && com == 2)) {
//			System.out.println("내가 졌습니다.");
//	    }else 
//	    	System.out.println("비겼습니다.");
//		
//		
		// 강사님 작성 v1
//		if (user == com)
//			System.out.println("비김");
//		else if ((user== 1 && com == 3) || (user==2 && com==1) || (user==3&&com==2)) {
//			System.out.println("나의 승리");
//		}else
//			System.out.println("나의 패배");
		
		// 강사님 작성 v2
		int res = user - com;
		if (res==0)
			System.out.println("비김");
		else if(res ==-2 || res ==1)
			System.out.println("나의 승리");
		else
			System.out.println("나의 패배");

	}
}