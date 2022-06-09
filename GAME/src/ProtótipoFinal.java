import java.util.Scanner;
public class ProtótipoFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha;
		int loading = 0;
		boolean exit = true;
		
		//variavel de decisão
		int pacifista=0;
		int radical=0;
		int deci1,deci2,deci3;

		
		do {
			System.out.println(" \n   MENU");
			System.out.println("\n 1- Tutorial" + "\n 2- Jogo" + "\n 3- Créditos" + "\n 4- Sair");
			escolha = entrada.nextInt();
			
			if (escolha == 1) {
				System.out.println("Você se encontra num mundo de aventura,\nonde tudo se dá através da matemática, porém, o poder está em mãos malignas,\nseu povo sofre opressão e principalmente você, humilhado por todos,\nprecisa provar que é diferente superando os desafios que se encontram em sua frente,\nalmejando o titulo de INVICTA MATH.");// não criei comando de tutorial ainda...
			}
			
			if (escolha == 2) {
				System.err.println("   INVICTA MATH");
				System.out.println("O mundo de Dunya é cheio de injustiças.\r\n"
						+ "Os melhores estão no topo.\r\n"
						+ "Aqueles que não podem competir se calam.\r\n"
						+ "Quem sabe os segredos do mundo?\r\n"
						+ "Quem chegará no topo?\r\n"
						+ "Ele mudará o mundo, ou ele continuará no mesmo?\r\n"
						+ "");
				loading = 1;
				exit = false;
			}
			
			if (escolha == 3) {
				System.out.println("Heloisa Hodnik \nIvan Dieckmann \nJairo Santos \nKaick Fontes");
			}			
			
			if (escolha == 4) {
				exit = false;
				System.out.println("Volte logo, sentiremos sua falta!");
			}
			
				}while (exit);
		
		
		  //ADDITIO
	  
      if(loading == 1) {
				int numeroErros = 0;
				int numeroQuestoes = 0;
				int continuar = 0; 
			
				String enter;
				//colocar a primeira parte da historia aqui
				
				System.out.println("Você se encontra na cidade em que nasceu, o dia tão esperado, o dia em que você finalmente receberá a sua Aptidão.\r\n"
						+ "\r\n"
						+ "Aptidão é a habilidade que toda criança recebe ao chegar em certa idade, alguns têm aptidões mais avançadas que outros, a aptidão define qual habilidade é o seu ponto forte,\ne aquilo que você usará para se defender e melhorar a sociedade em geral, e nesse mundo alguns são taxados de sem aptidão, nas quais são desprezados pela sociedade, tratados como excluídos.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Os sem aptidão são as pessoas que não tem a capacidade de melhorar essas habilidades, que elas não tem nenhum ponto forte,\nlogo elas sempre serão mais fracas que aqueles que têm aptidão.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "A aptidão pode ser usada tanto para melhorar a sociedade com avanços tecnológicos e científicos quanto para a autodefesa em geral.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Quando se está em combate você deve usar sua aptidão para sentir a defesa do inimigo que se baseia em uma das Operatios,\n (Operatio são operações matemáticas) entendendo essa Operatio e resolvendo ela você cria uma abertura no inimigo para poder atacá-lo.\r\n"
						+ "\r\n"
						+ "Os sem aptidão não tem Operatio, logo eles não tem defesa.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Você, fora de sua casa, encontra seu amigo, que está extremamente ansioso para receber sua aptidão.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Ao chegarem na igreja alguns clérigos o recebem, você deixa seu amigo ir primeiro, que já recebe a aptidão de Pot-Encia.\r\n"
						+ "\r\n"
						+ "As aptidões são separadas em 5 níveis:\r\n"
						+ "Ad-Ição.\r\n"
						+ "Subt-Racão.\r\n"
						+ "Mult-Iplicação.\r\n"
						+ "Div-Isão.\r\n"
						+ "Pot-Encia.\r\n"
						+ "\r\n"
						+ "Sendo da mais baixa até a mais forte nessa ordem.\r\n"
						+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"
						+ "O seu amigo ficou muito feliz com o que recebeu, logo chega a sua vez.\r\n"
						+ "\r\n"
						+ "Você acaba por receber o símbolo de sem aptidão.\r\n"
						+ "Os clérigos o mandam embora e ficam com o seu amigo ali para mostrar o que ele pode fazer.\r\n"
						+ "\r\n"
						+ "Você não teve nem chance de dizer nada e decide retornar para sua casa.\r\n"
						+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"
						+ "No outro dia você decide ir até os campos de plantio mais próximo para conseguir comida, mas no caminho acaba sendo importunado por alguns homens que descobriram que ele era sem aptidão.\r\n"
						+ "Essas pessoas atacam você de forma brutal\r\n"
						+ "Ali próximo você vê seu amigo passando, você implora por ajuda, mas seu amigo finge que nem o conhecia.\r\n"
						+ "Após um tempo o grupo para de bater em você e o deixam ali jogado no chão desmaiado.\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "Você acorda depois de um tempo em uma cama, com suas feridas tratadas\r\n"
						+ "Uma garota entra no lugar e conversa com você.\r\n"
						+ "Ela diz que viu você no chão todo machucado e que o levou até a casa dela para te tratar\r\n"
						+ "Diz também que é como você sem aptidão e que aquele grupo de bandidos sempre vêem a casa dela e exigem comida, e ameaçam ela e a família.\r\n"
						+ "Sem ter o que fazer ela é obrigada a entregar a única comida que consegue em dias para alimentar todos.\r\n"
						+ "Às vezes fica sem comer para que seus irmãos mais novos possam comer.\r\n"
						+ "\r\n"
						+ "Ao refletir sobre aquilo você sente uma dor no peito e decide fazer algo pra mudar essa situação.\r\n"
						+ "");
				System.out.println("(1) Dizer a garota que deve lutar, que mesmo sem aptidão ela deveria tentar se defender com o que sabe,\npara poder salvar a família dela, ela precisa ter força para proteger todos.");
				System.out.println("(2) Dizer à garota que ela deve proteger a família ao máximo,\ncontinuar entregando comida e esconder um pouco para que ela nem os irmãos fiquem com fome.");
				deci1=entrada.nextInt();
						
				if (deci1==1) {
				System.out.println("Você diz a garota que deve lutar, que mesmo sem aptidão ela deveria tentar se defender com o que sabe,\npara poder salvar a família dela, ela precisa ter força para proteger todos.");
				radical++;
				System.out.println(" ");
				}
				else {
				System.out.println("Você diz à garota que ela deve proteger a família ao máximo,\ncontinuar entregando comida e esconder um pouco para que ela e nem os irmãos fiquem com fome.");
				pacifista++;
				}

				//LINHA PÓS DECISÃO
				        System.out.println("A garota agradece as palavras.\nVocê decide ir embora e começar uma jornada em busca da justiça.");
				        System.out.println("\n");
						System.out.println("Capítulo 1\r\n"
								+ "Addittio\r\n"
								+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"
								+ "\r\n"
								+ "Você decide ir para a cidade mais próxima em busca de melhorar sua aptidão.\r\n"
								+ "No caminho você encontra um pequeno grupo de pessoas com vestimentas com o símbolo de Ad-Ição, eles estão atacando um senhor.\r\n"
								+ "Você decide tentar atacá-los, porém você é incapaz de entender os Operatios deles.\r\n"
								+ "\r\n"
								+ "X = ???????\r\n"
								+ "\r\n"
								+ "Pensando em um plano diferente você chama a atenção do grupo com xingamentos e rótulos, o grupo foca em você e começa a correr atrás de ti, antes de correr você diz pro senhor fugir, ele segue sua ordem e corre.\r\n"
								+ "O grupo não se importa mais com o homem e vai atrás de você.\r\n"
								+ "\r\n"
								+ "Depois de um bom tempo de corrida você consegue despistá-los.\r\n"
								+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"
								+ "\r\n"
								+ "Logo em seguida uma garota te encontra e diz que viu tudo o que aconteceu.\r\n"
								+ "Você tenta disfarçar, mas ela logo afirma que você é sem aptidão, afirmando que se arriscar para salvar a vida de alguém não é um costume de quem tem uma Aptidão, e muito menos fugir de um combate daquele jeito.\r\n"
								+ "Você não consegue mais negar e então pergunta o que ela quer.\r\n"
								+ "A garota diz que conhece outros como você e que pode te ajudar a se livrar desse grupo de pessoas que perseguem e humilham os outros.\r\n"
								+ "Você pergunta quem são eles e porquê das roupas com símbolos.\r\n"
								+ "A garota diz que se você quiser descobrir terá que ir com ela.\r\n"
								+ "Sem muito o que fazer você decide seguir a garota.\r\n"
								+ "No caminho ela explica tudo, diz que aqueles são seguidores de Addittio, o Math da Ad-Ição.\r\n"
								+ "Os Maths são um grupo de pessoas que têm o melhor desempenho com cada um dos 5 níveis de Aptidões, e que Addittio é o primeiro.\r\n"
								+ "As pessoas com o símbolo são seguidores de Addittio, pessoas com aptidão de Ad-Ição mas que seguem ordens do Math ao invés de tentar roubar a posição dele.\r\n"
								+ "Ela diz também que Addittio é um líder terrível, ele faz a gestação da cidade mas não contribui em nada,\nsó festeja com os outros nobres e o clérigo da cidade, utilizando os recursos que ele usurpa da população.\r\n"
								+ "A garota diz que se chama Kaya, e que montou uma resistência contra o Addittio pra tentar derrubá-lo do poder,\nmas infelizmente a resistência é composta por pessoas sem aptidão, e que os poucos com aptidão não são fortes o bastante para enfrentar Addittio.\r\n"
								+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"
								+ "Ao chegar no lugar, uma casa com cara de abandonada, mas com um porão secreto que leva a um enorme cômodo com várias pessoas.\r\n"
								+ "A garota diz que é ali que eles levam os membros da resistência, que normalmente são pessoas caçadas por Addittio por conta de algum feito que não o agradou.\r\n"
								+ "Chegando lá você decide conversar com as pessoas para entender a situação melhor.\r\n"
								+ "Depois de falar com elas, você entende que a garota é a líder da resistência, e que o pai dela era o antigo líder da cidade, mas Addittio o matou na frente de todos, e estabeleceu sua liderança tirana por ali.\r\n"
								+ "Você encontra o senhor que estava sendo atacado pelo grupo mais cedo.\r\n"
								+ "O senhor agradece muito você, dizendo que graças a ti ele poder viver mais um dia com suas filhas, que a mãe delas foi executada por Addittio a muito tempo,\ne desde então ele vive sendo cobrado pelos soldados como forma de pagamento pelos crimes da mulher,\nmas que ele não tinha recursos suficientes e seria executado também, então ele fugiu e encontrou Kaya que vem protegendo ele desde então.\r\n"
								+ "Disse que só saiu para ir buscar uma boneca de pano que sua filha tinha deixado na antiga casa,\nmas chegando lá encontrou os seguidores e eles então atacaram o senhor até que você apareceu.\r\n"
								+ "\r\n"
								+ "Você pergunta a ele qual crime a falecida esposa dele cometeu.\r\n"
								+ "Ele responde que para Addittio tudo que não agrada ele é um crime, que sua esposa simplesmente não aceitou se tornar parte de suas escravas pessoais, então ele a executou.\r\n"
								+ "\r\n"
								+ "Você agradece pela informação que o senhor deu, e diz que vai tirar ele daquela situação a qualquer custo.\r\n"
								+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"
								+ "\r\n"
								+ "Você vai atrás de Kaya e pede para que ela te treine.\r\n"
								+ "Ela diz que sem aptidões não são capazes de entender as Operatios, que é inútil e que nada mudaria.\r\n"
								+ "Você retruca dizendo que ficar do jeito que está também não vai mudar nada, e que ela não perderá nada tentando ajudá-lo.\r\n"
								+ "Mesmo receosa, Kaya decide ajudá-lo.\r\n"
								+ "Ela diz que ela se concentra muito na hora de entender as Operatios, que não tem o mesmo potencial que Addittio mas sabe usar sua Operatio bem.\r\n"
								+ "Ela te ensina que cada pessoa tem uma Operatio, que o nível de habilidade da pessoa determina qual vai ser a sua Operatio.\r\n"
								+ "Ela pede que você se sente e tente ver a Operatio dela.\r\n"
								+ "Ao se concentrar você consegue ver a Operatio de Kaya, porém não por completa\r\n"
								+ "\r\n"
								+ "X = 1 + ?\r\n"
								+ "\r\n"
								+ "Kaya diz que é um progresso para quem não conseguia ver nada, mas que o real problema é a resolução,\nprimeiro é necessário entender a Operatio, e para criar uma abertura de ataque é necessário reolver a Operatio.\r\n"
								+ "Ela diz que no caso se Addittio será necessário resolver mais de uma Operatio para poder derrotá-lo.\r\n"
								+ "Você continua treinando sem parar, Kaya se impressiona pois os sem aptidão sempre desistem, mas você é diferente.\r\n"
								+ "\r\n"
								+ "Depois de muito se concentrar você consegue entender a Operatio dela.\r\n"
								+ "\r\n"
								+ "X = 1 + 2\r\n"
								+ "\r\n"
								+ "Kaya se impressiona com seu desempenho rápido, e diz se você consegue resolver,\nporém ela não consegue terminar a frase pois sente o impacto de ter sua Operatio resolvida.\r\n"
								+ "\r\n"
								+ "Kaya fica em choque, pois sua guarda foi quebrada em um instante, ela questiona se você realmente é um sem aptidão e tenta ler a sua Operatio,\nao se concentrar ela percebe que você não tem Operatio, logo confirma que você é um sem aptidão.\r\n"
								+ "\r\n"
								+ "Kaya, ainda se perguntando como isso aconteceu te diz que quando uma defesa é quebrada leva um tempo para recuperá-la,\nmas que tudo depende das ações da pessoa, se ela está em combate ela não tem tempo para descansar, logo é impossível recuperar sua guarda,\ndando total vantagem e possibilidade de ataque para o inimigo.\r\n"
								+ "Ela diz que como não estão em um combate real ela consegue montar uma nova Operatio em alguns segundos, que ela não vai ser igual a anterior mas os parâmetros serão os mesmos.\r\n"
								+ "\r\n"
								+ "Você tenta ler a nova Operatio de Kaya. Com mais facilidade você consegue sem muito esforço.\r\n"
								+ "\r\n"
								+ "X = 1 +1\r\n"
								+ "\r\n"
								+ "Kaya sente automaticamente sua defesa se quebrando de novo.\r\n"
								+ "\r\n"
								+ "Kaya não compreende a situação e pergunta como fez isso.\r\n"
								+ "\r\n"
								+ "Você diz a ela que a guarda dela é muito simples de se resolver.\r\n"
								+ "\r\n"
								+ "Kaya diz que isso é muito rude da sua parte, e afirma que os seguidores de Addittio tem dificuldade em resolver a sua Operatio, e que você resolveu ela em um instante.\r\n"
								+ "\r\n"
								+ "Kaya, mesmo perplexa, sente que uma luz de esperança pode vir a brilhar.\r\n"
								+ "\r\n"
								+ "Você e Kaya decidem treinar por mais tempo para melhorar sua concentração.\r\n"
								+ "");
						System.out.println("Cansados, você e Kaya decidem terminar por hoje.\r\n"
								+ "Kaya diz que você pode salvar a cidade, que você é o mais apto a derrotar Addittio e que ela nunca conheceu um sem aptidão capaz de resolver Operatios,\ne principalmente na velocidade que você resolve.\r\n"
								+ "Vocês decidem ir dormir e planejar o que fazer amanhã.\r\n"
                                + "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n"+ "");
						System.out.println("No outro dia, você é acordado pelos gritos de desespero das pessoas no lugar.\r\n"
								+ "Você se pergunta o porquê do alarde, mas antes que possa questionar alguém, você de longe vê uma das duas filhas do senhor que você salvou chorando sem parar.\r\n"
								+ "Você procura Kaya, e vê ela com uma expressão de medo e desespero.\r\n"
								+ "Você pergunta a ela o que aconteceu.\r\n"
								+ "Ela diz que o senhor saiu novamente para pegar a boneca das filhas, e acabou sendo emboscado pelos seguidores de Addittio, eles levaram ele e a das filhas, a outra conseguiu fugir.\r\n"
								+ "Além disso Kaya disse que eles pegaram a irmã da garota primeiro e que ameaçaram matar a menina se ele não falasse onde estava se escondendo,\ne ele teve que contar onde fica o esconderijo da resistência, e foi levado para ser executado, ele e a criança.\r\n"
								+ "\r\n"
								+ "Você se enche de ódio e sai do lugar.\r\n"
								+ "Kaya pergunta aonde você vai, e você responde a ela que vai trazer justiça.\r\n"
								+ "\r\n"
								+ "Ao sair você vê 3 seguidores de Addittio vindo na direção do lugar.\r\n"
								+ "");
						System.out.println("Você derrotou todos os soldados com golpes não letais.");
						System.out.println("Você segue para o palácio de Addittio sem olhar para trás.\r\n"
								+ "\r\n"
								+ "Chegando lá você avista o senhor e a sua filha presos ao lado do trono.\r\n"
								+ "Additiio está sentado nele.\r\n"
								+ "\r\n"
								+ "Addittio está com um olhar sério, ele só diz a seguinte frase:\r\n"
								+ "\r\n"
								+ "\r\n"
								+ " Matem o sem aptidão.\r\n"
								+ "\r\n"
								+ "Você tinha pego o manto de um dos seguidores, e então você o solta na frente de Addittio.\r\n"
								+ "Addittio fica perplexo e diz:\r\n"
								+ "\r\n"
								+ "Como?\r\n"
								+ "\r\n"
								+ "Addittio levanta do seu trono e vai em sua direção,\ndizendo que sendo um sem aptidão é impossível desviar dos ataques.\r\n"
								+ "\r\n"
						+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
						enter = entrada.next();
						System.out.println( "\r\n");
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
								System.out.println("Você quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Você errou e foi atacado!");
							}
							break;
						case 1:
							System.out.println("x = 46 + 49 + 59");
							int resposta2 = entrada.nextInt();
							
							if(resposta2 == 154) {
								numeroQuestoes ++;
								System.out.println("Você quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Você errou e foi atacado!");
							}
							break;
						case 2:
							System.out.println("31 + 23 + 8 = x");
							int resposta3 = entrada.nextInt();
							
							if(resposta3 == 62) {
								numeroQuestoes ++;
								System.out.println("Você quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Você errou e foi atacado!");
							}
							break;
						case 3:
							System.out.println("41 + 16 + 6 + 74 = x");
							
							int resposta4 = entrada.nextInt();
							
							if(resposta4 == 137) {
								numeroQuestoes ++;
								System.out.println("Você quebrou a guarda de Additio e o atacou, quebre novamente!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Você errou e foi atacado!");
							}
							break;
						case 4:
							System.out.println("66 + x = 136 + 188");
							
							int resposta5 = entrada.nextInt();
							
							if(resposta5 == 258) {
								numeroQuestoes ++;
								System.out.println("Você quebrou a guarda de Additio e o atacou, hora do golpe final!");

							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Você errou e foi atacado!");

							}
							break;
						case 5:
							System.out.println("x = 800 + 130 + 44 + 898");
							
							int resposta6 = entrada.nextInt();
							
							if(resposta6 == 1872) {
								numeroQuestoes ++;
								System.out.println("Você quebrou a guarda de Additio e deu o golpe final!");
							} else {
								numeroQuestoes = 0;
								numeroErros ++;
								System.out.println("Você errou e foi atacado!");
							}
							break;
					}
				} while((numeroQuestoes < 6) && (numeroErros < 3));
				
				if(numeroErros == 3) {
					System.out.println("Voce perdeu, errou as três tentativas.");
					
				} else {
					System.out.println("Parabéns, você o derrotou com êxito!");
					continuar = 2;
					loading++;
				}
				
				if(numeroErros == 3) {
				System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
				 continuar = entrada.nextInt();
				}
				
				
			}while(continuar != 2); 
			
      }//fim, chave da primera fase...	
    
      
      //DETRACTIO
      if (loading == 2) {
    		
   
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		int continuar = 0;
  		
  		String enter;
  		System.out.println("Addittio cai para trás se perguntando como.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você pega a lâmina que ele estava empunhando e enfia ela no peito de Addittio.\r\n"
  				+ "\r\n"
  				+ "Voce diz: A justiça prevalecerá.\r\n"
  				+ "\r\n"
  				+ "Você vê que no pulso de Additio tem um bracele dourado com algumas escritas\r\n"
  				+ "\r\n"
  				+ "\" Math +\"\r\n"
  				+ "\r\n"
  				+ "Você entende que aquilo é o que mostra que você é um Math, e então você decide usá-la\r\n"
  				+ "\r\n"
  				+ "Você reivindicou seu primeiro bracelete de Math\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Se tornou o Math de Ad-Ição.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Kaya chega acompanhada de outros membros da resistência e vêem que você finalizou Addittio.\r\n"
  				+ "Os membros vão soltar o senhor a sua filha, enquanto Kaya vai em sua direção.\r\n"
  				+ "\r\n"
  				+ "Kaya não consegue falar direito, a só diz algumas palavras soltas:\r\n"
  				+ "\r\n"
  				+ "Você…como…sem aptidão…\r\n"
  				+ "\r\n"
  				+ "Você diz que foi fácil, e que faria tudo para poder trazer a justiça.\r\n"
  				+ "\r\n"
  				+ "Kaya te abraça, e começa a agradecer por ter salvo a cidade, que nunca teria imaginado algo assim.\r\n"
  				+ "\r\n"
  				+ "Você diz que infelizmente não pode fazer Addittio pagar pelo que fez.\r\n"
  				+ "\r\n"
  				+ "Ela diz que ele era um monstro, e que merecia isso.\r\n"
  				+ "");
  		System.out.println("(1)	Sentar no trono e reivindicar a cidade para si.");
  		System.out.println("(2)	Entregar a liderança da cidade para Kaya.");
  		deci2=entrada.nextInt();

  		if (deci2==1) {
  			System.err.println("Você senta no trono e reivindica a cidade para si.");
  			radical++;
  		}
  		else {
  			System.err.println("Você entrega a liderança da cidade para Kaya.");
  			pacifista++;
  		}
  		//LINHA PÓS DECISÃO
  		System.out.println("Dias depois\r\n"
  				+ "\r\n"
  				+ "Depois de prender todos os seguidores de Addittio você decide conversar com Kaya para dizer que vai embora.\r\n"
  				+ "\r\n"
  				+ "Você encontra Kaya, que diz que sabe que você vai embora, como forma de agradecimento ela te entrega a lâmina de Addittio,\nela diz que por mais que seja uma arma daquele monstro, era uma lâmina muito bem forjada e que merecia ser sua, para te ajudar na jornada.\r\n"
  				+ "\r\n"
  				+ "Você agradece o presente, e diz que vão se encontrar de novo, e que ela foi uma excelente mestra.\r\n"
  				+ "\r\n"
  				+ "Você se despede e sai da cidade.\r\n"
  				+ "\r\n"
  				+ "Na saída, o senhor que você salvou estava lhe esperando,\nele diz que queria agradecer mais uma vez por salvar ele e a família dele.\r\n"
  				+ "Também diz que como não tem muito a oferecer lhe deu um pouco de comida e disse que se precisar saber de algo só perguntar.\r\n"
  				+ "\r\n"
  				+ "Você agradece e pergunta se ele sabe algo sobre o Math da próxima cidade.\r\n"
  				+ "\r\n"
  				+ "O senhor diz que não sabe muito, mas que a situação lá é o contrário daqui,\nele diz que as pessoas amam o Math de lá, e que ele é uma excelente pessoa.\r\n"
  				+ "\r\n"
  				
  			+ "Você acha estranho, se despede do senhor e segue sua jornada.\r\n"
  			+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"	
  			+ "");
  		System.out.println("Capítulo 2\r\n"
  				+ "Detractio\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você chega na próxima cidade e percebe um clima bem diferente da primeira, um lugar alegre e feliz, pessoas sorrindo e gargalhando por todo lado,\nbardos cantando, donzelas dançando tudo parece muito diferente.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você avista 2 homens com um manto com um símbolo de Subt-Ração segurando uma criança, e mãe da criança com as mãos levantadas como se tivesse pedindo algo.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você fica irritado e corre em direção a eles, chegando perto você coloca a mão na lâmina, prepara para quebrar a guarda dos soldados,\nquando de repente, você vê algo que não entende, um dos seguidores não tinha Operatio, e o outro você não entendia a Operatio dele.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 1 ? 2\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O homem vira para você e pergunta o que está fazendo, estranhamente o homem usa uma máscara, e o outro soldado ao aldo dele também usa, a máscara cobre o rosto todo deles, e junto com um capacete eles ficam irreconhecíveis.\r\n"
  				+ "\r\n"
  				+ "Você percebe que eles estavam simplesmente brincando com a criança.\r\n"
  				+ "\r\n"
  				+ "Você se ajeita e diz que confundiu ele com outra pessoa e sai dali o mais rápido possível.\r\n"
  				+ "\r\n"
  				+ "Você percebe que todos dessa cidade são pessoas com aptidão, todos tem Operatio, no máximo uma pessoa sem aptidão foi vista nesse lugar até agora.\r\n"
  				+ "\r\n"
  				+ "Caminhando pela cidade você é parado por um homem com vários panfletos.\r\n"
  				+ "Ele diz que viu que você não tem Operatio, que é um sem aptidão, e pergunta se você não quer se voluntariar para o arrebatamento.\r\n"
  				+ "\r\n"
  				+ "Você diz que não sabe o que é isso.\r\n"
  				+ "\r\n"
  				+ "O homem percebe que você é novo na cidade, e diz que é uma ótima oportunidade para você,\ne pergunta se está fugindo de uma sociedade injusta e corrupta que maltrata os sem aptidão.\r\n"
  				+ "\r\n"
  				+ "Você diz que é algo assim.\r\n"
  				+ "\r\n"
  				+ "Ele então explica que o líder desta cidade, Detractio, criou um movimento chamado arrebatamento,\nele busca os sem aptidão dessa cidade e leva eles para uma região distante onde eles possam viver livre de perigos e de pessoas com aptidão que se aproveitam das outras.\r\n"
  				+ "\r\n"
  				+ "Você acha isso muito suspeito, e pergunta se o homem sabe como é lá.\r\n"
  				+ "\r\n"
  				+ "Ele diz que não, mas conhece pessoas que voltaram de lá e disseram que é um paraíso.\r\n"
  				+ "\r\n"
  				+ "Você questiona o porquê de eles voltarem se lá é tão bom.\r\n"
  				+ "\r\n"
  				+ "Você diz que a maioria se sente em débito com Detractio por dar tal oportunidade,\nque decidem servir Detractio e ajudar a encontrar mais pessoas que precisam de ajuda.\r\n"
  				+ "\r\n"
  				+ "Você pergunta como pode participar disso.\r\n"
  				+ "\r\n"
  				+ "O homem fica feliz, e diz que por sorte daqui a pouco vai rolar uma seleção no centro da cidade,\nque o próprio Detractio vai escolher aqueles que vão, se você falar que quer participar e for escolhido vai ter a sorte do próprio Detractio levar você até la.\r\n"
  				+ "\r\n"
  				+ "Você agradece a informação e vai direto para a praça averiguar isso direito.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Chegando lá, você vê Detractio num palco fazendo um anúncio.\r\n"
  				+ "\r\n"
  				+ "Ele diz que agora vai se iniciar a seleção dos sem aptidão para a ida ao paraíso.\nEle segue dizendo que os sem aptidão que quiserem ir subam no palco para serem selecionados.\r\n"
  				+ "\r\n"
  				+ "Você se interessa muito para descobrir que lugar é esse, e mesmo preocupado em não ser capaz de ler as Operatios dos soldados, você decide se voluntariar.\r\n"
  				+ "\r\n"
  				+ "Ao subir no palco você está ao lado de uma mulher com um garoto.\r\n"
  				+ "\r\n"
  				+ "Detractio vê que ninguém mais vai subir ao palco e então decide encerrar a seleção, ele diz que com só 3 participantes então não precisam de seleção,\nos 3 vão para o paraíso. Toda a cidade assistindo aquilo aplaude e grita de alegria.\r\n"
  				+ "\r\n"
  				+ "A mulher olha para você e pergunta se não está animado?\r\n"
  				+ "\r\n"
  				+ "Você diz que está sentindo algo no momento.\r\n"
  				+ "\r\n"
  				+ "A mulher diz que finalmente vai tirar o filho da antiga vida de sofrimento e vai dar uma vida feliz a ele.\r\n"
  				+ "\r\n"
  				+ "Você olha pro garoto e percebe que ele tem uma cicatriz enorme no olho direito.\r\n"
  				+ "\r\n"
  				+ "A mulher nota que você vê e diz que o garoto era humilhado por aqueles que têm aptidão só porque ele vem de uma linhagem de sem aptidões,\nlogo ele também nunca teria uma aptidão.\r\n"
  				+ "\r\n"
  				+ "Você diz que sente muito por ele, e a mulher responde que agora tudo vai mudar, que finalmente vão ser felizes.\r\n"
  				+ "\r\n"
  				+ "A conversa é interrompida por Detractio, que pede para um homem subir ao palco,\no homem sobe e diz a todos que até um tempo atrás ele era humilhado por não ter Operatio, e que foi a o paraíso e que ele era lindo, mas sentia que queria mais, e decidiu se juntar a Detractio na busca pelo salvamento dos outros.\r\n"
  				+ "\r\n"
  				+ "Você acha aquilo muito esquisito e percebe algo muito incomum, na roupa do homem,\nna parte de trás dava pra ver que tinha uma máscara presa, estava quase toda coberta pela camisa do homem, mas estava mal ajeitada, logo era possível ver a máscara.\r\n"
  				+ "\r\n"
  				+ "Você estava encarando aquilo tentando entender, quando de repente percebe que o homem estava olhando para você com uma expressão irritada no rosto.\r\n"
  				+ "\r\n"
  				+ "Você desvia o olhar e disfarça.\r\n"
  				+ "\r\n"
  				+ "Após Detractio terminar o anúncio você e a mulher são levados para o palácio de Detractio.\r\n"
  				+ "\r\n"
  				+ "No caminho, Detractio só fala sobre como o paraíso é incrível, mas logo ele chega na frente de uma porta,\ne diz que ali é onde você e a mulher vão ficar até os preparativos para viagem estarem prontos.\r\n"
  				+ " \r\n"
  				+ "A mulher, muito feliz, começa a elogiar o palácio, e diz que o quarto deve ser incrível.\r\n"
  				+ "\r\n"
  				+ "Quando Detractio abre a porta o quarto está totalmente escuro. Ele diz que vai dar uma iluminação no lugar, que isso deixa o ar de surpresa melhor.\r\n"
  				+ "\r\n"
  				+ "Quando vocês,4 entram no quarto, Detractio para de frente para você com um olhar sério.\r\n"
  				+ "\r\n"
  				+ "Ele diz a frase \"Durmam bem\".\r\n"
  				+ "\r\n"
  				+ "No exato momento você sente uma forte pancada na sua cabeça.\r\n"
  				+ "\r\n"
  				+ "Você está prestes a desmaiar, a última coisa que consegue ver é o garoto desesperado abraçando a mãe que também está no chão.\r\n"
  				+ "\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "…\r\n"
  				+ "\r\n"
  				+ "Você acorda em uma cela suja, em um lugar escuro.\r\n"
  				+ "Ao seu lado está a mulher, tremendo, toda ensanguentada.\r\n"
  				+ "\r\n"
  				+ "Você levanta correndo até ela e pergunta se ela está bem.\r\n"
  				+ "\r\n"
  				+ "Ela diz em frases pausadas e lentas que está bem. E diz que tiraram seu filho dela.\r\n"
  				+ "\r\n"
  				+ "Você então escuta alguém chegando perto da cela, é um dos soldados de Detractio, ele diz que você demorou muito para acordar.\r\n"
  				+ "\r\n"
  				+ "A voz do soldado lhe parece familiar, e como um flash sua mente assimila, é o mesmo homem que estava com a máscara de soldado no palco,\ne o mesmo soldado sem aptidão que você encontrou quando chegou na cidade.\r\n"
  				+ "\r\n"
  				+ "Você questiona onde vocês estão, e o que ele está fazendo.\r\n"
  				+ "\r\n"
  				+ "Ele responde que se você for mais comportado que aquela mulher talvez você seja vendido para um nobre e se torne o \"\n servo lambe dedos\", ou talvez seja vendido para um clérigo para ser um boneco de testes das novas máquinas de tortura.\r\n"
  				+ "\r\n"
  				+ "Você percebe que está sendo vendido no mercado de escravos, e começa a gritar perguntando sobre o paraíso e sobre o filho da mulher.\r\n"
  				+ "\r\n"
  				+ "Os dois soldados na sala começam a rir sem parar de você, um deles diz que com sorte o garoto já deve estar no paraíso mesmo.\r\n"
  				+ "\r\n"
  				+ "Você olha pra mulher e vê que ela está desabando no choro.\r\n"
  				+ "\r\n"
  				+ "Você se enche de raiva e começa a pedir para sair, e que você lutará contra os dois se necessário.\r\n"
  				+ "\r\n"
  				+ "O soldado mais atrás chega perto da cela e abre ela.\r\n"
  				+ "Ele diz que você pode sair, se conseguir vencer ele.\r\n"
  				+ "Você saca sua lâmina e levanta rapidamente pronto para quebrar a guarda do soldado, quando você vai atacar você \npercebe que ainda não compreende a Operatio desse soldado.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 2 ? 3\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Sem quebrar a guarda do soldado você acabou recebendo o choque da defesa de volta para você, e acabou no chão da cela novamente.\r\n"
  				+ "\r\n"
  				+ "Sem Operatio, você fica sem opção a não ser sentar ali enquanto os soldados riem de você.\r\n"
  				+ "\r\n"
  				+ "Sua determinação sempre foi maior que suas frustrações, logo, você senta e decide se lembrar do que Kaya lhe ensinou,\nvocê senta e se concentra no soldado, tentando entender suas Operatio.\r\n"
  				+ "\r\n"
  				+ "Os soldados continuam a tirar sarro de você por ficar tão calado.\r\n"
  				+ "Depois de alguns minutos concentrado você consegue entender a Operatio do soldado.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 2 - 3\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você se levanta rapidamente, e encara o soldado, quietos os dois lados o soldados estranham,\nvocê coloca a mão nas grades e começa a dizer que os soldados não são fortes o bastante para matarem você.\r\n"
  				+ "\r\n"
  				+ "O soldado da Operatio fica irritado e diz que vai te dar uma lição que você não vai esquecer.\r\n"
  				+ "");
  		System.out.println("Assim que o soldado abre a cela, você quebra a guarda dele e dá um golpe crucial nele.\r\n"
  				+ "\r\n"
  				+ "O outro soldado e a mulher se espantam, sem tempo de reação e sem Operatio você finaliza o outro soldado também.\r\n"
  				+ "\r\n"
  				+ "Você olha pra mulher e diz, eu vou buscar o seu filho, vem comigo.\r\n"
  				+ "\r\n"
  				+ "A mulher se levanta tremendo mas afirma com a cabeça e segue você pra fora da li.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Vocês estavam no subterrâneo do palácio de Detractio, vocês sobem as escadas e procuram pelo filho da mulher.\r\n"
  				+ "\r\n"
  				+ "Os soldados estavam todos pela cidade, o palácio estava praticamente desprotegido,\naté que você uma sala com uma porta enorme.\r\n"
  				+ "\r\n"
  				+ "Vocês se aproximam dela e escutam duas pessoas conversando do outro lado.\r\n"
  				+ "\r\n"
  				+ "Um deles era Detractio, ele dizia que uma criança é muito valiosa hoje no mercado, se bem cuidada pode servir de escravo por muito tempo.\r\n"
  				+ "\r\n"
  				+ "O outro desconhecido diz que o valor pedido é um absurdo, mas Detractio diz que é um valor alto,\nmas que seus cidadãos precisam viver bem sem preocupação.\r\n"
  				+ "\r\n"
  				+ "O desconhecido diz que vai consultar o líder dele para averiguar se realmente ele queria aquilo.\r\n"
  				+ "\r\n"
  				+ "De repente um soldado de Detractio grita, avisando que vocês estavam ali.\r\n"
  				+ "");
  		System.out.println("Em um instante você quebra a defesa dele e o nocauteia.\r\n"
  				+ "\r\n"
  				+ "Detractio já notou sua presença ali.\r\n"
  				+ "O desconhecido diz que é a primeira vez que vê um sem aptidão derrubar alguém que tem aptidão, e fala que ele mesmo vai te matar.\r\n"
  				+ "\r\n"
  				+ "Detractio diz que não e pede para que o desconhecido vá embora e confirme o acordo, \n ele mesmo cuidará disso.\r\n"
  				+ "\r\n"
  				+ "O desconhecido saiu dali rapidamente, e Detractio começa a te questionar.\r\n"
  				+ "\r\n"
  				+ "Ele diz que você entendeu errado, que o que ele está fazendo é pelo bem da cidade dele.\r\n"
  				+ "\r\n"
  				+ "Você retruca dizendo que ele está matando pessoas inocentes.\r\n"
  				+ "\r\n"
  				+ "Detractio diz que sem aptidão não são pessoas,\nsão apenas moedas de troca, que só assim para que elas tenham algum valor na vida, sem isso elas não passam de meros insetos atrapalhando a vida das pessoas de verdade.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você fica furioso e vai para cima de Detractio:\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "");
  		System.out.println("CHEFE DETRACTIO, TENTE DERROTÁ-LO! ");
  		
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
  							System.out.println("Você quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Você errou e foi atacado!");
  						}
  						break;
  					case 1:
  						System.out.println("5+2-14=x-4");
  						int resposta8 = entrada.nextInt();
  						
  						if(resposta8 == -3) {
  							numeroQuestoes ++;
  							System.out.println("Você quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Você errou e foi atacado!");
  						}
  						break;
  					case 2:
  						System.out.println("x-5-77=99+21");
  						int resposta9 = entrada.nextInt();
  						
  						if(resposta9 == 202) {
  							numeroQuestoes ++;
  							System.out.println("Você quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Você errou e foi atacado!");
  						}
  						break;
  					case 3:
  						System.out.println("\"-198+x=81-200\"");
  						
  						int resposta10 = entrada.nextInt();
  						
  						if(resposta10 == 79) {
  							numeroQuestoes ++;
  							System.out.println("Você quebrou a guarda de Detractio e o atacou, quebre novamente!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Você errou e foi atacado!");
  						}
  						break;
  					case 4:
  						System.out.println("777-800+x=195-87");
  						
  						int resposta11 = entrada.nextInt();
  						
  						if(resposta11 == 131) {
  							numeroQuestoes ++;
  							System.out.println("Você quebrou a guarda de Detractio e o atacou, hora do golpe final");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Você errou e foi atacado!");
  						}
  						break;
  					case 5:
  						System.out.println("x+1887-447=222+2222");
  						
  						int resposta12 = entrada.nextInt();
  						
  						if(resposta12 == 1004) {
  							numeroQuestoes ++;
  							System.out.println("Você quebrou a guarda de Detractio e o derrotou!");
  						} else {
  							numeroQuestoes = 0;
  							numeroErros ++;
							System.out.println("Você errou e foi atacado!");
  						}
  						break;
  				}
  			} while((numeroQuestoes < 6) && (numeroErros < 3));
  			
  			if(numeroErros == 3) {
  				System.out.println("Voce perdeu, errou as três tentativas.");
  				
  			} else {
				System.out.println("Parabéns, você o derrotou com êxito!");
  				continuar = 2;
  				loading++;
  			}
  			
  			if(numeroErros == 3) {
  			System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
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
  		String enter;
  		System.out.println("Detractio cai no chão ensanguentado, você vê o filho da mulher morrendo de medo dentro da sala que Detracrio estava.\r\n"
  				+ "\r\n"
  				+ "A mulher corre e abraça seu filho.\r\n"
  				+ "\r\n"
  				+ "Você olha para Detractio e diz que vai salvar a cidade do verdadeiro mal, ele.\r\n"
  				+ "\r\n"
  				+ "Detractio começa a rir, e em suas últimas palavras diz que você não sabe nada sobre essa cidade.\r\n"
  				+ "");
  		System.out.println("Você não entende o que aquilo significava, no mesmo momento, alguém entra no castelo e grita ao ver a cena.\r\n"
  				+ "\r\n"
  				+ "Você tenta se explicar, dizendo que ele estava matando pessoas inocentes pela cidade\"\r\n"
  				+ "\r\n"
  				+ "O homem diz a seguinte frase antes de sair correndo: \r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Então ele realmente era um herói, e você o matou…\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "No mesmo momento um choque de realidade vem em você, todos da cidade tem aptidão, Detractio antes de morrer disse que você não conhecia nada sobre a cidade.\r\n"
  				+ "\r\n"
  				+ "Você percebe que ninguém naquele lugar está realmente se importando com a vida dos sem aptidão, todos estavam vivendo às custas deles, e todos sabiam disso, a cidade inteira estava corrompida.\r\n"
  				+ "\r\n"
  				+ "Você diz pra mulher que vocês tem que sair dali imediatamente.\r\n"
  				+ "\r\n"
  				+ "Antes de correr você retira o bracelete de Detractio\r\n"
  				+ "\r\n"
  				+ "Você se tornou o Math de Subt-Ração.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Você, a mulher e a criança saem da cidade e se escondem na floresta ali perto.\r\n"
  				+ "Vocês conseguem escutar um grande grupo de pessoas correndo pela estrada procurando por vocês.\r\n"
  				+ "\r\n"
  				+ "Você vê a mulher chorando, dizendo:\r\n"
  				+ "\r\n"
  				+ "\"Eu só queria dar uma vida melhor para o meu filho, agora nossa vida está arruinada de vez\"\r\n"
  				+ "\r\n"
  				+ "Você tenta acalmar ela, e pede para que ela continue com você, até achar um lugar melhor de verdade,\num lugar onde ela possa realmente ter uma vida feliz.\r\n"
  				+ "\r\n"
  				+ "A mulher sabendo que não tinha para onde ir confiou em suas palavras e decidiu te seguir.\r\n"
  				+ "\r\n"
  				+ "Você diz a ela que precisam ir para a próxima cidade rápido, e a mulher afirma dizendo que sabe o caminho,\nmas que vai ser difícil conseguir algo naquela cidade…\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "");
  		System.out.println("Capítulo 3\r\n"
  				+ "\r\n"
  				+ "Temporibus\r\n"
  				+ "\r\n"
  				+ "No caminho para a cidade a mulher pergunta qual seu objetivo, já que o paraíso era uma farsa.\r\n"
  				+ "\r\n"
  				+ "Você diz que achou estranho tudo aquilo do paraíso, e que decidiu ir para entender o que estava acontecendo,\ne acabou se metendo nisso tudo.\r\n"
  				+ "\r\n"
  				+ "Ela então pergunta se você tinha algum objetivo antes de tudo isso.\r\n"
  				+ "\r\n"
  				+ "Você diz que seu objetivo era trazer a justiça verdadeira para todos, e mudar a situação dos sem aptidão.\r\n"
  				+ "\r\n"
  				+ "A mulher fica feliz dizendo que é um desejo nobre, mas que você está carregando um fardo do mundo todo nas costas dele.\r\n"
  				+ "\r\n"
  				+ "Ela então olha para você com uma expressão de interesse, e pergunta se não sonha em ter uma família.\r\n"
  				+ "\r\n"
  				+ "Você responde friamente que esse não é seu objetivo.\r\n"
  				+ "\r\n"
  				+ "A mulher sente um pouco de tristeza mas continua a caminhar calada até vocês chegarem na próxima cidade.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O lugar estava deserto, não tinha uma pessoa, todas as casas destruídas e abandonadas sem nenhum vestígio de vida.\r\n"
  				+ "\r\n"
  				+ "Aquilo tudo é muito esquisito pra você, você se pergunta se aconteceu uma guerra ou algo do tipo ali.\r\n"
  				+ "\r\n"
  				+ "A mulher diz que já ouviu falar daqui, a cidade foi destruída pelo exército do Invicta Math.\r\n"
  				+ "\r\n"
  				+ "Você pergunta a ela quem é esse Invicta Math.\r\n"
  				+ "\r\n"
  				+ "Ela te diz que é aquele reina sobre todos, o mais poderoso em aptidão, ninguém pode vencê-lo, todos os líderes servem a ele.\r\n"
  				+ "\r\n"
  				+ "Você então pergunta se ele sabe as atrocidades que os subordinados dele cometem, mas ela infelizmente não sabe responder.\r\n"
  				
+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"+ "\r\n"
  				+ "Vocês caminham mais um pouco e chegam ao palácio da cidade, todo em ruínas.\r\n"
  				+ "\r\n"
  				+ "Você entra na esperança de encontrar o bracelete do Math mas acaba ouvindo uma voz.\r\n"
  				+ "\r\n"
  				+ "\"O que vocês estão fazendo aqui?\"\r\n"
  				+ "\r\n"
  				+ "Você olha de onde veio, é um velho sentado no chão olhando para cima.\r\n"
  				+ "\r\n"
  				+ "Você pergunta quem é ele.\r\n"
  				+ "\r\n"
  				+ "Ele diz que vocês invadiram a casa dele, e ainda querem saber quem ele é, sendo que deveria ser ao contrário.\r\n"
  				+ "\r\n"
  				+ "Você diz que a casa dele está quase caindo, e que não parece muito confortável.\r\n"
  				+ "\r\n"
  				+ "Ele diz que casa é onde você pode chamar de lar, e que para ele ali era o lar dele.\r\n"
  				+ "\r\n"
  				+ "Você logo percebe o bracelete de Math no braço dele.\r\n"
  				+ "\r\n"
  				+ "O velho logo vê que você está de olho no bracelete e diz \" Se quiser pode pegar, me mate e me livre desse sofrimento\".\r\n"
  				+ "\r\n"
  				+ "Não parece certo, mas você vai fazer de tudo para cumprir seu objetivo,\nlogo você empunha bem devagar a sua lâmina, e vai caminhando lentamente até o velho.\r\n"
  				+ "\r\n"
  				+ "Quando você chega perto dele, a mulher toca no seu ombro e passa na frente. \r\n"
  				+ "\r\n"
  				+ "A mulher se agacha e fica de frente para o velho, ela pergunta o que aconteceu com ele.\r\n"
  				+ "\r\n"
  				+ "Ele diz que perdeu tudo, que estava tentando criar um lugar para que todos possam chamar de lar.\nEle estava conseguindo, a prosperidade era quase eterna, até que vários cavaleiros apareceram e jogaram fogo por toda a cidade, eles tinham um nível alto de aptidão, não poderiam ser parados. Quando ele se deu conta todos estavam mortos e ele estava sozinho na cidade.\r\n"
  				+ "\r\n"
  				+ "Você guarda sua faca e pergunta o que aconteceu com os corpos das pessoas.\r\n"
  				+ "\r\n"
  				+ "Ele diz que ele mesmo enterrou todos, que queria dar uma morte digna para seus cidadãos.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você e a mulher se olham com uma cara de angústia profunda.\r\n"
  				+ "\r\n"
  				+ "A mulher diz que ele não tem que ficar daquele jeito, que ele fez o máximo para proteger todos.\r\n"
  				+ "\r\n"
  				+ "Ele diz que não foi suficiente para proteger os cidadãos, não foi suficiente para proteger ele,\ne não foi suficiente para proteger a família dele.\r\n"
  				+ "\r\n"
  				+ "O clima é de tristeza, todos ficam calados só se ouve os ventos entrando pelos buracos no palácio.\r\n"
  				+ "\r\n"
  				+ "De repente o filho da mulher sai de trás dela vai até o velho, ele toca na cara do velho e começa a rir.\r\n"
  				+ "\r\n"
  				+ "O velho olha bem nos olhos dele e seus olhos se enchem de lágrimas.\r\n"
  				+ "\r\n"
  				+ "Ele levanta o garoto dizendo \"você me lembra muito o meu filho garoto\", com os olhos cheios de lágrimas.\r\n"
  				+ "\r\n"
  				+ "Você toca no ombro dele e diz que todo o final pode ser um recomeço, que só depende dele continuar,\ne que com certeza a família dele iria querer que ele continuasse.\r\n"
  				+ "\r\n"
  				+ "Ele diz que não pode, aonde quer que ele vá, aquele monstro vai atrás dele, custe o que custar.\r\n"
  				+ "\r\n"
  				+ "Você pergunta quem.\r\n"
  				+ "\r\n"
  				+ "O velho diz \" O Invicta Math\".\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Você diz que vai derrotar ele, é seu objetivo de vida.\r\n"
  				+ "\r\n"
  				+ "O cara diz que é impossível um sem aptidão derrotar alguém.\r\n"
  				+ "\r\n"
  				+ "Você então mostra os dois braceletes de Math que você tem.\r\n"
  				+ "\r\n"
  				+ "O velho fica espantado, ele te pergunta como.\r\n"
  				+ "\r\n"
  				+ "Você responde que um sem aptidão derrotou 2 Maths, é real.\r\n"
  				+ "\r\n"
  				+ "A mulher confirma com a cabeça que é verdade.\r\n"
  				+ "\r\n"
  				+ "O velho vira de costas para os dois e começa a sussurrar algumas coisas para si mesmo,\naté que ele fica de frente novamente e diz que você é o Sem aptidão matador de Maths.\r\n"
  				+ "\r\n"
  				+ "Você diz que o título é legal mas não quer ser chamado assim.\r\n"
  				+ "\r\n"
  				+ "Ele diz que não é bem isso, mas que ele não pode te contar agora, que você vai precisar descobrir sozinho.\r\n"
  				+ "\r\n"
  				+ "O velho então diz que agora ele vê tudo com clareza, e afirma que vai treinar você e que esse é o destino dele.\r\n"
  				+ "\r\n"
  				+ "Você não entende bem, mas gosta da idéia.\r\n"
  				+ "\r\n"
  				+ "O velho então questiona se você consegue ler o Operatio dele.\r\n"
  				+ "\r\n"
  				+ "Você responde que não consegue entender tudo\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X =  3 ? 2\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Ele diz que talvez leve um bom tempo para você aprender, mas basicamente é o símbolo de Mult-Iplicação.\r\n"
  				+ "\r\n"
  				+ "No exato momento você visualiza o Operatio dele.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 3 * 2\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Na hora você quebra a defesa do velho e ele sente.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Espantado, o velho te pergunta como você já sabia qual a maneira de resolver uma Operatio de Mult-Iplicação.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você diz que sua mãe antes de morrer cantava uma canção que te fez entender como resolver cada Operatio,\ne que ela desenhava nas paredes cada símbolo, mas nas Operátios é preciso um pouco mais de esforço para entender\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O velho responde que o clérigo mantém escondido as inscrições em uma sala secreta em cada igreja existente,\ne que aqueles com aptidão assim que descoberta são levados a essa sala para aprender sobre o sinal da sua respectiva Operátio. E que se sua mãe sabia disso significava que ela em algum momento já foi membro da Igreja.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você questiona sobre as igrejas.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "O velho responde que elas guardam todos os segredos do mundo, e que ninguém sabe de muita coisa,\nsó os membros da igreja e o Invicta Math sabem de tudo.\r\n"
  				+ "\r\n"
  				+ "Você pergunta para ele o que ele sabe.\r\n"
  				+ "\r\n"
  				+ "O velho então assume uma postura de combate e diz:\r\n"
  				+ "\r\n"
  				+ "\"Pra começar meu nome é Temporibus, e mesmo em ruínas eu ainda sou um Math,\nentão mostre que você realmente é digno de enfrentar o Invicta Math no futuro\"\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você então aceita o desafio:\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
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
							System.out.println("Você quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 1:
  					System.out.println("x-26.5=120+33");
  					int resposta14 = entrada.nextInt();
  					
  					if(resposta14 == 283) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 2:
  					System.out.println("30.6=x+9-63");
  					int resposta15 = entrada.nextInt();
  					
  					if(resposta15 == 234) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 3:
  					System.out.println("130.3+2x=x-9");
  					
  					int resposta16 = entrada.nextInt();
  					
  					if(resposta16 == 399) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Temporibus e o atacou, quebre novamente!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 4:
  					System.out.println("Em pleno século XXI, um dos problemas sociais que persistem em existir é a violência contra a mulher.\nCom a intenção de que esse número se reduza, existem várias campanhas registradas para\nque os casos sejam denunciados no número 180. No ano de 2019, foram registradas, em média, 290 denúncias por dia.\nIsso significa que, em uma quinzena, o número de denúncias recebidas foi, em média, igual a:");
  					
  					int resposta17 = entrada.nextInt();
  					
  					if(resposta17 == 4350) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Temporibus e o atacou, hora do golpe final amigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 5:
  					System.out.println("\nEm uma distribuidora de bebidas, foi recebido um pedido com 12 engradados de uma determinada bebida.\nSabendo que em cada engradado há 6 garrafas de 2 litros cada uma delas,\nentão a quantidade dessa bebida em litros presente nesse pedido é igual a:");
  					
  					int resposta18 = entrada.nextInt();
  					
  					if(resposta18 == 144) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Temporibus e o derrotou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  			}
  		} while((numeroQuestoes < 6) && (numeroErros < 3));
  		
  		if(numeroErros == 3) {
  			System.out.println("Voce perdeu, errou as três tentativas.");
  			
  		} else {
			System.out.println("Parabéns, você o derrotou com êxito!");
  			continuar = 2;
  			loading++;
  		}
  		
  		if(numeroErros == 3) {
  		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
  		 continuar = entrada.nextInt();
  		}
  		
  		
  	}while(continuar != 2);

	}//fim da parte 3....
      
      
      if(loading == 4) {
    		//DIVISION
  		
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		
  		int continuar = 0;
  		String enter;
  		System.out.println("Temporibus cai no chão cansado dizendo:\r\n"
  				+ "\r\n"
  				+ "\"Você realmente tem talento, você resolve extremamente rápido às Operatios, você aprendeu a fazer isso tudo numa canção com sua mãe?\"\r\n"
  				+ "\r\n"
  				+ "Você afirma.\r\n"
  				+ "\r\n"
  				+ "Temporibus diz que você tem chance de vencer o Invicta Math,\nsó que você precisa aprender os outros dois níveis de aptidão se quiser derrotá-lo, e diz também que sem saber ainda como fazer uma Operatio o desafio fica bem maior.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Temporibus entrega a você o bracelete de Math e diz que fica feliz em ajudar no que for.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você se tornou o Math de Mult-Iplicação\r\n"
  				+ "\r\n"
  				+ "Você pergunta se Temporibus está pronto para sair daquele lugar.\r\n"
  				+ "\r\n"
  				+ "Ele diz que sente que você vai mudar o mundo, e por isso ele já vai mudar a si mesmo, começando agora.\r\n"
  				+ "\r\n"
  				+ "Você fica feliz em ouvir isso, e então você pede um último favor a Temporibus,\nvocê pede para que ele possa levar a mulher e o filho dela para a cidade que era governada por Addittio, diz para encontrarem a líder de lá, seu nome é Kaya, diz que eu enviei ela, e que ela precisa de um lugar pra ficar segura.\r\n"
  				+ "\r\n"
  				+ "Temporibus diz para não se preocupar que ele vai proteger ela e levar ela segura até lá.\r\n"
  				+ "\r\n"
  				+ "Você sorri.\r\n"
  				+ "\r\n"
  				+ "A mulher vem te abraça e agradece por tudo que fez por ela,\npede para que quando você se tornar o Invicta Math que venha visitar ela assim que possível.\r\n"
  				+ "\r\n"
  				+ "Você diz que com certeza vai\r\n"
  				+ "\r\n"
  				+ "Temporibus vai indo e diz que vai esperar o dia em que você se tornará o Invicta Math.\r\n"
  				+ "\r\n"
  				+ "Você decide descansar por ali até ir atrás do seu próximo objetivo.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "");
  		System.out.println("Capítulo 4\r\n"
  				+ "\r\n"
  				+ "Division\r\n"
  				+ "\r\n"
  				+ "Você estava pronto para partir, quando de repente escuta passos se aproximando de você.\r\n"
  				+ "Você pergunta quem está aí, neste momento uma garota muito bem vestida aparece na sua frente.\r\n"
  				+ "Ela pergunta se você é o sem aptidão.\r\n"
  				+ "Você vê no pescoço dela um colar dourado com um símbolo familiar para você, é o sinal do Invicta Math.\r\n"
  				+ "Você estava prestes a questionar ela quando ela se aproxima de você com uma intenção assassina.\r\n"
  				+ "Ela diz que poderia te matar ali mesmo, mas que dessa vez ela seria misericordiosa.\r\n"
  				+ "Ela diz para você parar de trilhar esse caminho, que as coisas precisam ficar nesse estado imutável, a mudança é perigosa, você não sabe os segredos do mundo, por isso não deve se intrometer.\r\n"
  				+ "Você tenta ler a Operatio dela, mas a Operatio dela é totalmente confusa, você não entende nada.\r\n"
  				+ "\r\n"
  				+ "X=???????\r\n"
  				+ "\r\n"
  				+ "Ela diz que vai te dar uma chance, mas se você continuar seguindo esse caminho,\nela vai te matar assim que se encontrarem de novo.\r\n"
  				+ "Em seguida ela corre na sua direção e te desmaia com um golpe.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Mais tarde, você acorda em um quarto estranho.\r\n"
  				+ "Você se levanta e vai em direção a saída, quando se depara com um homem.\r\n"
  				+ "Ele pergunta se você está bem, e diz que estava voltando de uma viagem quando encontraram você desmaiado numa construção abandonada.\r\n"
  				+ "Você diz que está bem e agradece, em seguida pergunta em qual cidade você está,\ne ele responde a cidade sob jurisdição de Division a Math de Div-Isão.\r\n"
  				+ "\r\n"
  				+ "Você percebe que chegou no lugar certo, e pergunta como é essa Division.\r\n"
  				+ "Ele diz que ele é incrível, Division tem uma política de dividir os recursos na cidade,\naqui ninguém passa fome nem fica sem onde dormir, sempre se ajudando.\r\n"
  				+ "Você diz que parece difícil de acreditar.\r\n"
  				+ "Ele diz que realmente não é perfeito, tem pessoas que não concordam com isso e estão sempre tentando derrubá-lá.\r\n"
  				+ "Ele afirma também que para ele isso foi muito bom, pois sofreu um acidente e não consegue fazer muito esforço,\npor isso ele não é capaz de trabalhar no campo.\r\n"
  				+ "Você diz que pelo menos ele não tem que se preocupar.\r\n"
  				+ "\r\n"
  				+ "Você se despede do homem e caminha pela cidade, você não vê muito seguidores de Division no local,\ndiferente do resto dos outros Maths, você vê pessoas feliz partilhando alimentos e utensílios.\r\n"
  				+ "Você coloca na cabeça que precisa ver com seus próprios olhos essa Division,\naté que você percebe de longe uma mulher rodeada de alguns soldados andando pela cidade.\r\n"
  				+ "Você vê algumas pessoas agradecendo ela, e você escuta uma dizer seu nome,\nlogo você entende que aquela é Division, você decide ir falar com ela, mas de repente vê algo que te surpreende, alguém joga um tomate podre nela, e diz que ela é injusta e sem capacidade para liderar.\r\n"
  				+ "Os soldados estavam prontos para atacar essa pessoa, quando Division ordenou que eles não fizessem nada,\nela limpa o rosto e se desculpa com o homem que jogou a fruta nela, dizendo que vai fazer o possível para se tornar mais justa.\r\n"
  				+ "\r\n"
  				+ "Você se surpreende com a atitude da Math, e decide ir lá conversar com ela.\r\n"
  				+ "Ao se aproximar os soldados impedem seu avanço, você tenta ler suas Operatios, mas ainda estão confusas.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X= 4 ? 2\r\n"
  				+ "\r\n"
  				+ "Você precisa ler mais algumas pra entender, e nesse momento Division vê os braceletes de Math em você e suspira.\r\n"
  				+ "Ela diz que sabia que essa hora chegaria, e pede para que os soldados façam uma patrulha pela cidade,\npois ela tem assuntos a tratar com você.\r\n"
  				+ "Vocês dois vão para onde Division reside, chegando lá Division se senta e olha para você com um olhar sério.\r\n"
  				+ "Ela diz que não vai entregar o título tão fácil, que ela governou essa cidade por muito tempo e trabalhou duro para fazer ela ser justa, que ainda falta um caminho, mas que ela vai fazer tudo para chegar lá.\r\n"
  				+ "Você ia falar algo a ela, mas foi interrompido por um grupo de pessoas que invadiu o lugar.\r\n"
  				+ "Eles estavam furiosos, falavam que iriam tirar Division do poder pois ela não entendia nada de ser justo.\r\n"
  				+ "O grupo dizia que estava cansado de se matar de trabalhar, e quando finalmente conseguiam os recursos eles \neram obrigados a entregar para pessoas que não fazem nada, vivem as custas dos outros.\r\n"
  				+ "As pessoas estavam furiosas e prontas pra matar Division, a mesma se levanta e diz que resolve os problemas com você depois.\r\n"
  				+ "\r\n"
  				+ "Você lê as Operatios do grupo, e consegue entender elas.\r\n"
  				+ "Você diz para Division que vai deixar a luta mais justa, e vai ajudar ela, assim vocês dois lutam contra o grupo.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
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
						System.out.println("Você derrotou um inimigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 1:
  					System.out.println("18x-43=65");
  					int resposta20 = entrada.nextInt();
  					
  					if(resposta20 == 6) {
  						numeroQuestoes ++;
						System.out.println("Você derrotou outro inimigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 2:
  					System.out.println("23x-16x=48-17x");
  					double resul21 = entrada.nextDouble();
  					
  					if(resul21==2){
  						numeroQuestoes ++;
						System.out.println("Você derrotou mais um inimigo!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 3:
  					System.out.println("12+7+2x=25");
  					
  					double resposta22 = entrada.nextDouble();
  					
  					if(resposta22==3) {
  						numeroQuestoes ++;
						System.out.println("Você derrotou mais um inimigo, continue assim");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 4:
  					System.out.println("Converta 159 para número binário:");
  					
  					int resposta23 = entrada.nextInt();
  					
  					if(resposta23 == 10011111) {
  						numeroQuestoes ++;
						System.out.println("Você derrotou mais um inimigo, estamos quase lá!");

  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 5:
  					System.out.println("Converta 256 para número binário:");
  					
  					int resposta24 = entrada.nextInt();
  					
  					if(resposta24 == 100000000) {
  						numeroQuestoes ++;
                    System.out.println("Você derrotou TODOS!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  			}
  		} while((numeroQuestoes < 6) && (numeroErros < 3));
  		
  		if(numeroErros == 3) {
  			System.out.println("Voce perdeu, errou as três tentativas.");
  			
  		} else {
			System.out.println("Parabéns, você os derrotou com êxito!");
  			continuar = 2;
  			loading++;
  		}
  		
  		if(numeroErros == 3) {
  		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
  		 continuar = entrada.nextInt();
  		}
  		
  		
  	}while(continuar != 2); 
      }//fim da quarta fase...
      
      
      
       
      if (loading == 5) {
    		//POTENTIA
  		
  		int numeroErros = 0;
  		int numeroQuestoes = 0;
  		int continuar = 0;
  		String enter;
  		
  		System.out.println("Vocês dois nocautearam todos do grupo.\r\n"
  				+ "\r\n"
  				+ "Division agradece a cooperação, mas ainda afirma que não vai entregar a cidade. \r\n"
  				+ "");
  		System.out.println("(1) Quebrar sua guarda e finalizá-la, dizendo que ela não era justa, e reivindicar o bracelete.");
  		System.out.println("(2) Pedir só o bracelete de Math, e deixar a cidade com Division");
  		deci3=entrada.nextInt();

  		if(deci3==1) {
  		System.out.println("Você finaliza Division dizendo que ela não trouxe justiça,\nsó criou uma injustiça maior, você pega o bracelete para você e sai daquele lugar.\r\n"
  					+ "\r\n"
  					+ "\r\n");
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
  		//PÓS DECISÃO
  		System.out.println("Você percebe que já tem 4 braceletes,\ne só precisa de mais um para poder desafiar o Invicta Math, então você parte imediatamente para a próxima cidade.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Capítulo 5\r\n"
  				+ "Potentia\r\n"
  				+ "\r\n"
  				+ "Você chega na próxima cidade, a cidade parece próspera,\nnão se vê nada de estranho, exceto por uma coisa, as pessoas estão trocando alguma coisa dourada, você se aproxima e pergunta a uma pessoa o que é aquilo.\r\n"
  				+ "\r\n"
  				+ "Ela diz que você deve ter vindo de outra cidade, e diz que a líder de lá,\nPotentia criou um sistema de moeda de troca, ao invés de trocar alimentos e objetos agora eles colocam um valor sobre essas coisas e trocam elas por essas coisas douradas, chamadas de moedas.\r\n"
  				+ "\r\n"
  				+ "Você acha interessante isso, e pergunta como pode se encontrar com Potentia.\r\n"
  				+ "\r\n"
  				+ "Ele diz que se você seguir adiante você encontrará ela em uma forja mais a frente.\r\n"
  				+ "\r\n"
  				+ "Você agradece e vai até lá.\r\n"
  				+ "\r\n"
  				+ "Você acha estranho o líder de uma cidade ficar em uma forja, e além disso você não vê um seguidor de Potentia no lugar.\r\n"
  				+ "\r\n"
  				+ "Chegando na forja você vê uma mulher fazendo várias moedas douradas.\r\n"
  				+ "\r\n"
  				+ "Você questiona se ela é Potentia.\r\n"
  				+ "\r\n"
  				+ "Ela olha pra você e pergunta o que quer.\r\n"
  				+ "\r\n"
  				+ "Você vai direto ao ponto e diz que quer lutar contra ela para pegar o bracelete.\r\n"
  				+ "\r\n"
  				+ "Ela diz que não está interessada, e que tem muito trabalho a fazer.\r\n"
  				+ "\r\n"
  				+ "Você diz que vai tomar a força se precisar, que é necessário para trazer justiça ao mundo.\r\n"
  				+ "\r\n"
  				+ "Potentia para o que está fazendo, olha para você e pergunta se você entende algo de justiça.\r\n"
  				+ "\r\n"
  				+ "Você não entende a pergunta.\r\n"
  				+ "\r\n"
  				+ "Ela olha para você e diz que você vem falando de justiça,\nmas ainda não respeita a vontade dela e decide atacá-la injustamente.\r\n"
  				+ "\r\n"
  				+ "Você diz que não é bem assim.\r\n"
  				+ "\r\n"
  				+ "Potentia diz que se tornou Math para poder mudar a situação dessa cidade,\nque estava quase sendo apagada da história.\r\n"
  				+ "Ela veio com uma idéia que inovou tudo, fez as pessoas se organizarem sozinhas,\ne que agora ela ajuda a cidade simplesmente fabricando essas moedas e punindo aqueles que querem burlar o sistema.\r\n"
  				+ "\r\n"
  				+ "Ela fez as pessoas criarem sua própria sociedade, ela não precisa de soldados nem de palácios,\nela só quer viver, como todo mundo, e você chega do nada querendo passar por cima dela.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Ela diz que não vai passar o bracelete para alguém que quer impor a própria justiça sobre os outros e acha que está certo.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "\r\n"
  				+ "Você fica calado por um momento, mas depois diz a ela que se desculpa pela forma como agiu, que ele só não se dá bem com alguns Maths pois eles fizeram várias pessoas sofrerem, e que ele teve um julgamento muito precipitado.\r\n"
  				+ "\r\n"
  				+ "Ela diz que já é um começo, mas que ainda não é suficiente para fazer ela mudar de ideia.\r\n"
  				+ "\r\n"
  				+ "Você conta a ela que o caminho até aqui foi muito difícil, e que você teve que fazer escolhas,\nmas que seu objetivo ainda está claro, que fazer com que o sofrimento daqueles que são humilhados e excluídos da sociedade.\r\n"
  				+ "\r\n"
  				+ "Potentia ri, e diz que quando era mais jovem era igual a você,\nmas que ela só queria que a cidade que ela nasceu melhorasse, que todo mundo poderia viver melhor.\r\n"
  				+ "\r\n"
  				+ "Você diz que pode fazer isso com todas as outras mas precisa que ela ajude.\r\n"
  				+ "\r\n"
  				+ "Ela vê que você já venceu todos os outros só falta ela,\nela diz que vai te dar uma chance, amanhã no campo ali próximo encontre ela.\r\n"
  				+ "\r\n"
  				+ "Você diz que vai estar lá.\r\n"
  				+ "\r\n"
  				+ "Você sai da forja rapidamente com a intenção de conseguir decifrar a Operatio de potentia,/nvocê procura pela cidade gente como ela, mas é muito escasso, os poucos que encontrou não foram suficientes para entender.\r\n"
  				+ "Você continua observando, até que você encontra mais uma, e dessa vez conseguiu ler sua Operatio\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "X = 2²\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você se sente pronto para enfrentá-la.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "No outro dia você encontra Potentia no local marcado, ela diz que só vai te dar uma tentativa e que é melhor fazer valer.\r\n"
  				+ "\r\n"
  				+ "\r\n"
  				+ "Você diz que não vai decepcioná-la.\r\n"
  				+ "ENTRE COM QUALQUER TECLA PARA CONTINUAR. \r\n");
		enter = entrada.next();
		System.out.println( "\r\n"
  				+ "");
  		System.out.print("Se prepare amigo!\n");
  				
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
							System.out.println("Você quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 1:
  					System.out.println("3^4+20=70+30+x");
  					int resposta26 = entrada.nextInt();
  					
  					if(resposta26 == 1) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 2:
  					System.out.println("6^2(2x-3x)+8=4^2+7^4-85");
  					double resul27 = entrada.nextDouble();
  					
  					if(resul27==13){
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 3:
  					System.out.println("4^3.2^0.2^3");
  					
  					double resposta28 = entrada.nextDouble();
  					
  					if(resposta28==1536) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Potentia e o atacou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 4:
  					System.out.println("Converta 10101 (binário) para sistema decimal:");
  					
  					int resposta29 = entrada.nextInt();
  					
  					if(resposta29 == 21) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Potentia e o atacou, quase lá!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  				case 5:
  					System.out.println("Converta 20971 (binário) para sistema decimal:");
  					
  					int resposta30 = entrada.nextInt();
  					
  					if(resposta30== 20000) {
  						numeroQuestoes ++;
						System.out.println("Você quebrou a guarda de Potentia e o derrotou!");
  					} else {
  						numeroQuestoes = 0;
  						numeroErros ++;
						System.out.println("Você errou e foi atacado!");
  					}
  					break;
  			}
  		} while((numeroQuestoes < 6) && (numeroErros < 3));
  		
  		if(numeroErros == 3) {
  			System.out.println("Voce perdeu, errou as três tentativas.");
  			
  		} else {
  			System.out.println("Você a derrotou com êxito!");
  			continuar = 2;
  			loading++;
  		}
  		
  		if(numeroErros == 3) {
  		System.out.println("\nDeseja continuar: " + "1) Sim " + "2) Não");
  		 continuar = entrada.nextInt();
  		}
  		
  		
  	}while(continuar != 2); 
      }
      if (loading==6) {
    	  
    	  int numeroErros = 0;
    		int numeroQuestoes = 0;
    		int continuar = 0;
    		
    		System.out.println("Você chega a ponto de nocautear Potentia, mas para.\r\n"
    				+ "\r\n"
    				+ "Ela diz que aceita a derrota, e que você superou ela.\r\n"
    				+ "Ela te joga o bracelete, e diz que é novo ver um sem aptidão tão perto de se tornar o Invicta Math.\r\n"
    				+ "Você diz que muitos confiaram em você para isso, e que agora você pode cumprir o objetivo.\r\n"
    				+ "\r\n"
    				+ "Potentia sorri e diz que confia em você também.\r\n"
    				+ "\r\n"
    				+ "No exato momento você ouve uma explosão vinda da cidade.\r\n"
    				+ "");
    		System.out.println("Você e Potentia correm para ver o que está acontecendo.\r\n"
    				+ "Chegando no centro você vê a Invicta Math mobilizando exércitos para destruir.\r\n"
    				+ "Você e Potentia tentam pará-los.\r\n"
    				+ "Todos do exército de Invicta Math tem Operatios de nível Potentia.\r\n"
    				+ "Você e Potentia conseguem nocautear vários soldados.\r\n"
    				+ "A Invicta Math chega próximo a vocês, e em um instante nocauteia você e Potentia.\r\n"
    				+ "Desacordados vocês são levados a um lugar.\r\n"
    				+ "\r\n"
    				+ "\r\n"
    				+ "Mais tarde você acorda em uma cela aberta.\r\n"
    				+ "Potentia não estava com você.\r\n"
    				+ "Você sai da cela e vai caminhando devagar.\r\n"
    				+ "Não há ninguém por perto, você vai caminhando e procurando pelas salas, mas ninguém está ali.\r\n"
    				+ "Até que você chega em um enorme cômodo.\r\n"
    				+ "No fundo da sala tem um trono, A Invicta Math está sentada ali e parece estar te esperando.\r\n"
    				+ "Você olha para o lado e vê Potentia caída no chão.\r\n"
    				+ "Você ia ajudá-la, mas o Invicta Math diz que ela já está morta e que você será o próximo.\r\n"
    				+ "Você percebe que já não tem mais saída, é matar ou morrer.\r\n"
    				+ "Você lê a Operatio da Invicta Math, ela é exatamente como a de Potentia, logo você quebra ela em um instante.\r\n"
    				+ "A Invicta Math sente a quebra de sua guarda mas nada acontece.\r\n"
    				+ "Você pergunta o porquê.\r\n"
    				+ "Ela responde que já está acostumada a isso, que alguém não pode ser um Invicta Math se nem ao menos poder aguentar uma quebra simples de guarda.\r\n"
    				+ "Ela aponta para você e diz que muito menos alguém que nem Operatio tem.\r\n"
    				+ "A Invicta Math levanta e diz que chegou a hora do seu julgamento.\r\n"
    				+ "Ela avança rapidamente e se prepara para desferir o golpe.\r\n"
    				+ "Quando ela estava prestes a te golpear, Potentia usa suas últimas forças e pula na frente levando o golpe em seu lugar.\r\n"
    				+ "Potentia morre na sua frente, sem poder dizer suas últimas palavras.\r\n"
    				+ "Você sente uma dor no peito de tristeza, mas ao mesmo tempo sente um ódio profundo.\r\n"
    				+ "Nesse momento você sente um formigar em todo seu corpo, você sente que algo está se formando, mas não sabe o que.\r\n"
    				+ "A Invicta Math diz que você é a maior ameaça para este mundo, alguém incerto, cujo futuro não pode ser controlado.\r\n"
    				+ "Você não fala nada só se prepara para atacar.\r\n"
    				+ "A Invicta Math diz que seu nome é Unum, que é para você se lembrar antes de morrer.\r\n"
    				+ "Vocês dois se preparam para desferir ataques, você quebra a guarda de Unum, mas ela não sente nada, porém ela continua avançando deixando uma brecha para atacar.\r\n"
    				+ "Quando a colisão está próxima a acontecer você sente o formigamento parar, parece que estava pronto.\r\n"
    				+ "No exato momento Unum recebe uma onda de choque e é arremessada para o fundo da sala.\r\n"
    				+ "Você não entendeu o que acabou de acontecer.\r\n"
    				+ "Unum se levanta, limpando o sangue que escorria de sua boca, e diz que finalmente a incerteza tinha se formado, que você firmou sua Operatio.\r\n"
    				+ "Você olha para si mesmo e percebe que tem uma Operatio, só que você não sabe que elemento é esse.\r\n"
    				+ "");
    		
    		System.out.println("Você tinha descoberto um novo poder.\r\n"
    				+ "Você foi o primeiro e único com a aptidão de Rad-Iciação.\r\n"
    				+ "Unum diz que isso era a incerteza, todos que são taxados de sem aptidão na verdade estão \npropensos a conseguir uma aptidão não descoberta, e que sem o devido controle todo mundo entraria em caos.\r\n"
    				+ "Você diz que tudo isso é bobagem, e que é hora do acerto de contas.\r\n"
    				+ "");
    		
    		//ÚLTIMO BOSS, APENAS 3 DESAFIOS, ONDE NÃO SE PODE ERRAR NENHUMA VEZ
      
      do {
    		do {
    			if(continuar == 1) {
    				numeroErros = numeroErros - numeroErros;
    				continuar = 0;
    			}
    			
    			switch(numeroQuestoes) {
    				case 0:
    					System.out.println("Uma região no formato de quadrado possui área igual a 729 m².\n Diante disso, qual é a medida do lado dessa região, em metros?");
    					
    					int resposta31 = entrada.nextInt();
    					
    					if(resposta31 == 27) {
    						numeroQuestoes ++;
  							System.out.println("Você quebrou a guarda do inimigo e o atacou!");
    					} else {
    						numeroQuestoes = 0;
    						numeroErros ++;
  						System.out.println("Você errou e foi atacado!");
    					}
    					break;
    				case 1:
    					System.out.println("√√81+√16-√225+√144");
    					int resposta32 = entrada.nextInt();
    					
    					if(resposta32 == 4) {
    						numeroQuestoes ++;
  						System.out.println("Você quebrou a guarda do inimigo e o atacou!");
    					} else {
    						numeroQuestoes = 0;
    						numeroErros ++;
  						System.out.println("Você errou e foi atacado!");
    					}
    					break;
    				case 2:
    					System.out.println("√81+2x=19");
    					double resul33 = entrada.nextDouble();
    					
    					if(resul33==5){
    						numeroQuestoes ++;
  						System.out.println("Você quebrou a guarda do inimigo e o atacou, continue assim!");
    					} else {
    						numeroQuestoes = 0;
    						numeroErros ++;
  						System.out.println("Você errou e foi atacado!");
    					}
    					break;
    				case 3:
    					
    			}
    		} while((numeroQuestoes < 3) && (numeroErros < 1));
    		
    		if(numeroErros == 1) {
    			System.out.println("Voce perdeu, errou as três tentativas.");
    			
    		} else {
    			System.out.println("Você a derrotou com êxito!");
    			continuar = 2;
    			loading++;
    		}
    		
    		if(numeroErros == 1) {
    		System.out.println("\nDeseja tentar novamente: " + "1) Sim " + "2) Não");
    		 continuar = entrada.nextInt();
    		}
    		
    		
    	}while(continuar != 2); 
        }
        if (loading==7) {
        	
        	System.out.println("Unum cai no chão cansada, e afirma não ser possível que ela tenha perdido.\r\n"
        			+ "Você percebe que onde estavam batalhando era uma igreja.\r\n"
        			+ "Unum já não tem forças para falar, suas últimas palavras são que a era do Caos tinha chegado.\r\n"
        			+ "Unum morre na sua frente, você sente um alívio no peito, mas ainda uma tristeza pelo sacrifício de Potentia.\r\n"
        			+ "Você decide ir ao fundo da Igreja, para descobrir os segredos do mundo.\r\n"
        			+ "Chegando lá é um quarto escuro, cheio de inscrições na parede e alguns livros, você pega um deles e começa a ler as anotações.\r\n"
        			+ "É dito várias formas de tortura psicóloica contra os sem aptidão,\n o objetivo disso era para que eles nunca fossem capazes de obter qualquer uma das suas aptidões desconhecidas, dizia que o mundo não poderia mudar, e para isso sacrifícios são necessários.\r\n"
        			+ "\r\n"
        			+ "Você se enche de ódio, percebe que tudo que você viveu, e viu outras pessoas passarem era tudo manipulado para aquilo acontecer.\r\n"
        			+ "Você se lembra das palavras de Potentia, e decide que agora que é o Invicta Math vai mudar isso da sua forma.\r\n"
        			+ "\r\n"
        			+ "Você sai daquela igreja, estava em uma cidade, com várias pessoas ao redor você mostra o bracelete do Invicta Math\n e diz que a partir de agora as coisas vão ser diferentes.\r\n"
        			+ "As pessoas entendem que você derrotou Unum, algumas não aceitam, principalmente os clérigos,\n mas ninguém consegue ler sua Operatio e não conseguem fazer nada.\r\n"
        			+ "Alguns soldados da antiga Math diz que servem ao Invicta Math, e como tradição se você se tornou o Invicta Math eles vão te servir.\r\n"
        			+ "Você decide que é hora de agir.\r\n"
        			+ "");
        	
        	if(radical>pacifista) {
        		System.out.println("Você não aceitava a injustiça para aqueles sem aptidão,\n então você decidiu acabar com isso de uma vez por todas. Todos aqueles que nasciam sem aptidão tinham proteção total do seu governo, e o poder de decisão para cima dos outros, você impôs regras severas àqueles que tinham aptidão, e acabou subjugando alguns deles.\r\n"
        				+ "Você cansou de ver a injustiça sendo tomada para os mais fracos,\n então decidiu suprimir os mais fortes de formas absurdas.\r\n"
        				+ "Muitos eram contra você, mas não podiam fazer nada.\r\n"
        				+ "Nos livros de história você era taxado como uma ameaça, \num criador de uma época das trevas, que foi derrubado por um herói de verdade.\r\n"
        				+ "Infelizmente os seus ideais eram cruéis e não foram passados adiante,\n e com o tempo você acabou sendo esquecido ou censurado da história.\r\n"
        				+ "");
        		System.out.println("⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⡆⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠉⠉⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣧⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣇⣴⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣿⠀⢠⣿⣿⣿⣿⣿⣿⣟⣁⣸⣿⣷⣿⣿⣋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣿⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠻⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣿⣧⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠂⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⢻⣿⣿⣿⡿⠿⠿⠿⠟⠻⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⡿⢻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣧⣸⣿⣿⣿⣇⣀⣀⣀⣀⣤⣾⣿⣶⣦⡀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
        				+ "⣿⣿⣿⣿⣷⣶⣤⣤⣤⣤⣤⣾⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        	}
        	else {
        		System.out.println("Com o auxílio das outras cidades que te apoiam,\n você decide organizar um grupo de soldados para cada uma delas para que eles possam trazer segurança a todos.\r\n"
        				+ "Você volta para cidades, reencontra velhos amigos e diz que a hora de mudar chegou.\r\n"
        				+ "Você foi capaz de ajustar os problemas de injustiça,\n você não usou a força, mas sim o seu cérebro, e levou a humanidade a um período de paz, onde todos se ajudavam, e aqueles que desrespeitam os direitos dos outros eram punidos severamente.\r\n"
        				+ "Nos livros de história você era um herói, um salvador de um período das trevas,\n alguém que foi até o fim com suas convicções, e no final foi recompensado e recompensou os outros.\r\n"
        				+ "Um verdadeiro herói.\r\n"
        				+ "");
        		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠀⣀⢄⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠴⣦⣄⣣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣟⣓⠂⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠩⠾⢿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⡿⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣷⣶⣦⣤⣀⣀⣀⠀⠸⣿⣿⣿⣿⠇⢀⣀⣀⣤⣤⣶⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠇⢹⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡟⠀⠀⢿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠁⠀⠀⠘⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠀⠀⠀⠀⢿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⠀⠀⠀⠀⠘⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡿⠀⠀⠀⠀⠀⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⡇⠀⠀⠀⠀⠀⠻⣿⣿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠹⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠺⠿⠟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠿⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
        				+ "");     	  
}


	}
	}
}


