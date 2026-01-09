package study20260108;

import study20260109.Member;

public class JavaClasses2 {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		Movie movie = new Movie();
		// 메서드 뒤엔 항상 괄호가 붙음
		// new Movie() 'new' 연산자에 의해 'Movie'라는 타입의 공간을 만듦 / 생성자 메서드
		
		System.out.println(movie.title);
		
		movie.title = "악마를 보았다";
		movie.dir = "김지운";
		movie.year = 2010;
		movie.limitAge = 19;
		System.out.println(movie.title);
		
		Movie movie2 = new Movie("굿포춘",2020);
		
		System.out.println(movie2.title +" "+ movie2.year);
		
		// Music 클래스의 객체 생성하여 음악제목, 가수, 재생시간(총 몇 분) 저장되게 하기.
		// 매개변수 있는 생성자 메서드로 데이터 저장하고 츨력하기.
	
		
		Music music = new Music("White", "핑클", 2);
		System.out.println(music.title+" "+music.artist+" "+music.duration);
		
	}
	
}


