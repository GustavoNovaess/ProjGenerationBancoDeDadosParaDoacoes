package projeto.bloco1;

import java.util.ArrayList;
import java.util.Scanner;
import projeto.bloco1.*;

public class Doador extends PessoasClasse {
	
	Scanner entrada = new Scanner(System.in);
	
	private String itemDoado; 
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
	
	public ArrayList <Estoque> Doar(int itemDoado, ArrayList <Estoque> estoqueAtualizando) {
		
		Estoque estoque = new Estoque("",0);
		
		int opcao, quantidade;
		if(itemDoado == 1) {
			do {
				System.out.println("DIGITE O NÚMERO REFERENTE AO TIPO DE ALIMENTO/SUPRIMENTO QUE DESEJA DOAR:\n");
				
				
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
						+ "12 - Finalizar");
				
				System.out.print("ESPERANDO NÚMERO... ");
				opcao = entrada.nextInt();
				
				if (opcao > 0 && opcao < 12) {
					System.out.println("\nDigite a quantidade dos alimentos/suprimentos que você pretende doar:");
					quantidade = entrada.nextInt();
					estoqueAtualizando.get(opcao-1).setQuantidade(estoqueAtualizando.get(opcao-1).getQuantidade() + quantidade);
				} else if (opcao <= 0 || opcao >= 13) {
					System.err.println("\nOPÇÃO DIGITADA NÃO EXISTE, POR FAVOR INSIRA NOVAMENTE\n");
				}
				
			}while(opcao != 12);
			
		}

		else if(itemDoado == 2 ) {
				
				do {
					System.out.println("DIGITE O NÚMERO REFERENTE AO TIPO DE COBERTOR/TOALHA QUE DESEJA DOAR:\n");
					
					
					System.out.println("======MENU DE OPÇOES======\n");
					System.out.println("1 - Cobertores \n"
							+ "2 - Toalhas de Banho \n"
							+ "3 - Toalhas de Rosto \n"
							+ "4 - Finalizar \n");
					
					System.out.print("ESPERANDO NÚMERO... ");
					opcao = entrada.nextInt();
					
					if (opcao > 0 && opcao < 4) {
						System.out.println("\nDigite a quantidade dos cobertores/toalhas que você pretende doar:");
						quantidade = entrada.nextInt();
						estoqueAtualizando.get(opcao-1).setQuantidade(estoqueAtualizando.get(opcao-1).getQuantidade() + quantidade);
					} else if (opcao <= 0 || opcao >= 5) {
						System.err.println("\nOPÇÃO DIGITADA NÃO EXISTE, POR FAVOR INSIRA NOVAMENTE\n");
					}
					
				}while(opcao != 4);
				
		}
		
		else if(itemDoado == 3) {
				
				do {
					
					System.out.println("DIGITE O NÚMERO REFERENTE AO TIPO DE PRODUTO DE LIMPEZA OU HIGIENE PESSOAL QUE DESEJA DOAR:\n");
					
					
					System.out.println("======MENU DE OPÇOES======\n");
					System.out.println("1 - Sabonetes \n"
							+ "2 - Máscaras de Pano \n"
							+ "3 - Máscaras PFF2 \n"
							+ "4 - Álcool em Gel \n"
							+ "5 - Escova \n"
							+ "6 - Pasta de Dente \n"
							+ "7 - Detergente \n"
							+ "8 - Bucha de lavar louça \n"
							+ "9 - Sabão em Pó \n"
							+ "10 - Sabão em Pedra \n"
							+ "11 - Álcool 70 \n"
							+ "12 - Finalizar \n");
					
					System.out.print("ESPERANDO NÚMERO... ");
					opcao = entrada.nextInt();
					
					if (opcao > 0 && opcao < 12) {
						System.out.println("\nDigite a quantidade dos produtos de limpeza/higiene que você pretende doar:");
						quantidade = entrada.nextInt();
						estoqueAtualizando.get(opcao-1).setQuantidade(estoqueAtualizando.get(opcao-1).getQuantidade() + quantidade);
					} else if (opcao <= 0 || opcao >= 13) {
						System.err.println("\nOPÇÃO DIGITADA NÃO EXISTE, POR FAVOR INSIRA NOVAMENTE\n");
					}
					
				}while(opcao != 12);
				
				
				
		}
		else {
			System.err.println("Opção Inválida!");
		}
		
		entrada.nextLine();
		return estoqueAtualizando;
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
	
	public Doador cadastro() {

		Doador doador = new Doador();
		System.out.print("Nome: ");
		doador.setNome(entrada.nextLine());
		
		System.out.print("\nIdade: ");
		doador.setIdade(entrada.nextInt());
		entrada.nextLine();
		
		System.out.print("\nEndereço: ");
		doador.setEndereco(entrada.nextLine());
		
		System.out.print("\nCPF ou RG: ");
		doador.setCpfRg(entrada.nextLine());
		
		System.out.print("\nTelefone: ");
		doador.setTelefone(entrada.nextLine());
		
		System.out.print("\nRegião: ");
		doador.setRegiao(entrada.nextLine());
		
		return doador;
	}
	
	public String toString() {
		return "[ Nome: " + super.getNome() + "\t\tIdade: " + super.getIdade() + "\t\tEndereço: " + super.getEndereco() + "\nCPF/RG: " + super.getCpfRg() + "\t\tTelefone: " + super.getTelefone() +
				"\tRegião: " + super.getRegiao() +" ]\n";
	}
	
}
