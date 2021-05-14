package projeto.bloco1;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoDoacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Recebedor recebedor = new Recebedor();
		Doador doador = new Doador();
		Estoque estoque = new Estoque("",0);
		
		ArrayList <Recebedor> recebedorLista = new ArrayList<>();
		ArrayList <Doador> doadorLista = new ArrayList<>();
		ArrayList <Estoque> estoqueAlimentos = new ArrayList<>();
		ArrayList <Estoque> estoqueCobertores = new ArrayList<>();
		ArrayList <Estoque> estoqueLimpeza = new ArrayList<>();
		
		estoqueAlimentos = estoque.inicializarEstoqueAlimentos(estoqueAlimentos);
		estoqueCobertores = estoque.inicializarEstoqueCobertores(estoqueCobertores);
		estoqueLimpeza = estoque.inicializarEstoqueLimpeza(estoqueLimpeza);
		
		char cesta;
		int finalizador = 0,finalizadorAuxiliar = 0; 
		int operacao,doacao = -1;
		
		System.out.println("=====\tSISTEMA DE CADASTRO PARA DOAÇÕES DURANTE A PANDEMIA\t====="); //nome da ong
		
		do {
			
			System.out.println("\nDIGITE O NÚMERO QUE REPRESENTE A OPERAÇÃO QUE DESEJA REALIZAR:\n");
			System.out.println("[1] - EXECUTAR O PROGRAMA COMO RECEBEDOR");
			System.out.println("[2] - EXECUTAR O PROGRAMA COMO DOADOR");
			System.out.println("[3] - CHECAR LISTA DE RECEBEDORES");
			System.out.println("[4] - CHECAR LISTA DE DOADORES");
			System.out.println("[5] - CHECAR ESTOQUE");
			System.out.println("[6] - DOAR CESTA");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			
			System.out.print("ESPERANDO OPERAÇÃO... ");
			operacao = entrada.nextInt();
			
			switch(operacao) {
			
			case 1: // Executar instruções da classe recebedor
				System.out.println("\nRECEBEDOR\n");
				recebedor = recebedor.cadastro();
				recebedorLista.add(recebedor);
				break;
				
			case 2: // Executar instruções da classe doador
				System.out.println("\nDOADOR\n");
				doador = doador.cadastro();
				doadorLista.add(doador);
				do {
					System.out.println("\nDIGITE O NÚMERO REFERENTE AO TIPO DE ITEM QUE DESEJA DOAR:\n");
					System.out.println("[1] - ALIMENTOS E SUPRIMENTOS");
					System.out.println("[2] - COBERTORES E TOALHAS");
					System.out.println("[3] - PRODUTOS DE LIMPEZA E HIGIENE PESSOAL");
					System.out.println("[4] - FINALIZAR DOAÇÃO");
					
					doacao = entrada.nextInt();
					
					switch(doacao) {
					case 1:
						estoqueAlimentos = doador.Doar(doacao,estoqueAlimentos);
						break;
					case 2:
						estoqueCobertores = doador.Doar(doacao,estoqueCobertores);
						break;
					case 3:
						estoqueLimpeza = doador.Doar(doacao,estoqueLimpeza);
						break;
					case 4:
						finalizadorAuxiliar = 1;
						break;
					default:
						System.err.println("\nOPERAÇÃO INVÁLIDA. POR FAVOR INSIRA UMA OPERAÇÃO VÁLIDA.\n");
						break;
					}
				}while(finalizadorAuxiliar == 0);
				finalizadorAuxiliar = 0;
				System.out.println("   ____  _          _                 _                                                    _           _       _ \r\n"
						+ "  / __ \\| |        (_)               | |                                                  (_)         | |     | |\r\n"
						+ " | |  | | |__  _ __ _  __ _  __ _  __| | ___    _ __   ___  _ __   ___ _   _  __ _    __ _ _ _   _  __| | __ _| |\r\n"
						+ " | |  | | '_ \\| '__| |/ _` |/ _` |/ _` |/ _ \\  | '_ \\ / _ \\| '__| / __| | | |/ _` |  / _` | | | | |/ _` |/ _` | |\r\n"
						+ " | |__| | |_) | |  | | (_| | (_| | (_| | (_) | | |_) | (_) | |    \\__ \\ |_| | (_| | | (_| | | |_| | (_| | (_| |_|\r\n"
						+ "  \\____/|_.__/|_|  |_|\\__, |\\__,_|\\__,_|\\___/  | .__/ \\___/|_|    |___/\\__,_|\\__,_|  \\__,_| |\\__,_|\\__,_|\\__,_(_)\r\n"
						+ "                       __/ |                   | |                                       _/ |                    \r\n"
						+ "                      |___/                    |_|                                      |__/       "); //*****
				break;
				
			case 3: // Checa Lista de Recebedores
				System.out.println(recebedorLista);
				break;
				
			case 4: // Checa Lista de Doadores
				System.out.println(doadorLista);
				break;
				
			case 5: // Checar o Estoque **
				System.out.println("\n==========\t\tESTOQUE DE ALIMENTOS E SUPRIMENTOS\t\t==========\n");
				System.out.println(estoqueAlimentos);
				System.out.println("\n==========\t\tESTOQUE DE COBERTORES E TOALHAS\t\t==========\n");
				System.out.println(estoqueCobertores);
				System.out.println("\n==========\t\tESTOQUE DE PRODUTOS DE LIMPEZA E HIGIENE PESSOAL\t\t==========\n");
				System.out.println(estoqueLimpeza);
				System.out.println("\n");
				break;
				
			case 6: // DoarCesta
				
				if(!recebedorLista.isEmpty()) {
					cesta = recebedorLista.get(0).tipoDeCesta;
					recebedorLista.remove(0);
					doarCesta(cesta, estoqueAlimentos, estoqueCobertores, estoqueLimpeza);
				} else {
					System.err.println("\nLISTA DE RECEBEDORES VAZIA\n");
				}
				
				break;
				
			case 0: // finalizar o programa
				System.err.println("\nPROGRAMA FINALIZADO\n");
				finalizador = 1;
				break;
				
			default: // caso o usuário digite algo errado
				System.err.println("\nOPERAÇÃO INVÁLIDA. POR FAVOR INSIRA UMA OPERAÇÃO VÁLIDA.\n");
				break;
				
			}
			
		}while(finalizador == 0);
		
		
		
		entrada.close();
	}
	
	
	public static void doarCesta(char cesta, ArrayList<Estoque> estoqueAlimentos, ArrayList<Estoque> estoqueCobertores , ArrayList <Estoque> estoqueLimpeza) {
		
		Recebedor recebedor = new Recebedor();
		
		int temNoEstoque = 0, verificador = 1;
		if (cesta == 'P' ) {
			if(estoqueAlimentos.get(0).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(1).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(2).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(3).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(4).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(5).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(6).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(7).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(8).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(9).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(10).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(0).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(1).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(2).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(0).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(1).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(2).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(3).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(4).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(5).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(6).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(7).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(8).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(9).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(10).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			}
			
			if (verificador == 1) {
				temNoEstoque = 1;
			} else {
				System.out.println("NÃO HÁ ITENS SUFICIENTES NO ESTOQUE PARA MONTAR UMA CESTA TIPO " + cesta + "\n");
			}
		}
		
		if (cesta == 'M' ) {
			if(estoqueAlimentos.get(0).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(1).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(2).getQuantidade() < 1 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(3).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(4).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(5).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(6).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(7).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(8).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(9).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(10).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(0).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(1).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(2).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(0).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(1).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(2).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(3).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(4).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(5).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(6).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(7).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(8).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(9).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(10).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			}
			
			if (verificador == 1) {
				temNoEstoque = 1;
			} else {
				System.err.println("\nNÃO HÁ ITENS SUFICIENTES NO ESTOQUE PARA MONTAR UMA CESTA TIPO " + cesta + "\n");
			}
		}
		
		if (cesta == 'G' ) {
			if(estoqueAlimentos.get(0).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(1).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(2).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(3).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(4).getQuantidade() < 5 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(5).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(6).getQuantidade() < 5 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(7).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(8).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(9).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueAlimentos.get(10).getQuantidade() < 5 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(0).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(1).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueCobertores.get(2).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(0).getQuantidade() < 8 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(1).getQuantidade() < 9 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(2).getQuantidade() < 9 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(3).getQuantidade() < 4 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(4).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(5).getQuantidade() < 6 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(6).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(7).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(8).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(9).getQuantidade() < 3 && verificador == 1) {
				verificador = 0;
			} else if (estoqueLimpeza.get(10).getQuantidade() < 2 && verificador == 1) {
				verificador = 0;
			}
			
			if (verificador == 1) {
				temNoEstoque = 1;
			} else {
				System.err.println("\nNÃO HÁ ITENS SUFICIENTES NO ESTOQUE PARA MONTAR UMA CESTA TIPO " + cesta + "\n");
			}
		}
		
		if(cesta == 'P' && temNoEstoque == 1) {
			
			estoqueAlimentos.get(0).setQuantidade(estoqueAlimentos.get(0).getQuantidade() - 1);
			estoqueAlimentos.get(1).setQuantidade(estoqueAlimentos.get(1).getQuantidade() - 2);
			estoqueAlimentos.get(2).setQuantidade(estoqueAlimentos.get(2).getQuantidade() - 1);
			estoqueAlimentos.get(3).setQuantidade(estoqueAlimentos.get(3).getQuantidade() - 1);
			estoqueAlimentos.get(4).setQuantidade(estoqueAlimentos.get(4).getQuantidade() - 2);
			estoqueAlimentos.get(5).setQuantidade(estoqueAlimentos.get(5).getQuantidade() - 1);
			estoqueAlimentos.get(6).setQuantidade(estoqueAlimentos.get(6).getQuantidade() - 2);
			estoqueAlimentos.get(7).setQuantidade(estoqueAlimentos.get(7).getQuantidade() - 1);
			estoqueAlimentos.get(8).setQuantidade(estoqueAlimentos.get(8).getQuantidade() - 2);
			estoqueAlimentos.get(9).setQuantidade(estoqueAlimentos.get(9).getQuantidade() - 1);
			estoqueAlimentos.get(10).setQuantidade(estoqueAlimentos.get(10).getQuantidade() - 2);
			
			estoqueCobertores.get(0).setQuantidade(estoqueCobertores.get(0).getQuantidade() - 1);
			estoqueCobertores.get(1).setQuantidade(estoqueCobertores.get(1).getQuantidade() - 2);
			estoqueCobertores.get(2).setQuantidade(estoqueCobertores.get(2).getQuantidade() - 1);
			
			estoqueLimpeza.get(0).setQuantidade(estoqueLimpeza.get(0).getQuantidade() - 2);
			estoqueLimpeza.get(1).setQuantidade(estoqueLimpeza.get(1).getQuantidade() - 3);
			estoqueLimpeza.get(2).setQuantidade(estoqueLimpeza.get(2).getQuantidade() - 3);
			estoqueLimpeza.get(3).setQuantidade(estoqueLimpeza.get(3).getQuantidade() - 1);
			estoqueLimpeza.get(4).setQuantidade(estoqueLimpeza.get(4).getQuantidade() - 3);
			estoqueLimpeza.get(5).setQuantidade(estoqueLimpeza.get(5).getQuantidade() - 4);
			estoqueLimpeza.get(6).setQuantidade(estoqueLimpeza.get(6).getQuantidade() - 2);
			estoqueLimpeza.get(7).setQuantidade(estoqueLimpeza.get(7).getQuantidade() - 1);
			estoqueLimpeza.get(8).setQuantidade(estoqueLimpeza.get(8).getQuantidade() - 1);
			estoqueLimpeza.get(9).setQuantidade(estoqueLimpeza.get(9).getQuantidade() - 1);
			estoqueLimpeza.get(10).setQuantidade(estoqueLimpeza.get(10).getQuantidade() - 1);
			
			recebedor.tipoDeCesta(cesta);
			
		} else if (cesta == 'M' && temNoEstoque == 1) {
			
			estoqueAlimentos.get(0).setQuantidade(estoqueAlimentos.get(0).getQuantidade() - 2);
			estoqueAlimentos.get(1).setQuantidade(estoqueAlimentos.get(1).getQuantidade() - 4);
			estoqueAlimentos.get(2).setQuantidade(estoqueAlimentos.get(2).getQuantidade() - 1);
			estoqueAlimentos.get(3).setQuantidade(estoqueAlimentos.get(3).getQuantidade() - 2);
			estoqueAlimentos.get(4).setQuantidade(estoqueAlimentos.get(4).getQuantidade() - 4);
			estoqueAlimentos.get(5).setQuantidade(estoqueAlimentos.get(5).getQuantidade() - 2);
			estoqueAlimentos.get(6).setQuantidade(estoqueAlimentos.get(6).getQuantidade() - 4);
			estoqueAlimentos.get(7).setQuantidade(estoqueAlimentos.get(7).getQuantidade() - 2);
			estoqueAlimentos.get(8).setQuantidade(estoqueAlimentos.get(8).getQuantidade() - 2);
			estoqueAlimentos.get(9).setQuantidade(estoqueAlimentos.get(9).getQuantidade() - 2);
			estoqueAlimentos.get(10).setQuantidade(estoqueAlimentos.get(10).getQuantidade() - 4);
			
			estoqueCobertores.get(0).setQuantidade(estoqueCobertores.get(0).getQuantidade() - 2);
			estoqueCobertores.get(1).setQuantidade(estoqueCobertores.get(1).getQuantidade() - 3);
			estoqueCobertores.get(2).setQuantidade(estoqueCobertores.get(2).getQuantidade() - 2);
			
			estoqueLimpeza.get(0).setQuantidade(estoqueLimpeza.get(0).getQuantidade() - 4);
			estoqueLimpeza.get(1).setQuantidade(estoqueLimpeza.get(1).getQuantidade() - 6);
			estoqueLimpeza.get(2).setQuantidade(estoqueLimpeza.get(2).getQuantidade() - 6);
			estoqueLimpeza.get(3).setQuantidade(estoqueLimpeza.get(3).getQuantidade() - 2);
			estoqueLimpeza.get(4).setQuantidade(estoqueLimpeza.get(4).getQuantidade() - 6);
			estoqueLimpeza.get(5).setQuantidade(estoqueLimpeza.get(5).getQuantidade() - 6);
			estoqueLimpeza.get(6).setQuantidade(estoqueLimpeza.get(6).getQuantidade() - 3);
			estoqueLimpeza.get(7).setQuantidade(estoqueLimpeza.get(7).getQuantidade() - 2);
			estoqueLimpeza.get(8).setQuantidade(estoqueLimpeza.get(8).getQuantidade() - 2);
			estoqueLimpeza.get(9).setQuantidade(estoqueLimpeza.get(9).getQuantidade() - 2);
			estoqueLimpeza.get(10).setQuantidade(estoqueLimpeza.get(10).getQuantidade() - 2);
			
			recebedor.tipoDeCesta(cesta);
			
		} else if (cesta == 'G' && temNoEstoque == 1) {
			
			estoqueAlimentos.get(0).setQuantidade(estoqueAlimentos.get(0).getQuantidade() - 3);
			estoqueAlimentos.get(1).setQuantidade(estoqueAlimentos.get(1).getQuantidade() - 6);
			estoqueAlimentos.get(2).setQuantidade(estoqueAlimentos.get(2).getQuantidade() - 2);
			estoqueAlimentos.get(3).setQuantidade(estoqueAlimentos.get(3).getQuantidade() - 4);
			estoqueAlimentos.get(4).setQuantidade(estoqueAlimentos.get(4).getQuantidade() - 5);
			estoqueAlimentos.get(5).setQuantidade(estoqueAlimentos.get(5).getQuantidade() - 4);
			estoqueAlimentos.get(6).setQuantidade(estoqueAlimentos.get(6).getQuantidade() - 5);
			estoqueAlimentos.get(7).setQuantidade(estoqueAlimentos.get(7).getQuantidade() - 2);
			estoqueAlimentos.get(8).setQuantidade(estoqueAlimentos.get(8).getQuantidade() - 4);
			estoqueAlimentos.get(9).setQuantidade(estoqueAlimentos.get(9).getQuantidade() - 2);
			estoqueAlimentos.get(10).setQuantidade(estoqueAlimentos.get(10).getQuantidade() - 5);
			
			estoqueCobertores.get(0).setQuantidade(estoqueCobertores.get(0).getQuantidade() - 4);
			estoqueCobertores.get(1).setQuantidade(estoqueCobertores.get(1).getQuantidade() - 4);
			estoqueCobertores.get(2).setQuantidade(estoqueCobertores.get(2).getQuantidade() - 2);
			
			estoqueLimpeza.get(0).setQuantidade(estoqueLimpeza.get(0).getQuantidade() - 8);
			estoqueLimpeza.get(1).setQuantidade(estoqueLimpeza.get(1).getQuantidade() - 9);
			estoqueLimpeza.get(2).setQuantidade(estoqueLimpeza.get(2).getQuantidade() - 9);
			estoqueLimpeza.get(3).setQuantidade(estoqueLimpeza.get(3).getQuantidade() - 4);
			estoqueLimpeza.get(4).setQuantidade(estoqueLimpeza.get(4).getQuantidade() - 6);
			estoqueLimpeza.get(5).setQuantidade(estoqueLimpeza.get(5).getQuantidade() - 6);
			estoqueLimpeza.get(6).setQuantidade(estoqueLimpeza.get(6).getQuantidade() - 3);
			estoqueLimpeza.get(7).setQuantidade(estoqueLimpeza.get(7).getQuantidade() - 2);
			estoqueLimpeza.get(8).setQuantidade(estoqueLimpeza.get(8).getQuantidade() - 2);
			estoqueLimpeza.get(9).setQuantidade(estoqueLimpeza.get(9).getQuantidade() - 3);
			estoqueLimpeza.get(10).setQuantidade(estoqueLimpeza.get(10).getQuantidade() - 2);
			
			recebedor.tipoDeCesta(cesta);
			
		}
		
	}
}
