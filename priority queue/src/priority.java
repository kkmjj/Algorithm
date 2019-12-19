
import java.util.*;
public class priority {

	static int N;
	static int arr[] =new int[100];
	static PriorityQueue<Integer> temp = new  PriorityQueue<Integer>();
	static int sum=0;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		N=input.nextInt();
		
		for(int i=0;i<N;i++)
		{
			temp.offer(input.nextInt());
		}
		
		for(int i=0;i<N-1;i++) 
		{
			int first=temp.poll();
			int second=temp.poll();
			temp.offer(first+second);
			sum+=first+second;
			
		}
			
		System.out.print(sum);
		
		
		
	
	}

}
