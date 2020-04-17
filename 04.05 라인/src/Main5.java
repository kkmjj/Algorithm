import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main5 {

	
	static String[][] dataSource= {{"doc1","t1","t2","t3"},{"doc2","t0","t2","t3"},
			{"doc3","t1","t6","t7"},{"doc4","t1","t2","t4"},{"doc5","t6","t100","t8"}};
	static String[] tags = {"t1","t2","t3"};
	
	
	public static class doc implements Comparable<doc>{
		String name;
		int cnt;
		
		
		
		public doc(String name, int cnt) {
			this.name=name;
			this.cnt=cnt;
			
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public int compareTo(doc o) {
			// TODO Auto-generated method stub
			return o.cnt - this.cnt;
		}
				
		
	}
	
	
	public static String[] solution(String[][] dataSource, String[] tags)
	{
		
		int[] visit = new int[dataSource.length];
		ArrayList<String> resultlist = new ArrayList<String>();
		
		
		for(int i=0;i<tags.length;i++)
		{
			
			for(int j=0;j<dataSource.length;j++)
			{
				for(int h=1;h<dataSource[j].length;h++)
				{
					if(tags[i].equals(dataSource[j][h]))
					{
						visit[j]++;
						resultlist.add(dataSource[j][0]);
						
					}
					
					
				}
				
				
				
			}
		}
		
	List<doc> temp = new ArrayList<doc>();
		for(int i=0;i<visit.length;i++)
		{
			if(visit[i]==0)continue;
			//System.out.println(visit[i]+" "+ dataSource[i][0]);
			temp.add(new doc(dataSource[i][0],visit[i]));
		}
		
		
		Collections.sort(temp);
		
		
	
		 String[] answer= new String[temp.size()];
		
		  for(int i=0;i<temp.size();i++)
          {
			  
       	   answer[i]=temp.get(i).name;
       	   System.out.println(answer[i]);
          }
		
		
		
		
		
		
		
		return answer;
	
	}
	
	public static void main(String[] args) {
		
		solution(dataSource,tags);

	}

}
