package work;

import java.util.Scanner;

public class Work12 {

	public static void main(String[] args) {
		// 은행 계좌 관리 시스템을 만듭니다. 프로그램은 종료(4번)를 누르기 전까지 계속 실행되어야 합니다.
		/*
		요구사항:
		잔고 변수(balance): 처음엔 0원으로 시작합니다.
		무한 루프: while(true) 혹은 boolean run = true를 사용하여 프로그램이 꺼지지 않게 하세요.
		메뉴 출력: 루프가 돌 때마다 아래 메뉴를 보여주세요.
		
		----------------------------------
		1.예금 | 2.출금 | 3.잔고 | 4.종료
		----------------------------------
		선택>
		
		기능 구현:
		1. 입금(deposit): 입금할 금액을 입력받아 잔고에 더합니다.
		2. 출금(withdrawal): 출금할 금액을 입력받아 잔고에서 뺍니다.
		(도전 과제: 잔고보다 출금액이 크면 "잔고가 부족합니다" 출력하고 돈을 빼지 마세요.)
		3. 잔고(balance): 현재 잔고를 출력합니다.
		4. 종료(Exit): "프로그램 종료"를 출력하고 반복문을 끝냅니다(break).
		 */
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int balance = 0;
		
		while(true) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		System.out.print("원하는 업무를 숫자로 입력해주세요.: ");

		int key = sc. nextInt();
		
		if (key == 1) {
			System.out.println("입금할 금액을 입력하세요.: ");
			money = sc.nextInt();
			if (money > 0) {
				balance = balance + money;
				System.out.println(money + "원 입금되었습니다." + "(잔고: " + balance+"원)");
			}else
				System.out.println("금액을 다시 입력하세요.");
		}
		if (key == 2) {
			System.out.println("출금할 금액을 입력하세요.: ");
			money = sc.nextInt();
			if (money <= balance) {
				balance = balance - money;
				System.out.println(money + "원 출금되었습니다." + "(잔고: " + balance+"원)");
			}else
				System.out.println("잔고가 부족합니다.");
		}
		if (key ==3) System.out.println("잔고: " +balance);
		if (key ==4) {
			System.out.println("프로그램 종료");
			break;
		}
		
		}
		
		
		
		
	}

}
