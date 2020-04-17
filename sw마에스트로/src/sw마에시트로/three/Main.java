package sw마에시트로.three;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N= input.nextInt();
		int K= input.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++)
		{
			arr[i]=input.nextInt();
			
		}
		// 입력 
		
		
		//맨 뒤의 큰값을 1개씩 부분수열로 만들고 (1개의 부분수열의 cost는 0)  남은 부분수열개수가 1이 남았을때 해당 값과 작은값을 빼면 된다 .
		
		for(int i=N-1;i>=0;i--)
		{
			if(K==1) 
			{
				System.out.println(arr[i]-arr[0]);
			}
			arr[i]=0;
			K--;
		}
		
		
		
		
		
		
		
		
	}

}
