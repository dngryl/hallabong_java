package study20260109;

public class Member {
	
	// 클래스 변수
	static String dept; // 학과명
	
	// 인스턴스 변수
	String name;
	private int age;
	String gender;
	int birthDate;
	
	public Member(){} // 초기화하기 위해 필요한 생성자 메서드
	Member(String name, int age, String gender) { // 매개 변수가 있는 생성자 메서드
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() { //출력용 메서드 / 중괄호 안의 내용만 바꾸면 오버라이딩
		return "이름: "+name+" 나이: "+age+" 성별: "+gender+" 생년월일: "+birthDate;
	}
	
	
}

/*
 
 자바의 변수 종류
 
 1. 인스턴스 변수: 클래스의 멤버변수, 객체 생성 시 존재하는 변수
 				객체 소멸 시 같이 소멸되는 변수
 
 2. 지역 변수: 블럭 {} 영역에서 선언되는 변수			
 		  	 for() 소괄호 안에 선언되는 변수
 		     void sum(int a, int b) 메서드의 매개 변수
 
 3. 클래스 변수: 클래스의 멤버 변수	, new 연산자 없이 사용하는 변수
 			  앞에 static이 붙음
 		      프로그램 실행 시 클래스 정의를 메모리(ram)에 로드(적재)하면서 생성
 		      클래스 변수는 프로그램 종료 시 소멸됨
 		      클래스 변수는 객체들이 공유하는 변수이다.
 
 제어자
 
 static: '공통의' 라는 뜻으로 사용되는 제어자. static 변수와 static 메서드가 있다.
 		 static 메서드에는 static 변수만 사용가능. 인스턴스 변수는 사용불가
 		 모든 객체가 공유해야 하는 데이터가 필요한 경우이거나, 클래스의 대표 데이터로 사용해야 하는 경우,	
 		 다중 접속에 의해 너무 많은 생성을 방지하기 위해 사용하는 경우. 
 
 final: '변경할 수 없는' 이라는 뜻으로 사용되는 제어자. 특정 데이터가 실수에 의해 변경되지 않게 하고자 할 때 사용.
 		개발과정에서 다른 팀원이 데이터를 변경시키지 못하게 하기 위한 용도.
 		
 접근 제어자
 	권한 설정, 변수, 메서드, 클래스, 인터페이스 등에 사용된다.
 
 public: '공공의' 라는 뜻으로 사용되는 접근 제어자
 default: 기본적인 붙는 접근 제어자. 'default' 제어자가 붙으면 같은 패키지에서만 사용 가능
 protected: default와 마찬가지로 같은 패키지 내에서만 사용 가능. 단, 상속 관계일 경우 사용 가능
 private: 클래스 내부에서만 사용 가능 (중괄호 내에서만 사용 가능)
 
 		
 		
 abstract: '추상적'		
 
  객체지향 
  - 정보은닉
  - 캡슐화		  
 		  
*/