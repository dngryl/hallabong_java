package study20260109;

public class Test {

	public static void main(String[] args) {
		// 문제 1
		
		String name = "홍길동";
		int age = 25;
		double height = 175.5;
		String gender = "남";
		boolean student = true;
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
		System.out.println("성별: "+gender);
		System.out.println("학생여부: "+student);

		
		// 문제 2
		
		System.out.println();
		int a = 10;
		int b = 20;
		int temp1 = (b=10);
		int temp2 = (a=20);
		
		System.out.println(a);
		System.err.println(b);
		
		
		// 문제 3
		
		System.out.println();
		int width = 8;
		int height_ = 5;
		
		int result = width * height_;
		
		System.out.println("넓이: "+result);
		
		// 문제 4
		
		System.out.println();
		int kor = 85;
		int eng = 90;
		int mat = 78;
		
		int tot = kor+eng+mat;
		int avg = tot/3;
		
		System.out.println("총점: "+tot+"점");
		System.out.println("평균: "+avg+"점");
		
		// 문제 5
		
		System.out.println();
		int num = 3726;
		
		int hour = num/3600;
		int minute = num/60-60;
		int sec = num%60;
		
		System.out.printf(hour +"시 "+ minute +" 분 "+ sec+"초");
		
		// 문제 6
		System.out.println();
		System.out.println();
		int score = 59;
		
		if (score >= 60 && score <=100) { 
			System.out.println("합격");
		} else 
			System.out.println("불합격");
	
	
		// 문제 7
		
		System.out.println();
		int score_ = 72;
		
		if (score_ >= 90 && score_ <= 100) {
			System.out.println("A");
		}else if (score_ >= 80 && score_ <90) {
			System.out.println("B");
		}else if (score_ >= 70 && score_ <80) {
			System.out.println("C");
		}else if (score_ >= 60 && score_ <70) {
			System.out.println("D");
		}else 
			System.out.println("F");
		
		// 문제 8
		System.out.println();
		int n = 10;
		
		for (int i = 0; i<10; i++) {
			n=n+i;
			System.out.println(n);
		}
		
		// 문제 9
		System.out.println();
		int[] arr = {10, 20, 30, 40, 50};
		int tot_ = 0;
		int avg_ = 0;
		
		for (int i=0; i<5; i++) {
			tot_ = arr[i]+tot_;
			avg_ = tot_/5;
		}
		System.out.println("총합: "+tot_+" 평균: "+avg_);
		
		// 문제 10
		System.out.println();
		int[] scores = {87, 65,92,100,74};
		int max = scores[0]; 
		int min = scores[0];
		
		for (int i = 0; i<scores.length; i++) { // 인덱스 비교 시 사용
			if ( max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}
	
		System.out.println("최댓값: "+max+" 최솟값:"+min);
		
		// 문제 11
		System.out.println();
		int[] nums = {3,8,15,22,7,10};
		
		for (int n1 : nums) { // 직접 숫자 비교 시 사용
			if (n1%2==1) {
				result = result - n1;
			}else
				result = result + n1;
		}System.out.println(result);

		
	}

}

