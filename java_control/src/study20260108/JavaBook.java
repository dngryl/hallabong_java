package study20260108;

public class JavaBook {

	public static void main(String[] args) {
		// 책 이름, 저자, 출판년도를 저장할 수 있는 클래스 정의
		// 객체 생성하여 데이터 넣고 출력하기

		Book a = new Book();
		Book b = new Book();
		Book c = new Book();
		Book d = a;
		
		a.bookName = "해리포터";
		a.author = "J.K.롤링";
		a.year = 1999;
		
		System.out.println(a.bookName+" "+a.author+" "+a.year);
		System.out.println(d.bookName);
		
	} 

}

class Book {
	String bookName;
	String author;
	int year;
}