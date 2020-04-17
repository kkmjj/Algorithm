
public class Main {
	
	static String begin = "hit";
	static String target="cog";
	static String[] words= {"hot","dot","dog","lot","log"};
	
	static int[] visit= new int[words.length];
	static int ans=0;
	static int cnt=0;
	
	public static void dfs(String start,int depth,String[] words,String target)
	{
		
		if(depth >=words.length)
		{
			if(!start.equals(target)) ans=0;
			
			return ;
		}
		if(start.equals(target)) {
			
			ans=depth;
			
			return;
		}
		
		for(int i=0;i<words.length;i++)
		{
			
			if(words[i].equals(start))continue;
			
			 cnt=0;
			for(int j=0;j<words[i].length();j++)	// 글자수 비교 
			{
				if(start.charAt(j)!=words[i].charAt(j))cnt++;
				if(cnt >=2) break;
			}
			
			//다음 dfs 
			if(cnt==1 && visit[i]==0) {
				visit[i]=1;
				dfs(words[i],depth+1,words,target);
				visit[i]=0;
			}
			
			
		}
		
	}
	
	
	
	 public static int solution(String begin, String target, String[] words) {
	        int answer = 0;
	        
	        
	        dfs(begin,0,words,target);
	        
	        if(ans >words.length) ans=0;
	        
	        answer= ans;
	        
	        return answer;
	    }

	 
	 
	 
	public static void main(String[] args) {

		System.out.println(solution(begin, target, words));
	}

}
