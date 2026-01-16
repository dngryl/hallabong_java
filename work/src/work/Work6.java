package work;

public class Work6 {

	public static void main(String[] args) {
		// 목표: 배열에서 가장 작은 숫자를 찾아 출력하세요.
		// 출력 예시: 최저 점수: 44

		int[] scores = {55, 88, 92, 70, 44};
		int min = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] < min);
			min = scores[i];
		}System.out.println("최저 점수: " + min+ "점");
			
	}

}
