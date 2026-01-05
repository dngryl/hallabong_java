package study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {

//		for(int i =1; i<=10; i++) {
//			System.out.println(i);	
//		}

//		for(int i = 1; i<=100; i++) {
//			if (i%10 == 0) // 10의 배수
//			System.out.println(i);
//		}

		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("정수 입력: ");
//		int num = scan.nextInt();
//		
//		for (int i =1; i <= num; i++) {
//			System.out.println( i );
//		}

		// 1부터 12까지 출력하는데, 4의 배수에는 four라고 출력하시오.

//		for (int i = 1; i <= 12; i++) {
//			if (i % 4 == 0)
//				System.out.println("four");
//			else
//				System.out.println(i);
//		}
		
		// 1부터 1000까지 숫자 중에서 17의 배수가 몇개 인지 구하시오
		
//		int count = 0;
//		
//		for ( int i = 1; i<=1000; i++) {
//			if( i%17==0) {
//				count++; //여기서 '++'은 누적 
//			} // 중괄호 안에서 만들어진 변수는 중괄호 안에서만 적용
//		}
//		
//		System.out.println("17의 배수: "+count+"개");
	
		// 문제  
		// 동전 앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행하기
		// 게임에서 내가 맞춘 횟수는 총 몇 번인지 출력하기
		

//		int winUser = 0;
//		
//		for (int i = 1; i<=10; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("1: 앞면, 2: 뒷면 숫자를 입력하세요.: ");
//			
//			int coin = (int)Math.floor(Math.random()*2)+1;
//			int user = sc.nextInt();	
//			
//			if (user == coin) {
//				System.out.println("맞췄습니다.");
//				winUser++;
//			}else 
//				System.out.println("틀렸습니다.");
//		}
//		System.out.println("내가 맞춘 횟수: "+ winUser);
//
//	}
// 반복문 작성 전 1회 실행할 코드를 먼저 작성한 후, 반복문 안에 그대로 넣으면 쉬움.

/*
 * 반복문: for, while, do~while 반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정이다. 또는 횟수의 제한없이 동작
 * 시킬 수 있다.
 * 
 * 1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다. 그래야 몇번 반복 시킬 것인지 작성하기도 편하고 파악하기도 빠름.
 * 
 * for문
 * 
 * for( 초기값; 조건식; 증감식 ) { 반복 실행할 내용; 반복 실행할 내용; }
 * 
 * ex) for ( int i=3; i<=9; i++) { // 7번 반복 }
 * 
 * for ( int i=3; i<=9; i= i+2) { // 4번 반복 }
 * 
 * 주로 사용하는 for문 ex) for (Member m : MemberList) { }
 * 
 * 
 *
 * 
 * 
 * 
 */
	
//	for( ; true ;) {
//		
//	}
//	
//	for(;;) {
//		;
//	}
//	
//	while(true) {
//		System.out.println("나는 무한 루프이다.");
//	}
		
//	int i = 10;	
//	while(true) {
//		System.out.println(i);
//		i++;
//		if (i == 40) break; 
//	}
		
//	while (true) {
//		int num = (int)Math.floor(Math.random()*20)+1;
//			System.out.println(num);
//			if ( num == 11) break;
//	}
		
	int com = (int)Math.floor(Math.random()*50)+1;
	
	while (true) {
		System.out.println("1~50 중 입력: ");
		int user = scan.nextInt();
		if (user > com) {
			System.out.println("Down");
		}
		if (user < com) {
			System.out.println("Up");
		}
		if (user == com) {
			System.out.println("정답입니다.");
			break;
		}
	}
		
 // 내가 숫자를 제시하면 컴퓨터가 범위를 좁혀가며 맞출 수 있도록 만들기		
	
	
}
}
