package j0718;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		final int targetSales=1000;
		int mySales,bonus;
		
		System.out.print("실적을 입력하세요 : ");
		mySales=s1.nextInt();
		if(mySales>targetSales) {
			System.out.println("실적 달성");
			bonus=(mySales-targetSales)/10; // =*0.1
			System.out.println("보너스 : "+bonus);
		}else {
			System.out.println("실적 달성 못함");
			bonus=0;
			System.out.println("보너스 : "+bonus);
			
					}
		
		

	}

}
