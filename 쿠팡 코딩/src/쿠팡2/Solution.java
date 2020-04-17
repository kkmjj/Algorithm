package 쿠팡2;

public class Solution {

	static int N=4;
	static int M=7;
	static int T=2;
	static int K=4;
	
	static int temp[] = new int[10];
	static int visit[] = new int[10];
	static int count=0;
	
	static void dfs(int N,int M,int depth,int T,int K)		// 우선  N일동안 m개 돌리기 경우의수 
	{
		
		if(depth==N)
		{	int entire=0;
			for(int i=0;i<N;i++)
			{
				
				//System.out.print(temp[i]);
				entire+=temp[i];
			}
			
			if(entire!=M) return;
			
			for(int i=0;i<N;i++)
			{
				int sumit=0;
				for(int j=i;j<i+T;j++)
				{
					sumit+=temp[j];
				}
				
				if(sumit>K) return;
				
				
			}
			
			
			for(int i=0;i<N;i++)
			{
				
				System.out.print(temp[i]);
				
			}
			
			count++;
			System.out.println();
			return;
		}
		
		
		
		
		for(int i=0;i<=M;i++)
		{
			
			temp[depth]=i;
			dfs(N,M,depth+1,T,K);
		
			
		}
		
		
		
	}
	
	
	 public static int solution(int N,int M,int T, int K) 
	 {
		 int answer=-1;
		 
		 dfs(N,M,0,T,K);
		 
		 
		 
		 return answer;
		 
		 
		 
		 
	 }
	
	
	public static void main(String[] args) {
		solution(N,M,T,K);
		
		System.out.println(count);

	}

}
