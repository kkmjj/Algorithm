import java.util.Arrays;

public class Main {

	
	static int[][] routes = {{-20,15},{-15,5},{-18,-13},{-5,-3}};
	
	public  static int solution(int[][] routes) {
		 int answer = 1;
	     	
		 	Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
		 	//젤 빨리 도착하는 애를 기준으로 잡고 
		 	
		 	int end=routes[0][1]; // 도착한 애의 도착보다 나중에 출발한거면 추가 		 
		 
		 	for(int i=1;i<routes.length;i++)	//도착이 항상 다음 인덱스 가 늦기 때문에 중간으로 들어갈일은 없음
		 	{
		 		if(end < routes[i][0])
		 		{
		 			answer++;
		 			end=routes[i][1];
		 			
		 		}
		 		
		 		System.out.println(routes[i][0]+" "+routes[i][1]);
		 	}
		 	
		 
	        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(routes));
	}

}
