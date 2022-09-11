package Thread;

public class Alarme implements Runnable {

	Data data;

	public Alarme(Data data) {
		this.data = data;
	}

	@Override
	public void run() {

		// aqui defini uma condição em que caso seja igual a 20:20 ele ira avisar o
		// usuario

		while (true) {
			if (data.alarmHora == data.alarmMinuto) {
				System.out.println("-----------------------------------");
				System.out.println("ACORDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				System.out.println("-----------------------------------");
				break;

			}

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
