import java.util.PriorityQueue;

public class 입국심사 {
	
	static int n=6;
	static int[] times= {7,10};
	
	
	public static class tester implements Comparable<tester>{
		
		long time;
		int index;
		
		public tester(long time, int index) {
			this.time=time;
			this.index=index;
			
		}
		
		@Override
		public int compareTo(tester target) {
			
			return this.time <= target.time ? -1: 1;
		}
		
	}
	
	
	
	  public static long solution(int n, int[] times) {
		  
		  long answer=0;
		  int cnt=0;
		 
		  
		  PriorityQueue<tester> priorityQueue = new PriorityQueue<>();
		  
		  
		  for(int i=0;i<times.length;i++)
		  {
			  priorityQueue.add(new tester((long)times[i],i));
		  }
		  
		  while(n!=cnt)
		  {
			  int plus =priorityQueue.peek().index;
			  cnt++; // 한명이 끝났다고 생각하고 
			  answer =priorityQueue.peek().time; // 시간 측정하고 
			
			  priorityQueue.poll();
			  priorityQueue.add(new tester((long)(answer+times[plus]),plus));
			 
		  }
		
		  
		  //System.out.println(answer);
		  return answer;
		  
		  
	  }
	
	

	public static void main(String[] args) {
		
	
		solution(n,times);
		
		// TODO Auto-generated method stub

	}

}
