package projeto.bloco1;

import java.util.Scanner;
// "////" representa coisas específicas que ainda precisa fazer
public class AplicacaoDoacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int finalizador = 0; 
		char operacao;
		
		System.out.println("=====\tSISTEMA DE CADASTRO PARA DOAÇÕES DURANTE A PANDEMIA\t====="); //nome da ong
		
		do {
			
			System.out.println("DIGITE O NÚMERO QUE REPRESENTE A OPERAÇÃO QUE DESEJA REALIZAR:\n");
			System.out.println("[1] - EXECUTAR O PROGRAMA COMO RECEBEDOR");
			System.out.println("[2] - EXECUTAR O PROGRAMA COMO DOADOR");
			System.out.println("[3] - EXECUTAR O PROGRAMA COMO FUNCIONÁRIO");
			System.out.println("[4] - CHECAR ESTOQUE");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			
			System.out.print("ESPERANDO OPERAÇÃO... ");
			operacao = entrada.next(".").charAt(0);
			
			switch(operacao) {
			
			case '1': // Executar instruções da classe recebedor
				System.out.println("\nRECEBEDOR\n");
				//// Imprimir a cesta
				break;
				
			case '2': // Executar instruções da classe doador
				System.out.println("\nDOADOR\n");
				break;
				
			case '3': // Executar instruções da classe funcionário
				System.out.println("\nFUNCIONÁRIO\n");
				break;
				
			case '4': // Checar o Estoque **
				System.out.println("\nESTOQUE\n");
				break;
				
			case '0': // finalizar o programa
				System.err.println("\nPROGRAMA FINALIZADO\n");
				finalizador = 1;
				break;
				
			default: // caso o usuário digite algo errado
				System.err.println("\nOPERAÇÃO INVÁLIDA. POR FAVOR INSIRA UMA OPERAÇÃO VÁLIDA\n");
				break;
				
			}
			
		}while(finalizador == 0);
		
		entrada.close();
	}
	
}
