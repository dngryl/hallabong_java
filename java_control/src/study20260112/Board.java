package study20260112;

public class Board {

	private String title;
	private String writer;
	private int hit;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", writer=" + writer + ", hit=" + hit + "]";
	}
	public Board(String title, String writer, int hit) {
		this.title = title;
		this.writer = writer;
		this.hit = hit;
	}

	
	// 조회수 증가 메서드 만들기
	// 사용자들이 해당 게시글을 보면 조회수 증가
	// 작성자가 게시글을 보면 조회수 증가 안됨
	
	public void hitUp( String user) {
	// writer: 해당글의 작성자 user: 글 열람한 사람
		
//		if (user.equals(writer)) {
//			return;
//		}else {
//			hit++;
//		}
		if (! user.equals(writer))
			hit++;
	}
	
	// 게시글의 제목 수정 // 매개변수 필요없음
	// 게시글의 작성자가 아니면 수정 할 수 없다. // 매개변수 필요함
	
	public void updateTitle(String who, String title) {
		if (who.equals(writer))
			this.title = title;
	}
	
	// 
	
	
	
	
}