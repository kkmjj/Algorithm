package 엔테크5번;
import java.util.*;
public class Main {



	//int n, int m, int[] x_axis, int[] y_axis
	public static void main(String[] args) {
				 int n=3;
				 int m=4;
				int[] x_axis= {2};
				int[] y_axis= {1,2};
						
					
		
		
		int x_start =x_axis[0];
		int x_end = n -x_axis[x_axis.length-1];
		
		int x=x_start < x_end ? x_end :x_start;
		
		for(int i=1;i<x_axis.length;i++)
		{
			if(x <x_axis[i]-x_axis[i-1])
			{
				x=x_axis[i]-x_axis[i-1];
			}
		}
		
		//System.out.print(x);
		
		
		
		int y_start =y_axis[0];
		int y_end = m -y_axis[y_axis.length-1];
		
		int y=y_start < y_end ? y_end :y_start;
		
		for(int i=1;i<y_axis.length;i++)
		{
			if(y <y_axis[i]-y_axis[i-1])
			{
				y=y_axis[i]-y_axis[i-1];
			}
		}
		
		System.out.print(x*y);
		
		

	}

}
