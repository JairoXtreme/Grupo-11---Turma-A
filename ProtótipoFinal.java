import java.util.Scanner;

public class Prot�tipoFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha;
		int loading = 0;
		boolean exit = true;
		
		//variavel de decis�o
		int pacifista=0;
		int radical=0;
		int deci1,deci2,deci3;

		
		do {
			System.err.println("    MENU");
			System.out.println("\n 1- Tutorial" + "\n 2- Jogo" + "\n 3- Cr�ditos" + "\n 4- Sair");
			escolha = entrada.nextInt();
			
			if (escolha == 1) {
				System.out.println("Voc� se encontra num mundo de aventura,\nonde tudo se d� atrav�s da matem�tica, por�m, o poder est� em m�os malignas,\nseu povo sofre opress�o e principalmente voc�, humilhado por todos,\nprecisa provar que � diferente superando os desafios que se encontram em sua frente,\nalmejando o titulo de INVICTA MATH.");// n�o criei comando de tutorial ainda...
			}
			
			if (escolha == 2) {
				System.err.println("   INVICTA MATH");
				System.out.println("O mundo de Dunya � cheio de injusti�as.\r\n"
						+ "Os melhores est�o no topo.\r\n"
						+ "Aqueles que n�o podem competir se calam.\r\n"
						+ "Quem sabe os segredos do mundo?\r\n"
						+ "Quem chegar� no topo?\r\n"
						+ "Ele mudar� o mundo, ou ele continuar� no mesmo?\r\n"
						+ "");
				loading = 1;
				exit = false;
			}
			
			if (escolha == 3) {
				System.out.println("Heloisa Hodnik \nIvan Dieckmann \nJairo Santos \nKaick Fontes");
			}			
			
			if (escolha == 4) {
				exit = false;
				System.out.println("ate mais");
			}
			
				}while (exit);
		
		
		  //ADDITIO
	  
      if(loading == 1) {
				int numeroErros = 0;
				int numeroQuestoes = 0;
				int continuar = 0; 
				
				//colocar a primeira parte da historia aqui
				
				System.out.println("Voc� se encontra na cidade em que nasceu, o dia t�o esperado, o dia em que voc� finalmente receber� a sua Aptid�o.\r\n"
						+ "\r\n"
						+ "Aptid�o � a habilidade que toda crian�a recebe ao chegar em certa idade, alguns t�m aptid�es mais avan�adas que outros, a aptid�o define qual habilidade � o seu ponto forte,\ne aquilo que voc� usar� para se defender e melhorar a sociedade em geral, e nesse mundo alguns s�o taxados de sem aptid�o, nas quais s�o desprezados pela sociedade, tratados como exclu�dos.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Os sem aptid�o s�o as pessoas que n�o tem a capacidade de melhorar essas habilidades, que elas n�o tem nenhum ponto forte,\nlogo elas sempre ser�o mais fracas que aqueles que t�m aptid�o.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "A aptid�o pode ser usada tanto para melhorar a sociedade com avan�os tecnol�gicos e cient�ficos quanto para a autodefesa em geral.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Quando se est� em combate voc� deve usar sua aptid�o para sentir a defesa do inimigo que se baseia em uma das Operatios, (Operatio s�o opera��es matem�ticas) entendendo essa Operatio e resolvendo ela voc� cria uma abertura no inimigo para poder atac�-lo.\r\n"
						+ "\r\n"
						+ "Os sem aptid�o n�o tem Operatio, logo eles n�o tem defesa.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Voc�, fora de sua casa, encontra seu amigo, que est� extremamente ansioso para receber sua aptid�o.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Ao chegarem na igreja alguns cl�rigos o recebem, voc� deixa seu amigo ir primeiro, que j� recebe a aptid�o de Pot-Encia.\r\n"
						+ "\r\n"
						+ "As aptid�es s�o separadas em 5 n�veis:\r\n"
						+ "Ad-I��o.\r\n"
						+ "Subt-Rac�o.\r\n"
						+ "Mult-Iplica��o.\r\n"
						+ "Div-Is�o.\r\n"
						+ "Pot-Encia.\r\n"
						+ "\r\n"
						+ "Sendo da mais baixa at� a mais forte nessa ordem.\r\n"
						+ "\r\n"
						+ "O seu amigo ficou muito feliz com o que recebeu, logo chega a sua vez.\r\n"
						+ "\r\n"
						+ "Voc� acaba por receber o s�mbolo de sem aptid�o.\r\n"
						+ "Os cl�rigos o mandam embora e ficam com o seu amigo ali para mostrar o que ele pode fazer.\r\n"
						+ "\r\n"
						+ "Voc� n�o teve nem chance de dizer nada e decide retornar para sua casa.\r\n"
						+ "No outro dia voc� decide ir at� os campos de plantio mais pr�ximo para conseguir comida, mas no caminho acaba sendo importunado por alguns homens que descobriram que ele era sem aptid�o.\r\n"
						+ "Essas pessoas atacam voc� de forma brutal\r\n"
						+ "Ali pr�ximo voc� v� seu amigo passando, voc� implora por ajuda, mas seu amigo finge que nem o conhecia.\r\n"
						+ "Ap�s um tempo o grupo para de bater em voc� e o deixam ali jogado no ch�o desmaiado.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Voc� acorda depois de um tempo em uma cama, com suas feridas tratadas\r\n"
						+ "Uma garota entra no lugar e conversa com voc�.\r\n"
						+ "Ela diz que viu voc� no ch�o todo machucado e que o levou at� a casa dela para te tratar\r\n"
						+ "Diz tamb�m que � como voc� sem aptid�o e que aquele grupo de bandidos sempre v�em a casa dela e exigem comida, e amea�am ela e a fam�lia.\r\n"
						+ "Sem ter o que fazer ela � obrigada a entregar a �nica comida que consegue em dias para alimentar todos.\r\n"
						+ "�s vezes fica sem comer para que seus irm�os mais novos possam comer.\r\n"
						+ "\r\n"
						+ "Ao refletir sobre aquilo voc� sente uma dor no peito e decide fazer algo pra mudar essa situa��o.\r\n"
						+ "");
				System.out.println("(1) Dizer a garota que deve lutar, que mesmo sem aptid�o ela deveria tentar se defender com o que sabe,\npara poder salvar a fam�lia dela, ela precisa ter for�a para proteger todos.");
				System.out.println("(2) Dizer � garota que ela deve proteger a fam�lia ao m�ximo,\ncontinuar entregando comida e esconder um pouco para que ela nem os irm�os fiquem com fome.");
				deci1=entrada.nextInt();
						
				if (deci1==1) {
				System.out.println("Voc� diz a garota que deve lutar, que mesmo sem aptid�o ela deveria tentar se defender com o que sabe,\npara poder salvar a fam�lia dela, ela precisa ter for�a para proteger todos.");
				radical++;
				System.out.println(" ");
				}
				else {
				System.out.println("Voc� diz � garota que ela deve proteger a fam�lia ao m�ximo,\ncontinuar entregando comida e esconder um pouco para que ela e nem os irm�os fiquem com fome.");
				pacifista++;
				}

				//LINHA P�S DECIS�O
				        System.out.println("A garota agradece as palavras.\nVoc� decide ir embora e come�ar uma jornada em busca da justi�a.");
						System.out.println("Cap�tulo 1\r\n"
								+ "Addittio\r\n"
								+ "\r\n"
								+ "Voc� decide ir para a cidade mais pr�xima em busca de melhorar sua aptid�o.\r\n"
								+ "No caminho voc� encontra um pequeno grupo de pessoas com vestimentas com o s�mbolo de Ad-I��o, eles est�o atacando um senhor.\r\n"
								+ "Voc� decide tentar atac�-los, por�m voc� � incapaz de entender os Operatios deles.\r\n"
								+ "\r\n"
								+ "X = ???????\r\n"
								+ "\r\n"
								+ "Pensando em um plano diferente voc� chama a aten��o do grupo com xingamentos e r�tulos, o grupo foca em voc� e come�a a correr atr�s de ti, antes de correr voc� diz pro senhor fugir, ele segue sua ordem e corre.\r\n"
								+ "O grupo n�o se importa mais com o homem e vai atr�s de voc�.\r\n"
								+ "\r\n"
								+ "Depois de um bom tempo de corrida voc� consegue despist�-los.\r\n"
								+ "\r\n"
								+ "Logo em seguida uma garota te encontra e diz que viu tudo o que aconteceu.\r\n"
								+ "Voc� tenta disfar�ar, mas ela logo afirma que voc� � sem aptid�o, afirmando que se arriscar para salvar a vida de algu�m n�o � um costume de quem tem uma Aptid�o, e muito menos fugir de um combate daquele jeito.\r\n"
								+ "Voc� n�o consegue mais negar e ent�o pergunta o que ela quer.\r\n"
								+ "A garota diz que conhece outros como voc� e que pode te ajudar a se livrar desse grupo de pessoas que perseguem e humilham os outros.\r\n"
								+ "Voc� pergunta quem s�o eles e porqu� das roupas com s�mbolos.\r\n"
								+ "A garota diz que se voc� quiser descobrir ter� que ir com ela.\r\n"
								+ "Sem muito o que fazer voc� decide seguir a garota.\r\n"
								+ "No caminho ela explica tudo, diz que aqueles s�o seguidores de Addittio, o Math da Ad-I��o.\r\n"
								+ "Os Maths s�o um grupo de pessoas que t�m o melhor desempenho com cada um dos 5 n�veis de Aptid�es, e que Addittio � o primeiro.\r\n"
								+ "As pessoas com o s�mbolo s�o seguidores de Addittio, pessoas com aptid�o de Ad-I��o mas que seguem ordens do Math ao inv�s de tentar roubar a posi��o dele.\r\n"
								+ "Ela diz tamb�m que Addittio � um l�der terr�vel, ele faz a gesta��o da cidade mas n�o contribui em nada,\ns� festeja com os outros nobres e o cl�rigo da cidade, utilizando os recursos que ele usurpa da popula��o.\r\n"
								+ "A garota diz que se chama Kaya, e que montou uma resist�ncia contra o Addittio pra tentar derrub�-lo do poder,\nmas infelizmente a resist�ncia � composta por pessoas sem aptid�o, e que os poucos com aptid�o n�o s�o fortes o bastante para enfrentar Addittio.\r\n"
								+ "Ao chegar no lugar, uma casa com cara de abandonada, mas com um por�o secreto que leva a um enorme c�modo com v�rias pessoas.\r\n"
								+ "A garota diz que � ali que eles levam os membros da resist�ncia, que normalmente s�o pessoas ca�adas por Addittio por conta de algum feito que n�o o agradou.\r\n"
								+ "Chegando l� voc� decide conversar com as pessoas para entender a situa��o melhor.\r\n"
								+ "Depois de falar com elas, voc� entende que a garota � a l�der da resist�ncia, e que o pai dela era o antigo l�der da cidade, mas Addittio o matou na frente de todos, e estabeleceu sua lideran�a tirana por ali.\r\n"
								+ "Voc� encontra o senhor que estava sendo atacado pelo grupo mais cedo.\r\n"
								+ "O senhor agradece muito voc�, dizendo que gra�as a ti ele poder viver mais um dia com suas filhas, que a m�e delas foi executada por Addittio a muito tempo,\ne desde ent�o ele vive sendo cobrado pelos soldados como forma de pagamento pelos crimes da mulher,\nmas que ele n�o tinha recursos suficientes e seria executado tamb�m, ent�o ele fugiu e encontrou Kaya que vem protegendo ele desde ent�o.\r\n"
								+ "Disse que s� saiu para ir buscar uma boneca de pano que sua filha tinha deixado na antiga casa,\nmas chegando l� encontrou os seguidores e eles ent�o atacaram o senhor at� que voc� apareceu.\r\n"
								+ "\r\n"
								+ "Voc� pergunta a ele qual crime a falecida esposa dele cometeu.\r\n"
								+ "Ele responde que para Addittio tudo que n�o agrada ele � um crime, que sua esposa simplesmente n�o aceitou se tornar parte de suas escravas pessoais, ent�o ele a executou.\r\n"
								+ "\r\n"
								+ "Voc� agradece pela informa��o que o senhor deu, e diz que vai tirar ele daquela situa��o a qualquer custo.\r\n"
								+ "\r\n"
								+ "Voc� vai atr�s de Kaya e pede para que ela te treine.\r\n"
								+ "Ela diz que sem aptid�es n�o s�o capazes de entender as Operatios, que � in�til e que nada mudaria.\r\n"
								+ "Voc� retruca dizendo que ficar do jeito que est� tamb�m n�o vai mudar nada, e que ela n�o perder� nada tentando ajud�-lo.\r\n"
								+ "Mesmo receosa, Kaya decide ajud�-lo.\r\n"
								+ "Ela diz que ela se concentra muito na hora de entender as Operatios, que n�o tem o mesmo potencial que Addittio mas sabe usar sua Operatio bem.\r\n"
								+ "Ela te ensina que cada pessoa tem uma Operatio, que o n�vel de habilidade da pessoa determina qual vai ser a sua Operatio.\r\n"
								+ "Ela pede que voc� se sente e tente ver a Operatio dela.\r\n"
								+ "Ao se concentrar voc� consegue ver a Operatio de Kaya, por�m n�o por completa\r\n"
								+ "\r\n"
								+ "X = 1 + ?\r\n"
								+ "\r\n"
								+ "Kaya diz que � um progresso para quem n�o conseguia ver nada, mas que o real problema � a resolu��o,\nprimeiro � necess�rio entender a Operatio, e para criar uma abertura de ataque � necess�rio reolver a Operatio.\r\n"
								+ "Ela diz que no caso se Addittio ser� necess�rio resolver mais de uma Operatio para poder derrot�-lo.\r\n"
								+ "Voc� continua treinando sem parar, Kaya se impressiona pois os sem aptid�o sempre desistem, mas voc� � diferente.\r\n"
								+ "\r\n"
								+ "Depois de muito se concentrar voc� consegue entender a Operatio dela.\r\n"
								+ "\r\n"
								+ "X = 1 + 2\r\n"
								+ "\r\n"
								+ "Kaya se impressiona com seu desempenho r�pido, e diz se voc� consegue resolver,\npor�m ela n�o consegue terminar a frase pois sente o impacto de ter sua Operatio resolvida.\r\n"
								+ "\r\n"
								+ "Kaya fica em choque, pois sua guarda foi quebrada em um instante, ela questiona se voc� realmente � um sem aptid�o e tenta ler a sua Operatio,\nao se concentrar ela percebe que voc� n�o tem Operatio, logo confirma que voc� � um sem aptid�o.\r\n"
								+ "\r\n"
								+ "Kaya, ainda se perguntando como isso aconteceu te diz que quando uma defesa � quebrada leva um tempo para recuper�-la,\nmas que tudo depende das a��es da pessoa, se ela est� em combate ela n�o tem tempo para descansar, logo � imposs�vel recuperar sua guarda,\ndando total vantagem e possibilidade de ataque para o inimigo.\r\n"
								+ "Ela diz que como n�o est�o em um combate real ela consegue montar uma nova Operatio em alguns segundos, que ela n�o vai ser igual a anterior mas os par�metros ser�o os mesmos.\r\n"
								+ "\r\n"
								+ "Voc� tenta ler a nova Operatio de Kaya. Com mais facilidade voc� consegue sem muito esfor�o.\r\n"
								+ "\r\n"
								+ "X = 1 +1\r\n"
								+ "\r\n"
								+ "Kaya sente automaticamente sua defesa se quebrando de novo.\r\n"
								+ "\r\n"
								+ "Kaya n�o compreende a situa��o e pergunta como fez isso.\r\n"
								+ "\r\n"
								+ "Voc� diz a ela que a guarda dela � muito simples de se resolver.\r\n"
								+ "\r\n"
								+ "Kaya diz que isso � muito rude da sua parte, e afirma que os seguidores de Addittio tem dificuldade em resolver a sua Operatio, e que voc� resolveu ela em um instante.\r\n"
								+ "\r\n"
								+ "Kaya, mesmo perplexa, sente que uma luz de esperan�a pode vir a brilhar.\r\n"
								+ "\r\n"
								+ "Voc� e Kaya decidem treinar por mais tempo para melhorar sua concentra��o.\r\n"
								+ "");
						System.out.println("Cansados, voc� e Kaya decidem terminar por hoje.\r\n"
								+ "Kaya diz que voc� pode salvar a cidade, que voc� � o mais apto a derrotar Addittio e que ela nunca conheceu um sem aptid�o capaz de resolver Operatios,\ne principalmente na velocidade que voc� resolve.\r\n"
								+ "Voc�s decidem ir dormir e planejar o que fazer amanh�.\r\n"
								+ "");
						System.out.println("No outro dia, voc� � acordado pelos gritos de desespero das pessoas no lugar.\r\n"
								+ "Voc� se pergunta o porqu� do alarde, mas antes que possa questionar algu�m, voc� de longe v� uma das duas filhas do senhor que voc� salvou chorando sem parar.\r\n"
								+ "Voc� procura Kaya, e v� ela com uma express�o de medo e desespero.\r\n"
								+ "Voc� pergunta a ela o que aconteceu.\r\n"
								+ "Ela diz que o senhor saiu novamente para pegar a boneca das filhas, e acabou sendo emboscado pelos seguidores de Addittio, eles levaram ele e a das filhas, a outra conseguiu fugir.\r\n"
								+ "Al�m disso Kaya disse que eles pegaram a irm� da garota primeiro e que amea�aram matar a menina se ele n�o falasse onde estava se escondendo,\ne ele teve que contar onde fica o esconderijo da resist�ncia, e foi levado para ser executado, ele e a crian�a.\r\n"
								+ "\r\n"
								+ "Voc� se enche de �dio e sai do lugar.\r\n"
								+ "Kaya pergunta aonde voc� vai, e voc� responde a ela que vai trazer justi�a.\r\n"
								+ "\r\n"
								+ "Ao sair voc� v� 3 seguidores de Addittio vindo na dire��o do lugar.\r\n"
								+ "");
						System.out.println("Voc� derrotou todos os soldados com golpes n�o letais.");
						System.out.println("Voc� segue para o pal�cio de Addittio sem olhar para tr�s.\r\n"
								+ "\r\n"
								+ "Chegando l� voc� avista o senhor e a sua filha presos ao lado do trono.\r\n"
								+ "Additiio est� sentado nele.\r\n"
								+ "\r\n"
								+ "Addittio est� com um olhar s�rio, ele s� diz a seguinte frase:\r\n"
								+ "\r\n"
								+ "\r\n"
								+ " Matem o sem aptid�o.\r\n"
								+ "\r\n"
								+ "Voc� tinha pego o manto de um dos seguidores, e ent�o voc� o solta na frente de Addittio.\r\n"
								+ "Addittio fica perplexo e diz:\r\n"
								+ "\r\n"
								+ "Como?\r\n"
								+ "\r\n"
								+ "Addittio levanta do seu trono e vai em sua dire��o,\ndizendo que sendo um sem aptid�o � imposs�vel desviar dos ataques.\r\n"
								+ "");
						System.out.println("CHEFE ADDITIO, DERROTE-O!");
			do {
				do {
					if(continuar == 1) {
						numeroErros = numeroErros - numeroErros;
						continuar = 0;
					}
					
					switch(numeroQuestoes) {
						case 0:
							System.out.println("\nx = 97 + 54");
							
							int resposta1 = entrada.nextInt();
							
							if(resposta1 == 151) {
								numeroQuestoes ++;
								System.out.println("Voc� quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Voc� errou e foi atacado!");
							}
							break;
						case 1:
							System.out.println("x = 46 + 49 + 59");
							int resposta2 = entrada.nextInt();
							
							if(resposta2 == 154) {
								numeroQuestoes ++;
								System.out.println("Voc� quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Voc� errou e foi atacado!");
							}
							break;
						case 2:
							System.out.println("31 + 23 + 8 = x");
							int resposta3 = entrada.nextInt();
							
							if(resposta3 == 62) {
								numeroQuestoes ++;
								System.out.println("Voc� quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Voc� errou e foi atacado!");
							}
							break;
						case 3:
							System.out.println("41 + 16 + 6 + 74 = x");
							
							int resposta4 = entrada.nextInt();
							
							if(resposta4 == 137) {
								numeroQuestoes ++;
								System.out.println("Voc� quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Voc� errou e foi atacado!");
							}
							break;
						case 4:
							System.out.println("66 + x = 136 + 188");
							
							int resposta5 = entrada.nextInt();
							
							if(resposta5 == 258) {
								numeroQuestoes ++;
								System.out.println("Voc� quebrou a guarda de Additio e o atacou, hora do golpe final!");

							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Voc� errou e foi atacado!");

							}
							break;
						case 5:
							System.out.println("x = 800 + 130 + 44 + 898");
							
							int resposta6 = entrada.nextInt();
							
							if(resposta6 == 1872) {
								numeroQuestoes ++;
								System.out.println("Voc� quebrou a guarda de Additio e deu o golpe final!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Voc� errou e foi atacado!");
							}
							break;
					}
				} while((numeroQuestoes < 6) && (numeroErros < 3));
				
				if(numeroErros == 3) {
					System.out.println("Voce perdeu, errou as tr�s tentativas.");
					
				} else {
					System.out.println("Parab�ns, voc� o derrotou com �xito!");
					continuar = 2;
					loading++;
				}
				
				if(numeroErros == 3) {
				System.out.println("\nDeseja continuar: " + "1) Sim " + "2) N�o");
				 continuar = entrada.nextInt();
				}
				
				
			}while(continuar != 2); 
			
      }//fim, chave da primera fase...	
    
      
      //DETRACTIO
      if (loading == 2) {
    		
   
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		int continuar = 0;
  		
  		System.out.println("Addittio cai para tr�s se perguntando como.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� pega a l�mina que ele estava empunhando e enfia ela no peito de Addittio.\r\n"
  				+ "\r\n"
  				+ "Voce diz: A justi�a prevalecer�.\r\n"
  				+ "\r\n"
  				+ "Voc� v� que no pulso de Additio tem um bracele dourado com algumas escritas\r\n"
  				+ "\r\n"
  				+ "\" Math +\"\r\n"
  				+ "\r\n"
  				+ "Voc� entende que aquilo � o que mostra que voc� � um Math, e ent�o voc� decide us�-la\r\n"
  				+ "\r\n"
  				+ "Voc� reivindicou seu primeiro bracelete de Math\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Se tornou o Math de Ad-I��o.\r\n"
  				+ "\r\n"
  				+ "Kaya chega acompanhada de outros membros da resist�ncia e v�em que voc� finalizou Addittio.\r\n"
  				+ "Os membros v�o soltar o senhor a sua filha, enquanto Kaya vai em sua dire��o.\r\n"
  				+ "\r\n"
  				+ "Kaya n�o consegue falar direito, a s� diz algumas palavras soltas:\r\n"
  				+ "\r\n"
  				+ "Voc�como�sem aptid�o�\r\n"
  				+ "\r\n"
  				+ "Voc� diz que foi f�cil, e que faria tudo para poder trazer a justi�a.\r\n"
  				+ "\r\n"
  				+ "Kaya te abra�a, e come�a a agradecer por ter salvo a cidade, que nunca teria imaginado algo assim.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que infelizmente n�o pode fazer Addittio pagar pelo que fez.\r\n"
  				+ "\r\n"
  				+ "Ela diz que ele era um monstro, e que merecia isso.\r\n"
  				+ "");
  		System.out.println("(1)	Sentar no trono e reivindicar a cidade para si.");
  		System.out.println("(2)	Entregar a lideran�a da cidade para Kaya.");
  		deci2=entrada.nextInt();

  		if (deci2==1) {
  			System.err.println("Voc� senta no trono e reivindica a cidade para si.");
  			radical++;
  		}
  		else {
  			System.err.println("Voc� entrega a lideran�a da cidade para Kaya.");
  			pacifista++;
  		}
  		//LINHA P�S DECIS�O
  		System.out.println("Dias depois\r\n"
  				+ "\r\n"
  				+ "Depois de prender todos os seguidores de Addittio voc� decide conversar com Kaya para dizer que vai embora.\r\n"
  				+ "\r\n"
  				+ "Voc� encontra Kaya, que diz que sabe que voc� vai embora, como forma de agradecimento ela te entrega a l�mina de Addittio,\nela diz que por mais que seja uma arma daquele monstro, era uma l�mina muito bem forjada e que merecia ser sua, para te ajudar na jornada.\r\n"
  				+ "\r\n"
  				+ "Voc� agradece o presente, e diz que v�o se encontrar de novo, e que ela foi uma excelente mestra.\r\n"
  				+ "\r\n"
  				+ "Voc� se despede e sai da cidade.\r\n"
  				+ "\r\n"
  				+ "Na sa�da, o senhor que voc� salvou estava lhe esperando,\nele diz que queria agradecer mais uma vez por salvar ele e a fam�lia dele.\r\n"
  				+ "Tamb�m diz que como n�o tem muito a oferecer lhe deu um pouco de comida e disse que se precisar saber de algo s� perguntar.\r\n"
  				+ "\r\n"
  				+ "Voc� agradece e pergunta se ele sabe algo sobre o Math da pr�xima cidade.\r\n"
  				+ "\r\n"
  				+ "O senhor diz que n�o sabe muito, mas que a situa��o l� � o contr�rio daqui,\nele diz que as pessoas amam o Math de l�, e que ele � uma excelente pessoa.\r\n"
  				+ "\r\n"
  				+ "Voc� acha estranho, se despede do senhor e segue sua jornada.\r\n"
  				+ "");
  		System.out.println("Cap�tulo 2\r\n"
  				+ "Detractio\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� chega na pr�xima cidade e percebe um clima bem diferente da primeira, um lugar alegre e feliz, pessoas sorrindo e gargalhando por todo lado,\nbardos cantando, donzelas dan�ando tudo parece muito diferente.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� avista 2 homens com um manto com um s�mbolo de Subt-Ra��o segurando uma crian�a, e m�e da crian�a com as m�os levantadas como se tivesse pedindo algo.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� fica irritado e corre em dire��o a eles, chegando perto voc� coloca a m�o na l�mina, prepara para quebrar a guarda dos soldados,\nquando de repente, voc� v� algo que n�o entende, um dos seguidores n�o tinha Operatio, e o outro voc� n�o entendia a Operatio dele.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 1 ? 2\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O homem vira para voc� e pergunta o que est� fazendo, estranhamente o homem usa uma m�scara, e o outro soldado ao aldo dele tamb�m usa, a m�scara cobre o rosto todo deles, e junto com um capacete eles ficam irreconhec�veis.\r\n"
  				+ "\r\n"
  				+ "Voc� percebe que eles estavam simplesmente brincando com a crian�a.\r\n"
  				+ "\r\n"
  				+ "Voc� se ajeita e diz que confundiu ele com outra pessoa e sai dali o mais r�pido poss�vel.\r\n"
  				+ "\r\n"
  				+ "Voc� percebe que todos dessa cidade s�o pessoas com aptid�o, todos tem Operatio, no m�ximo uma pessoa sem aptid�o foi vista nesse lugar at� agora.\r\n"
  				+ "\r\n"
  				+ "Caminhando pela cidade voc� � parado por um homem com v�rios panfletos.\r\n"
  				+ "Ele diz que viu que voc� n�o tem Operatio, que � um sem aptid�o, e pergunta se voc� n�o quer se voluntariar para o arrebatamento.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que n�o sabe o que � isso.\r\n"
  				+ "\r\n"
  				+ "O homem percebe que voc� � novo na cidade, e diz que � uma �tima oportunidade para voc�,\ne pergunta se est� fugindo de uma sociedade injusta e corrupta que maltrata os sem aptid�o.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que � algo assim.\r\n"
  				+ "\r\n"
  				+ "Ele ent�o explica que o l�der desta cidade, Detractio, criou um movimento chamado arrebatamento,\nele busca os sem aptid�o dessa cidade e leva eles para uma regi�o distante onde eles possam viver livre de perigos e de pessoas com aptid�o que se aproveitam das outras.\r\n"
  				+ "\r\n"
  				+ "Voc� acha isso muito suspeito, e pergunta se o homem sabe como � l�.\r\n"
  				+ "\r\n"
  				+ "Ele diz que n�o, mas conhece pessoas que voltaram de l� e disseram que � um para�so.\r\n"
  				+ "\r\n"
  				+ "Voc� questiona o porqu� de eles voltarem se l� � t�o bom.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que a maioria se sente em d�bito com Detractio por dar tal oportunidade,\nque decidem servir Detractio e ajudar a encontrar mais pessoas que precisam de ajuda.\r\n"
  				+ "\r\n"
  				+ "Voc� pergunta como pode participar disso.\r\n"
  				+ "\r\n"
  				+ "O homem fica feliz, e diz que por sorte daqui a pouco vai rolar uma sele��o no centro da cidade,\nque o pr�prio Detractio vai escolher aqueles que v�o, se voc� falar que quer participar e for escolhido vai ter a sorte do pr�prio Detractio levar voc� at� la.\r\n"
  				+ "\r\n"
  				+ "Voc� agradece a informa��o e vai direto para a pra�a averiguar isso direito.\r\n"
  				+ "\r\n"
  				+ "Chegando l�, voc� v� Detractio num palco fazendo um an�ncio.\r\n"
  				+ "\r\n"
  				+ "Ele diz que agora vai se iniciar a sele��o dos sem aptid�o para a ida ao para�so.\nEle segue dizendo que os sem aptid�o que quiserem ir subam no palco para serem selecionados.\r\n"
  				+ "\r\n"
  				+ "Voc� se interessa muito para descobrir que lugar � esse, e mesmo preocupado em n�o ser capaz de ler as Operatios dos soldados, voc� decide se voluntariar.\r\n"
  				+ "\r\n"
  				+ "Ao subir no palco voc� est� ao lado de uma mulher com um garoto.\r\n"
  				+ "\r\n"
  				+ "Detractio v� que ningu�m mais vai subir ao palco e ent�o decide encerrar a sele��o, ele diz que com s� 3 participantes ent�o n�o precisam de sele��o,\nos 3 v�o para o para�so. Toda a cidade assistindo aquilo aplaude e grita de alegria.\r\n"
  				+ "\r\n"
  				+ "A mulher olha para voc� e pergunta se n�o est� animado?\r\n"
  				+ "\r\n"
  				+ "Voc� diz que est� sentindo algo no momento.\r\n"
  				+ "\r\n"
  				+ "A mulher diz que finalmente vai tirar o filho da antiga vida de sofrimento e vai dar uma vida feliz a ele.\r\n"
  				+ "\r\n"
  				+ "Voc� olha pro garoto e percebe que ele tem uma cicatriz enorme no olho direito.\r\n"
  				+ "\r\n"
  				+ "A mulher nota que voc� v� e diz que o garoto era humilhado por aqueles que t�m aptid�o s� porque ele vem de uma linhagem de sem aptid�es,\nlogo ele tamb�m nunca teria uma aptid�o.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que sente muito por ele, e a mulher responde que agora tudo vai mudar, que finalmente v�o ser felizes.\r\n"
  				+ "\r\n"
  				+ "A conversa � interrompida por Detractio, que pede para um homem subir ao palco,\no homem sobe e diz a todos que at� um tempo atr�s ele era humilhado por n�o ter Operatio, e que foi a o para�so e que ele era lindo, mas sentia que queria mais, e decidiu se juntar a Detractio na busca pelo salvamento dos outros.\r\n"
  				+ "\r\n"
  				+ "Voc� acha aquilo muito esquisito e percebe algo muito incomum, na roupa do homem,\nna parte de tr�s dava pra ver que tinha uma m�scara presa, estava quase toda coberta pela camisa do homem, mas estava mal ajeitada, logo era poss�vel ver a m�scara.\r\n"
  				+ "\r\n"
  				+ "Voc� estava encarando aquilo tentando entender, quando de repente percebe que o homem estava olhando para voc� com uma express�o irritada no rosto.\r\n"
  				+ "\r\n"
  				+ "Voc� desvia o olhar e disfar�a.\r\n"
  				+ "\r\n"
  				+ "Ap�s Detractio terminar o an�ncio voc� e a mulher s�o levados para o pal�cio de Detractio.\r\n"
  				+ "\r\n"
  				+ "No caminho, Detractio s� fala sobre como o para�so � incr�vel, mas logo ele chega na frente de uma porta,\ne diz que ali � onde voc� e a mulher v�o ficar at� os preparativos para viagem estarem prontos.\r\n"
  				+ " \r\n"
  				+ "A mulher, muito feliz, come�a a elogiar o pal�cio, e diz que o quarto deve ser incr�vel.\r\n"
  				+ "\r\n"
  				+ "Quando Detractio abre a porta o quarto est� totalmente escuro. Ele diz que vai dar uma ilumina��o no lugar, que isso deixa o ar de surpresa melhor.\r\n"
  				+ "\r\n"
  				+ "Quando voc�s,4 entram no quarto, Detractio para de frente para voc� com um olhar s�rio.\r\n"
  				+ "\r\n"
  				+ "Ele diz a frase \"Durmam bem\".\r\n"
  				+ "\r\n"
  				+ "No exato momento voc� sente uma forte pancada na sua cabe�a.\r\n"
  				+ "\r\n"
  				+ "Voc� est� prestes a desmaiar, a �ltima coisa que consegue ver � o garoto desesperado abra�ando a m�e que tamb�m est� no ch�o.\r\n"
  				+ "\r\n"
  				+ "�\r\n"
  				+ "\r\n"
  				+ "Voc� acorda em uma cela suja, em um lugar escuro.\r\n"
  				+ "Ao seu lado est� a mulher, tremendo, toda ensanguentada.\r\n"
  				+ "\r\n"
  				+ "Voc� levanta correndo at� ela e pergunta se ela est� bem.\r\n"
  				+ "\r\n"
  				+ "Ela diz em frases pausadas e lentas que est� bem. E diz que tiraram seu filho dela.\r\n"
  				+ "\r\n"
  				+ "Voc� ent�o escuta algu�m chegando perto da cela, � um dos soldados de Detractio, ele diz que voc� demorou muito para acordar.\r\n"
  				+ "\r\n"
  				+ "A voz do soldado lhe parece familiar, e como um flash sua mente assimila, � o mesmo homem que estava com a m�scara de soldado no palco,\ne o mesmo soldado sem aptid�o que voc� encontrou quando chegou na cidade.\r\n"
  				+ "\r\n"
  				+ "Voc� questiona onde voc�s est�o, e o que ele est� fazendo.\r\n"
  				+ "\r\n"
  				+ "Ele responde que se voc� for mais comportado que aquela mulher talvez voc� seja vendido para um nobre e se torne o \"\n servo lambe dedos\", ou talvez seja vendido para um cl�rigo para ser um boneco de testes das novas m�quinas de tortura.\r\n"
  				+ "\r\n"
  				+ "Voc� percebe que est� sendo vendido no mercado de escravos, e come�a a gritar perguntando sobre o para�so e sobre o filho da mulher.\r\n"
  				+ "\r\n"
  				+ "Os dois soldados na sala come�am a rir sem parar de voc�, um deles diz que com sorte o garoto j� deve estar no para�so mesmo.\r\n"
  				+ "\r\n"
  				+ "Voc� olha pra mulher e v� que ela est� desabando no choro.\r\n"
  				+ "\r\n"
  				+ "Voc� se enche de raiva e come�a a pedir para sair, e que voc� lutar� contra os dois se necess�rio.\r\n"
  				+ "\r\n"
  				+ "O soldado mais atr�s chega perto da cela e abre ela.\r\n"
  				+ "Ele diz que voc� pode sair, se conseguir vencer ele.\r\n"
  				+ "Voc� saca sua l�mina e levanta rapidamente pronto para quebrar a guarda do soldado, quando voc� vai atacar voc� \npercebe que ainda n�o compreende a Operatio desse soldado.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 2 ? 3\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Sem quebrar a guarda do soldado voc� acabou recebendo o choque da defesa de volta para voc�, e acabou no ch�o da cela novamente.\r\n"
  				+ "\r\n"
  				+ "Sem Operatio, voc� fica sem op��o a n�o ser sentar ali enquanto os soldados riem de voc�.\r\n"
  				+ "\r\n"
  				+ "Sua determina��o sempre foi maior que suas frustra��es, logo, voc� senta e decide se lembrar do que Kaya lhe ensinou,\nvoc� senta e se concentra no soldado, tentando entender suas Operatio.\r\n"
  				+ "\r\n"
  				+ "Os soldados continuam a tirar sarro de voc� por ficar t�o calado.\r\n"
  				+ "Depois de alguns minutos concentrado voc� consegue entender a Operatio do soldado.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 2 - 3\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� se levanta rapidamente, e encara o soldado, quietos os dois lados o soldados estranham,\nvoc� coloca a m�o nas grades e come�a a dizer que os soldados n�o s�o fortes o bastante para matarem voc�.\r\n"
  				+ "\r\n"
  				+ "O soldado da Operatio fica irritado e diz que vai te dar uma li��o que voc� n�o vai esquecer.\r\n"
  				+ "");
  		System.out.println("Assim que o soldado abre a cela, voc� quebra a guarda dele e d� um golpe crucial nele.\r\n"
  				+ "\r\n"
  				+ "O outro soldado e a mulher se espantam, sem tempo de rea��o e sem Operatio voc� finaliza o outro soldado tamb�m.\r\n"
  				+ "\r\n"
  				+ "Voc� olha pra mulher e diz, eu vou buscar o seu filho, vem comigo.\r\n"
  				+ "\r\n"
  				+ "A mulher se levanta tremendo mas afirma com a cabe�a e segue voc� pra fora da li.\r\n"
  				+ "\r\n"
  				+ "Voc�s estavam no subterr�neo do pal�cio de Detractio, voc�s sobem as escadas e procuram pelo filho da mulher.\r\n"
  				+ "\r\n"
  				+ "Os soldados estavam todos pela cidade, o pal�cio estava praticamente desprotegido,\nat� que voc� uma sala com uma porta enorme.\r\n"
  				+ "\r\n"
  				+ "Voc�s se aproximam dela e escutam duas pessoas conversando do outro lado.\r\n"
  				+ "\r\n"
  				+ "Um deles era Detractio, ele dizia que uma crian�a � muito valiosa hoje no mercado, se bem cuidada pode servir de escravo por muito tempo.\r\n"
  				+ "\r\n"
  				+ "O outro desconhecido diz que o valor pedido � um absurdo, mas Detractio diz que � um valor alto,\nmas que seus cidad�os precisam viver bem sem preocupa��o.\r\n"
  				+ "\r\n"
  				+ "O desconhecido diz que vai consultar o l�der dele para averiguar se realmente ele queria aquilo.\r\n"
  				+ "\r\n"
  				+ "De repente um soldado de Detractio grita, avisando que voc�s estavam ali.\r\n"
  				+ "");
  		System.out.println("Em um instante voc� quebra a defesa dele e o nocauteia.\r\n"
  				+ "\r\n"
  				+ "Detractio j� notou sua presen�a ali.\r\n"
  				+ "O desconhecido diz que � a primeira vez que v� um sem aptid�o derrubar algu�m que tem aptid�o, e fala que ele mesmo vai te matar.\r\n"
  				+ "\r\n"
  				+ "Detractio diz que n�o e pede para que o desconhecido v� embora e confirme o acordo, \n ele mesmo cuidar� disso.\r\n"
  				+ "\r\n"
  				+ "O desconhecido saiu dali rapidamente, e Detractio come�a a te questionar.\r\n"
  				+ "\r\n"
  				+ "Ele diz que voc� entendeu errado, que o que ele est� fazendo � pelo bem da cidade dele.\r\n"
  				+ "\r\n"
  				+ "Voc� retruca dizendo que ele est� matando pessoas inocentes.\r\n"
  				+ "\r\n"
  				+ "Detractio diz que sem aptid�o n�o s�o pessoas,\ns�o apenas moedas de troca, que s� assim para que elas tenham algum valor na vida, sem isso elas n�o passam de meros insetos atrapalhando a vida das pessoas de verdade.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� fica furioso e vai para cima de Detractio:\r\n"
  				+ "");
  		System.out.println("CHEFE DETRACTIO, TENTE DERROT�-LO! ");
  		
  		do {
  			
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
  							System.out.println("Voc� quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Voc� errou e foi atacado!");
  						}
  						break;
  					case 1:
  						System.out.println("5+2-14=x-4");
  						int resposta8 = entrada.nextInt();
  						
  						if(resposta8 == -3) {
  							numeroQuestoes ++;
  							System.out.println("Voc� quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Voc� errou e foi atacado!");
  						}
  						break;
  					case 2:
  						System.out.println("x-5-77=99+21");
  						int resposta9 = entrada.nextInt();
  						
  						if(resposta9 == 202) {
  							numeroQuestoes ++;
  							System.out.println("Voc� quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Voc� errou e foi atacado!");
  						}
  						break;
  					case 3:
  						System.out.println("\"-198+x=81-200\"");
  						
  						int resposta10 = entrada.nextInt();
  						
  						if(resposta10 == 79) {
  							numeroQuestoes ++;
  							System.out.println("Voc� quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Voc� errou e foi atacado!");
  						}
  						break;
  					case 4:
  						System.out.println("777-800+x=195-87");
  						
  						int resposta11 = entrada.nextInt();
  						
  						if(resposta11 == 131) {
  							numeroQuestoes ++;
  							System.out.println("Voc� quebrou a guarda de Detractio e o atacou, hora do golpe final");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Voc� errou e foi atacado!");
  						}
  						break;
  					case 5:
  						System.out.println("x+1887-447=222+2222");
  						
  						int resposta12 = entrada.nextInt();
  						
  						if(resposta12 == 1004) {
  							numeroQuestoes ++;
  							System.out.println("Voc� quebrou a guarda de Detractio e o derrotou!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Voc� errou e foi atacado!");
  						}
  						break;
  				}
  			} while((numeroQuestoes < 6) && (numeroErros < 3));
  			
  			if(numeroErros == 3) {
  				System.out.println("Voce perdeu, errou as tr�s tentativas.");
  				
  			} else {
				System.out.println("Parab�ns, voc� o derrotou com �xito!");
  				continuar = 2;
  				loading++;
  			}
  			
  			if(numeroErros == 3) {
  			System.out.println("\nDeseja continuar: " + "1) Sim " + "2) N�o");
  			 continuar = entrada.nextInt();
  			}
  			
  			
  		}while(continuar != 2);
      }//fim da segunda parte...
  
	//???
      if(loading == 3) {
    	//TEMPORIBUS
  		
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		int continuar = 0;
  		
  		System.out.println("Detractio cai no ch�o ensanguentado, voc� v� o filho da mulher morrendo de medo dentro da sala que Detracrio estava.\r\n"
  				+ "\r\n"
  				+ "A mulher corre e abra�a seu filho.\r\n"
  				+ "\r\n"
  				+ "Voc� olha para Detractio e diz que vai salvar a cidade do verdadeiro mal, ele.\r\n"
  				+ "\r\n"
  				+ "Detractio come�a a rir, e em suas �ltimas palavras diz que voc� n�o sabe nada sobre essa cidade.\r\n"
  				+ "");
  		System.out.println("Voc� n�o entende o que aquilo significava, no mesmo momento, algu�m entra no castelo e grita ao ver a cena.\r\n"
  				+ "\r\n"
  				+ "Voc� tenta se explicar, dizendo que ele estava matando pessoas inocentes pela cidade\"\r\n"
  				+ "\r\n"
  				+ "O homem diz a seguinte frase antes de sair correndo: \r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Ent�o ele realmente era um her�i, e voc� o matou�\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "No mesmo momento um choque de realidade vem em voc�, todos da cidade tem aptid�o, Detractio antes de morrer disse que voc� n�o conhecia nada sobre a cidade.\r\n"
  				+ "\r\n"
  				+ "Voc� percebe que ningu�m naquele lugar est� realmente se importando com a vida dos sem aptid�o, todos estavam vivendo �s custas deles, e todos sabiam disso, a cidade inteira estava corrompida.\r\n"
  				+ "\r\n"
  				+ "Voc� diz pra mulher que voc�s tem que sair dali imediatamente.\r\n"
  				+ "\r\n"
  				+ "Antes de correr voc� retira o bracelete de Detractio\r\n"
  				+ "\r\n"
  				+ "Voc� se tornou o Math de Subt-Ra��o.\r\n"
  				+ "\r\n"
  				+ "Voc�, a mulher e a crian�a saem da cidade e se escondem na floresta ali perto.\r\n"
  				+ "Voc�s conseguem escutar um grande grupo de pessoas correndo pela estrada procurando por voc�s.\r\n"
  				+ "\r\n"
  				+ "Voc� v� a mulher chorando, dizendo:\r\n"
  				+ "\r\n"
  				+ "\"Eu s� queria dar uma vida melhor para o meu filho, agora nossa vida est� arruinada de vez\"\r\n"
  				+ "\r\n"
  				+ "Voc� tenta acalmar ela, e pede para que ela continue com voc�, at� achar um lugar melhor de verdade,\num lugar onde ela possa realmente ter uma vida feliz.\r\n"
  				+ "\r\n"
  				+ "A mulher sabendo que n�o tinha para onde ir confiou em suas palavras e decidiu te seguir.\r\n"
  				+ "\r\n"
  				+ "Voc� diz a ela que precisam ir para a pr�xima cidade r�pido, e a mulher afirma dizendo que sabe o caminho,\nmas que vai ser dif�cil conseguir algo naquela cidade�\r\n"
  				+ "");
  		System.out.println("Cap�tulo 3\r\n"
  				+ "\r\n"
  				+ "Temporibus\r\n"
  				+ "\r\n"
  				+ "No caminho para a cidade a mulher pergunta qual seu objetivo, j� que o para�so era uma farsa.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que achou estranho tudo aquilo do para�so, e que decidiu ir para entender o que estava acontecendo,\ne acabou se metendo nisso tudo.\r\n"
  				+ "\r\n"
  				+ "Ela ent�o pergunta se voc� tinha algum objetivo antes de tudo isso.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que seu objetivo era trazer a justi�a verdadeira para todos, e mudar a situa��o dos sem aptid�o.\r\n"
  				+ "\r\n"
  				+ "A mulher fica feliz dizendo que � um desejo nobre, mas que voc� est� carregando um fardo do mundo todo nas costas dele.\r\n"
  				+ "\r\n"
  				+ "Ela ent�o olha para voc� com uma express�o de interesse, e pergunta se n�o sonha em ter uma fam�lia.\r\n"
  				+ "\r\n"
  				+ "Voc� responde friamente que esse n�o � seu objetivo.\r\n"
  				+ "\r\n"
  				+ "A mulher sente um pouco de tristeza mas continua a caminhar calada at� voc�s chegarem na pr�xima cidade.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O lugar estava deserto, n�o tinha uma pessoa, todas as casas destru�das e abandonadas sem nenhum vest�gio de vida.\r\n"
  				+ "\r\n"
  				+ "Aquilo tudo � muito esquisito pra voc�, voc� se pergunta se aconteceu uma guerra ou algo do tipo ali.\r\n"
  				+ "\r\n"
  				+ "A mulher diz que j� ouviu falar daqui, a cidade foi destru�da pelo ex�rcito do Invicta Math.\r\n"
  				+ "\r\n"
  				+ "Voc� pergunta a ela quem � esse Invicta Math.\r\n"
  				+ "\r\n"
  				+ "Ela te diz que � aquele reina sobre todos, o mais poderoso em aptid�o, ningu�m pode venc�-lo, todos os l�deres servem a ele.\r\n"
  				+ "\r\n"
  				+ "Voc� ent�o pergunta se ele sabe as atrocidades que os subordinados dele cometem, mas ela infelizmente n�o sabe responder.\r\n"
  				+ "\r\n"
  				+ "Voc�s caminham mais um pouco e chegam ao pal�cio da cidade, todo em ru�nas.\r\n"
  				+ "\r\n"
  				+ "Voc� entra na esperan�a de encontrar o bracelete do Math mas acaba ouvindo uma voz.\r\n"
  				+ "\r\n"
  				+ "\"O que voc�s est�o fazendo aqui?\"\r\n"
  				+ "\r\n"
  				+ "Voc� olha de onde veio, � um velho sentado no ch�o olhando para cima.\r\n"
  				+ "\r\n"
  				+ "Voc� pergunta quem � ele.\r\n"
  				+ "\r\n"
  				+ "Ele diz que voc�s invadiram a casa dele, e ainda querem saber quem ele �, sendo que deveria ser ao contr�rio.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que a casa dele est� quase caindo, e que n�o parece muito confort�vel.\r\n"
  				+ "\r\n"
  				+ "Ele diz que casa � onde voc� pode chamar de lar, e que para ele ali era o lar dele.\r\n"
  				+ "\r\n"
  				+ "Voc� logo percebe o bracelete de Math no bra�o dele.\r\n"
  				+ "\r\n"
  				+ "O velho logo v� que voc� est� de olho no bracelete e diz \" Se quiser pode pegar, me mate e me livre desse sofrimento\".\r\n"
  				+ "\r\n"
  				+ "N�o parece certo, mas voc� vai fazer de tudo para cumprir seu objetivo,\nlogo voc� empunha bem devagar a sua l�mina, e vai caminhando lentamente at� o velho.\r\n"
  				+ "\r\n"
  				+ "Quando voc� chega perto dele, a mulher toca no seu ombro e passa na frente. \r\n"
  				+ "\r\n"
  				+ "A mulher se agacha e fica de frente para o velho, ela pergunta o que aconteceu com ele.\r\n"
  				+ "\r\n"
  				+ "Ele diz que perdeu tudo, que estava tentando criar um lugar para que todos possam chamar de lar.\nEle estava conseguindo, a prosperidade era quase eterna, at� que v�rios cavaleiros apareceram e jogaram fogo por toda a cidade, eles tinham um n�vel alto de aptid�o, n�o poderiam ser parados. Quando ele se deu conta todos estavam mortos e ele estava sozinho na cidade.\r\n"
  				+ "\r\n"
  				+ "Voc� guarda sua faca e pergunta o que aconteceu com os corpos das pessoas.\r\n"
  				+ "\r\n"
  				+ "Ele diz que ele mesmo enterrou todos, que queria dar uma morte digna para seus cidad�os.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� e a mulher se olham com uma cara de ang�stia profunda.\r\n"
  				+ "\r\n"
  				+ "A mulher diz que ele n�o tem que ficar daquele jeito, que ele fez o m�ximo para proteger todos.\r\n"
  				+ "\r\n"
  				+ "Ele diz que n�o foi suficiente para proteger os cidad�os, n�o foi suficiente para proteger ele,\ne n�o foi suficiente para proteger a fam�lia dele.\r\n"
  				+ "\r\n"
  				+ "O clima � de tristeza, todos ficam calados s� se ouve os ventos entrando pelos buracos no pal�cio.\r\n"
  				+ "\r\n"
  				+ "De repente o filho da mulher sai de tr�s dela vai at� o velho, ele toca na cara do velho e come�a a rir.\r\n"
  				+ "\r\n"
  				+ "O velho olha bem nos olhos dele e seus olhos se enchem de l�grimas.\r\n"
  				+ "\r\n"
  				+ "Ele levanta o garoto dizendo \"voc� me lembra muito o meu filho garoto\", com os olhos cheios de l�grimas.\r\n"
  				+ "\r\n"
  				+ "Voc� toca no ombro dele e diz que todo o final pode ser um recome�o, que s� depende dele continuar,\ne que com certeza a fam�lia dele iria querer que ele continuasse.\r\n"
  				+ "\r\n"
  				+ "Ele diz que n�o pode, aonde quer que ele v�, aquele monstro vai atr�s dele, custe o que custar.\r\n"
  				+ "\r\n"
  				+ "Voc� pergunta quem.\r\n"
  				+ "\r\n"
  				+ "O velho diz \" O Invicta Math\".\r\n"
  				+ "\r\n"
  				+ "Voc� diz que vai derrotar ele, � seu objetivo de vida.\r\n"
  				+ "\r\n"
  				+ "O cara diz que � imposs�vel um sem aptid�o derrotar algu�m.\r\n"
  				+ "\r\n"
  				+ "Voc� ent�o mostra os dois braceletes de Math que voc� tem.\r\n"
  				+ "\r\n"
  				+ "O velho fica espantado, ele te pergunta como.\r\n"
  				+ "\r\n"
  				+ "Voc� responde que um sem aptid�o derrotou 2 Maths, � real.\r\n"
  				+ "\r\n"
  				+ "A mulher confirma com a cabe�a que � verdade.\r\n"
  				+ "\r\n"
  				+ "O velho vira de costas para os dois e come�a a sussurrar algumas coisas para si mesmo,\nat� que ele fica de frente novamente e diz que voc� � o Sem aptid�o matador de Maths.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que o t�tulo � legal mas n�o quer ser chamado assim.\r\n"
  				+ "\r\n"
  				+ "Ele diz que n�o � bem isso, mas que ele n�o pode te contar agora, que voc� vai precisar descobrir sozinho.\r\n"
  				+ "\r\n"
  				+ "O velho ent�o diz que agora ele v� tudo com clareza, e afirma que vai treinar voc� e que esse � o destino dele.\r\n"
  				+ "\r\n"
  				+ "Voc� n�o entende bem, mas gosta da id�ia.\r\n"
  				+ "\r\n"
  				+ "O velho ent�o questiona se voc� consegue ler o Operatio dele.\r\n"
  				+ "\r\n"
  				+ "Voc� responde que n�o consegue entender tudo\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X =  3 ? 2\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Ele diz que talvez leve um bom tempo para voc� aprender, mas basicamente � o s�mbolo de Mult-Iplica��o.\r\n"
  				+ "\r\n"
  				+ "No exato momento voc� visualiza o Operatio dele.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 3 * 2\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Na hora voc� quebra a defesa do velho e ele sente.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Espantado, o velho te pergunta como voc� j� sabia qual a maneira de resolver uma Operatio de Mult-Iplica��o.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� diz que sua m�e antes de morrer cantava uma can��o que te fez entender como resolver cada Operatio,\ne que ela desenhava nas paredes cada s�mbolo, mas nas Oper�tios � preciso um pouco mais de esfor�o para entender\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O velho responde que o cl�rigo mant�m escondido as inscri��es em uma sala secreta em cada igreja existente,\ne que aqueles com aptid�o assim que descoberta s�o levados a essa sala para aprender sobre o sinal da sua respectiva Oper�tio. E que se sua m�e sabia disso significava que ela em algum momento j� foi membro da Igreja.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� questiona sobre as igrejas.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O velho responde que elas guardam todos os segredos do mundo, e que ningu�m sabe de muita coisa,\ns� os membros da igreja e o Invicta Math sabem de tudo.\r\n"
  				+ "\r\n"
  				+ "Voc� pergunta para ele o que ele sabe.\r\n"
  				+ "\r\n"
  				+ "O velho ent�o assume uma postura de combate e diz:\r\n"
  				+ "\r\n"
  				+ "\"Pra come�ar meu nome � Temporibus, e mesmo em ru�nas eu ainda sou um Math,\nent�o mostre que voc� realmente � digno de enfrentar o Invicta Math no futuro\"\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� ent�o aceita o desafio:\r\n"
  				+ "\n");
  				
  	do {
  		  		do {
  			if(continuar == 1) {
  				numeroErros = numeroErros - numeroErros;
  				continuar = 0;
  			}
  			
  			switch(numeroQuestoes) {
  				case 0:
  					System.out.println("x+80=8.20");
  					
  					int resposta13 = entrada.nextInt();
  					
  					if(resposta13 == 80) {
  						numeroQuestoes ++;
							System.out.println("Voc� quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 1:
  					System.out.println("x-26.5=120+33");
  					int resposta14 = entrada.nextInt();
  					
  					if(resposta14 == 283) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 2:
  					System.out.println("30.6=x+9-63");
  					int resposta15 = entrada.nextInt();
  					
  					if(resposta15 == 234) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 3:
  					System.out.println("130.3+2x=x-9");
  					
  					int resposta16 = entrada.nextInt();
  					
  					if(resposta16 == 399) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 4:
  					System.out.println("Em pleno s�culo XXI, um dos problemas sociais que persistem em existir � a viol�ncia contra a mulher.\nCom a inten��o de que esse n�mero se reduza, existem v�rias campanhas registradas para\nque os casos sejam denunciados no n�mero 180. No ano de 2019, foram registradas, em m�dia, 290 den�ncias por dia.\nIsso significa que, em uma quinzena, o n�mero de den�ncias recebidas foi, em m�dia, igual a:");
  					
  					int resposta17 = entrada.nextInt();
  					
  					if(resposta17 == 4350) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Temporibus e o atacou, hora do golpe final amigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 5:
  					System.out.println("\nEm uma distribuidora de bebidas, foi recebido um pedido com 12 engradados de uma determinada bebida.\nSabendo que em cada engradado h� 6 garrafas de 2 litros cada uma delas,\nent�o a quantidade dessa bebida em litros presente nesse pedido � igual a:");
  					
  					int resposta18 = entrada.nextInt();
  					
  					if(resposta18 == 144) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Temporibus e o derrotou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  			}
  		} while((numeroQuestoes < 6) && (numeroErros < 3));
  		
  		if(numeroErros == 3) {
  			System.out.println("Voce perdeu, errou as tr�s tentativas.");
  			
  		} else {
			System.out.println("Parab�ns, voc� o derrotou com �xito!");
  			continuar = 2;
  			loading++;
  		}
  		
  		if(numeroErros == 3) {
  		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) N�o");
  		 continuar = entrada.nextInt();
  		}
  		
  		
  	}while(continuar != 2);

	}//fim da parte 3....
      
      
      if(loading == 4) {
    		//DIVISION
  		
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		
  		int continuar = 0;
  		
  		System.out.println("Temporibus cai no ch�o cansado dizendo:\r\n"
  				+ "\r\n"
  				+ "\"Voc� realmente tem talento, voc� resolve extremamente r�pido �s Operatios, voc� aprendeu a fazer isso tudo numa can��o com sua m�e?\"\r\n"
  				+ "\r\n"
  				+ "Voc� afirma.\r\n"
  				+ "\r\n"
  				+ "Temporibus diz que voc� tem chance de vencer o Invicta Math,\ns� que voc� precisa aprender os outros dois n�veis de aptid�o se quiser derrot�-lo, e diz tamb�m que sem saber ainda como fazer uma Operatio o desafio fica bem maior.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Temporibus entrega a voc� o bracelete de Math e diz que fica feliz em ajudar no que for.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� se tornou o Math de Mult-Iplica��o\r\n"
  				+ "\r\n"
  				+ "Voc� pergunta se Temporibus est� pronto para sair daquele lugar.\r\n"
  				+ "\r\n"
  				+ "Ele diz que sente que voc� vai mudar o mundo, e por isso ele j� vai mudar a si mesmo, come�ando agora.\r\n"
  				+ "\r\n"
  				+ "Voc� fica feliz em ouvir isso, e ent�o voc� pede um �ltimo favor a Temporibus,\nvoc� pede para que ele possa levar a mulher e o filho dela para a cidade que era governada por Addittio, diz para encontrarem a l�der de l�, seu nome � Kaya, diz que eu enviei ela, e que ela precisa de um lugar pra ficar segura.\r\n"
  				+ "\r\n"
  				+ "Temporibus diz para n�o se preocupar que ele vai proteger ela e levar ela segura at� l�.\r\n"
  				+ "\r\n"
  				+ "Voc� sorri.\r\n"
  				+ "\r\n"
  				+ "A mulher vem te abra�a e agradece por tudo que fez por ela,\npede para que quando voc� se tornar o Invicta Math que venha visitar ela assim que poss�vel.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que com certeza vai\r\n"
  				+ "\r\n"
  				+ "Temporibus vai indo e diz que vai esperar o dia em que voc� se tornar� o Invicta Math.\r\n"
  				+ "\r\n"
  				+ "Voc� decide descansar por ali at� ir atr�s do seu pr�ximo objetivo.\r\n"
  				+ "");
  		System.out.println("Cap�tulo 4\r\n"
  				+ "\r\n"
  				+ "Division\r\n"
  				+ "\r\n"
  				+ "Voc� estava pronto para partir, quando de repente escuta passos se aproximando de voc�.\r\n"
  				+ "Voc� pergunta quem est� a�, neste momento uma garota muito bem vestida aparece na sua frente.\r\n"
  				+ "Ela pergunta se voc� � o sem aptid�o.\r\n"
  				+ "Voc� v� no pesco�o dela um colar dourado com um s�mbolo familiar para voc�, � o sinal do Invicta Math.\r\n"
  				+ "Voc� estava prestes a questionar ela quando ela se aproxima de voc� com uma inten��o assassina.\r\n"
  				+ "Ela diz que poderia te matar ali mesmo, mas que dessa vez ela seria misericordiosa.\r\n"
  				+ "Ela diz para voc� parar de trilhar esse caminho, que as coisas precisam ficar nesse estado imut�vel, a mudan�a � perigosa, voc� n�o sabe os segredos do mundo, por isso n�o deve se intrometer.\r\n"
  				+ "Voc� tenta ler a Operatio dela, mas a Operatio dela � totalmente confusa, voc� n�o entende nada.\r\n"
  				+ "\r\n"
  				+ "X=???????\r\n"
  				+ "\r\n"
  				+ "Ela diz que vai te dar uma chance, mas se voc� continuar seguindo esse caminho,\nela vai te matar assim que se encontrarem de novo.\r\n"
  				+ "Em seguida ela corre na sua dire��o e te desmaia com um golpe.\r\n"
  				+ "\r\n"
  				+ "Mais tarde, voc� acorda em um quarto estranho.\r\n"
  				+ "Voc� se levanta e vai em dire��o a sa�da, quando se depara com um homem.\r\n"
  				+ "Ele pergunta se voc� est� bem, e diz que estava voltando de uma viagem quando encontraram voc� desmaiado numa constru��o abandonada.\r\n"
  				+ "Voc� diz que est� bem e agradece, em seguida pergunta em qual cidade voc� est�,\ne ele responde a cidade sob jurisdi��o de Division a Math de Div-Is�o.\r\n"
  				+ "\r\n"
  				+ "Voc� percebe que chegou no lugar certo, e pergunta como � essa Division.\r\n"
  				+ "Ele diz que ele � incr�vel, Division tem uma pol�tica de dividir os recursos na cidade,\naqui ningu�m passa fome nem fica sem onde dormir, sempre se ajudando.\r\n"
  				+ "Voc� diz que parece dif�cil de acreditar.\r\n"
  				+ "Ele diz que realmente n�o � perfeito, tem pessoas que n�o concordam com isso e est�o sempre tentando derrub�-l�.\r\n"
  				+ "Ele afirma tamb�m que para ele isso foi muito bom, pois sofreu um acidente e n�o consegue fazer muito esfor�o,\npor isso ele n�o � capaz de trabalhar no campo.\r\n"
  				+ "Voc� diz que pelo menos ele n�o tem que se preocupar.\r\n"
  				+ "\r\n"
  				+ "Voc� se despede do homem e caminha pela cidade, voc� n�o v� muito seguidores de Division no local,\ndiferente do resto dos outros Maths, voc� v� pessoas feliz partilhando alimentos e utens�lios.\r\n"
  				+ "Voc� coloca na cabe�a que precisa ver com seus pr�prios olhos essa Division,\nat� que voc� percebe de longe uma mulher rodeada de alguns soldados andando pela cidade.\r\n"
  				+ "Voc� v� algumas pessoas agradecendo ela, e voc� escuta uma dizer seu nome,\nlogo voc� entende que aquela � Division, voc� decide ir falar com ela, mas de repente v� algo que te surpreende, algu�m joga um tomate podre nela, e diz que ela � injusta e sem capacidade para liderar.\r\n"
  				+ "Os soldados estavam prontos para atacar essa pessoa, quando Division ordenou que eles n�o fizessem nada,\nela limpa o rosto e se desculpa com o homem que jogou a fruta nela, dizendo que vai fazer o poss�vel para se tornar mais justa.\r\n"
  				+ "\r\n"
  				+ "Voc� se surpreende com a atitude da Math, e decide ir l� conversar com ela.\r\n"
  				+ "Ao se aproximar os soldados impedem seu avan�o, voc� tenta ler suas Operatios, mas ainda est�o confusas.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X= 4 ? 2\r\n"
  				+ "\r\n"
  				+ "Voc� precisa ler mais algumas pra entender, e nesse momento Division v� os braceletes de Math em voc� e suspira.\r\n"
  				+ "Ela diz que sabia que essa hora chegaria, e pede para que os soldados fa�am uma patrulha pela cidade,\npois ela tem assuntos a tratar com voc�.\r\n"
  				+ "Voc�s dois v�o para onde Division reside, chegando l� Division se senta e olha para voc� com um olhar s�rio.\r\n"
  				+ "Ela diz que n�o vai entregar o t�tulo t�o f�cil, que ela governou essa cidade por muito tempo e trabalhou duro para fazer ela ser justa, que ainda falta um caminho, mas que ela vai fazer tudo para chegar l�.\r\n"
  				+ "Voc� ia falar algo a ela, mas foi interrompido por um grupo de pessoas que invadiu o lugar.\r\n"
  				+ "Eles estavam furiosos, falavam que iriam tirar Division do poder pois ela n�o entendia nada de ser justo.\r\n"
  				+ "O grupo dizia que estava cansado de se matar de trabalhar, e quando finalmente conseguiam os recursos eles \neram obrigados a entregar para pessoas que n�o fazem nada, vivem as custas dos outros.\r\n"
  				+ "As pessoas estavam furiosas e prontas pra matar Division, a mesma se levanta e diz que resolve os problemas com voc� depois.\r\n"
  				+ "\r\n"
  				+ "Voc� l� as Operatios do grupo, e consegue entender elas.\r\n"
  				+ "Voc� diz para Division que vai deixar a luta mais justa, e vai ajudar ela, assim voc�s dois lutam contra o grupo.\r\n"
  				+ "");
  				System.out.println("HORA DA BATALHA AMIGO!");
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
						System.out.println("Voc� derrotou um inimigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 1:
  					System.out.println("18x-43=65");
  					int resposta20 = entrada.nextInt();
  					
  					if(resposta20 == 6) {
  						numeroQuestoes ++;
						System.out.println("Voc� derrotou outro inimigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 2:
  					System.out.println("23x-16x=48-17x");
  					double resul21 = entrada.nextDouble();
  					
  					if(resul21==2){
  						numeroQuestoes ++;
						System.out.println("Voc� derrotou mais um inimigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 3:
  					System.out.println("12+7+2x=25");
  					
  					double resposta22 = entrada.nextDouble();
  					
  					if(resposta22==3) {
  						numeroQuestoes ++;
						System.out.println("Voc� derrotou mais um inimigo, continue assim");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 4:
  					System.out.println("Converta 159 para n�mero bin�rio:");
  					
  					int resposta23 = entrada.nextInt();
  					
  					if(resposta23 == 10011111) {
  						numeroQuestoes ++;
						System.out.println("Voc� derrotou mais um inimigo, estamos quase l�!");

  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 5:
  					System.out.println("Converta 256 para n�mero bin�rio:");
  					
  					int resposta24 = entrada.nextInt();
  					
  					if(resposta24 == 100000000) {
  						numeroQuestoes ++;
                    System.out.println("Voc� derrotou TODOS!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  			}
  		} while((numeroQuestoes < 6) && (numeroErros < 3));
  		
  		if(numeroErros == 3) {
  			System.out.println("Voce perdeu, errou as tr�s tentativas.");
  			
  		} else {
			System.out.println("Parab�ns, voc� os derrotou com �xito!");
  			continuar = 2;
  			loading++;
  		}
  		
  		if(numeroErros == 3) {
  		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) N�o");
  		 continuar = entrada.nextInt();
  		}
  		
  		
  	}while(continuar != 2); 
      }//fim da quarta fase...
      
      
      
       
      if (loading == 5) {
    		//POTENTIA
  		
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		int continuar = 0;
  		
  		System.out.println("Voc�s dois nocautearam todos do grupo.\r\n"
  				+ "\r\n"
  				+ "Division agradece a coopera��o, mas ainda afirma que n�o vai entregar a cidade. \r\n"
  				+ "");
  		System.err.println("(1) Quebrar sua guarda e finaliz�-la, dizendo que ela n�o era justa, e reivindicar o bracelete.");
  		System.err.println("(2) Pedir s� o bracelete de Math, e deixar a cidade com Division");
  		deci3=entrada.nextInt();

  		if(deci3==1) {
  		System.out.println("Voc� finaliza Division dizendo que ela n�o trouxe justi�a,\ns� criou uma injusti�a maior, voc� pega o bracelete para voc� e sai daquele lugar.\r\n"
  					+ "\r\n"
  					+ "\r\n");
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
  		//P�S DECIS�O
  		System.out.println("Voc� percebe que j� tem 4 braceletes,\ne s� precisa de mais um para poder desafiar o Invicta Math, ent�o voc� parte imediatamente para a pr�xima cidade.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Cap�tulo 5\r\n"
  				+ "Potentia\r\n"
  				+ "\r\n"
  				+ "Voc� chega na pr�xima cidade, a cidade parece pr�spera,\nn�o se v� nada de estranho, exceto por uma coisa, as pessoas est�o trocando alguma coisa dourada, voc� se aproxima e pergunta a uma pessoa o que � aquilo.\r\n"
  				+ "\r\n"
  				+ "Ela diz que voc� deve ter vindo de outra cidade, e diz que a l�der de l�,\nPotentia criou um sistema de moeda de troca, ao inv�s de trocar alimentos e objetos agora eles colocam um valor sobre essas coisas e trocam elas por essas coisas douradas, chamadas de moedas.\r\n"
  				+ "\r\n"
  				+ "Voc� acha interessante isso, e pergunta como pode se encontrar com Potentia.\r\n"
  				+ "\r\n"
  				+ "Ele diz que se voc� seguir adiante voc� encontrar� ela em uma forja mais a frente.\r\n"
  				+ "\r\n"
  				+ "Voc� agradece e vai at� l�.\r\n"
  				+ "\r\n"
  				+ "Voc� acha estranho o l�der de uma cidade ficar em uma forja, e al�m disso voc� n�o v� um seguidor de Potentia no lugar.\r\n"
  				+ "\r\n"
  				+ "Chegando na forja voc� v� uma mulher fazendo v�rias moedas douradas.\r\n"
  				+ "\r\n"
  				+ "Voc� questiona se ela � Potentia.\r\n"
  				+ "\r\n"
  				+ "Ela olha pra voc� e pergunta o que quer.\r\n"
  				+ "\r\n"
  				+ "Voc� vai direto ao ponto e diz que quer lutar contra ela para pegar o bracelete.\r\n"
  				+ "\r\n"
  				+ "Ela diz que n�o est� interessada, e que tem muito trabalho a fazer.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que vai tomar a for�a se precisar, que � necess�rio para trazer justi�a ao mundo.\r\n"
  				+ "\r\n"
  				+ "Potentia para o que est� fazendo, olha para voc� e pergunta se voc� entende algo de justi�a.\r\n"
  				+ "\r\n"
  				+ "Voc� n�o entende a pergunta.\r\n"
  				+ "\r\n"
  				+ "Ela olha para voc� e diz que voc� vem falando de justi�a,\nmas ainda n�o respeita a vontade dela e decide atac�-la injustamente.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que n�o � bem assim.\r\n"
  				+ "\r\n"
  				+ "Potentia diz que se tornou Math para poder mudar a situa��o dessa cidade,\nque estava quase sendo apagada da hist�ria.\r\n"
  				+ "Ela veio com uma id�ia que inovou tudo, fez as pessoas se organizarem sozinhas,\ne que agora ela ajuda a cidade simplesmente fabricando essas moedas e punindo aqueles que querem burlar o sistema.\r\n"
  				+ "\r\n"
  				+ "Ela fez as pessoas criarem sua pr�pria sociedade, ela n�o precisa de soldados nem de pal�cios,\nela s� quer viver, como todo mundo, e voc� chega do nada querendo passar por cima dela.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Ela diz que n�o vai passar o bracelete para algu�m que quer impor a pr�pria justi�a sobre os outros e acha que est� certo.\r\n"
  				+ "\r\n"
  				+ "Voc� fica calado por um momento, mas depois diz a ela que se desculpa pela forma como agiu, que ele s� n�o se d� bem com alguns Maths pois eles fizeram v�rias pessoas sofrerem, e que ele teve um julgamento muito precipitado.\r\n"
  				+ "\r\n"
  				+ "Ela diz que j� � um come�o, mas que ainda n�o � suficiente para fazer ela mudar de ideia.\r\n"
  				+ "\r\n"
  				+ "Voc� conta a ela que o caminho at� aqui foi muito dif�cil, e que voc� teve que fazer escolhas,\nmas que seu objetivo ainda est� claro, que fazer com que o sofrimento daqueles que s�o humilhados e exclu�dos da sociedade.\r\n"
  				+ "\r\n"
  				+ "Potentia ri, e diz que quando era mais jovem era igual a voc�,\nmas que ela s� queria que a cidade que ela nasceu melhorasse, que todo mundo poderia viver melhor.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que pode fazer isso com todas as outras mas precisa que ela ajude.\r\n"
  				+ "\r\n"
  				+ "Ela v� que voc� j� venceu todos os outros s� falta ela,\nela diz que vai te dar uma chance, amanh� no campo ali pr�ximo encontre ela.\r\n"
  				+ "\r\n"
  				+ "Voc� diz que vai estar l�.\r\n"
  				+ "\r\n"
  				+ "Voc� sai da forja rapidamente com a inten��o de conseguir decifrar a Operatio de potentia,/nvoc� procura pela cidade gente como ela, mas � muito escasso, os poucos que encontrou n�o foram suficientes para entender.\r\n"
  				+ "Voc� continua observando, at� que voc� encontra mais uma, e dessa vez conseguiu ler sua Operatio\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 2�\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� se sente pronto para enfrent�-la.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "No outro dia voc� encontra Potentia no local marcado, ela diz que s� vai te dar uma tentativa e que � melhor fazer valer.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Voc� diz que n�o vai decepcion�-la.\r\n"
  				+ "");
  		System.out.print("Se prepare amigo!");
  				
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
							System.out.println("Voc� quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 1:
  					System.out.println("3^4+20=70+30+x");
  					int resposta26 = entrada.nextInt();
  					
  					if(resposta26 == 1) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 2:
  					System.out.println("6^2(2x-3x)+8=4^2+7^4-85");
  					double resul27 = entrada.nextDouble();
  					
  					if(resul27==13){
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 3:
  					System.out.println("4^3.2^0.2^3^2 / 8^4.2^4");
  					
  					double resposta28 = entrada.nextDouble();
  					
  					if(resposta28==1/2 || resposta28==0.5) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 4:
  					System.out.println("Converta 10101 (bin�rio) para sistema decimal:");
  					
  					int resposta29 = entrada.nextInt();
  					
  					if(resposta29 == 21) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Potentia e o atacou, quase l�!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  				case 5:
  					System.out.println("Converta 20971 (bin�rio) para sistema decimal:");
  					
  					int resposta30 = entrada.nextInt();
  					
  					if(resposta30== 20000) {
  						numeroQuestoes ++;
						System.out.println("Voc� quebrou a guarda de Potentia e o derrotou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Voc� errou e foi atacado!");
  					}
  					break;
  			}
  		} while((numeroQuestoes < 6) && (numeroErros < 3));
  		
  		if(numeroErros == 3) {
  			System.out.println("Voce perdeu, errou as tr�s tentativas.");
  			
  		} else {
  			System.out.println("Voc� a derrotou com �xito!");
  			continuar = 2;
  			loading++;
  		}
  		
  		if(numeroErros == 3) {
  		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) N�o");
  		 continuar = entrada.nextInt();
  		}
  		
  		
  	}while(continuar != 2); 
      }
      if (loading==6) {
    	  
    	  int numeroErros = 0;
    		int numeroQuestoes = 0;
    		int continuar = 0;
    		
    		System.out.println("Voc� chega a ponto de nocautear Potentia, mas para.\r\n"
    				+ "\r\n"
    				+ "Ela diz que aceita a derrota, e que voc� superou ela.\r\n"
    				+ "Ela te joga o bracelete, e diz que � novo ver um sem aptid�o t�o perto de se tornar o Invicta Math.\r\n"
    				+ "Voc� diz que muitos confiaram em voc� para isso, e que agora voc� pode cumprir o objetivo.\r\n"
    				+ "\r\n"
    				+ "Potentia sorri e diz que confia em voc� tamb�m.\r\n"
    				+ "\r\n"
    				+ "No exato momento voc� ouve uma explos�o vinda da cidade.\r\n"
    				+ "");
      }
}


	}


