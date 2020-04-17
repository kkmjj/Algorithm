import java.util.Stack;

public class Main {

	
	static String s = "baabaa";
	
	
	
	 public static int solution(String s) {
	        int answer = -1;

	        Stack<Character> stack = new Stack<Character>();
	        
	        stack.push(s.charAt(0));
	        
	        for(int i=1;i<s.length();i++)
	        {
	        	
	        	if(stack.isEmpty()) {
	        		stack.push(s.charAt(i));
	        		continue;
	        	}
	        	
	        	if(stack.peek()==s.charAt(i))
	        	{
	        		
	        		stack.pop();
	        	}
	        	else
	        	{
	        		stack.push(s.charAt(i));
	        	}
	        }
	        
	        if(stack.isEmpty()) answer=1;
	        
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		System.out.println(solution(s));

	}

}
