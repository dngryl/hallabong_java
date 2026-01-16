package work;

import java.util.Arrays;
import java.util.Scanner;

public class Work13 {
	public static void main(String[] args) {
		
		// 영화관 좌석 예매 시스템
		
		/*
		준비물: 좌석 10개를 관리하는 배열 int[] seats = new int[10]; (처음엔 다 0)

		기능 (무한 루프 & Switch):
		좌석 확인: 현재 좌석 상태를 보여줍니다. (0은 [ ], 1은 [O] 등으로 표시)
		예매하기: 좌석 번호(1~10)를 입력받아 예약을 진행합니다.
		조건: 이미 예약된 자리면 "이미 예약되었습니다" 출력.
		취소하기: 좌석 번호를 입력받아 예약을 취소(0으로 변경)합니다.
		종료: 프로그램 종료.
		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] seats = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println("=======================================");
		System.out.println("============영화 좌석 예매 시스템============");
		System.out.println("=======================================");
		System.out.println("1. 좌석확인 | 2. 예매하기 | 3. 취소하기 | 4. 종료");
		System.out.println("=======================================");
		System.out.print("원하는 서비스의 번호를 입력하세요: ");
		

		int key = sc.nextInt();
			
		if (key == 1) {
			System.out.println("좌석 확인");
			System.out.println(Arrays.toString(seats));
		}
		if (key == 2) {
			System.out.println("=============== 예매 하기 ================");
			System.out.println(Arrays.toString(seats));
			System.out.println("원하시는 좌석을 선택하세요.: ");
			key = sc.nextInt();
			
			for (int i = 0; i<seats.length; i++) {
				boolean check = false;
				if ((i+1)==key) {
					for (int k=i; k<(i+))
				}
			}
		}
		if (key==3) {
			System.out.println("취소 하기");	
		}
		if (key==4) {
			System.out.println("프로그램 종료");		
		}
	
	
		}
		
		
		
		
}
