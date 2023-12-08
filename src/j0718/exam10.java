package j0718;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1=s1.nextInt();
		System.out.print("두번째 정수 : ");
		int num2=s1.nextInt();
		int max;
		if(num1>num2) {
			max=num1;
			System.out.println("큰 수는 "+max);
		}else if(num1<num2) {
			max=num2;
			System.out.println("큰 수는 "+max);
		}else {
			System.out.println("두 수는 같다");
		}
		

	}

}
