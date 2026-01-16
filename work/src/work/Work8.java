package work;

public class Work8 {

	public static void main(String[] args) {
		// 먼저 학생들의 평균 점수를 구하세요.
		// 그 다음, 평균보다 높은 점수를 받은 학생이 총 몇 명인지 세어서 출력하세요.
		
		int[] scores = {55, 88, 92, 70, 44};
		int tot = 0;
		int avg = 0;
		int avgUp = 0;
		
		for (int i = 0; i < scores.length; i++) {
			tot = scores[i]+tot;	
		}
		avg = tot/scores.length;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>avg) {
				avgUp++;
			}
		}
		
		System.out.println(avg+" "+avgUp);
	}

}
