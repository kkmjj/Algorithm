import java.util.Stack;

//[2020īī����ä] ��ȣ ��ȯ


public class Main {
	
	
	static String p="(()))(";
	
	public static String matching(String temp) {
		
		if(temp=="") return "";
		
		int cnt =0;	// ������ �¾ƶ��������� Ȯ�� �� index ����
		
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
		// u v�� ������ 
		
		boolean visit=true;
		
		if(u.charAt(0)==')')visit=false;	// ó������ ������ ��Ī ���� 
		
		if(false)
		{
			
		}
		else if(true)	// ( ���� �����ϸ� �ùٸ��� �˻� 
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
