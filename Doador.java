import java.util.Scanner;

public class Doador {
	
	private String itemDoado; //Op��es 1, 2 e 3
	private int quantidade;

	public String getAlimento() {
		return itemDoado;
	}

	public void setAlimento(String alimento) {
		this.itemDoado = alimento;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void menuDeOpcoes() {
		
	}
	
	public void Doar(int itemDoado) {

		if(itemDoado == 1) {
			System.out.println("Digite a quantidade dos alimentos/suprimentos que voc� pretende doar\n");

			System.out.println("======MENU DE OP�OES======\n");
			System.out.println("1 - Arroz(5kg) \n"
					+ "2 - Feij�o(1kg) \n"
					+ "3 - �leo \n"
					+ "4 - Fuba \n"
					+ "5 - Farinha \n"
					+ "6 - Macarr�o \n"
					+ "7 - Leite \n"
					+ "8 - Sal \n"
					+ "9 - A�ucar \n"
					+ "10 - Extrato de Tomate \n"
					+ "11 - Caf� \n"
					+ "12 - Bolacha �gua e Sal \n"
					+ "13 - Bolacha de Maizena \n"
					+ "13 - Sardinha \n"
					+ "14 - Bisnaga \n"
					+ "15 - Bo5o Pronto \n"
					+ "16 - Caixa de Suco/Toddy \n"
					+ "17 - Garrafa de �gua\n");

		}

		else if(itemDoado == 2 ) {
				System.out.println("Digite a quantidade dos alimentos/suprimentos que voc� pretende doar\n");
	
				System.out.println("======MENU DE OP�OES======\n");
				System.out.println("1 - Cobertores \n"
						+ "2 - Toalhas de Banho \n"
						+ "3 - Toalhas de Rosto \n");
		}
		
		else if(itemDoado == 3) {
				System.out.println("Digite a quantidade dos alimentos/suprimentos que voc� pretende doar\n");
				
				System.out.println("======MENU DE OP�OES======\n");
				System.out.println("1 - Sabonetes \n"
						+ "2 - M�scaras de Pano \n"
						+ "3 - M�scaras PFF2 \n"
						+ "4 - �lcool em Gel \n"
						+ "5 - Escova \n"
						+ "5 - Pasta de Dente \n"
						+ "6 - Detergente \n"
						+ "7 - Bucha de lavar lou�a \n"
						+ "8 - Sab�o em P� \n"
						+ "9 - Sab�o em Pedra \n"
						+ "10 - �lcool 70: \n");
		}
		else {
			System.out.println("Op��o Inv�lida!");
		}
	}
	
	public void QuantidadeDoada() {
		Scanner entrada = new Scanner(System.in);
		int escolhaDoMenu, quantidade;
		System.out.println("Digite '-1' no o item desejado para finalizar a opera��o");
			
			do {
				System.out.println("Digite o n�mero do item desejado: ");
				escolhaDoMenu = entrada.nextInt();
				System.out.println("Quantidade: ");
				quantidade = entrada.nextInt();
			}while(escolhaDoMenu != -1);
		}
}
