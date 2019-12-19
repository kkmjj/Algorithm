package 엔테크서비스4번;

import java.util.*;

public class Main {
	
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		int k=input.nextInt();
		
		int answer=1;
		if(k>n) {
			answer=0;
		}
		
		else if(k==1)
		{	answer=n;
		}
		else
		{
			
			answer=n*n;
		for(int i=1;i<k;i++)
		{
			
			answer=answer *(n-i)*(n-i);
			
			
		}
		 answer=answer/2;
		}

		
		System.out.print(answer);
		
	}

}
