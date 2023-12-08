package j0718;

import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("성별코드를 입력하세요 : ");
		int gender=s1.nextInt();
		switch(gender) {
		case 1:
			System.out.println("남성");
			break; //스위치문 실행 시 각각의 케이스문 안에 브레이크 문이 있어야 함(스위치 문이 빠져나오는 통로)
		case 2:
			System.out.println("여성");
			break;
		case 3:
			System.out.println("남성");
			break;
		case 4:
			System.out.println("여성");
			break;
		default:
			System.out.println("잘못된 성별코드입니다");
			break; //default는 마지막이므로 브레이크 있으나 없으나 상관없음
				
		}

	}

}
