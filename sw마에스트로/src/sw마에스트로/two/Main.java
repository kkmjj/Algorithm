package sw마에스트로.two;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for(int i=0;i<T;i++)	// 테스트 케이스
		{
			int N= input.nextInt();
			int M= input.nextInt();
			
			int[][] arr = new int[N][M];
			
			int cont_one=1; 
			String answer ="YES";
			
			for(int k=0;k<N;k++)
			{
				for(int j=0;j<M;j++)
				{
					//System.out.print(cont_one);
					arr[k][j]= input.nextInt();
					if(arr[k][j]==0)	// 1의 연속이 끝났을때 
					{
						if(cont_one==2) {
							answer="NO";
						}
						
						cont_one=1;
					}
					else
					{
						cont_one++;
					}
					
					
					
				}
				cont_one=1;
				//System.out.println();
			}
			
			// 문제에 주어진 입력 
			for(int k=0;k<M;k++)
			{
				for(int j=0;j<N;j++)
				{
					
					if(arr[j][k]==0)	// 1의 연속이 끝났을때 
					{
						if(cont_one==2) answer="NO";
						
						cont_one=1;
					}
					else
					{
						cont_one++;
					}
					
					
					
				}
				cont_one=1;
			}
			
			
			// 가로 기준으로 연속해서 1이 되는 값을 구하는데 하나라도 1의연속이 1개이면 NO (N)기준 
			
			System.out.println(answer);
			
		}

	}

}
