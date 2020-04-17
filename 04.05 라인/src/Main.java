import java.util.ArrayList;

public class Main {
	
	static String inputString="{[]}";
	
	   public static int solution(String inputString) {
	        int answer = -1;
	        
	        ArrayList<String> open = new ArrayList<String>();
	        ArrayList<String> close = new ArrayList<String>();
	        
	        for(int i=0;i<inputString.length();i++)	// 문자열 길이 만큼 
	        {
	        	
	        	//열기이면 
	        	if(inputString.charAt(i)=='(' || inputString.charAt(i)=='{'
	        			||inputString.charAt(i)=='['|| inputString.charAt(i)=='<')
	        	{
	        		open.add(String.valueOf(inputString.charAt(i)));
	        	}
	        	//닫기면
	        	if(inputString.charAt(i)==')' || inputString.charAt(i)=='}'
	        			||inputString.charAt(i)==']'|| inputString.charAt(i)=='>')
					{
	        		
	        		if(!open.contains("(") && inputString.charAt(i)==')') continue;
	        		if(!open.contains("{") && inputString.charAt(i)=='}') continue;
	        		if(!open.contains("[") && inputString.charAt(i)==']') continue;
	        		if(!open.contains("<") && inputString.charAt(i)=='>') continue;
	        		
	        		close.add(String.valueOf(inputString.charAt(i)));
					}
	
	        }
	        
	        String[] openresult = open.toArray(new String[open.size()]);
	      
	        if(openresult.length==close.size())
	        {
	        	answer=0;
	        	for(int i=0;i<openresult.length;i++)
		        {
	
		        	if(openresult[i].equals("("))	// ( 있으면
		        	{

		        		if(close.contains(")"))
		        		{
		        			answer++;
		        		}
		        		else
		        		{
		        			answer=-1;
		        			break;
		        		}
		        	}
		        	if(openresult[i].equals("{"))	// ( 있으면
		        	{

		        		if(close.contains("}"))
		        		{
		        			answer++;
		        		}
		        		else
		        		{
		        			answer=-1;
		        			break;
		        		}
		        	}
		        	if(openresult[i].equals("["))	// ( 있으면
		        	{

		        		if(close.contains("]"))
		        		{
		        			answer++;
		        		}
		        		else
		        		{
		        			answer=-1;
		        			break;
		        		}
		        	}
		        	if(openresult[i].equals("<"))	// ( 있으면
		        	{

		        		if(close.contains(">"))
		        		{
		        			answer++;
		        		}
		        		else
		        		{
		        			answer=-1;
		        			break;
		        		}
		        	}
		        
		        	
		        }
	        }
	     
	        
	        
	        
	        
	        
	        return answer;
	    }

	public static void main(String[] args) {
		System.out.println(solution(inputString));

	}

}
