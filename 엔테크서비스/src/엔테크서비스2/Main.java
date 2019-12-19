package 엔테크서비스2;

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
				list.add(temp%10); // 나머지를 list에 저장
				temp=temp/10;
			}
		System.out.println(list);
			
		int answer=0;
			
		for(int i=0;i<list.size();i++)
		{
				if(N%list.get(i)==0)answer++; // list.get으로 값을 불러옴 
		
		}
		
		
			System.out.print(answer);	
			
	
	}

}
