
public class Main2 {
	// �ǽɹ����̶�  �������� ������� ������ ���
	// answer = �ǽɹ��׼� + ����� �ǽɹ��׼� �� ���� 
	
	
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
			//temp[1] �� 
			
			for(int i=0;i<sheets[temp[0]].length();i++)	// ù��° ������ �ι�° ������ �� 
			{
				if(sheets[temp[0]].charAt(i)==sheets[temp[1]].charAt(i) &&	//�ǽɹ��׼� 
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
        
        dfs(0,0,answer_sheet,sheets);	// ������ 2�� �̱� 
        answer=ans;
        
        return answer;
    }

	public static void main(String[] args) {
		solution(answer_sheet, sheets);

	}

}
