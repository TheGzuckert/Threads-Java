package Thread;

public class Contador implements Runnable {
	
	Data data;
	
	public Contador(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		
		
		while(true) {
			
			data.contadorSec++;
			
			if(data.contadorSec == 60) {
				data.contadorSec = 0;
				data.contadorMin++;
			}
			
			if(data.contadorMin== 60) {
				data.contadorMin = 0;
				data.contadorhora++;
			}
			
			if(data.contadorhora== 24) 
				data.contadorhora= 0;
			
			System.out.println("\n"+ data.contadorhora +":"+ data.contadorMin +":"+ data.contadorSec);
			
			
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
