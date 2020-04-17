import java.util.Arrays;

public class 구명보트 {
	
	
	
	static int people[] = {70,50,80,50};
	static int limit=100;
	
	
    public static int solution(int[] people, int limit) {
    	int answer=0;
    	
    	Arrays.parallelSort(people);
    	int location=0;
    	
    	for(int i=people.length-1;i>=0;i--)
    	{
    		
    		if(location > i) continue;
    		
    		if(i==location) {
    			answer++;
    		
    			continue;
    		}
    		
    		if(people[i]+people[location]<=limit)
    		{
    			answer++;
    			location++;
    		}
    		else
    		{
    			answer++;
    		}
    		
    		
    		
    		
    	}
    	
    	
    	return answer;
    	
    	
    	
    }
	
	public static void main(String[] args) {
		 
		
		System.out.println(solution(people, limit)) ;
		
		

	}

}
