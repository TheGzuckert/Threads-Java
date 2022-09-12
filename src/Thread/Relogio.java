package Thread;

public class Relogio implements Runnable {
	
	Data data;
	
	public Relogio(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		
		
		while(true) {
			
			data.relogioSec++;
			
			if(data.relogioSec == 60) {
				data.relogioSec = 0;
				data.relogioMin++;
			}
			
			if(data.relogioMin == 60) {
				data.relogioMin = 0;
				data.relogiohora++;
			}
			
			if(data.relogiohora == 24) 
				data.relogiohora= 0;
			
			System.out.println("\n"+ data.relogiohora +":"+ data.relogioMin +":"+ data.relogioSec);
			
			
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
