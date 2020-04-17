package 자바이론테스트;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test {
	
	static int[] n= {1,2,3,4,5,6,7,8,9,10};
	
	static int[] temp = new int[n.length];
	static int visit[] = new int[n.length];
	
	
	static void dfs(int depth,int start) {
		
		if(depth==5)	// 5개 뽑는다.
		{
			for(int i=0;i<5;i++)
			{
				System.out.print(temp[i]);
			}
			System.out.println();
		}
		
		
		for(int i=start;i<n.length;i++)
		{
			if(visit[i]==1)continue;
			
			visit[i]=1;
			temp[depth]=n[i];
			dfs(depth+1,i);
			visit[i]=0;
			
		}
	}

	public static void main(String[] args) {

		
		dfs(0,0);
	
		
		
		
		
		

	}

}
