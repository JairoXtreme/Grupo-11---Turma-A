import java.util.Scanner;

public class Teste_Inserção {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int pacifista=0;
		int radical=0;
		int resposta,resposta2,resposta3;
		
		//DECISÃO 1
		
System.out.println("(1) Dizer a garota que deve lutar, que mesmo sem aptidão ela deveria tentar se defender com o que sabe,\npara poder salvar a família dela, ela precisa ter força para proteger todos.");
System.out.println("(2) Dizer à garota que ela deve proteger a família ao máximo,\ncontinuar entregando comida e esconder um pouco para que ela nem os irmãos fiquem com fome.");
resposta=entrada.nextInt();
		
if (resposta==1) {
System.out.println("Você diz a garota que deve lutar, que mesmo sem aptidão ela deveria tentar se defender com o que sabe,\npara poder salvar a família dela, ela precisa ter força para proteger todos.");
radical++;
}
else {
System.out.println("Você diz à garota que ela deve proteger a família ao máximo,\ncontinuar entregando comida e esconder um pouco para que ela e nem os irmãos fiquem com fome.");
pacifista++;
}

//DECISÃO 2

System.out.println("(1)	Sentar no trono e reivindicar a cidade para si.");
System.out.println("(2)	Entregar a liderança da cidade para Kaya.");
resposta2=entrada.nextInt();

if (resposta2==1) {
	System.out.println("Você senta no trono e reivindica a cidade para si.");
	radical++;
}
else {
	System.out.println("Você emtrega a liderança da cidade para Kaya.");
	pacifista++;
}

//DECISÃO 3

System.out.println("(1) Quebrar sua guarda e finalizá-la, dizendo que ela não era justa, e reivindicar o bracelete.");
System.out.println("(2) Pedir só o bracelete de Math, e deixar a cidade com Division");
resposta3=entrada.nextInt();

if(resposta3==1) {
System.out.println("Você finaliza Division dizendo que ela não trouxe justiça,\nsó criou uma injustiça maior, você pega o bracelete para você e sai daquele lugar.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Você percebe que já tem 4 braceletes, e só precisa de mais um para poder desafiar o Invicta Math, então você parte imediatamente para a próxima cidade.\r\n"
			+ "");
radical++;
	
}
else {
System.out.println("Você pede o bracelete a Division, e diz que ela faz um bom trabalho na cidade,\ne que só precisa do bracelete para poder ajudar ela a fazer o mundo mais justo.\r\n"
			+ "\r\n"
			+ "Division confia o bracelete a você, e diz que espera grandes resultados.\r\n"
			+ "\r\n"
			+ "Você sai da-li.\r\n"
			+ "");
pacifista++;
}

//RESULTADO FINAL,ONDE É CALCULADO A PARTIR DAS PRÓPRIAS DECISÕES DO JOGADOR SE SEU FINAL SERÁ:
//PACISITA OU RADICAL

if(radical>pacifista) {
	System.out.println("FINAL RADICAL.");
}
else {
	System.out.println("FINAL PACIFISTA");
}

	}

}
