// 조이스틱 

public class Main2 {

	static String name= "JEROEN";

	static int ans=10000000;

	
	
	
	public static void dfs(int depth, int[] alpah_index,int[] store,int[] check, String name) 
	{
		
		if(depth==alpah_index.length)
		{
			int cnt=0;
			cnt+=store[0] < name.length()-store[0] ? store[0] :  name.length()-store[0]; // 작은값 넣기 
			
			
			for(int i=1;i<alpah_index.length;i++)
			{
				
				int plus =
				(int)Math.abs(store[i]- store[i-1]) < (name.length()-store[i])+(store[i-1]) ? 
				(int)Math.abs(store[i]- store[i-1]) :(name.length()-store[i])+(store[i-1]);
				
				
				cnt +=plus;
				
			}
			// 정해진 순서에서 값을 더한다 .
			

			
			ans = cnt < ans ? cnt : ans;
			
			System.out.println(ans);
			return;
			
		}
		
		
		
		
		
		
		for(int i=0;i<alpah_index.length;i++)
		{
			if(check[i]==1)continue;
			
			check[i]=1;
			store[depth]=alpah_index[i];
			dfs(depth+1,alpah_index,store,check,name);
			check[i]=0;
		}
			
		
		
	}
	
	
	
	 public static int solution(String name) {
		 int answer=0;
		 
		 int A_CNT=0;

		 
		 for(int i=0;i<name.length();i++)
		 {
			 int temp = name.charAt(i)-65;
			 
			 if(temp >13) temp=26-temp;
			
			 answer+=temp;
			 if(temp==0) A_CNT++;
			 
		 }	// 위 아래 횟수 최소 움직임 횟수  // A의 개수 
		 
		
		 
		 int alpah_index[] = new int[name.length()-A_CNT]; // A를 뺀 index
		 int store[]  = new int[name.length()-A_CNT];
		 int check[] = new int[name.length()-A_CNT];
		 
		 int index=0;
		 
		 
		 for(int i=0;i<name.length();i++)
		 {
			 
			 if(name.charAt(i)-65!=0)
			 {
				alpah_index[index]+=i ;
				index++;
			 }
		 }
		 // 배열에 넣고 
		 
		 dfs(0,alpah_index,store,check,name);
		
		 answer+=ans;
	
		 return answer;
		 
		 
		 
	 }
	 
	 
	 
	public static void main(String[] args) {
		System.out.println(solution(name));

	}

}
