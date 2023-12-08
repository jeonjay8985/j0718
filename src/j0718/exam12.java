package j0718;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int score=s1.nextInt();
		if(score>100 || score<0) {  //또는 shift+원화표시
			System.out.println("잘못된 성적입니다.");
		}else if(score >=90) {
			System.out.println("A학점");
		}else if(score >=80) {
			System.out.println("B학점");
		}else if(score >=70) {
			System.out.println("C학점");
		}else if(score >=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
			
		}

	}

}
