package sw������Ʈ��.three;

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
		// �Է� 
		
		
		//�� ���� ū���� 1���� �κм����� ����� (1���� �κм����� cost�� 0)  ���� �κм��������� 1�� �������� �ش� ���� �������� ���� �ȴ� .
		
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
