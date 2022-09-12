package Thread;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Data data = new Data();

		// Instanciamos a primeira Thread Principal
		Runnable hora = new Hora(data);
		Thread thread = new Thread(hora);
		thread.start();

		boolean opcao = true;

		while (opcao == true) {
			System.out.println("Insira a opção desejada:" + "\n1 Ajustar a horario" + "\n2 Visualizar o horario"
					+ "\n3 Inicia Relogio" + "\n4 Inicar o Cronometro" + "\n5 Mostrar Cronometro"
					+ "\n6 Parar o Cronometro" + "\n7 Zera o Cronometro" + "\n8 Iniciar Alarme");

			int numeroDesejado = input.nextInt();

			switch (numeroDesejado) {

			case 1:
				System.out.println("\nInsira a Hora: ");
				data.hora = input.nextInt();
				System.out.println("\nInsira os Minutos: ");
				data.minuto = input.nextInt();
				;
				System.out.println("\nInsira a Segundos: ");
				data.segundos = input.nextInt();
				System.out.println("-----------------------------------");
				break;

			case 2:
				System.out.println("\n" + data.getHora() + ":" + data.getMinuto() + ":" + data.getMinuto());
				System.out.println("-----------------------------------");
				break;

			case 3:
				// aqui instanciamos a segunda Thread Relogio
				Runnable contador = new Relogio(data);
				Thread thread2 = new Thread(contador);
				thread2.start();
				break;

			case 4:
				// aqui instanciamos a terceira Thread Cronometro
				Runnable timer = new Cronometro(data);
				Thread thread3 = new Thread(timer);
				data.opcaoTimer = true;
				thread3.start();

				System.out.println("\n" + data.cronometroHora + ":" + data.cronometroMin + ":" + data.cronometroSec);
				System.out.println("Cronometro Iniciado");
				System.out.println("-----------------------------------");
				break;

			case 5:
				System.out.println("\n" + data.cronometroHora + ":" + data.cronometroMin + ":" + data.cronometroSec);
				System.out.println("Print do Cronometro");
				System.out.println("-----------------------------------");
				break;

			case 6:
				data.opcaoTimer = false;
				System.out.println(data.cronometroHora + ":" + data.cronometroMin + ":" + data.cronometroSec);
				System.out.println("\nCronometro Pausado");
				System.out.println("-----------------------------------");
				break;

			case 7:
				data.stopTimer();
				System.out.println("\n" + data.cronometroHora + ":" + data.cronometroMin + ":" + data.cronometroSec);
				System.out.println("Cronommetro Zerado");
				System.out.println("-----------------------------------");
				break;

			case 8:
				// Instanciada a quarta Alarme
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
