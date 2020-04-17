package 엔테크서비스UI개발1번;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int speed_limit=60;
		int[][] cameras= {{60,1},{130,2},{240,4},{432,7}};
		
		
		int answer=0;
		
	
		
		if(cameras[0][0]/cameras[0][1]>speed_limit)answer++;
		
		double start=cameras[0][0]; // 시작을 전에 끝에서 부터 
		double time=cameras[0][1];
		
		for(int i=1;i<cameras.length;i++)
		{
			
			
			
			if((cameras[i][0]-start)/(cameras[i][1]-time) > speed_limit) {
				//System.out.println((cameras[i][0]-start)/cameras[i][1]);
				answer++;
			}
			
			
			start=cameras[i][0];
			time=cameras[i][1];
			
		}
		
		
		System.out.print(answer);

	}

}
