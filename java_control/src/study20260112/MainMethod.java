package study20260112;

public class MainMethod {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name = "이순신";
		student.age = "34";
//		student.tall = 175; // tall은 private이기 때문에 클래스 외부에서 사용불가
		
		System.out.println(student);
		
		Student student2 = new Student("김유신","45",172);
		System.out.println(student2);
		
		
		BingoGame bingo = new BingoGame("이동렬",99,3,2,1);
		System.out.println(bingo);
		
		bingo.setName("김춘추");
		System.out.println(bingo);
		
	}
}
