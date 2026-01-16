package work;

public class Work7 {
	public static void main(String[] args) {
		// 목표: 점수가 100점인 학생이 배열의 **몇 번째 방(인덱스)**에 있는지 찾아내세요.
		int[] scores = {55, 100, 92, 70, 44};
		
		for (int i = 0; i<scores.length; i++) {
			if (scores[i] == 100) {
				System.out.println(i+1);
			}
		}
		
	}
}
