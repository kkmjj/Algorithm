import java.util.Arrays;

//level 3 �������ϱ� 


public class Main2 {

	static int n=4;
	static int[][] costs= {{0,1,5},{1,2,3},{2,3,3},{3,1,2},{3,0,4}};
	
	
	static int[] visit = new int[101];
	static int[] exit = new int[((visit.length-1)*visit.length)/2];
	
	public static class xy  implements Comparable<xy>{
		int start;
		int end;
		int edge;
		
		public xy(int start, int end, int edge) {
		
			this.start=start;
			this.end=end;
			this.edge=edge;
			
		}
		
		@Override
		public int compareTo(xy o) {
			// TODO Auto-generated method stub
			return this.edge-o.edge  ;
		}
		
		
	}
	
	
	public static int solution(int n, int[][] costs)
	{
        int answer = 0;
        
        if(n==1) return answer; // 1���̸� �ٷ� 0 ���� 
        
        
        
       xy[] xys = new xy[costs.length];

       for(int i=0;i<costs.length;i++)
       {
    	 xys[i] = new xy(costs[i][0],costs[i][1],costs[i][2]);
    	 
       }
        
       Arrays.sort(xys);
       // ����� ���� ��°� ���� ������� �����ѵ� 
     
        
        
       visit[xys[0].start]=1;
       visit[xys[0].end]=1;
       exit[0]=1;
       n= n-2;
       answer+=xys[0].edge;
       // ���������� �켱 ��� �߰��ϰ� 
       
     //  System.out.println(n);
       
       	while(n!=0)
       	{
       		//System.out.println(n);
       		for(int i=1;i<xys.length;i++)
       		{
       			if(n==0)break;
       			
       			if(exit[i]==1)continue;	// �̹� �ѰŸ� �н�
       			
       			if(visit[xys[i].start]==1 && visit[xys[i].end]==1) continue;
       		
       			
       			if(visit[xys[i].start]==1 || visit[xys[i].end]==1)	// ���� �����ϼ� �ִ� �����ġ 
       			{
       				visit[xys[i].start]=1;
       				visit[xys[i].end]=1;
       				System.out.println(xys[i].start+" "+xys[i].end+" "+xys[i].edge);
       				answer+=xys[i].edge;
       				n--;
       				exit[i]=1;
       				break;
       			}
     
       		}
       		
       	
       	
       
       
       	}
       
        
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution(n, costs));

	}

}
