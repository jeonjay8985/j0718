package j0718;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=s1.nextInt();
		switch(num) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("잘못된 숫자");
				
			
		}

	}

}
