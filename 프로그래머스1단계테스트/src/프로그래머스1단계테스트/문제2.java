package ���α׷��ӽ�1�ܰ��׽�Ʈ;
// ��� ��� �� ���ϱ� 
public class ����2 {

	static int n=30;
	
	public static int solution(int n) {
		int answer=0;
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				answer+=i;
			}
		}
		
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		System.out.println(solution(n));

	}

}
