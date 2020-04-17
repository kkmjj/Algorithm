

public class Main {
	
	
	static String []  words = {"frodo","front","frost","frozen","frame","kakao"};
	static String []  queries = {"fro??","????o","fr???","fro???","pro?"};
	static int[] ans = new int[queries.length];
	
    public static int[] solution(String[] words, String[] queries) {
        
        int[] answer = new int[queries.length];
        
        
        
        for(int i=0;i<queries.length;i++)
        {
        	for(int j=0;j<words.length;j++)
        	{
	        	
        		if(queries[i].length()!=words[j].length()) continue;
        		if(words.length==1) {
        			answer[i]++;
        			continue;
        		}
        		// 길이 가 같을 경우 
        	
        		
        		if(queries[i].charAt(0)=='?')
        		{
        			
        			
        			
        			String pre = queries[i].replace("?", "");
        			
        			
        			
	      			int begin  =queries[i].length()-pre.length();
	      			int end = pre.length();
	      			
	      			String temp = words[j].substring(begin);
        		
	      			if(temp.equals(pre)) answer[i]++;
        			
        		}
        		else
        		{
        			
        			String pre = queries[i].replace("?", "");
        			
        		
        	
	      			
	      			String temp = words[j].substring(0,pre.length());
	      			
	      			
	      			
	      			
	      			if(temp.equals(pre)) answer[i]++;
        			
        			
        			
        		}
        		
        		
        		
        		
        		
        		
        	}
        	
        }
        
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		
		
		ans=solution(words,queries);
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
		

	}

}
