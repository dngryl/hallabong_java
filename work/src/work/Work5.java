package work;

public class Work5 {
	public static void main(String[] args) {
	
		// max라는 변수를 하나 만들고, 아주 작은 수(예: 0) 혹은 배열의 첫 번째 값으로 초기화하세요.
		// for문을 돌면서 배열의 점수(scores[i])가 현재 max보다 크다면, max 값을 그 점수로 바꿔치기하세요.
		// 반복문이 다 끝나면 max에는 가장 큰 수만 남게 됩니다.
		
		int[] scores = {55, 88, 92, 70, 44};
		int max = scores[0];
		
		for (int i=0; i<scores.length; i++) {
			if (scores[i]>max) {
				max = scores[i];
			}
		}System.out.println(max);
		
		
	}
}
