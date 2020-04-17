import java.util.Arrays;



public class Main {
	
	static int n=6;
	static int[] times= {7,10};
	
	
  public static long solution(int n, int[] times) {
		  
	  
		  long answer=Long.MAX_VALUE;
		  
		  Arrays.parallelSort(times);
		  
		  
		  long left=0;
		  long right=times[0]*n; // �ִ밪�� ȿ�����νð� 
		  
		  long mid = 0;
		  
	        while (left <= right) {
	            long done = 0;
	            mid = (left + right) / 2;

	            for (int time : times) {
	                done += mid / time;
	            }

	            if (done < n) {		
// ���� �ð�  done���δ� �ð��� �� �ʿ��ϴ� ���� 0~30 �̿����� 16~30 ���� ���������� �����ϱ� ���� 

	                left = mid + 1;
	            }
	            else {
	// �ð��� �����ְų�, �� �´� ���
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
