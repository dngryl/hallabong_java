package study20260109;

public class MainMethod {
	
	// static이 붙은 메서드에는 인스턴스 변수나 인스턴스 메서드 사용 불가.
	// 생성되는 시점이 다르기 때문에 사용할 수 없다.
	// 반대로 인스턴스 메서드에서 static 변수나, static 메서드 사용가능.
	
	public static void main(String[] args) {
		
		
		Member member = new Member();
		member.name = "김유신";
//		member.age = 24;
		member.gender = "남";

		Member member2 = new Member("이순신", 34, "남");

		// 클래스 외부에서 클래스 변수에 데이터 저장하는 방법 (중괄호 밖의 영역)
		Member.dept = "컴퓨터공학과";
		System.out.println(member.dept);
		System.out.println(member2.dept);
		
		System.out.println(member.toString());
		System.out.println(member2);
		
		// 상수
		final int num=0; // 상수는 항상 앞에 'final'제어자 선언, 이후 변수 변경 불가
		
		// static (제어자)
//		static int aa = 30; // static 메서드 안에서는 일반적으로 불가
		
		
	}

}
