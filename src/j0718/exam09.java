package j0718;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num= s1.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num+"은/는 짝수입니다.");
		}else {
			System.out.println(num+"은/는 홀수입니다.");
			
			
		}
		

	}

}
