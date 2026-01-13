package study20260112;

public class Student {

	static String schoolName; //static은 클래스 변수
	// 접근 제어자(default) 같은 패키지 안에서만 사용 가능
	
	public String name; // 인스턴스 변수
	//접근 제어자(public) 패키지 이름이 다를 경우 임포트 필요
	public String age; // 인스턴스 변수
	private int tall; // 인스턴스 변수
	// 접근 제어자(private) 내부에서만 사용가능
	private int grade=100; // 인스턴스 변수
	// 명시적 초기화
	
	// 변수 초기화 순서
	// 명시적 초기화 -> 초기화 블럭 -> 생성자메서드
	
	
	{
		name="이성계";
	}
	// 블럭을 사용한 초기화 -> 인스턴스 초기화 블럭
	
	public Student () {}
	public Student (String name, String age, int tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	public Student(String name, int tall) { // 오버로딩이기 때문에 매개 변수 타입이 달라야 함.
		this.name = name;
		this.tall = tall;
	}
	
	public String toString() {
	// 클래스 객체에 저장되어 있는 값을 출력할 때 자바에서는 일반적으로 toString 메서드를 사용한다.
		return name+" : "+age+" : "+tall+" : "+grade;
	}
	
}
