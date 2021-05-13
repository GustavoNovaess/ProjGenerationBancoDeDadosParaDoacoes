package projeto.bloco1;

import java.util.ArrayList;
import java.util.Scanner;

// "////" representa coisas espec�ficas que ainda precisa fazer
public class AplicacaoDoacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Recebedor recebedor = new Recebedor();
		ArrayList <Recebedor> recebedorLista = new ArrayList<>();
		
		int finalizador = 0; 
		int operacao;
		
		System.out.println("=====\tSISTEMA DE CADASTRO PARA DOA��ES DURANTE A PANDEMIA\t====="); //nome da ong
		
		do {
			
			System.out.println("DIGITE O N�MERO QUE REPRESENTE A OPERA��O QUE DESEJA REALIZAR:\n");
			System.out.println("[1] - EXECUTAR O PROGRAMA COMO RECEBEDOR");
			System.out.println("[2] - EXECUTAR O PROGRAMA COMO DOADOR");
			System.out.println("[3] - EXECUTAR O PROGRAMA COMO FUNCION�RIO");
			System.out.println("[4] - CHECAR LISTA DE RECEBEDORES");
			System.out.println("[5] - CHECAR ESTOQUE");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			
			System.out.print("ESPERANDO OPERA��O... ");
			operacao = entrada.nextInt();
			
			switch(operacao) {
			
			case 1: // Executar instru��es da classe recebedor
				System.out.println("\nRECEBEDOR\n");
				recebedor.cadastro();
				recebedorLista.add(recebedor);
				//// Imprimir a cesta
				break;
				
			case 2: // Executar instru��es da classe doador
				System.out.println("\nDOADOR\n");
				break;
				
			case 3: // Executar instru��es da classe funcion�rio
				System.out.println("\nFUNCION�RIO\n");
				break;
				
			case 4: // Checar lista de recebedores
				System.out.println(recebedorLista);
				break;
				
			case 5: // Checar o Estoque **
				break;
			case 0: // finalizar o programa
				System.err.println("\nPROGRAMA FINALIZADO\n");
				finalizador = 1;
				break;
				
			default: // caso o usu�rio digite algo errado
				System.err.println("\nOPERA��O INV�LIDA. POR FAVOR INSIRA UMA OPERA��O V�LIDA\n");
				break;
				
			}
			
		}while(finalizador == 0);
		
		entrada.close();
	}
	
}
