import java.util.Scanner;
public class P_I_ATUU {

 public static void main(String[] args) {
Scanner entrada=new Scanner (System.in);
  
       //ADDITIO
 
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
     System.out.println("x = 97 + 54");
     
     int resposta1 = entrada.nextInt();
     
     if(resposta1 == 151) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 1:
     System.out.println("x = 46 + 49 + 59");
     int resposta2 = entrada.nextInt();
     
     if(resposta2 == 154) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 2:
     System.out.println("31 + 23 + 8 = x");
     int resposta3 = entrada.nextInt();
     
     if(resposta3 == 62) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 3:
     System.out.println("41 + 16 + 6 + 74 = x");
     
     int resposta4 = entrada.nextInt();
     
     if(resposta4 == 137) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 4:
     System.out.println("66 + x = 136 + 188");
     
     int resposta5 = entrada.nextInt();
     
     if(resposta5 == 258) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 5:
     System.out.println("x = 800 + 130 + 44 + 898");
     
     int resposta6 = entrada.nextInt();
     
     if(resposta6 == 1872) {
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