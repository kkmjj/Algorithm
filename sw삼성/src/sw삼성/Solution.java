package sw�Ｚ;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.io.FileInputStream;


class Solution
{
	
	static int[] visit= new int[100];
	static int[] temp = new int[100];
	static int sums=0;
	static int min=10000000;
	static void dfs(int depth, int a[])
	{
		sums=0;
		
		if(depth==a.length-1)
		{
		
			int v[] = new int[a.length];
			int before=0;
			
			for(int i=0;i<a.length-1;i++)
			{
				before=0;
			System.out.print(" "+temp[i]);
				
				for(int j=0;j<a.length;j++)
				{
					before+=a[j];
					if(v[j]==1 && v[temp[i]]==1)		// �湮�� �̹� �ߴµ� �ٸ� ���� ������ 
					{
						break;
					}
					
					
					if(v[j]==1 && v[temp[i]]!=1)		// ���� �湮�� ���ߴµ� �ٸ� ���� ������ 
					{
						before=0;
						
					}
					if(j==temp[i])		// ���� ���� ���ԵǸ� 
					{
						v[temp[i]]=1;
					}
					
					
					
				}
			//	System.out.print(" "+before);
					sums+=before;
			}
			//System.out.println(" "+min);
			min = min < sums ? min : sums;
			System.out.println(" "+sums);
			//System.out.println("min "+min);
			sums=min;
			return;
		}
		
		
		
		
		for(int i=0;i<a.length-1;i++)
		{
			
			if(visit[i]==1)continue;
			
			visit[i]=1;
			temp[depth]=i;
			dfs(depth+1,a);
			visit[i]=0;
			
		}
		

		
	}
	
	

	
	
public static void main(String args[]) throws Exception
{

Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt(); // �׽�Ʈ ���̽� ���� 
int ans[] = new int[T];


for(int test_case = 1; test_case <= T; test_case++)
{
	int answer=0;
	int n=sc.nextInt();
	int m=sc.nextInt(); // n*m
	
	
	
	
	
	int a[][] = new int[n][m];
    
    int r_arr[] = new int[m]; // ���ΰ� 
    int c_arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<m;j++)
       {
          a[i][j]=sc.nextInt();
          r_arr[j]+=a[i][j];
          c_arr[i]+=a[i][j];
       }
       
    }
	// �Է�
	
	
    
    min=10000000;
    
    dfs(0,r_arr);
    answer=sums;
     min=10000000;
   
	dfs(0,c_arr);
	
	 answer=answer+sums;
	
	
	System.out.println("#"+test_case+" "+answer);
		
}





}


}