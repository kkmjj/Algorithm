import java.util.Scanner;

public class Main2 {
	
	
	public static int answer[]= new int[2];
	
	
	public static void GCD(int a,int b,int depth,int K) {
		
		
		if(depth> K)
		{
			answer[0]=a;
			answer[1]=b;
			return;
		}
		
		//System.out.println((a+b)+" "+a);
		GCD(a+b,a,depth+1,K);
		
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T=input.nextInt();
		
		for(int i=0;i<T;i++) 
		{
			
		
		int K=input.nextInt();
		
		GCD(1,0,0,K);
		
		System.out.print("#"+T+" ");
		for(int j=0;j<2;j++)
		{
			System.out.print(answer[j]+" ");
		}
		
		}

	}

}
