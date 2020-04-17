//숫자야구 


public class Main {
	
	static int[][] basesball= {{123,1,1},{356,1,0},{327,2,0},{489,0,1}};
	static int temp[] = new int[3];
	static boolean visit[] = new boolean[10];
	static int ans=0;
	static boolean v =false;
	
	
	public static void dfs(int depth,int[][] baseball) {
		
		if(depth==3)
		{
			int ten=100;
			int cnt=0;
			
			v=false;
			
			for(int j=0;j<baseball.length;j++)	// baseball에 대한 숫자 비교 
			{
				if(v==true)continue;
			
				String one = Integer.toString(baseball[j][0]);
				
				int strike=0;
				int ball=0;
				
			for(int i=0;i<depth;i++)
			{
				
				for(int h=0;h<one.length();h++)
				{
					
					if(h==i&&(int)one.charAt(h)-48==temp[i]) {
						strike++;
						continue;
					}
					
					
					if((int)one.charAt(h)-48==temp[i]) ball++;
					
					
					
				}
				
				cnt+=temp[i]*ten;
				ten = ten/10;
			}
			
			if(strike!=baseball[j][1] || baseball[j][2]!=ball) v=true;
			
			}
			
			if(v==false)ans++;
			
			
			System.out.println(cnt);
			
			
			return;
		}
		
		
		
		for(int i=1;i<=9;i++)
		{
			if(visit[i]) continue;
			
			visit[i]=true;
			temp[depth]=i;
			dfs(depth+1,baseball);
			visit[i]=false;
		}
		
	}
	
	
	
	
	
	
	
    public static int solution(int[][] baseball) {
        int answer = 0;
        
        dfs(0,baseball);
        
        answer=ans;
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		solution(basesball);
		
		
		System.out.println("ans"+ans);

	}

}
