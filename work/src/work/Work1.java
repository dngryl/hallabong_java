package work;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		
	// 영화관 좌석 예약

	// int [] seats = new int[50]; 
				
	// 0: 빈좌석, 1: 예약된 좌석
	// 사용자(예약자)로부터 예약 인원수를 입력받아 원하는 위치에 예약되게 하기
	// 단, 원하는 위치에 연속적으로 예약인원 수 만큼 빈자리가 없으면 좌석 없음 출력
		
		Scanner scan = new Scanner(System.in);
		
		int [] seats = {0,0,1,1,0,0,0,0,1,0,
						0,0,0,0,1,0,0,0,0,0,
						0,0,0,0,0,0,0,0,1,0,
						0,0,1,0,0,1,0,0,0,0,
						0,0,0,1,1,0,0,0,1,0,};
		
		// 예약 인원 입력받기
		
		int personCount = scan.nextInt();
		System.out.println("예약 인원 수를 입력하세요.: ");
		
		// 좌석 위치 입력받기
		
		System.out.println("좌석을 입력하세요.: ");
		int position = scan.nextInt();
		
		for (int i=0; i<seats.length; i++ ) {
			if ((i+1) == position) {
				boolean check = false;				
			}
			
		}
		
		
	}
	
}
