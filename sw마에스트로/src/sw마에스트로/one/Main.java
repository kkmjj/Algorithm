package sw������Ʈ��.one;

import java.*;
import java.util.Scanner;

public class Main {
	
	static int temp[] = new int[10];
	static String ans ="";
	
	
	static void dfs(int N,int arr[] , int depth, int leng)
	{
		
		
		if(depth >=leng)
		{
			int sum=0;
			String answer="";
			for(int i=0;i<depth;i++)
			{
				
				//System.out.print(arr[temp[i]]+" ");
			
				sum+=arr[temp[i]];
				answer+=Integer.toString(temp[i]);
			}
			
			if(sum > N) sum=0;
			
			
			//System.out.println();
			if(sum!=0) {
				
				//System.out.println("��"+sum+" "+answer);
				ans=answer;
	
			}
			
			
			return;
			
		}
		
		
		
		
		for(int i=0;i<10;i++)
		{
			temp[depth]=i;
			dfs(N,arr,depth+1,leng);
		}
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N= input.nextInt();
		
		
		int arr[] = new int[10];
		
		arr[0]=10;
		arr[1]=2;
		arr[2]=10;
		arr[3]=10;
		arr[4]=4;
		arr[5]=5;
		arr[6]=10;
		arr[7]=3;
		arr[8]=7;
		arr[9]=6;	// �ش� ���ڸ� ���鶧 ������ �־�ΰ�  ������ ������ ������ ������� ����
		
		for(int i=0;i<10;i++)
		{
			if(arr[i]>N)arr[i]=10;
		}
		
		
		
		int leng = N/2;	//answer�� �ڸ���  ���� ȸ���� ���� 2�� ��������.
	
		
		int max=0;
		
		if(leng==1)
		{
			int index=0;
			for(int i=0;i<10;i++)
			{
				
				if(arr[i]==10)continue;
				//System.out.println(arr[i]);
				if(max < arr[i])
				{
					//System.out.println(arr[i]+" "+i);
					max= arr[i];
					index=i;
					//System.out.println(index);
				}
			}
			
			System.out.println(index);
		}
		else
		{
			
			dfs(N,arr,0,leng);
			
			System.out.println(ans);
			
			
			
			
		}
	
		
		

	}

}
