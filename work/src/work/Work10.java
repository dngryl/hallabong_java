package work;

import java.util.Scanner;

public class Work10 {

	public static void main(String[] args) {
		// 사용자가 올바른 비밀번호를 입력할 때까지 계속 물어보는 시스템입니다.
		/*
		정답 비밀번호를 정수 1234로 설정해 두세요.
		사용자에게 "비밀번호 입력:" 을 출력하고 입력을 받으세요.
		입력한 값이 1234가 아니라면, 계속해서 다시 입력을 받으세요.
		반드시 do-while 문을 사용하세요.
		정답을 맞히면 반복을 종료하고 "로그인 성공!"을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int enter;
		int pw = 1234;

		do {
			System.out.print("비밀번호 입력: ");
			enter = sc.nextInt();
			if(enter != pw) {
				System.out.print("비밀번호가 틀렸습니다. 다시 입력하세요. ");
			}
			
		} while (enter != pw);
			System.out.println("로그인 성공!");
			
		
		
	}

}
