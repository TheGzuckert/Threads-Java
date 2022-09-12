package Thread;

public class Alarme implements Runnable {

	Data data;

	public Alarme(Data data) {
		this.data = data;
	}

	@Override
	public void run() {

		while (true) {
			if (data.alarmHora == data.alarmMinuto) {
				System.out.println("-----------------------------------");
				System.out.println("-----------------------------------");
				System.out.println("ACORDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				System.out.println("-----------------------------------");
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
