package 엔테크서비스;
import java.util.*;
public class one {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		int a =input.nextInt();
		int b =input.nextInt();
		int budget = input.nextInt();
		// 입력 
		
		int answer=0;
		
		int temp= budget -a;
		while(temp >0)
		{
			if(temp%b==0)answer++;
			
			temp-=a;
			
			
		}
		
		
		
		System.out.print(answer);
		
		
		
		
		

	}

}
