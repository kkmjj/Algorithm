package ���α׷��ӽ�1�ܰ��׽�Ʈ;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test {
	
	static String strings[] = {"abce","abcd","cdx"};
	static int n =2;

	
	public static String[] solution(String [] strings, int n) {
		
	
		String[] answer= new String[strings.length];
		
		Arrays.sort(strings);
		
		char[] a = new char[strings.length];
		for(int i=0;i<strings.length;i++)
		{
			a[i] =strings[i].charAt(n);
		}
		
		Arrays.parallelSort(a);
		// �ش� �ε��� ���� ���� 
		for(int i=0;i<answer.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int visit[] = new int[strings.length];
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<strings.length;j++)
			{
				if(a[i]==strings[j].charAt(n) && visit[j]!=1)		// �ش� ��ġ�� ���� �����ϸ�
				{
					answer[i]=strings[j];			// �ش� ���� answer�� �ֱ� 
					visit[j]=1;
					break;
				}
			}
			
			
		}
		
		
		for(int i=0;i<answer.length;i++)
		{
			System.out.println(answer[i]);
		}
	
		
		
		return answer;
	}
	

	public static void main(String[] args) {

		solution(strings, n);
		//for(int i=0;i<strings.length;i++) System.out.println(answer);
		
		
	
		
		
		
		
		

	}

}
