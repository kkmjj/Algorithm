import java.util.Arrays;

public class Main {

	
	static int[][] routes = {{-20,15},{-15,5},{-18,-13},{-5,-3}};
	
	public  static int solution(int[][] routes) {
		 int answer = 1;
	     	
		 	Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
		 	//�� ���� �����ϴ� �ָ� �������� ��� 
		 	
		 	int end=routes[0][1]; // ������ ���� �������� ���߿� ����ѰŸ� �߰� 		 
		 
		 	for(int i=1;i<routes.length;i++)	//������ �׻� ���� �ε��� �� �ʱ� ������ �߰����� ������ ����
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
