package Thread;

public class Relogio implements Runnable {

	Data data;

	public Relogio(Data data) {
		this.data = data;
	}


	@Override
	public void run() {
		while(true) {
			
			data.segundos++;
			
			if(data.segundos == 60) {
				data.segundos = 0;
				data.minuto++;
			}
			
			if(data.minuto==60) {
				data.minuto=0;
				data.hora++;
			}
			
			if(data.hora==24) 
				data.hora=0;
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
