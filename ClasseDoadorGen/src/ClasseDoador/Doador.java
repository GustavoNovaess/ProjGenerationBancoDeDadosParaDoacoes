package ClasseDoador;

import java.util.Scanner;

public class Doador {

	private String itemDoado; //Opções 1, 2 e 3
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
			System.out.println("Digite a quantidade dos alimentos/suprimentos que você pretende doar\n");

			System.out.println("======MENU DE OPÇOES======\n");
			System.out.println("1 - Arroz(5kg) \n"
					+ "2 - Feijão(1kg) \n"
					+ "3 - Óleo \n"
					+ "4 - Fuba \n"
					+ "5 - Farinha \n"
					+ "6 - Macarrão \n"
					+ "7 - Leite \n"
					+ "8 - Sal \n"
					+ "9 - Açucar \n"
					+ "10 - Extrato de Tomate \n"
					+ "11 - Café \n"
					+ "12 - Bolacha Água e Sal \n"
					+ "13 - Bolacha de Maizena \n"
					+ "13 - Sardinha \n"
					+ "14 - Bisnaga \n"
					+ "15 - Bo5o Pronto \n"
					+ "16 - Caixa de Suco/Toddy \n"
					+ "17 - Garrafa de água\n");

		}

		else if(itemDoado == 2 ) {
				System.out.println("Digite a quantidade dos alimentos/suprimentos que você pretende doar\n");
	
				System.out.println("======MENU DE OPÇOES======\n");
				System.out.println("1 - Cobertores \n"
						+ "2 - Toalhas de Banho \n"
						+ "3 - Toalhas de Rosto \n");
		}
		
		else if(itemDoado == 3) {
				System.out.println("Digite a quantidade dos alimentos/suprimentos que você pretende doar\n");
				
				System.out.println("======MENU DE OPÇOES======\n");
				System.out.println("1 - Sabonetes \n"
						+ "2 - Máscaras de Pano \n"
						+ "3 - Máscaras PFF2 \n"
						+ "4 - Álcool em Gel \n"
						+ "5 - Escova \n"
						+ "5 - Pasta de Dente \n"
						+ "6 - Detergente \n"
						+ "7 - Bucha de lavar louça \n"
						+ "8 - Sabão em Pó \n"
						+ "9 - Sabão em Pedra \n"
						+ "10 - Álcool 70: \n");
		}
		else {
			System.out.println("Opção Inválida!");
		}
	}
	
	public void QuantidadeDoada() {
		Scanner entrada = new Scanner(System.in);
		int escolhaDoMenu, quantidade;
		System.out.println("Digite '-1' no o item desejado para finalizar a operação");
			
			do {
				System.out.println("Digite o número do item desejado: ");
				escolhaDoMenu = entrada.nextInt();
				System.out.println("Quantidade: ");
				quantidade = entrada.nextInt();
			}while(escolhaDoMenu != -1);
		}
}
