package study20260113;

import java.util.Arrays;

public class Method3 {
	
	public static void main(String[] args) {
		

//		User[] users = new User[5];
//		
//		// User클래스 객체 생성
//		users[0] = new User("lee","asd123","이순신","010358891849");
//		
////		users[0].setName("이순신"); // set은 저장
//		
//		System.out.println(users[0].getName()); // get은 출력
				
		User[] users = {
				new User("lee","asd123","이순신","01035891849"),
				new User("kim","asd456","김유신","01012345678"),
				new User("sky","123456","한석봉","01022223333"),
				new User("gold","123asd","김개똥","01045678912"),
				new User("hong","456asd","홍길동","01011112222")
		};
		
		UserService us = new UserService();
//		us.findId(users);
//		us.findPassword(users);
//		
//		System.out.println(Arrays.toString(users));
		us.logIn(users);
		
	}

}
