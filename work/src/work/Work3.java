package work;

public class Work3 {

	public static void main(String[] args) {
		// scores[i] 가 현재 검사하는 학생의 점수입니다.
		// 점수가 60점 이상이면 count를 1 증가시키세요
		
		int[] scores = {90, 45, 78, 59, 100};
		int passCount = 0;
		
		for (int i=0; i<scores.length; i++) {
			if (scores[i] >= 60) {
				passCount ++;	
			}
		}System.out.println(passCount);
	}
}
