package study20260114;

import java.sql.*;

public class DBConnectItem {

	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public DBConnectItem () {
		connect();
	}
	
	private void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "dngryl";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/dngryl";
			conn = DriverManager.getConnection(url, username, password);
			
		}catch (Exception e) {
			System.out.println("접속 실패");
		}
		
	}
	
	public Item [] findItem() {
		Item [] items = new Item[4];
		
		String sql = "select * from item";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i=0;
			while(rs.next()) {
				Item data = new Item (
						rs.getString("name"),
						rs.getInt("price"),
						rs.getString("main_image"),
						rs.getInt("stock")	
						);
				
					items[i] = data;
					i++;
						
				}
		
			}catch (Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");
		}	
		
		return items;
		
	}
}	
