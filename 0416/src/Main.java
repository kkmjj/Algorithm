import java.util.Arrays;

public class Main {

	static int[] budgets = {120,110,140,150};
	static int M=485;
	
	 public static int solution(int[] budgets, int M) {
	        int answer = 0;
	        
	       Arrays.parallelSort(budgets);
	       // ���� �ѵ� 
	       
	       
	       
	       int small = 0;
	       int tall = budgets[budgets.length-1];
	       
	       while(small <= tall)
	       {
	    	   int piv= (small+tall)/2;
	       
	    	   	//	System.out.print(piv);
				       int temp=0;
				       for(int i : budgets)
				       {   
				    	   if(i >= piv )
				    	   {
				    		   temp+=piv;
				    	   }
				    	   else
				    	   {
				    		   temp+=i;
				    	   }
				       }
				       
				       
				       if(temp < M)	// ���ذ� ���� ������ �ִ�ġ�� �� �ø��� 
				       {
				    	  // System.out.println(" "+temp);
				    	   answer=piv;
				    	  small= piv+1;
				    	  	
				       }
				       else	// ���ذ����� ũ��  
				       {
				    	   tall=piv-1;
				       }
				    //   System.out.println();
	       
	       }
	       
	       
	       
	       
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
	
			System.out.println(solution(budgets, M));
	}

}
