package j0718;

public class exam01 {

	public static void main(String[] args) {
		int n1=10;
		int n2=25;
		
		System.out.println("n1++ :"+(n1++));
		System.out.println(n1);
		
		
		n1=10;
		System.out.println("++n1" +(++n1)); //먼저 +1계산하고<전이 연산자> +1+10
		System.out.println(n1);
		
	
		n1=10;
		System.out.println("n1-- :"+(n1--)); //10찍어주고( 다음 문장으로;빠져 나가면서 -1됨. 해당코딩값 "10" "9"<후이 연산자>
		System.out.println(n1);
		
		n1=10;
		System.out.println("--n1 :"+(--n1)); 
		System.out.println(n1);
		
		
		
		/*
		System.out.println(n1>10 || n2<30);
		System.out.println(!(n1>10 || n2<30));
		System.out.println(n1 += 10); //n1=n1+10 20 (1)
		System.out.println(n1 -= 10); //n1=n1=10 20(1)-10
		System.out.println(n1 *= 10); //n1=n1*10 10(2)*10
		System.out.println(n1 /= 10); //n1=n1/10 100(3)/10
		System.out.println(n1 %= 10); //n1=n1%10, 나머지 10(4)/10
		
		/*
		//System.out.println("n1==n2" +(n1==n2));
		//System.out.println("n1 != n2" +(n1 != n2));
		//System.out.println("n1>n2"+(n1>n2));
		//System.out.println("n1<n2"+(n1<n2));
		//System.out.println("n1>=n2"+(n1>=n2));
		//System.out.println("n1<=n2"+(n1<=n2));
		*/
		

	}

}
