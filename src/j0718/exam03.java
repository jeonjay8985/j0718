package j0718;
import java.util.*;
public class exam03 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("정수1 입력 : "); 
		int num1=s1.nextInt();
		System.out.print("정수2 입력 : "); 
		int num2=s1.nextInt();
		
		int result=num1+num2;
		System.out.printf("%d+%d=%d\n", num1,num2,result);
		
		result=num1-num2;
		System.out.printf("%d-%d=%d\n", num1,num2,result);
		
		result=num1*num2;
		System.out.printf("%d*%d=%d\n", num1,num2,result);
		
		result=num1/num2;
		System.out.printf("%d/%d=%d\n", num1,num2,result);
		
		result=num1%num2;
		System.out.printf("%d%%%d=%d\n", num1,num2,result); //나머지 퍼센트 2개!! %%
		
			
		System.out.println("num1 : "+num1);
		
		
		

	}

}
