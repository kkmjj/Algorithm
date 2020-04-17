public class N으로표현 {

		static int N=5;
		static int number=12;
		
	 	static int dp[];
	    static int answer = 99;
	    public static  int dfs(int Num,int Sum,int number){
	        if(Num>8) return -1;
	        if(Sum == number)
	            answer = answer<Num?answer:Num;
	        for(int i=0;i<8;i++){
	            int sets = dp[i];
	            int count = i+1;
	            
	            dfs(Num+count,Sum+sets,number);
	            dfs(Num+count,Sum-sets,number);
	            dfs(Num+count,Sum/sets,number);
	            dfs(Num+count,Sum*sets,number);
	        }
	        return 0;
	    }
	    
	    public static int solution(int N, int number) {
	        dp = new int[8];
	        String a = "";
	        for(int i=0;i<8;i++){
	            a += Integer.toString(N);
	            dp[i] = Integer.parseInt(a);
	        }
	        
	        dfs(0,0,number);
	        if(answer == 99)
	            return -1;
	        return answer;
	    }

	
	public static void main(String[] args) {
		 
		
		System.out.println(solution(N,number)) ;
		
		

	}

}
