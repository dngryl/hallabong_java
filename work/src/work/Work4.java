package work;

public class Work4 {
	public static void main(String[] args) {
		// for문을 사용하여 배열에 있는 모든 점수를 하나씩 꺼내 더하세요. (누적 계산)
		// 전부 더한 값을 학생 수(배열의 길이)로 나누어 평균을 구하세요.
		// 출력 예시와 똑같이 나오도록 출력하세요.
		// 총점: 372점 평균: 74점
		
		int[] scores = {90, 45, 78, 59, 100};
		int total = 0;
		int avg = 0;
		
		for (int i=0; i<scores.length; i++) {
			total = scores[i]+total;
			avg = total/scores.length; 
		}System.out.println("총점: "+total+"점"+" 평균: "+avg+"점");
		
	}
}
