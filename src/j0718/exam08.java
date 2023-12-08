

package j0718;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int num=s1.nextInt();
		
		if(num >100) { //한 문장만 있으면 { 없어도 됨. 두 문장 이상이 올 땐 { }로 묶어줘야함. 헷갈리지 않게 묶는습관 들이는게 좋음
			System.out.println("100보다 크다.");
		}else if(num==100) {
			System.out.println("100과 같다.");
		}else {
			System.out.println("100보다 작다."); 

			
		}

	}

}
