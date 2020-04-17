package 프로그래머스윈터서머코딩;



public class Main {

	static int[] numbers= {1,1,1,1,1};
	static int target =3;
	static int[] temp = new int[20];
	static int answer=0;
	
	
	public static void dfs(int depth,int next,int[] numbers,int target)
	{
		if(depth==numbers.length)
		{
			int sum=0;
			
			for(int i=0;i<depth;i++)
			{
				sum+= numbers[i]*temp[i];
			}
			
			if(sum==target) answer++;
			
			
			return;
		}
		
		
		int ax[] = {-1,1};
		
		for(int i=0;i<2;i++)
		{
			temp[depth]=ax[i];
			
			dfs(depth+1,next*ax[i],numbers,target);
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		dfs(0,1,numbers,target);

		System.out.print(answer);
		
		
		
		

	}

}
