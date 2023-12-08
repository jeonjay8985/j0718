package j0718;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		
		System.out.print("정수 세개를 입력하세요 : ");
		int x=s1.nextInt();
		int y=s1.nextInt();
		int z=s1.nextInt();
		
		int max; // =0하면 안되는 이유: z값이 안나옴 
		if(x>y) {
			if(x>z) {
				max=x;
			}else {
				max=z;
			}
		}else if(y>z) {
			max=y;
		}else {
			max=z;
		}
		System.out.println("가장 큰 수는 "+max+" 입니다."); //"+max+" ??
		
		
		
		/*
		System.out.print("정수 세개를 입력하세요 : ");
		
		int x=s1.nextInt();
		int y=s1.nextInt();
		int z=s1.nextInt();
		
		int max;
		if(x>y && x>z) {
		System.out.println ("가장 큰 수는 "+x+" 입니다");
		}else if(y>x && y>z) { 
		System.out.println ("가장 큰 수는 "+y+"입니다");
        }else {
			System.out.println("가장 큰 수는 "+z+"입니다");
        }
		*/
		
	}
	
}


