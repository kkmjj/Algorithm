package 엔테크서비스2번;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String phone_number=input.next();
		int answer=0;
		
			


		if(phone_number.length()==11 && phone_number.substring(0,3).equals("010"))
		{
			
			boolean number= true;
			for(int i=0;i<phone_number.length();i++)
			{
				char temp =phone_number.charAt(i);
				
				if(!('0'<=temp && temp <='9'))
				{
					number=false;
				}
			}
			
			
			
			answer=1;
			if(!number)answer=-1;
			
			
		}
		else if(phone_number.length()==13 && phone_number.substring(0,3).equals("010-"))
		{
			String[] array =phone_number.split("-");
		
			answer=2;
	
		}
		else if(phone_number.length()==16)
		{
			answer=3;
		}
		else
		{
			answer=-1;
		}
		
		
		
		System.out.print(answer);
		
		
	}

}
