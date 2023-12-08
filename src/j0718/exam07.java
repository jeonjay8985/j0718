package j0718;
import java.util.*;
public class exam07 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
			
			System.out.print("직사각형 가로 입력 : "); 
			float num1=s1.nextFloat();
			System.out.print("직사각형 세로 입력 : "); 
			float num2=s1.nextFloat();
			
			float result1=2*(num1+num2);
		    System.out.printf("직사각형 둘레는 =  2*%f+2*%f=%f\n", num1, num2, result1); 
		    
		    float result2=num1*num2;
		    System.out.printf("직사각형 넓이는 =  %f*%f=%f\n", num1, num2, result2); 

	}

}
