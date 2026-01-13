package study20260112;

public class Method2 {

	public static void main(String[] args) {
		
		Vending orange = new Vending("쌕쌕 오렌지", 1500, 2);
		Vending top = new Vending("Top 블랙", 2700, 3);
		
		
		System.out.println(orange);
		System.out.println(top);
		
		top.buy(2700);
		System.out.println(top);
		
		top.stockCheck();
		
		top.buy(2700);
		System.out.println(top);
		
		top.buy(2700);
		System.out.println(top);
		
		top.stockCheck();
		
		top.add(5);
	
		top.stockCheck();
		
		top.buy(2700);
		System.out.println(top);
	}

}
