package j0718;

import java.util.Scanner;

public class exam18 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int score=s1.nextInt();
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
					
				//-10=F, 109=A뜸. 0점보다 작은 점수&100점보다 큰 점수 걸러내줘야함.  
				
		}

	}

}
