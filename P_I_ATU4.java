import java.util.Scanner;

public class P_I_ATU4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		//DIVISION
		
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
					System.out.println("10y-5(1+y)=3.(2y-2)-20");
					
					int resposta19 = entrada.nextInt();
					
					if(resposta19 == 19) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 1:
					System.out.println("18x-43=65");
					int resposta20 = entrada.nextInt();
					
					if(resposta20 == 6) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 2:
					System.out.println("23x-16x=14-17x");
					double resul21 = entrada.nextDouble();
					
					if(resul21==14/24 || resul21==7/12 || resul21==0.583 || resul21==0.58333333333){
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 3:
					System.out.println("12+7+4x=25");
					
					double resposta22 = entrada.nextDouble();
					
					if(resposta22==6/4 || resposta22==3/2 || resposta22==1.5) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 4:
					System.out.println("Converta 159 para número binário:");
					
					int resposta23 = entrada.nextInt();
					
					if(resposta23 == 10011111) {
						numeroQuestoes ++;
					} else {
						numeroQuestoes = 0;
						numeroErros ++;
					}
					break;
				case 5:
					System.out.println("Converta 256 para número binário:");
					
					int resposta24 = entrada.nextInt();
					
					if(resposta24 == 100000000) {
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
			System.out.println("Voce Venceu");
			continuar = 2;
		}
		
		if(numeroErros == 3) {
		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
		 continuar = entrada.nextInt();
		}
		
		
	}while(continuar != 2); 
		
	}

	}