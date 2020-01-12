import java.util.*;

class Solution {
    class Land implements Comparable<Land> {
        int row;
        int col;
        int cost;
        public Land(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Land l) {
            if (this.cost < l.cost) {
                return -1;
            }
            else if (this.cost > l.cost) {
                return 1;
            }
            return 0;
        }
    }
    public int solution(int[][] land, int height) {
        int answer = 0;
        int N = land.length;
        boolean[][] visited = new boolean[N][N];
        Queue<Land> landNoLadder = new LinkedList<Land>();
        PriorityQueue<Land> landNeedLadder = new PriorityQueue<Land>();
        landNoLadder.offer(new Land(0, 0, 0));
        int cnt = 0;
        while (!landNoLadder.isEmpty()){
            Land curr = landNoLadder.poll();
            if (!visited[curr.row][curr.col]) {
                cnt++;
                visited[curr.row][curr.col] = true;
                answer += curr.cost;
                //check left
                int ax[]= {0,0,-1,1};
                int ay[] = {1,-1,0,0};
                
                for(int i=0;i<4;i++)
                {
                	
                	if(curr.row+ax[i] < 0 && curr.col+ay[i] <0 &&curr.row+ax[i] >land.length && curr.col+ay[i] >land[0].length )continue;
                	
                	int sub= Math.abs(land[curr.row][curr.col] - land[curr.row+ax[i]][curr.col+ay[i]]);
                	// 사다리가 필요한 경우 
                	if(height < sub )
                	{
                		landNeedLadder.add(new Land(curr.row+ax[i],curr.col+ay[i],sub));
                	}
                	else 
                	{
                		landNoLadder.add(new Land(curr.row+ax[i],curr.col+ay[i],0));
                	}
                
                	
                	
                }
                
                
                
                
            }
            if (landNoLadder.isEmpty()) {
                if (!landNeedLadder.isEmpty()) landNoLadder.offer(landNeedLadder.poll());
            }   
        }
        System.out.println(cnt);
        return answer;
    }
}