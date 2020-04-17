import java.util.Stack;

//[2020카카오공채] 괄호 변환


public class Main {
	
	
	static String p="(()))(";
	
	public static String matching(String temp) {
		
		if(temp=="") return "";
		
		int cnt =0;	// 개수가 맞아떨어지는지 확인 및 index 역할
		
		if(temp.charAt(0)=='(') cnt++;
		if(temp.charAt(0)==')') cnt--;
		
		for(int i=1;i<temp.length();i++)
		{
			if(temp.charAt(i)=='(') cnt++;
			if(temp.charAt(i)==')') cnt--;
			
			if(cnt==0)
			{
				
				cnt = i;
				break;
			}
			
		}
		
		String u=temp.substring(0,cnt+1);
		String v =temp.substring(cnt+1);
		// u v로 나누고 
		
		boolean visit=true;
		
		if(u.charAt(0)==')')visit=false;	// 처음부터 닫으면 매칭 실패 
		
		if(false)
		{
			
		}
		else if(true)	// ( 부터 시작하면 올바른지 검사 
		{
			
			Stack<Character> stack = new Stack<Character>();
			
			for(int i=1;i<u.length();i++)
			{
				
			}
			
			
			
			
			
		}
		
	
		
		
		
		
		
		
	
		return temp.substring(0,cnt+1);
	}
	
	public static  String solution(String p) {
        String answer = "";
        
        matching(p);
        
        
        
        return answer;
    }

	public static void main(String[] args) {
	
		
		
		solution(p);
		

	}

}
