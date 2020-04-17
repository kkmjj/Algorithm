
public class Main {

	
	static String s="aa";
					

	
	
	public static int solution(String s) {
        int answer = 1;
        int len = s.length();
        char[] a = s.toCharArray();

        int[][] dp = new int[len][len];

        // 1. 1�ڸ�
        for (int i = 0; i < len; i++)
            dp[i][i] = 1;

        // 2. 2�ڸ�
        for (int i = 0; i < len-1; i++) {
            if( a[i] == a[i+1] ) {
                dp[i][i + 1] = 1;
                answer = 2;
            }
        }
        // 3. 3�ڸ� �̻�
        for (int k = 3; k <= len; k++) {
            for (int i = 0; i <= len-k ; i++) {
                int j = i+k-1; // k���� ��ŭ ������ index
                if( a[i] == a[j] && dp[i+1][j-1] == 1 ) { // ���ڿ��� ����, [i-1][j+1] �� �Ӹ�����̶��
                    dp[i][j] = 1;
                    answer = Math.max(answer,k);
                }
            }
        }

        return answer;
    }
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		System.out.println(solution(s));

	}

}
