package study20260107;

import java.util.Scanner;

public class Move {

	public static void main(String[] args) {
		// 2차원 배열의 1차원 배열 안의 1차원 배열은 중괄호 하나 더 감싸기.
		
		Scanner scan = new Scanner(System.in);
		
		
		int[][] board = {
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,2,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
		
		int posX =0, posY=0;
		
		while (true) {
		for (int i=0; i<board.length; i++) {//2차원 배열이라 for문 2개
			for (int k=0; k<board[i].length; k++) {
			
				if(board[i][k] == 1)
					System.out.printf("%c",'■');
				else if(board[i][k]==0)
					System.out.printf(" ");
				else if(board[i][k]==2) {
					System.out.printf("%c",'♂');
					posX = k; posY=i;
				}	
					
			}
			System.out.println();
		}
		
		char key = scan.nextLine().charAt(0);
		
		// 이동하기 w 위, s 아래, a 왼쪽, d 오른쪽
		// 벽부분 이동 불가하게 만들기
		board[posY][posX] =0;
		switch(key) {
		
		case 'w':
			if(board[posY-1][posX]!=1)
				posY--;
			break;
		case 's':
			if(board[posY+1][posX]!=1)
				posY++;
			break;
		case 'a':
			if(board[posY][posX-1]!=1)
				posX--;
			break;
		case 'd':
			if(board[posY][posX+1]!=1)
				posX++;
			break;	
			
		default: // switch문 예외 처리
			System.out.println("올바른 이동키를 입력하세요.");
			
		}
		board[posY][posX]=2;
		
	}
		
		
		
	}
}

		
//		// 2차원 배열
//		// 2차원 배열은 1차원 배열에 1차원 배열을 할당하는 것
//		
//		int [][] arr = new int[3][4];
//		// 3의 크기인 1차원 배열에 4의 크기인 1차원 배열을 만드는 것
//
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 20;
//		arr[0][3] = 50;
//		
//		for (int a = 0; a < arr.length; a++) { // 2차원 배열의 첫번째 크기만큼 반복
//			for(int b=0; b< arr[a].length; b++) { // 2차원 배열의 두번째 크기만큼 반복
//				System.out.println( arr[a][b]);
//			}
//		}
		
		
//		// 90~100점 A, 80~89점 B, 70~79 C, 나머지 F
		
//		int score = 88;
//		
//		switch(score /10) {
//		
//		case 10:
//		case 9:
//			System.out.println("A등급");
//			break;
//		case 8:
//			System.out.println("B등급");
//			break;
//		}
		
		
		
//		int num = 2;
//		
//		switch (num) { // switch문은 범위는 불가. 비교연산자X
//			
//		case 'a': // 문자와 문자열, 정수만 가능
//			System.out.println("2번 선택됨 실행!");
//			break;
//		case 4:
//			System.out.println("4번 선택됨!");
//			break;
//		case 20:
//			System.out.println("20번 선택....흠");
//			break;
//		case 54:
//			System.out.println("난 54번인데?? 흠..");
//			break;
//		}

