package projeto.bloco1;

import java.util.ArrayList;
import java.util.Scanner;

// "////" representa coisas espec�ficas que ainda precisa fazer
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
		
		int finalizador = 0,finalizadorAuxiliar = 0; 
		int operacao,doacao = -1;
		
		System.out.println("=====\tSISTEMA DE CADASTRO PARA DOA��ES DURANTE A PANDEMIA\t====="); //nome da ong
		
		do {
			
			System.out.println("DIGITE O N�MERO QUE REPRESENTE A OPERA��O QUE DESEJA REALIZAR:\n");
			System.out.println("[1] - EXECUTAR O PROGRAMA COMO RECEBEDOR");
			System.out.println("[2] - EXECUTAR O PROGRAMA COMO DOADOR");
			System.out.println("[3] - EXECUTAR O PROGRAMA COMO FUNCION�RIO");
			System.out.println("[4] - CHECAR LISTA DE RECEBEDORES");
			System.out.println("[5] - CHECAR LISTA DE DOADORES");
			System.out.println("[6] - CHECAR ESTOQUE");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			
			System.out.print("ESPERANDO OPERA��O... ");
			operacao = entrada.nextInt();
			
			switch(operacao) {
			
			case 1: // Executar instru��es da classe recebedor
				System.out.println("\nRECEBEDOR\n");
				recebedor = recebedor.cadastro();
				recebedorLista.add(recebedor);
				//// Imprimir a cesta
				break;
				
			case 2: // Executar instru��es da classe doador
				System.out.println("\nDOADOR\n");
				doador = doador.cadastro();
				doadorLista.add(doador);
				do {
					System.out.println("\nDIGITE O N�MERO REFERENTE AO TIPO DE ITEM QUE DESEJA DOAR:\n");
					System.out.println("[1] - ALIMENTOS E SUPRIMENTOS");
					System.out.println("[2] - COBERTORES E TOALHAS");
					System.out.println("[3] - PRODUTOS DE LIMPEZA E HIGIENE PESSOAL");
					System.out.println("[4] - FINALIZAR DOA��O");
					
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
						System.err.println("\nOPERA��O INV�LIDA. POR FAVOR INSIRA UMA OPERA��O V�LIDA.\n");
						break;
					}
				}while(finalizadorAuxiliar == 0);
				finalizadorAuxiliar = 0;
				System.out.println("Obrigado por sua doa��o."); //*****
				break;
				
			case 3: // Executar instru��es da classe funcion�rio
				System.out.println("\nFUNCION�RIO\n");
				break;
				
			case 4: // Checa Lista de Recebedores
				System.out.println(recebedorLista);
				break;
				
			case 5: // Checa Lista de Doadores
				System.out.println(doadorLista);
				break;
				
			case 6: // Checar o Estoque **
				System.out.println("\n==========\t\tESTOQUE DE ALIMENTOS E SUPRIMENTOS\t\t==========\n");
				System.out.println(estoqueAlimentos);
				System.out.println("\n==========\t\tESTOQUE DE COBERTORES E TOALHAS\t\t==========\n");
				System.out.println(estoqueCobertores);
				System.out.println("\n==========\t\tESTOQUE DE PRODUTOS DE LIMPEZA E HIGIENE PESSOAL\t\t==========\n");
				System.out.println(estoqueLimpeza);
				System.out.println("\n");
				break;
			case 0: // finalizar o programa
				System.err.println("\nPROGRAMA FINALIZADO\n");
				finalizador = 1;
				break;
				
			default: // caso o usu�rio digite algo errado
				System.err.println("\nOPERA��O INV�LIDA. POR FAVOR INSIRA UMA OPERA��O V�LIDA.\n");
				break;
				
			}
			
		}while(finalizador == 0);
		
		
		
		entrada.close();
	}
	
}
