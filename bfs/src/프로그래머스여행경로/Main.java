package 프로그래머스여행경로;


import java.util.*;
import java.lang.*;

public class Main  {
	
	
	    static int visit[] =new int[30001];
		
	    static void dfs(String[][] tickets, int visit[],int depth,String start,String[] answer) 
		{
			
			
			if(depth==tickets.length)
			{
				
				return;
			}
			
			
			
			
			
			for(int i=0;i<tickets.length;i++)
			{
				if(tickets[i][0]==start && visit[i]==0) //시작점이 전에 도착점이면 
				{
					visit[i]=1;
				//	System.out.println("visti"+i);
					answer[depth]=tickets[i][1];		// answer[2]=도착점을 넣는다 
					
					//System.out.println("D"+depth);
					dfs(tickets,visit,depth+1,tickets[i][1],answer);
				}
				
			
			}
			
			
			
		}
	    
	    public String[] solution(String[][] tickets) {
	       String [] answer= new String[tickets.length];
				
				answer[0]="ICN";
				
					PriorityQueue<String> second = new PriorityQueue<String>();
					
					String temp =tickets[0][0]; //처음 비교값 
					
					for(int i=0;i<tickets.length;i++)
					{
						
						
						for(int j=i+1;j<tickets.length;j++)
						{
							if(tickets[i][0]==tickets[j][0])	// 첫 원소끼리 같으면 
							{
								PriorityQueue<String> q = new PriorityQueue<String>();
								q.add(tickets[i][1]);
								q.add(tickets[j][1]);
								
								tickets[i][1]=q.poll();
								tickets[j][1]=q.poll();		// 순서대로 집어 넣는다. 
							}
						}
					}
					
					//System.out.println(tickets.length);
					
					for(int i=0;i<tickets.length;i++)
					{
						if(tickets[i][0]=="ICN" && visit[i]==0) dfs(tickets,visit,1,tickets[i][0],answer);
						
					}
	        return answer;
	    }
	
	


	public static void main(String[] args) {
			
			
			
		
	}






}
