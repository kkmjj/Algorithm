import java.util.*;


public class Main {

	
	// 최대 공약수 
	public static int gcd (int a ,int b)

	{
		if(a==0)return b;
		
		return gcd(b%a,a);
	}
	
	public static void main(String[] args) {
		int w,h;
		
		Scanner input =new Scanner(System.in);
		
		w= input.nextInt();
		h = input.nextInt();
		
		long answer=1;
		
		
		answer =((long)w*(long)h) -(((long)w+(long)h)-gcd(w,h));
		
		
		System.out.print(answer);
		
		
		

	}

}
