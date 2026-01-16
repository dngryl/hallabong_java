package work;

public class Work9 {
	public static void main(String[] args) {
		// 랜덤 무기 뽑기 (Random + Switch)
		// 1부터 4 사이의 랜덤한 정수를 하나 생성하세요. (Math.random() 사용)
		// switch 문을 사용하여 숫자에 따라 당첨 아이템을 출력하세요.
		// 1: "전설의 검 당첨!"
		// 2: "단단한 방패 당첨!"
		// 3: "체력 물약 당첨!"
		// 4: "꽝! 다음 기회에..."
		
		int num = (int)Math.floor(Math.random()*4)+1;
		
		switch (num) {
		case 1: 
			System.out.println(num+": 전설의 검 당첨!"); break;
		case 2:
			System.out.println(num+": 단단한 방패 당첨!"); break;
		case 3:
			System.out.println(num+": 체력 물약 당첨!"); break;
		case 4:
			System.out.println(num+": 꽝! 다음 기회에..."); break;
			
		}
		
		
	}
}
