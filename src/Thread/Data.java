package Thread;

public class Data {
	
	public int hora;
	public int minuto;
	public int segundos;
	
	// Configuração do cronometro
	public int cronometroHora;
	public int cronometroMin;
	public int cronometroSec;
	
	// Configuração do alarme
	public int alarmHora;
	public int alarmMinuto;
	
	//Configuração do relogio
	public int relogioSec; 
	public int relogioMin;
	public int relogiohora;
	
	//Opção de alarme podendo ser ligado e desligado
	public boolean opcaoTimer;

	
	public Data() {
		this.alarmHora = 0;
		this.alarmMinuto = 0;
		this.cronometroHora = 0;
		this.cronometroMin = 0;
		this.relogiohora = 0;
		this.relogioMin = 0;
		this.relogioSec = 0;
	}
	
	
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundos;
	}
	
	public void stopTimer () {
		cronometroHora = 0;
		cronometroMin = 0;
		cronometroSec = 0;
	}
	
}
