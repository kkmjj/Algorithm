package �縰���;

import java.util.*;

public class palindrom {

	static int answer=0;
	
	public static boolean palin(String a)
	{
		
		String temp = new StringBuffer(a).reverse().toString();
		
	
		if(a.equals(temp))
		{
			answer=a.length();
			return true;
		}
		
		
	
		return false;
		
		
	}
	
	
	
	
	public static void main(String[] args) {

	
		Scanner input =new Scanner(System.in);
		
		String s = input.next();
		int length=s.length()-1;
		
		while(!palin(s))		// true �� ���� �縰����� �ƴϸ� ��  = �縰����϶� ���� 
		{
			
			s=s.substring(0,length);
			System.out.println(s);
			s=s.substring(1,length);
			System.out.println(s);
			
		}
		
		
		
	}

}
