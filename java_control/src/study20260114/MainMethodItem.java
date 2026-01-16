package study20260114;

public class MainMethodItem {

	public static void main(String[] args) {
		
		DBConnectItem connect = new DBConnectItem();
		
		Item[] items = connect.findItem();
		
		System.out.println(items[1]);
		
		

	}

}
