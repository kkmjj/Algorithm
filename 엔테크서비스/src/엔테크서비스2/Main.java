package ����ũ����2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int N=input.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			
			int temp =N;
		
			while(temp!=0) 
			{
				if(list.contains(temp%10)) {
					temp=temp/10;
					continue;
				}
				list.add(temp%10); // �������� list�� ����
				temp=temp/10;
			}
		System.out.println(list);
			
		int answer=0;
			
		for(int i=0;i<list.size();i++)
		{
				if(N%list.get(i)==0)answer++; // list.get���� ���� �ҷ��� 
		
		}
		
		
			System.out.print(answer);	
			
	
	}

}
