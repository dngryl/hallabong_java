package study20260105;

import java.util.Scanner;

public class asdasdV2 {

	public static void main(String[] args) {
		// 가위 바위 보 게임을 총 15회 진행
		// 1: 가위, 2: 바위, 3: 보자기
		// 게임을 진행하면서 1판 끝날 때 마다 몇승, 몇패, 몇무 출력하기.
		// ex) 0승 0패 0무 누적

		int winCount = 0, loseCount = 0, drawCount = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 15; i++ ) {
			int com = (int)Math.floor(Math.random()*15)+1;
			System.out.println("1: 가위, 2: 바위, 3: 보");
			int user = sc.nextInt();
			
			System.out.println("컴퓨터: "+com + " 나: "+user);
			
			int res = user-com;
			if(res==0) {
				System.out.println("비김");
				drawCount++;
			}else if (res== -2 || res == 1) {
				System.out.println("나의 승리");
				winCount++;
			}else {
				System.out.println("나의 패배");
				loseCount++;
			}
			
			System.out.println("승: "+winCount+" 패 "+loseCount+" 무 "+drawCount);
			
		}			
					
		
	
	}
}


