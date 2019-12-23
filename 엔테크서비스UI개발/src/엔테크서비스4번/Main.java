package 엔테크서비스4번;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		String sentence="Jackdaws love my big sphinx of quartz";
		
		String temp ="abcdefghijklmnopqrstuvwxyz";
		String lower =sentence.toLowerCase();
		
		String answer=temp;
	
		for(int i=0;i<lower.length();i++)
		{
			if(temp.contains(Character.toString(lower.charAt(i))))
			{
				answer=answer.replace(Character.toString(lower.charAt(i)), "");
			}
		}
		
		
		
		if(answer.length()==0)answer="perfect";
		
	

		System.out.print(answer);

		
	}

}
