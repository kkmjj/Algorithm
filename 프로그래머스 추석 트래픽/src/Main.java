public class Main {
	static String[] lines= {
			"2016-09-15 20:59:57.421 0.351s",
			"2016-09-15 20:59:58.233 1.181s",
			"2016-09-15 20:59:58.299 0.8s",
			"2016-09-15 20:59:58.688 1.041s",
			"2016-09-15 20:59:59.591 1.412s",
			"2016-09-15 21:00:00.464 1.466s",
			"2016-09-15 21:00:00.464 1.466s",
			"2016-09-15 21:00:00.741 1.581s",
			"2016-09-15 21:00:00.748 2.31s"	,
			"2016-09-15 21:00:00.748 2.31s"	,
			"2016-09-15 21:00:00.966 0.381s",
			"2016-09-15 21:00:02.066 2.62s"
			
	};
	
	

	
	  public static long solution(String[] lines) {
		  
		long visit[] = new long[200000000];
		 	System.out.println(Integer.MAX_VALUE);
		  long answer = 0;
	      
	    for(int i=0;i<lines.length;i++)
	    {
	    	
	    	String temp = lines[i].substring(11);
	    	
	    	System.out.println(temp);
	    	
	    	int time = Integer.parseInt(temp.substring(0,2)) *3600 * 1000;	// 시간 
	    
	     	int min = Integer.parseInt(temp.substring(3,5)) * 60 * 1000;
	     	
	     	
	    	int sec = Integer.parseInt(temp.substring(6,8)) * 1000;
    	
	    	int ms = Integer.parseInt(temp.substring(9,11)) * 1000;
    	
	    	int end_time = time+min+sec+ms;
	    	
	    	System.out.println(end_time);
	    	
	    	int ing_sec  = Integer.parseInt(temp.substring(13,14)) *1000;
	    	
	    	int ing_ms=0;
	    	if(temp.substring(17,18)!="s")
	    	{
	    	ing_ms  = Integer.parseInt(temp.substring(15,18)) *1000;
	    	}
	    	else
	    	{
	    	
	    		ing_ms  = Integer.parseInt(temp.substring(15,17)) *1000;
	    	}
	    	int ing = ing_sec + ing_ms;		// 걸린 시간 
	    	
	    	
	    	int start_time = (end_time -ing)/1000;		// 처음 시간 구하고 
	    	
	    	end_time = end_time/1000;
	    	
	    	// 초단위로 그 초에 몇개 들어있는지 판단 
	    	
	    	for(int j=start_time; j<=end_time;j++)
	    	{
	    		visit[j]++;
	    	}
	    	
	    	
	    	 for(int k=0; k<200000000; k++){
	    	        if(answer<visit[k]){
	    	            answer = visit[k];
	    	        }
	    	    }	
	    
	    	
	    	
	    }
	     
	    
	    
	      return answer;
	  }
	
	

	public static void main(String[] args) {
		
		System.out.println(solution(lines));
		
	}
	
}
