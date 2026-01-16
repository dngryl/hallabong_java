package work;

public class Work11 {

	public static void main(String[] args) {
		// 채팅 목록에 "욕설"이 포함되어 있는지 검사합니다.
		/*
		 향상된 for문 (for-each) 을 사용하여 배열의 단어를 하나씩 꺼내세요.

		 단어가 "바보" 이거나 "멍청이" 라면 -> "금지어가 감지되었습니다: [단어]" 를 출력하세요.

	 	 그 외의 단어는 "메시지: [단어]" 라고 정상 출력하세요.
		 */

		String[] chats = {"안녕하세요", "반갑습니다", "바보", "오늘 날씨 좋네요", "멍청이"};
		String bannTx1 = "바보";
		String bannTx2 = "멍청이";
		
		for (String filter : chats) {
				if (filter.equals(bannTx1)||(filter.equals(bannTx2))) {
					System.out.println("금지어가 감지되었습니다.");
				}else System.out.println("메세지: "+filter);
		}
		
	}

}
