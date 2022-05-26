import java.util.Scanner;

public class P_I_ATU5 {

 public static void main(String[] args) {
  Scanner entrada=new Scanner(System.in);
  
  //POTENTIA
  
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
     System.out.println("5^2-21+x=8^4-54");
     
     int resposta25 = entrada.nextInt();
     
     if(resposta25 == 4088) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 1:
     System.out.println("3^4+20=70+30+x");
     int resposta26 = entrada.nextInt();
     
     if(resposta26 == 1) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 2:
     System.out.println("6^2(2x-3x)+8=4^2+7^4-85");
     double resul27 = entrada.nextDouble();
     
     if(resul27==13){
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 3:
     System.out.println("4^3.2^0.2^3^2 / 8^4.2^4");
     
     double resposta28 = entrada.nextDouble();
     
     if(resposta28==1/2 || resposta28==0.5) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 4:
     System.out.println("Converta 10101 (binário) para sistema decimal:");
     
     int resposta29 = entrada.nextInt();
     
     if(resposta29 == 21) {
      numeroQuestoes ++;
     } else {
      numeroQuestoes = 0;
      numeroErros ++;
     }
     break;
    case 5:
     System.out.println("Converta 20971 (binário) para sistema decimal:");
     
     int resposta30 = entrada.nextInt();
     
     if(resposta30== 20000) {
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