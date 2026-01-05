package study20260105;

import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {
		// 가위 바위 보 게임을 총 15회 진행
		// 1: 가위, 2: 바위, 3: 보자기
		// 게임을 진행하면서 1판 끝날 때 마다 몇승, 몇패, 몇무 출력하기.
		// ex) 0승 0패 0무 누적

		int winCount = 0;
		int drawCount = 0;
		int loseCount = 0;
		
		for (int i = 1; i <= 15; i++ ) {
			
			System.out.print("1: 가위, 2: 바위, 3: 보자기 1~3까지 숫자 중 하나를 입력하시오.: ");
			Scanner kbd = new Scanner(System.in);
			int user = kbd.nextInt();
			int com = (int) Math.floor(Math.random()*3)+1;
		
			if (com == user) {
				System.out.println("비겼습니다.");
				drawCount++;
			}else if ((user == 1 && com == 2) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("이겼습니다.");
				winCount++;
			}else {
				System.out.println("졌습니다.");
				loseCount++;
			}	
		System.out.println("승"+winCount+" / "+"패"+loseCount+" / "+"무"+drawCount);
		}
		
	
	}
}


