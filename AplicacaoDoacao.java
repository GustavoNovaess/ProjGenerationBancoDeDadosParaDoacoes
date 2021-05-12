package projeto.bloco1;

import java.util.Scanner;

public class AplicacaoDoacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int finalizador = 0; 
		char operacao;
		
		System.out.println("=====\tSISTEMA DE CADASTRO PARA DOA��ES DURANTE A PANDEMIA\t====="); //nome da ong
		
		do {
			
			System.out.println("DIGITE O N�MERO QUE REPRESENTE A OPERA��O QUE DESEJA REALIZAR:\n");
			System.out.println("[1] - EXECUTAR O PROGRAMA COMO RECEBEDOR");
			System.out.println("[2] - EXECUTAR O PROGRAMA COMO DOADOR");
			System.out.println("[3] - EXECUTAR O PROGRAMA COMO FUNCION�RIO");
			System.out.println("[4] - CHECAR ESTOQUE");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			
			System.out.print("ESPERANDO OPERA��O... ");
			operacao = entrada.next(".").charAt(0);
			
			switch(operacao) {
			
			case '1': // Executar instru��es da classe recebedor
				System.out.println("\nRECEBEDOR\n");
				break;
				
			case '2': // Executar instru��es da classe doador
				System.out.println("\nDOADOR\n");
				break;
				
			case '3': // Executar instru��es da classe funcion�rio
				System.out.println("\nFUNCION�RIO\n");
				break;
				
			case '4': // Checar o Estoque **
				System.out.println("\nESTOQUE\n");
				break;
				
			case '0': // finalizar o programa
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
