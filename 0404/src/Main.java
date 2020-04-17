// 정수 삼각형 level 3

public class Main {

	static int[][] triangle= {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
	
	
	  public static int solution(int[][] triangle) {
	        int answer = 0;
	        
	        
	        triangle[1][0]+=triangle[0][0];
	        triangle[1][1]+=triangle[0][0];
	        
	        
	        for(int i=2;i<triangle.length;i++)
	        {
	        	
	        	for(int j=0;j<triangle[i].length;j++)
	        	{
	        		if(i==j) triangle[i][j]+=triangle[i-1][j-1];	//같으면 바로 전값 더하기
	        		
	        		else if(j==0) triangle[i][j]+=triangle[i-1][0]; // 맨 왼쪽에 있으면 전값 더하기 
	        		
	        		else if(i>j)
	        		{
	        			int plus = triangle[i-1][j-1] < triangle[i-1][j] ? 
	        					triangle[i-1][j] :triangle[i-1][j-1];
	        					
	        				triangle[i][j]+=plus;
	        		}
	        		
	        		
	        		if(i==triangle.length-1) answer = answer < triangle[i][j] ? triangle[i][j]: answer;
	        	}
	        	
	        
	        	
	        }
	        
	        
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(triangle) );
	}

}
