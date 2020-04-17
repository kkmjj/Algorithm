import java.util.Arrays;

//level 3 저울 문제 



public class Main {

	static int[] weight= {3,1,6,2,7,30,1};

	
	public static int solution(int[] weight)
	{ 
		Arrays.sort(weight); 
		if(weight[0]!=1) return 1; 
		int[] sum = new int[weight.length]; 
		int tmpsum = 0; 
		for(int i=0;i<weight.length;i++) 
		{ 
			tmpsum+=weight[i]; 
			sum[i]=tmpsum; 
			if(i<weight.length-1 && sum[i]+1<weight[i+1]) {
				return sum[i]+1; 
				} 
			} 
		return sum[sum.length-1]+1; 
		
	}


	
	public static void main(String[] args) {
		solution(weight);
	}

}
