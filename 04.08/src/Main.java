import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {

		/*
		   �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   �������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��,
		   �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
		   ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		   ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N=sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
			{
			    arr[i]=sc.nextInt();	
			}
			// �迭 �Է� 
			
			
			int answer=1;
			
			for(int i=1;i<arr.length;i++)
			{
				
				if(arr[i-1]>arr[i]) {
					
					arr[i-1]=0;
				}
				else if(arr[i-1]==arr[i]) {
					
					arr[i-1]=-1;
				}
				else
				{
					arr[i-1]=1;
				}
	
			}
			
			
			int temp=arr[0];
			
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]==-1 && i==0) answer--;
				
				System.out.print(arr[i]);
				if(arr[i]==temp || arr[i]==-1)
				{
					continue;
					
				}
				else
				{
					temp=arr[i];
					answer++;
				}
				
			
			
			}
			
			System.out.print(" "+answer);	
			System.out.println();	
			
			
			


		}
	}
		

	}


