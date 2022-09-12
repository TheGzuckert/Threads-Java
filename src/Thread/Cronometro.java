package Thread;

import java.util.Iterator;

public class Cronometro implements Runnable {
//vai ficar por ultimo

	Data data;

	public Cronometro(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		while (data.opcaoTimer) {

			data.cronometroSec++;

			if (data.cronometroSec == 60) {
				data.cronometroHora = 0;
				data.cronometroHora++;
			}

			if (data.cronometroMin == 60) {
				data.cronometroMin = 0;
				data.cronometroHora++;
			}

			if (data.cronometroHora == 24)
				data.cronometroHora = 0;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
