package pri;

import java.util.Arrays;

public class �Ա��ɻ� {
	
	static int n=6;
	static int times[] = {7,10};
	
	
	
	static public long solution(int n2 ,int[] times)
	{
            long answer = Long.MAX_VALUE;	// long�� �ִ밪�� �˾ƺ��� �ִ�.
	        long left = 0;
	        long right = 0;
	        long mid;

	        for (int time : times) {
	            if (time > right) {
	                right = time;
	            }
	        }

	        right *= n;				// �� �����ɸ��� �� ���ϰ� 
	     
	        
	        
	        while (left <= right) {
	            long done = 0;
	            mid = (left + right) / 2;

	            for (int time : times) {
	                done += mid / time;
	            }

	            if (done < n) {		// ���� �ð�  done���δ� �ð��� �� �ʿ��ϴ� ���� 0~30 �̿����� 16~30 ���� ���������� �����ϱ� ���� 

	                left = mid + 1;
	            }
	            else {
	// �ð��� �����ְų�, �� �´� ���
	            	answer  = answer < mid ? answer : mid;
	                right = mid - 1;
	            }
	            
	        }
	        
	        
	        System.out.println(left + " "+ right);
	        return answer;
	    
		
		
	}
		//�� �ɻ籹�� ó������ ���ԵǸ� ������ ���ٰ� �����ϰ� 2�� ���� 
		
		
	
	
	
	public static void main(String[] args) {
		
	
			System.out.println(solution(n,times));
		
		
	}

}
