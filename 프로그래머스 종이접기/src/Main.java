import java.util.*;
public class Main {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		
		
		
		
		String a="0";
		
		if(n==1) {
			int answer[] = new int[1];
			answer[0]=0;
		}
		
		else
		{
			
			for(int i=1;i<n;i++)
			{
			
				a = a.replace("0", "024").replace("1", "031");
				a = a.replace("4", "1");
				
			}
			
			
			a=a.replace("2", "0");
			a=a.replace("3","1");
		
			
		}
		
		int answer[] = new int[a.length()];
		
		for(int i=0;i<a.length();i++)
		{
			
			answer[i]=a.charAt(i)-'0';
			
		
		}
		
		
		
	
		
		
		
	}
	
	
	
	
	

}
