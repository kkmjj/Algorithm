package ���α׷��ӽ�2�ܰ��׽�Ʈ;

import java.util.PriorityQueue;

public class ����2 {

	static int[] scoville = {1,2,3,9,10,12};
	static int K=7;
	
	 static public int solution(int[] scoville, int K) {
		  
		 int answer = 0;
		
		
		 PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		 
		 for (int i  : scoville)
		 {
			 q.add(i);
		 } // ���� ������� ���� �� 
		 
		 int scope=0;
		 int visit=1;
		 
		 while (q.peek() <= K) {
			 
	       if (q.size() == 1) {
	                return -1;
	            }
		   scope=0;
		   scope += q.poll();
		   scope += q.poll() *2;
		  // System.out.println(scope);
		   
		   answer++;
		   q.add(scope);
		   
		  
		 }
	     
		
		 
		 
	      return answer;
	  }
	
	public static void main(String[] args) {
		System.out.println(solution(scoville,K));

	}

}
