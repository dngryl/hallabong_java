package study20260105;

public class MainMethod {

	public static void main(String[] args) {
		
//		Integer.parseInt ()  정수값으로 변경
//		Math.floor() 소수점 자르기
		int num = (int) Math.floor(Math.random()*10)+1; // 1을 더해서 범위를 1~10까지 나오도록
		
		System.out.println(num);
		
	}

}
