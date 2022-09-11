package Thread;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Data data = new Data();
		
		Runnable relogio = new Relogio(data);
		Thread thread = new Thread(relogio);
		thread.start();
		
		
		boolean opcao = true;
		
		while (opcao == true) {
			System.out.println(
					"Insira a opção desejada:"  
					+ "\n1 Ajustar a hora"
					+ "\n2 Visualizar a hora" 
					+ "\n3 Inicia relogio"
					+ "\n4 Inicar o Timer"
					+ "\n5 Mostrar Timer"
					+ "\n6 Parar o Timer" 
					+ "\n7 Zera o Alarme" 
					+ "\n8 Iniciar Alarme");
			
			int numeroDesejado = input.nextInt();
			
			switch (numeroDesejado) {
			
			case 1 :				
				System.out.println("\nInsira a Hora: ");
				data.hora = input.nextInt();
				System.out.println("\nInsira os Minutos: ");
				data.minuto = input.nextInt();
;				System.out.println("\nInsira a Segundos: ");
				data.segundos = input.nextInt();
				System.out.println("-----------------------------------");
				break;
				
			case 2 :
				System.out.println("\n"+ data.getHora() +":"+ data.getMinuto() +":"+ data.getMinuto());
				System.out.println("-----------------------------------");
				break;
				
			case 3:
				//aqui instanciamos a segunda Thread
				Runnable contador = new Contador(data);
				Thread thread2 = new Thread(contador);
				thread2.start();
				
				System.out.println("Teste do contador");
				break;
				
			case 4:
				//aqui instanciamos a terceira Thread
				Runnable timer = new Timer(data);
				Thread thread3 = new Thread(timer);
				data.opcaoTimer = true;
				thread3.start();
				
				System.out.println("Timer Iniciado");
				System.out.println("-----------------------------------");
				
				break;
				
			case 5:
				System.out.println("\n"+ data.cronometroHora +":"+ data.cronometroMin +":"+ data.cronometroSec);
				System.out.println("Print do Timer");
				System.out.println("-----------------------------------");
				break;
				
			case 6:
				data.opcaoTimer = false;
				System.out.println("\n"+ data.cronometroHora +":"+ data.cronometroMin +":"+ data.cronometroSec);
				System.out.println("-----------------------------------");
				break;
				
			case 7:
				data.stopTimer();
				System.out.println("\n"+ data.cronometroHora +":"+ data.cronometroMin +":"+ data.cronometroSec);
				System.out.println("Timer Zerado");
				System.out.println("-----------------------------------");
				break;
	
			case 8 :
				//Instanciada a quarta Thread
				System.out.println("\nDefina as Horas:");
				data.alarmHora = input.nextInt();
				System.out.println("\nDefina os Minutos:");
				data.alarmMinuto = input.nextInt();
				System.out.println("\n");
				Runnable alarme = new Alarme(data);
				Thread thread4 = new Thread(alarme);
				thread4.start();
				break;
			
			}

		}

	}

}
