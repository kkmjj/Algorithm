
public class Main2 {
	// 의심문항이란  같은수를 골랐으나 오답인 경우
	// answer = 의심문항수 + 가장긴 의심문항수 의 제곱 
	
	
	static String answer_sheet="24551";
	static String[] sheets= {"24553","24553","24553","24553"};
	static int temp[] = new int[2];
	static int ans=0;
	static int check[] = new int[sheets.length];

	
	
	static void dfs(int start,int depth,String answer_sheet, String[] sheets) 
	{
		if(depth==2)
		{
			int joke=0;
			int visit=0;
			int con=0;
			for(int i=0;i<2;i++)
			{
				System.out.print(temp[i]);
			}
			
			//temp[0]
			//temp[1] 비교 
			
			for(int i=0;i<sheets[temp[0]].length();i++)	// 첫번째 시험지 두번째 시험지 비교 
			{
				if(sheets[temp[0]].charAt(i)==sheets[temp[1]].charAt(i) &&	//의심문항수 
						sheets[temp[0]].charAt(i)!=answer_sheet.charAt(i))
				{
					joke++;
					visit++;
					if(i==answer_sheet.length()-1 && con==0)con++;
				}
				else
				{
					con = con < visit ? visit : con ;
					visit=0;
				
				}
					
			}
			
			ans= (int) (ans < joke + Math.pow(con, 2) ?  joke + Math.pow(con, 2) : ans);
			
			System.out.println("ans" +ans);
			
			return;
		}
		
		
		for(int i=start;i<sheets.length;i++)
		{
			if(check[i]==1)continue;
			
			
			check[i]=1;
			temp[depth]=i;
			dfs(i,depth+1,answer_sheet,sheets);
			check[i]=0;
	
		}
		
		
		
	}
	
	
	
	public  static int solution(String answer_sheet, String[] sheets) {
        int answer = -1;
        
        dfs(0,0,answer_sheet,sheets);	// 시험지 2개 뽑기 
        answer=ans;
        
        return answer;
    }

	public static void main(String[] args) {
		solution(answer_sheet, sheets);

	}

}
