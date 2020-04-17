package pri;

import java.util.Arrays;

public class 입국심사 {
	
	static int n=6;
	static int times[] = {7,10};
	
	
	
	static public long solution(int n2 ,int[] times)
	{
            long answer = Long.MAX_VALUE;	// long의 최대값을 알아볼수 있다.
	        long left = 0;
	        long right = 0;
	        long mid;

	        for (int time : times) {
	            if (time > right) {
	                right = time;
	            }
	        }

	        right *= n;				// 젤 오래걸리는 값 구하고 
	     
	        
	        
	        while (left <= right) {
	            long done = 0;
	            mid = (left + right) / 2;

	            for (int time : times) {
	                done += mid / time;
	            }

	            if (done < n) {		// 현재 시간  done으로는 시간이 더 필요하다 따라서 0~30 이였으면 16~30 으로 오른쪽으로 진행하기 위함 

	                left = mid + 1;
	            }
	            else {
	// 시간이 여유있거나, 딱 맞는 경우
	            	answer  = answer < mid ? answer : mid;
	                right = mid - 1;
	            }
	            
	        }
	        
	        
	        System.out.println(left + " "+ right);
	        return answer;
	    
		
		
	}
		//각 심사국에 처음으로 들어가게되면 그전에 들어갔다고 가정하고 2가 증가 
		
		
	
	
	
	public static void main(String[] args) {
		
	
			System.out.println(solution(n,times));
		
		
	}

}
