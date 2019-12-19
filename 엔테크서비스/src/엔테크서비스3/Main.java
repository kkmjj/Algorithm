package 엔테크서비스3;


import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String input =a.next();
		boolean answer =true;
		
		Stack<Character> stack =new Stack(); // stack을 사용하여 괄호 검사 여는 괄호 
		Queue<Character> q = new LinkedList<Character>(); // 닫는 괄호 
		
		ArrayList<Character> s_list = new ArrayList<>(); // 괄호 순서 넣어두기 
		ArrayList<Character> q_list = new ArrayList<>();
		
		s_list.add('[');
		s_list.add('{');
		s_list.add('(');
		
		q_list.add(']');
		q_list.add('}');
		q_list.add(')');
		
		int open=0;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='('|| input.charAt(i)=='{'|| input.charAt(i)=='[')
			{
				stack.push(input.charAt(i));
					
			}
			if(input.charAt(i)==']'|| input.charAt(i)=='}'|| input.charAt(i)==')')
			{
				q.add(input.charAt(i));
			}

		}
		
		//System.out.print(stack);
		//System.out.print(q);
		
		if(stack.size()!=q.size())answer=false;  // 개수가 다르면 false 
		
		else
		{
			int length=stack.size();
			int number=4;
			
		
			
			for(int i=0; i<length;i++)
			{
				if(s_list.indexOf(stack.lastElement()) >number || s_list.indexOf(stack.lastElement())==number) {
					
					answer=false;
					break;
				}
				else
				{
					number=s_list.indexOf(stack.lastElement());
		
					if(number!=q_list.indexOf(q.peek()))
						{
							//System.out.println(q_list.indexOf(q.peek()));
							//System.out.println(number);
							answer=false;
							break;
						}
					
					
					q.remove();
					stack.pop();
					
					
					
					
					
				}
			}
			
			
		}
	
		
		System.out.print(answer);
		
		

}

}