package 프로그래머스2단계테스트;

import java.util.Arrays;

public class 문제1_2 {

	
	static int A[] = {1,4,2};
	static int B[] = {5,4,4};
	
	 static public int solution(int A[] ,int B[]) {
		  
		 int answer=0;
		 
		Arrays.parallelSort(A);
		Arrays.parallelSort(B);
		  
		
		for(int i=0;i<A.length;i++)
		{
			answer +=A[i]*B[(A.length-1)-i];
		}
		  	
		  
	     
	      return answer;
	  }
	
	public static void main(String[] args) {
		
		System.out.println(solution(A,B));
	}

}
