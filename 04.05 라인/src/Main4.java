import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main4 {

    static String[][] snapshots= {{"ACCOUNT1","100"},{"ACCOUNT2","150"}};
    static String[][] transactions= {
          {"1","SAVE","ACCOUNT2","100"},
          {"2","WITHDRAW","ACCOUNT1","50"},
          {"1","SAVE","ACCOUNT2","100"},
          {"4","SAVE","ACCOUNT3","500"},
          {"3","WITHDRAW","ACCOUNT2","30"},
    
    };
    
    static int visit[] =new int[10000000];
    
    
    public static class AC {
    	String AD;
    	String money;
    	
    	public AC(String AD, String money) {
    		this.AD =AD;
    		this.money=money;
			// TODO Auto-generated constructor stub
		}
    	
    	
    	
    }
    
    
   
     public static String[][] solution(String[][] snapshots, String[][] transactions) {
        
    	
      
    	  ArrayList<AC> temp = new ArrayList<AC>();
        
           for(int i=0;i<transactions.length;i++)
           {
              
              
              int ID=Integer.parseInt(transactions[i][0]);
              
              if(visit[ID]==1)continue;
              
              visit[ID]=1;
              
              if(transactions[i][1].equals("SAVE"))
              {
            	  int v=0;
            	  
                 for(int j=0;j<snapshots.length;j++)
                 {
                    if(snapshots[j][0].equals(transactions[i][2]))   // °°Àº °èÁÂ
                    {
                       int account=Integer.parseInt(transactions[i][3])+Integer.parseInt(snapshots[j][1]);
                       snapshots[j][1]=Integer.toString(account);
                       v=1;
                    }
                 }
                 // °èÁÂ°¡ »õ·Î¿î °æ¿ì 
                 
                 if(v==0)temp.add(new AC(transactions[i][2],transactions[i][3]));
                 
                 
                 
                    
              }
              
              if(transactions[i][1].equals("WITHDRAW"))
              {
                 for(int j=0;j<snapshots.length;j++)
                 {
                    if(snapshots[j][0].equals(transactions[i][2]))   // °°Àº °èÁÂ
                    {
                       int account=Integer.parseInt(snapshots[j][1])-Integer.parseInt(transactions[i][3]);
                       snapshots[j][1]=Integer.toString(account);
                       continue;
                       
                    }
                 }
                 
                 
                 
                 
                    
              }
              
            
              
              
            
           }
           //
           
 
           for(int i=0;i<snapshots.length;i++)
           {
        	 temp.add(new AC(snapshots[i][0],snapshots[i][1]));
           }
           
         
           
           String[][] answer= new String[temp.size()][2];
           
           for(int i=0;i<temp.size();i++)
           {
        	   answer[i][0]=temp.get(i).AD;
        	   answer[i][1]=temp.get(i).money;
        	//  System.out.println(temp.get(i).money+ " "+temp.get(i).AD);
           }
           
           
          Arrays.parallelSort(answer,new Comparator<String[]>() {
        	  @Override
        	public int compare(String[] o1, String[] o2) {
        		// TODO Auto-generated method stub
        	if(o1[0].compareTo(o2[0])< 0)
        	{
        		return -1;
        	}
        	
        	return 1;
        	}
		});
  

         
          for(int i=0;i<answer.length;i++)
          {
     
       	  System.out.println(answer[i][0]+ " "+answer[i][1]);
       	  
          }
           
           
           
           
           
      
           
           
           return answer;
       }
   
   public static void main(String[] args) {
      
      solution(snapshots, transactions);

   }
}