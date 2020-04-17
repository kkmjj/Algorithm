package 엔테크3qjs;
import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		
		int[] i_array = new int[n+1]; //초기값 0 열림
		

		int answer=0;
		
		if(n<3) 
		{
			answer=1;
		}
		else
		{
			int index=2;
			while(index <=n)
			{
				for(int i=1;i<i_array.length;i++)
				{
					if(i%index==0)
					{
						if(i_array[i]==0)
						{
							i_array[i]=1;
						}
						else 
						{
							i_array[i]=0;
						}
					}
				}
				
				
				
				index++;
			}
			
			//System.out.print(i_array.length);
			
			for(int i=1;i<i_array.length;i++)
			{
				if(i_array[i]==0)
				{
					answer++;
				}
			}
			
			
			
		}
		
		
		
		System.out.print(answer%10002);
		
	}

}
