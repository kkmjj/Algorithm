import java.util.ArrayList;

public class Main {
	
	
	static int n=5;
	static int[][] results= {{4,3},{4,2},{3,2},{1,2},{2,5}};
	static int[] temp = new int[102];
	static int[] visit = new int[102];

	static ArrayList<int[]> answers = new ArrayList<int[]>();
	
	public static void dfs(int depth,int n)
	{
		if(depth> n)
		{
		
			for(int i=1;i<depth;i++)
			{
					//System.out.print(temp[i]);
			}
			
			answers.add(temp);
			//System.out.println();
			
			return;
		}
		
		for(int i=1;i<=n;i++)
		{
			if(visit[i]==1)continue;
			
			temp[depth]=i;
			visit[i]=1;
			dfs(depth+1,n);
			visit[i]=0;
		}
	}
	
	
	
	public static int solution(int n, int[][] results) {
	        int answer = 0;
	        dfs(1,n);
	      
	        for(int i=0;i<answers.size();i++)
	        {
	        	for(int j=1;j<=n ;j++)
	        	{
	        		System.out.print(answers.get(i)[j]);
	        	}
	        	System.out.println();
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {
		
		System.out.println(solution(n, results));
	}

}
