import java.util.ArrayList;

public class Main3 {

	 static String road ="0001111101011111111";
	 static int n=2;
	 static int check[] = new int[road.length()];
	 static int temp[] = new int[5];
	 static int ans=0;
	
	 
	 static void dfs(int start, int depth, String road, int n) 
	 {
		 if(depth==n)
		 {
			 int visit=0;
			 int con=0;
			 ArrayList<Integer> INDEX = new ArrayList<Integer>();
			 
			 for(int i=0;i<depth;i++)
			 {
				 System.out.print(temp[i]+" ");
				 INDEX.add(temp[i]);
				
			 }
				System.out.println();
				//System.out.println(road);
		
		for(int i=0;i<road.length();i++)
			{
				if(road.charAt(i)=='1' || INDEX.contains(i))
				{             
					visit++;
					
					if(i==road.length()-1)
					{
						con= con < visit ? visit : con;
						visit=0;
					}
					
				}
				else
				{
					
					
					con= con < visit ? visit : con;
					visit=0;
				}
			}
			
			
		
			ans= con < ans ? ans : con;	// 가장 큰 도로의 길이 구하기 
			System.out.println(con);
			 
			 return;
		 }
			
		 
		for(int i=start;i<road.length();i++)
		{
			
			if(road.charAt(i)=='0')
			{
				if(check[i]==1)continue;
				
				
				check[i]=1;
				temp[depth]=i;
				dfs(i,depth+1,road,n);
				check[i]=0;
		
			}
			
		}
		 
	 }
	 
	 
	 
	
    public static int solution(String road, int n) {
        int answer = -1;
        
        int cnt=0;
        for(int i=0;i<road.length();i++)
        {
        	if(road.charAt(i)=='0')
        	{
        		cnt++;
        	}
        }
        
        if(cnt <= n)	// 작거나 같으면 전체 길이 개수 이다 .
        {
        	answer = road.length();
        }
        
        else
        {
        	dfs(0,0,road,n);	// n의 개수만큼 공사 시작 
        	answer= ans;
        }
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(road,n));

	}

}
