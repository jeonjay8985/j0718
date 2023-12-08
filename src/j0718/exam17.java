package j0718;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("학점을 입력하세요 : ");
		
		String grade=s1.next();
		switch(grade) {
		case "A" :
			System.out.println("매우 우수");
			break;
		case "B" :
			System.out.println("우수");
			break;
		case "C" : 
			System.out.println("좋음");
			break;
		case "D" :
			System.out.println("좀 더 열심히");
			break;
		case "F":
			System.out.println("비통");
			break;
		default: 
			System.out.println("잘못된 등급"); // 99/10=9 91/10=9 100/10=10
				
		}
	}

}
