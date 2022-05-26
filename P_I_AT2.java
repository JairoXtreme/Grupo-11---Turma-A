import java.util.Scanner;

public class P_I_AT2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		//DETRACTIO
		
		int numeroErros = 0;
		int numeroQuestoes = 0;
		
		int continuar = 0;
			do {
				if(continuar == 1) {
					numeroErros = numeroErros - numeroErros;
					continuar = 0;
				}
				
				switch(numeroQuestoes) {
					case 0:
						System.out.println("-4+x=5-2");
						
						int resposta7 = entrada.nextInt();
						
						if(resposta7 == 7) {
							numeroQuestoes ++;
						} else {
							numeroQuestoes = 0;
							numeroErros ++;
						}
						break;
					case 1:
						System.out.println("5+2-14=x-4");
						int resposta8 = entrada.nextInt();
						
						if(resposta8 == -3) {
							numeroQuestoes ++;
						} else {
							numeroQuestoes = 0;
							numeroErros ++;
						}
						break;
					case 2:
						System.out.println("x-5-77=99+21");
						int resposta9 = entrada.nextInt();
						
						if(resposta9 == 202) {
							numeroQuestoes ++;
						} else {
							numeroQuestoes = 0;
							numeroErros ++;
						}
						break;
					case 3:
						System.out.println("\"-198+x=81-200\"");
						
						int resposta10 = entrada.nextInt();
						
						if(resposta10 == 79) {
							numeroQuestoes ++;
						} else {
							numeroQuestoes = 0;
							numeroErros ++;
						}
						break;
					case 4:
						System.out.println("777-800+x=195-87");
						
						int resposta11 = entrada.nextInt();
						
						if(resposta11 == 131) {
							numeroQuestoes ++;
						} else {
							numeroQuestoes = 0;
							numeroErros ++;
						}
						break;
					case 5:
						System.out.println("x+1887-447=222+2222");
						
						int resposta12 = entrada.nextInt();
						
						if(resposta12 == 1004) {
							numeroQuestoes ++;
						} else {
							numeroQuestoes = 0;
							numeroErros ++;
						}
						break;
				}
			} while((numeroQuestoes < 6) && (numeroErros < 3));
			
			if(numeroErros == 3) {
				System.out.println("Voce perdeu, errou as três tentativas.");
				
			} else {
				System.out.println("Você derrotou Detractio");
				continuar = 2;
			}
			
			if(numeroErros == 3) {
			System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
			 continuar = entrada.nextInt();
			}
			while(continuar != 2);
			
			}
			
	}
