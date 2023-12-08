package j0718;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String str1;
		System.out.print("문자를 입력하세요 : ");
		str1=s1.nextLine();
		if(str1.equals("korea")) { //문자는 *equals 씀
			System.out.println("입력된 문자는 "+str1+"입니다");
		}else {
			System.out.println("입력된 문자는 "+str1+"가 아닙니다");
			
		}
		
		
		
	}

}
