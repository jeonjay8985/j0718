package j0718;

public class exam13 {

	public static void main(String[] args) {
		int num=70;
		if(num<100) {
			System.out.println("숫자가 100보다 작습니다");
			if(num>50) {
				System.out.println("숫자가 50보다 큽니다");
			}
		}
		
		if(num<100 && num>50) {
			System.out.println("숫자가 100보다 작고 50보다 큽니다"); //중첩if문
		}
	}

}
