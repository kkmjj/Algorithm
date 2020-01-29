package 프로그래머스1단계테스트;
//연속되어있는 숫자 빼기 
public class 문제1 {
	static int[] arr = {1,1,3,3,0,1,1};
	
	
	public static int[] solution(int []arr) {
		
		int ans[] = new int[arr.length];
		
		int temp=arr[0]; //기준점 잡고 
		int index=0;
		ans[index]=temp;
		
		for(int i=1;i<arr.length;i++)
		{
			if(temp==arr[i]) {
				continue; // 같은게 있으면 건너 뛰기 
			}
			else
			{
			  temp=arr[i];				// 기준을 다른걸로 변경 
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
