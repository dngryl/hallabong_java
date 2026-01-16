package work;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		// 1. 입력받은 번호로 해당 학생의 점수를 가져오세요. (인덱스 주의!)
		// 2. if-else 문을 써서 60점 이상인지 확인하세요.
		
		int[] scores = {90, 45, 78, 59, 100};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("조회할 학생 번호를 입력하세요(1~5): ");
		int studentNum = sc.nextInt();
		
		int selectStudent = scores[studentNum-1]; // 공식이라 외우기 
		
		if (selectStudent >= 60) {
			System.out.println("60점 이상입니다.");
		}else System.out.println("60점 미만입니다.");
		
	}

}
