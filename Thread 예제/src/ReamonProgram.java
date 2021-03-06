
public class ReamonProgram {

	public static void main(String[] args) {
		try {
		RamenCook ramenCook =new RamenCook(6);
		new Thread(ramenCook,"A").start();
		new Thread(ramenCook,"B").start();
		new Thread(ramenCook,"C").start();
		new Thread(ramenCook,"D").start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
	
	class RamenCook implements Runnable {
		
		
		private int ramenCount;
		private String[] burners = {"_","_","_","_"};
		
		public RamenCook(int count)
		{
			ramenCount =count;
		}
		
		@Override
		public void run() {
			while(ramenCount >0)
			{
				synchronized (this) {		// 한번에 한 쓰레드만 접근 가능하게 
					ramenCount--;
					System.out.println(
							Thread.currentThread().getName()+":"+ramenCount
							
							);
				}
				
				for(int i=0;i<burners.length;i++)
				{
					if(!burners[i].equals("_")) continue;	// 버너가 비어있는 것을 찾아 그 버너에 해당 쓰레드를 넣는다 .
					
					synchronized (this) {
						burners[i] = Thread.currentThread().getName();
						System.out.println(
								Thread.currentThread().getName()+":"+(i+1)+"번ON"
								
								);
						
						showBurners();
					}
					
					
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					synchronized (this) {
						burners[i]="_";
					
							
							System.out.println(
									Thread.currentThread().getName()+":"+(i+1)+"OFF"
									
									
									);
							
							showBurners();
						
						
					}
					break;
					
				}
				
				try {
					Thread.sleep(Math.round(1000 * Math.random()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
		private void showBurners() {
			String StringToPrint="";
			
			for(int i=0;i<burners.length;i++)
			{
				StringToPrint +=(" "+burners[i]);
			}

			System.out.println(StringToPrint);
		}
		
	}
	
	
	
	


