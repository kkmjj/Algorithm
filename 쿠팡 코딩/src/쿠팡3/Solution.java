package ÄíÆÎ3;

public class Solution {

	static int numServer=2;
	
	static String[] logs= {"12:00:00 0.400","12:00:00 0.200","12:00:00 0.500"}
	
	
	 public static int[] solution(int numServer, String[] logs) 
	 {
		int answer[] = {};
		
		String start[] = new String[logs.length];
		String time[] = new String[logs.length];
		
		start[0] = logs[0].split(" ")[0];
		time[0] = logs[0].split(" ")[1];
		
		System.out.println(start[0]);
		
		 
		 return answer;
		 
		 
	 }
	
	
	public static void main(String[] args) {
		solution(numServer,logs);
	}

}
