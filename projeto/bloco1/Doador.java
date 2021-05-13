package projeto.bloco1;

import java.util.ArrayList;
import java.util.Scanner;
import projeto.bloco1.*;

public class Doador extends PessoasClasse implements PessoasInterface {
	
	Scanner entrada = new Scanner(System.in);
	
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
	
	public ArrayList <Estoque> Doar(int itemDoado, ArrayList <Estoque> estoqueAtualizando) {
		
		Estoque estoque = new Estoque("",0);
		
		int opcao, quantidade;
		if(itemDoado == 1) {
			do {
				System.out.println("DIGITE O N�MERO REFERENTE AO TIPO DE ALIMENTO/SUPRIMENTO QUE DESEJA DOAR:\n");
				//System.out.println("Digite a quantidade dos alimentos/suprimentos que voc� pretende doar\n");
				
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
						+ "15 - Bolo Pronto \n"
						+ "16 - Caixa de Suco/Toddy \n"
						+ "17 - Garrafa de �gua\n"
						+ "18 - Finalizar");
				
				System.out.print("ESPERANDO N�MERO... ");
				opcao = entrada.nextInt();
				
				if (opcao > 0 && opcao < 18) {
					System.out.println("\nDigite a quantidade dos alimentos/suprimentos que voc� pretende doar:");
					quantidade = entrada.nextInt();
					estoqueAtualizando.get(opcao-1).setQuantidade(estoqueAtualizando.get(opcao-1).getQuantidade() + quantidade);
				} else if (opcao <= 0 || opcao >= 19) {
					System.err.println("\nOP��O DIGITADA N�O EXISTE, POR FAVOR INSIRA NOVAMENTE\n");
				}
				
			}while(opcao != 18);
			
		}

		else if(itemDoado == 2 ) {
				
				do {
					System.out.println("DIGITE O N�MERO REFERENTE AO TIPO DE COBERTOR/TOALHA QUE DESEJA DOAR:\n");
					//System.out.println("Digite a quantidade dos alimentos/suprimentos que voc� pretende doar\n");
					
					System.out.println("======MENU DE OP�OES======\n");
					System.out.println("1 - Cobertores \n"
							+ "2 - Toalhas de Banho \n"
							+ "3 - Toalhas de Rosto \n"
							+ "4 - Finalizar \n");
					
					System.out.print("ESPERANDO N�MERO... ");
					opcao = entrada.nextInt();
					
					if (opcao > 0 && opcao < 4) {
						System.out.println("\nDigite a quantidade dos cobertores/toalhas que voc� pretende doar:");
						quantidade = entrada.nextInt();
						estoqueAtualizando.get(opcao-1).setQuantidade(estoqueAtualizando.get(opcao-1).getQuantidade() + quantidade);
					} else if (opcao <= 0 || opcao >= 5) {
						System.err.println("\nOP��O DIGITADA N�O EXISTE, POR FAVOR INSIRA NOVAMENTE\n");
					}
					
				}while(opcao != 4);
				
		}
		
		else if(itemDoado == 3) {
				
				do {
					
					System.out.println("DIGITE O N�MERO REFERENTE AO TIPO DE PRODUTO DE LIMPEZA OU HIGIENE PESSOAL QUE DESEJA DOAR:\n");
					//System.out.println("Digite a quantidade dos alimentos/suprimentos que voc� pretende doar\n");
					
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
							+ "10 - �lcool 70 \n"
							+ "11 - Finalizar \n");
					
					System.out.print("ESPERANDO N�MERO... ");
					opcao = entrada.nextInt();
					
					if (opcao > 0 && opcao < 11) {
						System.out.println("\nDigite a quantidade dos produtos de limpeza/higiene que voc� pretende doar:");
						quantidade = entrada.nextInt();
						estoqueAtualizando.get(opcao-1).setQuantidade(estoqueAtualizando.get(opcao-1).getQuantidade() + quantidade);
					} else if (opcao <= 0 || opcao >= 12) {
						System.err.println("\nOP��O DIGITADA N�O EXISTE, POR FAVOR INSIRA NOVAMENTE\n");
					}
					
				}while(opcao != 11);
				
				
				
		}
		else {
			System.err.println("Op��o Inv�lida!");
		}
		
		entrada.nextLine();
		return estoqueAtualizando;
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
	
	public Doador cadastro() {

		Doador doador = new Doador();
		System.out.print("Nome: ");
		doador.setNome(entrada.nextLine());
		
		System.out.print("\nIdade: ");
		doador.setIdade(entrada.nextInt());
		entrada.nextLine();
		
		System.out.print("\nEndere�o: ");
		doador.setEndereco(entrada.nextLine());
		
		System.out.print("\nCPF ou RG: ");
		doador.setCpfRg(entrada.nextLine());
		
		System.out.print("\nTelefone: ");
		doador.setTelefone(entrada.nextLine());
		
		System.out.print("\nRegi�o: ");
		super.setRegiao(entrada.nextLine());
		
		return doador;
	}
	
	public String toString() {
		return "[ Nome: " + super.getNome() + "\t\tIdade: " + super.getIdade() + "\t\tEndere�o: " + super.getEndereco() + "\nCPF/RG: " + super.getCpfRg() + "\t\tTelefone: " + super.getTelefone() +
				"\tRegi�o: " + super.getRegiao() +" ]\n";
	}
	
}
