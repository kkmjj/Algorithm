package 프로그래머스3단계;

public class 문제1 {
	
	static String s ="abaabba";

	
	
	public static boolean pel(String str)
	{
		
	
		boolean visit = false;
		
		String reversedString = new StringBuilder(str).reverse().toString();

		
		if(str.equals(reversedString)) visit=true;
		
		
		return visit;
	}
	
	 public static int solution(String s)
	    {
	        int answer = 1;
	        	
	       if(s.length()>1) 
	       { 
	    	   
	    	for(int i=0;i<s.length();i++)
	        {
	        	
	        	for(int j=s.length()-1; (j-i+1)>answer;j--) // 현재 answer 값보다 길이가 작으면 for문 안들어감
	        	{
	        		  
	        	
	        		
	        		if(s.charAt(i)== s.charAt(j))
	        		{
	        			
	        			String str = s.substring(i, j+1);
	        			
	        			if((j+1-i)==2) {
	        				answer = 2 < answer ? answer : 2;
	        				continue;
	        			}
	        			
	        			
	        			if(s.charAt(i+1)!=s.charAt(j-1))continue;
	        			
	        			if(pel(str)) {
	        				
	        				System.out.println(str);
	        				answer = answer < str.length() ? str.length() : answer;
	        				j=0;
	        			}
	        		}
	        		
	        		
	        	}
	        		
	        }
	    	
	       }

	        
	        return answer;
	    }
	

	public static void main(String[] args) {

			System.out.println(solution(s));

	}

}
