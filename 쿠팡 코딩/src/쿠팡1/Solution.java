package ����1;

import java.util.Arrays;

public class Solution {
	
	static int n= 6;
	static int min_postion =-10;
	static int max_position =10;
	static int [] positions = {6,-10,2,-6};
	
	 public static int[] solution(int n, int min_postion, int max_position,int[] positions) 
	 {
		 
		 
		 
		 // max���� min�� �ϴ� ���� 
		 int temp = max_position -min_postion; // ��ü ���� 
		 // ��ü �������� ������ -1 ���� ������ 
		 
		 temp = temp / (n-1) ; // ���� ���� �ǰ� 
		 // ���� ���� ������ �������� temp(������ ���� ������ )
		 
		 int entire[] =new int[n];
		 for(int i=0;i<n;i++)
		 {
			 entire[i]=min_postion;
			 min_postion+=temp;
		 }
		 
		 Arrays.parallelSort(positions); 	// ����� ������ ������������ ����� 

		
		 
		 for(int j=0;j<positions.length;j++)
		 {for(int i=0;i<n;i++)
		 {
			 if(entire[i]==positions[j])		// ����� ���̸� 
			 {
				 entire[i]=0;
				
			 }
		 }
		 }
		 
		// for(int i=0;i<n;i++)  System.out.println(entire[i]);
		 
		// System.out.println(index);
		 
		 int answer[] =new int[n-positions.length];
		 
		 int indx=0;
		 for(int i=0;i<n;i++) 
		 {
			 if(entire[i]==0)continue;
			 
			 answer[indx]=entire[i];
			 indx++;
		 }
		 
		 
		for(int i=0;i<answer.length;i++)System.out.println(answer[i]);
		 
		 
	//	 for(int i=0;i<positions.length;i++) System.out.println(positions[i]);
		 
		 
		 return answer;
		 
		 
		 
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		solution(n,min_postion, max_position,positions);

	}

}
