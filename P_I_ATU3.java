import java.util.Scanner;
public class P_I_ATU3 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		//TEMPORIBUS
		
		int numeroErros = 0;
		int numeroQuestoes = 0;
		
		int continuar = 0;
				
	do {
		do {
			if(continuar == 1) {
				numeroErros = numeroErros - numeroErros;
				continuar = 0;
			}
			
			switch(numeroQuestoes) {
				case 0:
					System.out.println("3x+45=2x+155");
					
					int resposta13 = entrada.nextInt();
					
					if(resposta13 == 110) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 1:
					System.out.println("x-26.5=120+33");
					int resposta14 = entrada.nextInt();
					
					if(resposta14 == 283) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 2:
					System.out.println("30.6=x+9-63");
					int resposta15 = entrada.nextInt();
					
					if(resposta15 == 234) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 3:
					System.out.println("130.3+2x=x-9");
					
					int resposta16 = entrada.nextInt();
					
					if(resposta16 == 399) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 4:
					System.out.println("Em pleno s�culo XXI, um dos problemas sociais que persistem em existir � a viol�ncia contra a mulher.\n Com a inten��o de que esse n�mero se reduza, existem v�rias campanhas registradas para\n que os casos sejam denunciados no n�mero 180. No ano de 2019, foram registradas, em m�dia, 290 den�ncias por dia.\n Isso significa que, em uma quinzena, o n�mero de den�ncias recebidas foi, em m�dia, igual a:");
					
					int resposta17 = entrada.nextInt();
					
					if(resposta17 == 4350) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 5:
					System.out.println("Em uma distribuidora de bebidas, foi recebido um pedido com 12 engradados de uma determinada bebida.\n Sabendo que em cada engradado h� 6 garrafas de 2 litros cada uma delas,\n ent�o a quantidade dessa bebida em litros presente nesse pedido � igual a:");
					
					int resposta18 = entrada.nextInt();
					
					if(resposta18 == 144) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
			}
		} while((numeroQuestoes < 6) && (numeroErros < 3));
		
		if(numeroErros == 3) {
			System.out.println("Voce perdeu, errou as tr�s tentativas.");
			
		} else {
			System.out.println("Voce Venceu");
			continuar = 2;
		}
		
		if(numeroErros == 3) {
		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) N�o");
		 continuar = entrada.nextInt();
		}
		
		
	}while(continuar != 2); 
		
	}

	}