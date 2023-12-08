package j0718;

public class exam22 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=100; i++) {
		System.out.println(i);
		sum += i; // sum=sum+i
		System.out.println(sum);
		if(sum>=2500) {
			System.out.println("i값은 "+i+"이고 합계는 "+sum+"입니다");
			break;
			
			
		}
		}
		
		
		
	}

}
