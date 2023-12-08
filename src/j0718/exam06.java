package j0718;
import java.util.*;
public class exam06 {

	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
		
		float num1=(float)3.14; //3.14f로 써도 됨! 플롯형 에러 사라짐~
		System.out.print("반지름 입력 : "); 
		float num2=s1.nextFloat();
		
		
		float result=num1*num2*num2;
		
		System.out.printf("%f*%f*%f=%f\n", num1, num2, num2, result); 
		
		

	}

}
