
public class Main2 {

	
	static int n=  3;
	static int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
	static int[] visit = new int[201];
	
	static boolean v= false;
	
	
	
	public static void dfs(int index,int[][] computers,int[] visit)
	{
		
		
		for(int i=0;i<computers[index].length;i++)
		{
			if(visit[i]==1) continue;
			
			if(computers[index][i]==1) {
				visit[i]=1;
				dfs(i,computers,visit);
			}
		}
		
	}
	
	 public static  int solution(int n, int[][] computers) {
	        int answer = 0;
	        
	        
	        for(int i=0;i<computers.length;i++)
	        {
	        	for(int j=0;j<computers[i].length;j++)
	        	{
	        		
	        		if(computers[i][j]==1 && visit[j]!=1) {
	        			
	        			dfs(j,computers,visit);
	        			answer++;
	        		}
	        		
	        	}
	        }
	        
	        
	       
	        
	        return answer;
	    }
	 
	public static void main(String[] args) {
		
	System.out.println(solution(n, computers));

	}

}
