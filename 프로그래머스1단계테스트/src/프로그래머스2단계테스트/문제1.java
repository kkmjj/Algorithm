package 프로그래머스2단계테스트;

import java.util.LinkedList;
import java.util.Queue;

public class 문제1 {
	static int m=2;
	static int n=3;
	static int[][] picture = {{1,0,2},{1,1,2}};
	static int[][] visit = new int[102][102];
	
	static public class temp {
		
		int x;
		int y;
		
		public temp(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
	}
	
	
	static public int bfs (int i,int j, int[][] pic,int m,int n) {
		int with=1;
		int edge = pic[i][j];
		pic[i][j]=0;
		
		Queue<temp> q = new LinkedList<temp>();  // 큐를 만들어서 
		
		temp first = new temp(i,j);
		
		q.add(first);
		
		while(!q.isEmpty())
		{
			
			int ax[] = {1,-1,0,0};
			int ay[] = {0,0,1,-1};
			
			int temp_x= q.peek().x;
			int temp_y =q.peek().y;
			
			q.poll();
			
			for(int k=0;k<4;k++)
			{
				int newx = ax[k]+temp_x;
				int newy = ay[k]+temp_y;
				
				if(newx <0 || newx >=m || newy <0 || newy >=n ) continue;
				
				if(pic[newx][newy]!=edge) continue; // 해당 값이 다르거나 이미 방문했으면
				
				q.add(new temp(newx,newy));  // 다음 꺼 진행 
				with++;
				pic[newx][newy]=0;
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		return with;
	}
	
	
	 public static int[] solution(int m, int n, int[][] picture) 
	 {
		
		int answer[]  = new int[2];
		 int numberOfArea = 0;
		 int maxSizeOfOneArea = 0;
		 
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(picture[i][j]!=0) // 색이 있고 방문하지 않았으면 들어가서 넓이 구하기 
				{
				//	 System.out.println(i+" "+j);
					numberOfArea++;
				 int cnt =bfs(i,j,picture,m,n);
				 maxSizeOfOneArea = maxSizeOfOneArea <cnt ? cnt : maxSizeOfOneArea;
				}
			}
		}
		
		 answer[0] = numberOfArea;
	      answer[1] = maxSizeOfOneArea;
		
		
		for(int i=0;i<2;i++) System.out.println(answer[i]);
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		solution( m, n, picture);

	}

}
