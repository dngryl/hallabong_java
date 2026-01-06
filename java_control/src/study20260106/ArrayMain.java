package study20260106;

public class ArrayMain {

	public static void main(String[] args) {
				
//		char[] temp = new char[5];
//		
//		temp[0] = 'g'; temp[1] = 'o'; temp[2] = 'o'; temp[3] = 'd';
//		System.out.println(temp);
//		
//		String a = "good";
//		String aa = new String ("member");
//		
//		System.out.println(aa+""+a);
//		
//		String word = "i like banana";
//		
//		System.out.println(word);
//		System.out.println(word.charAt(4)); // charAt() 배열에 인덱스 추가 하는 식
//		System.out.println(word.indexOf('b')); // indexOf() 문자를 넣어야 인덱스가 나옴
//		System.out.println(word.substring(2)); // substring() 문자열을 자름
//	
//		
		String name = "이순신-김유신-김춘추-이성계-박문수-박팽년";
		
		System.out.println(name);
		
		String[] names = name.split("-");
		// String[] names = {"이순신,"김유신","김춘추","이성계","박문수","박팽년"}
		
		System.out.println(names[0]);
		
		// 반복문으로 이름을 전부 출력하세요. (한 줄에 하나씩)
		
		for (String wow : names) { // 성이 김씨인 사람만 
			if( wow.charAt(0) == '김' )
			System.out.println(wow);
		}
		for (String wow : names) { // 이름에 신이 들어가는 사람만
			if( wow.indexOf('신') != -1) // -1은 해당 배열에 존재X
				System.out.println(wow);
		}
		
		// 문제1. fruits 배열에서 과일이름이 3자 이상인 것만 출력하세요. (length())
		
		String[] fruits = {"사과","딸기","배","수박","바나나","복숭아","파인애플","아보카도","오렌지","감","한라봉","망고"};
		
		for (String fruit : fruits) {
			if (fruit.length() >= 3)
			System.out.println(fruit);
		}
		
		
		// 문제2. fruits 배열에서 딸기와 수박은 제외하고 출력하세요.
		
		for (String fruit : fruits) {
			if (! fruit.equals("딸기") && fruit.equals("수박"))
				System.out.println(fruit);
		}
		
		System.out.println("\n\n\n");
		
		// 과일을 한줄에 4개씩 3줄로 출력할 것이다.
		
		for (int i=0; i < fruits.length; i++ ) {
			if(i % 4 ==0)
				System.out.println();
			
			System.out.print(fruits[i]+ " ");
		}
		
		
			
		
//		int[] arr = new int[5];
//		// 타입에 배열을 쓸 때, 대괄호[] 작성
//		// arr은 참조 변수이다. 참조 변수는 메모리 주소를 저장할 수 있는 변수이다.
//		// 배열의 인덱스는 0부터 시작.
//		
//		System.out.println(arr);
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 55;
//		arr[3] = 11;
//		arr[4] = 99;
//		
//		// 규칙이 있을 경우 반복문 사용가능, 그러므로 배열은 반복문(for문)을 사용하는게 적합
//		
//		System.out.println(arr[2]);
//		
//		for(int i=0; i < arr.length; i++) { // 일반적으로 배열은 arr.length로 작성
//			System.out.println(arr[i]);
//		}
//		
////		for(int i=0; i <= 4; i++) {
////			System.out.println(arr[i]);
////		}
//		
//		for (int num : arr) { // 위의 코드와 동일한 결과, 향상된 for문, 그러나 배열에 데이터 저장은 불가
//			if(num > 50)
//			System.out.println(num);
//		}
//		
//				
//		
//		int[] arr2 = {10,20,30};
		
		
		
	}

}

/*
 배열: 동일한 데이터 타입의 데이터 저장공간이 연속적으로 나열 되어있는 구조
 
 
*/