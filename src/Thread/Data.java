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
	
	//Configuração do Contador
	public int contadorSec;
	public int contadorMin;
	public int contadorhora;
	
	// Opções de Alarme / Cronometro e Relogio
	public boolean opcaoAlarme;
	public boolean opcaoTimer;
	public boolean opcaoRelogio;
	public boolean opcaoContador;

	
	public Data() {
		this.hora = 0;
		this.minuto = 0;
		this.segundos = 0;
		this.alarmHora = 0;
		this.alarmMinuto = 0;
		this.cronometroHora = 0;
		this.cronometroMin = 0;
		this.contadorhora = 0;
		this.contadorMin = 0;
		this.contadorSec = 0;
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
