package study_test;

import java.util.*;


public class 주사위던지기2 {
	static int N;
	static int M;
	static int array[]= new int[1000];
	static int sum=0;
	
	public static void dfs(int depth) {
		
		if(depth > N)
		{
			for(int i=1;i<depth;i++)
			{
				sum+=array[i];
			}
			
			if(sum==M)
			{
				for(int i=1;i<depth;i++)
				{
					System.out.print(array[i]);
				}
				System.out.println("");
			}
			sum=0;
			return;
			
		}
		
		
		
		for(int i=1;i<=6;i++)
		{
			array[depth]=i;
			dfs(depth+1);
		}
		
		
	}

	public static void main(String[] args) {
	
	
		Scanner scan =new Scanner(System.in);
		
		N = scan.nextInt();
	    M = scan.nextInt();
		// N번 던져서 합이 M 이 나오게 
		
		dfs(1);
		

	}

}
