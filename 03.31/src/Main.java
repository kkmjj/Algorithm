import java.util.Arrays;



public class Main {
	
	static int n=6;
	static int[] times= {7,10};
	
	
  public static long solution(int n, int[] times) {
		  
	  
		  long answer=Long.MAX_VALUE;
		  
		  Arrays.parallelSort(times);
		  
		  
		  long left=0;
		  long right=times[0]*n; // 최대값중 효율적인시간 
		  
		  long mid = 0;
		  
	        while (left <= right) {
	            long done = 0;
	            mid = (left + right) / 2;

	            for (int time : times) {
	                done += mid / time;
	            }

	            if (done < n) {		
// 현재 시간  done으로는 시간이 더 필요하다 따라서 0~30 이였으면 16~30 으로 오른쪽으로 진행하기 위함 

	                left = mid + 1;
	            }
	            else {
	// 시간이 여유있거나, 딱 맞는 경우
	            	answer  = answer < mid ? answer : mid;
	                right = mid - 1;
	              
	            }
	            
	        }
	
		  return answer;
		  
		  
	  }

	public static void main(String[] args) {
		
		System.out.println(solution(n, times));
	}

}
