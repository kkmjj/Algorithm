//가장큰 정사각형 

public class Main02 {
	
	static int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
	
	
	
	
	
	
	
	
	 public int solution(int [][]board)
	    {
		    int answer=0;
		  	if (board.length < 2 || board[0].length < 2)
			{

				for (int j = 0; j < board.length; j++)
				{
					for (int i = 0; i <board[0].length; i++)
					{
						if (board[j][i] == 1) answer = 1;
					}
				}
			}
			else
			{
				
				for (int j = 1; j < board.length; j++)
				{
					for (int i = 1; i < board[0].length; i++)
					{
						if (board[j][i] == 1)
						{
						board[j][i] = Math.min(board[j - 1][i - 1], Math.min(board[j][i - 1], board[j - 1][i])) + 1;
							answer = Math.max(board[j][i], answer);
						}
					}
				}
			}
			answer = (int)Math.pow(answer, 2);
		  return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
