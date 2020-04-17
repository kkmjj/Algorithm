import java.util.ArrayList;

public class Main {

	   static String[][] tickets= {{"ICN","SFO"},{"ICN","ATL"},{"SFO","ATL"},{"ATL","ICN"},{"ATL","SFO"}};
	   static int visit[] =new int[10001];
	   static String v[] = new String[10001];
	   static String temp[] = new String[v.length];
	   static ArrayList<String[]> answers = new ArrayList<String[]>();
	   
	   public static void dfs(String start,String[][] tickets,int depth,ArrayList<String[]> answers) {
	      if(depth>tickets.length)
	      {
	         String[] ans= new String[depth];
	         v[0]="ICN";
	         ans[0]="ICN";
	         for(int i=1;i<depth;i++)
	         {
	            ans[i]=v[i];
	            System.out.print(v[i]+" ");
	            
	         }
	         System.out.println();
	         answers.add(ans);
	         return;
	      }
	      
	      for(int i=0;i<tickets.length;i++)
	      {
	         if(visit[i]==1)continue;
	         
	         if(start.equals(tickets[i][0]))   // 출발점이랑 같은 지점이면 티켓을 타고 들어간다.
	         {
	            visit[i]=1;
	            v[depth]=tickets[i][1];
	            dfs(tickets[i][1],tickets,depth+1,answers);
	            visit[i]=0;
	         }
	      }
	      
	   }
	    public static String[] solution(String[][] tickets) {
	          dfs("ICN",tickets,1,answers);
	         // System.out.println("---------");
	          int index=0;
	          
	          for(int i=1;i<answers.size();i++)
	          {
	             for(int j=0;j<answers.get(i).length;j++)
	             {
	                if(answers.get(index)[j].equals(answers.get(i)[j]))continue;
	                //알파벳이 같으면 다음 인덱스에서 비교 
	                
	                
	                if(answers.get(i)[j].compareTo(answers.get(index)[j]) > 0)
	                {
	            
	                   break;
	                }
	                
	                if(answers.get(i)[j].compareTo(answers.get(index)[j]) < 0)
	                {
	                   System.out.println(answers.get(index)[j] +" "+i+" "+j);
	                   index=i;
	                   break;
	                }
	                
	                
	             }
	          }
	           String[] answer= answers.get(index);
	           System.out.print("answer = ");

	           for(int i=0;i<answer.length;i++)
	           {
	              System.out.print(answer[i]+ " ");
	           }

	           return answer;
	       }
	   
	   public static void main(String[] args) {
	      
	      solution(tickets);

	   }
}
