import java.util.Scanner;

public class Teste_Inser��o {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int pacifista=0;
		int radical=0;
		int resposta,resposta2,resposta3;
		
		//DECIS�O 1
		
System.out.println("(1) Dizer a garota que deve lutar, que mesmo sem aptid�o ela deveria tentar se defender com o que sabe,\npara poder salvar a fam�lia dela, ela precisa ter for�a para proteger todos.");
System.out.println("(2) Dizer � garota que ela deve proteger a fam�lia ao m�ximo,\ncontinuar entregando comida e esconder um pouco para que ela nem os irm�os fiquem com fome.");
resposta=entrada.nextInt();
		
if (resposta==1) {
System.out.println("Voc� diz a garota que deve lutar, que mesmo sem aptid�o ela deveria tentar se defender com o que sabe,\npara poder salvar a fam�lia dela, ela precisa ter for�a para proteger todos.");
radical++;
}
else {
System.out.println("Voc� diz � garota que ela deve proteger a fam�lia ao m�ximo,\ncontinuar entregando comida e esconder um pouco para que ela e nem os irm�os fiquem com fome.");
pacifista++;
}

//DECIS�O 2

System.out.println("(1)	Sentar no trono e reivindicar a cidade para si.");
System.out.println("(2)	Entregar a lideran�a da cidade para Kaya.");
resposta2=entrada.nextInt();

if (resposta2==1) {
	System.out.println("Voc� senta no trono e reivindica a cidade para si.");
	radical++;
}
else {
	System.out.println("Voc� emtrega a lideran�a da cidade para Kaya.");
	pacifista++;
}

//DECIS�O 3

System.out.println("(1) Quebrar sua guarda e finaliz�-la, dizendo que ela n�o era justa, e reivindicar o bracelete.");
System.out.println("(2) Pedir s� o bracelete de Math, e deixar a cidade com Division");
resposta3=entrada.nextInt();

if(resposta3==1) {
System.out.println("Voc� finaliza Division dizendo que ela n�o trouxe justi�a,\ns� criou uma injusti�a maior, voc� pega o bracelete para voc� e sai daquele lugar.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Voc� percebe que j� tem 4 braceletes, e s� precisa de mais um para poder desafiar o Invicta Math, ent�o voc� parte imediatamente para a pr�xima cidade.\r\n"
			+ "");
radical++;
	
}
else {
System.out.println("Voc� pede o bracelete a Division, e diz que ela faz um bom trabalho na cidade,\ne que s� precisa do bracelete para poder ajudar ela a fazer o mundo mais justo.\r\n"
			+ "\r\n"
			+ "Division confia o bracelete a voc�, e diz que espera grandes resultados.\r\n"
			+ "\r\n"
			+ "Voc� sai da-li.\r\n"
			+ "");
pacifista++;
}

//RESULTADO FINAL,ONDE � CALCULADO A PARTIR DAS PR�PRIAS DECIS�ES DO JOGADOR SE SEU FINAL SER�:
//PACISITA OU RADICAL

if(radical>pacifista) {
	System.out.println("FINAL RADICAL.");
}
else {
	System.out.println("FINAL PACIFISTA");
}

	}

}
