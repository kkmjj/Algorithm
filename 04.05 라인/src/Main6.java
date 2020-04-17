import java.util.ArrayList;
import java.util.Arrays;

public class Main6 {
	
	
	static String[] directory = {"/","/hello","/hello/tmp","/root","/root/abcd",
			"/root/abcd/etc","/root/abcd/hello"};
	
	static String[] command = {"mkdir /root/tmp", "cp /hello /root/tmp" ,"rm /hello"};

	public static String[] solution(String[] directory, String[] command)
	{
		ArrayList<String> answerlist = new ArrayList<String>();
		
		for(int i=0;i<directory.length;i++)
		{
			answerlist.add(directory[i]);
		}
		// 기본적인 directory를 넣는다. 
		
		
		for(int i=0;i<command.length;i++)
		{
			String[] temp = command[i].split(" ");
			//띄어쓰기 
			
			
			//mkdir이면 넣기 
			if(temp[0].equals("mkdir"))answerlist.add(temp[1]);
			//cp 이면 
			if(temp[0].equals("cp"))
			{
				String copy = temp[2]; // /root/tmp
				
				for(int j=0;j<answerlist.size();j++)
				{
					if(answerlist.get(j).contains(temp[1]))
					{
						System.out.println(answerlist.get(j));
					}
				}
			}
			
		
		
				
				
			
			
		}
		
		
		
		
		
		
		String[] answer= new String[answerlist.size()];
		
		
		for(int i=0;i<answerlist.size();i++)
		{
			answer[i]=answerlist.get(i);
			//System.out.println(answer[i]);
		}
		
		Arrays.sort(answer);
		
		return answer;
	
		
		
	}
	
	public static void main(String[] args) 
	{
	

		solution(directory,command);
		
		
		
		
	}

}
