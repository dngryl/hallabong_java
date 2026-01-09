package study20260108;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		
		// 이 정도 까지는 해야된다 - 배열 실습
		// 문제 1. 10개의 무작위 정수 값 저장하기 (배열에) 랜덤 범위는 1~50

		int [] num = new int [10];
		
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*50)+1;
		}
		
		for(int n : num)
			System.out.println(n);
			System.out.println(Arrays.toString(num));
		
		// 문제 2. 
		// int[] score = { 99,66,77,56,78,98,83};
		// 1학년 3반 학생들의 점수를 배열에 저장하였다.
		// 3반 학생들의 성적의 평균값을 구하세요.
		// 반복문을 이용하세요.
		
		int[] score = {99,66,77,56,78,98,83};
		int total = 0; 
		
		for (int i = 0; i<score.length; i++) {
			total = total + score[i];
		}
		int avg = total /score.length;
		System.out.println("평균: "+avg);
		
		
		// 문제 3. 정수 10개를 저장할 수 있는 배열을 선언
		// 1~50의 무작위값 저장하기
		// 배열의 첫번째 값과 마지막 값 출력
		
		int [] arr = new int [10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			if (arr[i] % 2 ==0) {
				System.out.println(arr[i]);
			}
		}
//		System.out.println(num[0]+", "+num[9]);
//		System.out.println(num[0]+", "+num[num.length-1]);
	
		//문제 4. 문제 3번에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력하세요.
		
		for ( int n : arr) {
			if (n%2==0)
				System.out.println(n);
		}
		
		// 문제 5. 마지막
		// int[] temp = {6, 0, 5, -2, 0, 4, 8, 0}
		// temp 배열은 일별 최고 기온을 저장한 것이다.
		// 배열에 저장된 기온 중 가장 높은 기온과 가장 낮은 기온을 찾으세요.
		// 0번 인덱스의 기온은 12월 11일 데이터이다.
		// 가장 높은 기온의 날짜와 가장 낮은 기온의 날짜도 출력하세요.
		// (가장 높은, 가장 낮은 기온만 찾아서 출력하는 것만 해도 성공)
		
		int[] temp = {6, 0, 5, -2, 0, 4, 8, 0};
		int max = temp[0];
		int min = temp[0];
		
		for (int i=0; i<temp.length; i++) {
			if (max < temp[i]) max = temp[i]; // 최댓값 구하기
			
			if (min > temp[i]) min = temp[i]; // 최솟값 구하기
		}
		
		System.out.println("가장 높은 기온: "+max+" 가장 낮은 기온: "+min);
		
		// 0번 인덱스의 기온은 12월 11일이다.
		// 가장 높은 기온이 몇 번째 인덱스에 있는 지 찾아야 한다.
		
		for (int i=0; i<temp.length; i++) {
			if (temp[i] == max) {
				System.out.println("가장 높은 기온: "+max+" 날짜: 12월"+(i+11)+"일");
			}
			if (temp[i] == min) {
				System.out.println("가장 낮은 기온: "+min+" 날짜: 12월"+(i+11)+"일");
			}
		
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
	
	}
	
}
}