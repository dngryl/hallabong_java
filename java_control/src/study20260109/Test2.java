package study20260109;

public class Test2 {

	public static void main(String[] args) {
		
		// 문제 1.
		
		int [] monthlySales = {1200, 950, 1430, 800, 1600, 1700, 900, 1100, 1550, 1800, 1300, 2000};
		int totalYear = 0;
		int avgMonth = 0;
		int maxMonth = monthlySales[0];
		int minMonth = monthlySales[0];
		int avgOverMonth = 0;
		
		for ( int i=0; i<monthlySales.length; i++) {
			totalYear = monthlySales[i]+totalYear;

			
			if (maxMonth < monthlySales[i]) {
				maxMonth = monthlySales[i];
			}
			if (minMonth > monthlySales[i]) {
				minMonth = monthlySales[i];	
			}
		}
		avgMonth = totalYear/monthlySales.length;
		for ( int n : monthlySales) {
			if (n >= avgMonth) {
				avgOverMonth ++;
			}
		}

		
		System.out.println(totalYear+" "+avgMonth+" "+maxMonth+" "+minMonth+" "+avgOverMonth);
	}
	

}
