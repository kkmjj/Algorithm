package ���α׷��ӽ�1�ܰ��׽�Ʈ;
//���ӵǾ��ִ� ���� ���� 
public class ����1 {
	static int[] arr = {1,1,3,3,0,1,1};
	
	
	public static int[] solution(int []arr) {
		
		int ans[] = new int[arr.length];
		
		int temp=arr[0]; //������ ��� 
		int index=0;
		ans[index]=temp;
		
		for(int i=1;i<arr.length;i++)
		{
			if(temp==arr[i]) {
				continue; // ������ ������ �ǳ� �ٱ� 
			}
			else
			{
			  temp=arr[i];				// ������ �ٸ��ɷ� ���� 
			  index++;
			  ans[index]=temp;
			
			}
			
			
		}
		
		int[] answer= new int[index+1];
		
		for(int i=0;i<=index;i++)
		{
			answer[i]=ans[i];
		}
			
		

		return answer;
		
	
	}

	public static void main(String[] args) {
	
		 solution(arr);
	}

}
