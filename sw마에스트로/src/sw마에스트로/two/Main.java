package sw������Ʈ��.two;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for(int i=0;i<T;i++)	// �׽�Ʈ ���̽�
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
					if(arr[k][j]==0)	// 1�� ������ �������� 
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
			
			// ������ �־��� �Է� 
			for(int k=0;k<M;k++)
			{
				for(int j=0;j<N;j++)
				{
					
					if(arr[j][k]==0)	// 1�� ������ �������� 
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
			
			
			// ���� �������� �����ؼ� 1�� �Ǵ� ���� ���ϴµ� �ϳ��� 1�ǿ����� 1���̸� NO (N)���� 
			
			System.out.println(answer);
			
		}

	}

}
