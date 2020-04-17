import java.util.Arrays;

public class Main {

	static int[] budgets = {120,110,140,150};
	static int M=485;
	
	 public static int solution(int[] budgets, int M) {
	        int answer = 0;
	        
	       Arrays.parallelSort(budgets);
	       // 정렬 한뒤 
	       
	       
	       
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
				       
				       
				       if(temp < M)	// 기준값 보다 작으면 최대치를 더 올리고 
				       {
				    	  // System.out.println(" "+temp);
				    	   answer=piv;
				    	  small= piv+1;
				    	  	
				       }
				       else	// 기준값보다 크면  
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
