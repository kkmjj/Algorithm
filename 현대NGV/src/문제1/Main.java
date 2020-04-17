package 문제1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			 sc.nextLine();
			String ar = sc.nextLine();
		//입력 
		
		int max=0;
		
		for(int i=0;i<=N-K;i++)
		{
			String temp = ar.substring(i, i+K);
			
			int num = Integer.parseInt(temp);
			max = num < max ? max : num;
		}
		
		System.out.println(max);

	}

}
