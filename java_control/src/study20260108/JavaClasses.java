package study20260108;

public class JavaClasses {

	public static void main(String[] args) {
	
		User u = new User();
		User u2 = new User();
		User u3 = u;
		
		u.age = 30;
		u.name = "이순신";
		u.job = "군인";
		System.out.println(u.age);
		System.out.println(u.name);
		System.out.println(u.job);
		System.out.println(u3.age);
		
	}
	
}

class User{ //User라는 이름의 클래스 정의
	
	int age;
	String name;
	String job;
	
}

