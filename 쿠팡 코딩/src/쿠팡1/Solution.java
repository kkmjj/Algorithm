package 쿠팡1;

import java.util.Arrays;

public class Solution {
	
	static int n= 6;
	static int min_postion =-10;
	static int max_position =10;
	static int [] positions = {6,-10,2,-6};
	
	 public static int[] solution(int n, int min_postion, int max_position,int[] positions) 
	 {
		 
		 
		 
		 // max에서 min을 일단 뺀다 
		 int temp = max_position -min_postion; // 전체 길이 
		 // 전체 개수에서 간격은 -1 뺀것 임으로 
		 
		 temp = temp / (n-1) ; // 간격 수가 되고 
		 // 이제 작은 수부터 차근차근 temp(간격을 더해 나간다 )
		 
		 int entire[] =new int[n];
		 for(int i=0;i<n;i++)
		 {
			 entire[i]=min_postion;
			 min_postion+=temp;
		 }
		 
		 Arrays.parallelSort(positions); 	// 배송한 지역을 오름차순으로 만들고 

		
		 
		 for(int j=0;j<positions.length;j++)
		 {for(int i=0;i<n;i++)
		 {
			 if(entire[i]==positions[j])		// 배송한 값이면 
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
