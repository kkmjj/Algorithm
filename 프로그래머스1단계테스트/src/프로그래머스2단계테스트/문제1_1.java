package ���α׷��ӽ�2�ܰ��׽�Ʈ;

public class ����1_1 {
	static int n = 78;
	
	
	static int Counting(int index) {
			int count=1;
		
			  while(index!=1)
			  {
				  if(index%2==1)count++;
				  index=index/2;
				  
			  }
			
			
		return count;
	}
	
	 static public int solution(int n) {
		  
		 int answer = 0;
		  int before=0;
		  int after=1;
		  
		  before =Counting(n);// 1�� ���� ���ϱ� 
		  
		  
		  while(before!=after)
		  {
			  n++;
			  after=Counting(n);
			  
			  
		  }
		  
		  answer=n;
		  
		  
		  
		  	
		  
	     
	      return answer;
	  }

	public static void main(String[] args) {
		System.out.println(solution(n));

	}

}
