package projeto.bloco1;

import java.util.Scanner;

public class Recebedor extends PessoasClasse implements PessoasInterface {

	
	Scanner entrada = new Scanner(System.in);
	//Atributos
		private int quantidadeDeFamiliares;
		private int horarioDeRetirada;
		char tipoDeCesta;
		
		
		public int getQuantidadeDeFamiliares() {
			return quantidadeDeFamiliares;
		}
		
		public void setQuantidadeDeFamiliares(int quantidadeDeFamiliares) {
			this.quantidadeDeFamiliares = quantidadeDeFamiliares;
			
			if(quantidadeDeFamiliares <= 3) {
				this.tipoDeCesta = 'P';
			}
			
			if(quantidadeDeFamiliares > 3 && quantidadeDeFamiliares <= 6) {
				this.tipoDeCesta = 'M';
			}
			
			if(quantidadeDeFamiliares > 6) {
				this.tipoDeCesta = 'G';
			}
			/*if(quantidadeDeFamiliares == 00) {
				this.tipoDeCesta = 'E';//cesta especial
			}*/
		}
		
		public int getHorarioDeRetirada() {
			return horarioDeRetirada;
		}
		
		public void setHorarioDeRetirada(int horarioDeRetirada) {
			this.horarioDeRetirada = horarioDeRetirada;
		}	
		
		
		//Método
		void tipoDeCesta () {
			switch (this.tipoDeCesta){
				case 'P':
					System.out.println("Sua cesta será a Cesta P!");
					System.out.println("\n\t" + "Itens da CESTA P:\n");
					System.out.println("ALIMENTOS\n");
					System.out.println("1 Saco de arroz\n2 sacos de feijão\n1 pacote de sal\n1 pacote de açúcar\n2 pacotes de macarrão"
							+ "\n1 pacote de fuba\n2 caixas de leite\n1 pacote de café\n2 garrafas de óleo\n1 saco de farinha"
							+ "\n2 pacotes de extrato de tomate\n");
					System.out.println("PRODUTOS DE LIMPEZA / HIGIENE PESSOAL\n");
					System.out.println("2 sabonetes\n* Máscaras de Pano(Qtd de máscaras a definir na retirada)\n1 garrafa grande de álcool em gel\n"
							+ "3 escovas de dente\n4 pastas de dente\n2 detergentes\n1 bucha de lavar louça\n1 pacote de sabão em pó(0.5 kg)\n1 sabão em pedra\n"
							+ "1 garrafa de álcool 70\n");
					System.out.println("COBERTORES E TOALHAS\n");
					System.out.println("1 cobertor\n2 toalhas de banho\n1 toalha de rosto");
					break;
					
				case 'M':
					System.out.println("Sua cesta será a Cesta M!");
					System.out.println("\n\t" + "Itens da CESTA M:\n");
					System.out.println("ALIMENTOS\n");
					System.out.println("2 Sacos de arroz\n4 sacos de feijão\n1 pacote de sal\n2 pacotes de açúcar\n4 pacotes de macarrão\n"
							+ "2 pacotes de fubá\n4 caixas de leite\n2 pacotes de café\n2 garrafas de óleo\n2 sacos de farinha\n"
							+ "4 pacotes de extrato de tomate\n");
					System.out.println("PRODUTOS DE LIMPEZA / HIGIENE PESSOAL\n");
					System.out.println("4 sabonetes\n* Máscaras de Pano(Qtd de máscaras a definir na retirada)\n2 garrafas grandes de álcool em gel\n"
							+ "6 escovas de dente\n6 pastas de dente\n3 detergentes\n2 buchas de lavar louça\n2 pacotes de sabão em pó(0.5 kg)\n2 sabões em pedra\n"
							+ "2 garrafas de álcool 70\n");
					System.out.println("COBERTORES E TOALHAS\n");
					System.out.println("2 cobertores\n3 toalhas de banho\n2 toalhas de rosto");
					break;
					
				case 'G':
					System.out.println("Sua cesta será a Cesta G!");
					System.out.println("\n\t" + "Itens da CESTA G:\n");
					System.out.println("ALIMENTOS\n");
					System.out.println("3 Sacos de arroz\n6 sacos de feijão\n2 pacote de sal\n4 pacotes de açúcar\n5 pacotes de macarrão\n"
							+ "4 pacotes de fubá\n5 caixas de leite\n2 pacotes de café\n4 garrafas de óleo\n2 sacos de farinha\n"
							+ "5 pacotes de extrato de tomate\n");
					System.out.println("PRODUTOS DE LIMPEZA / HIGIENE PESSOAL\n");
					System.out.println("8 sabonetes\n* Máscaras de Pano(Qtd de máscaras a definir na retirada)\n4 garrafas grandes de álcool em gel\n"
							+ "6 escovas de dente\n6 pastas de dente\n3 detergentes\n2 buchas de lavar louça\n2 pacotes de sabão em pó(0.5 kg)\n3 sabões em pedra\n"
							+ "2 garrafas de álcool 70\n");
					System.out.println("COBERTORES E TOALHAS\n");
					System.out.println("4 cobertores\n4 toalhas de banho\n2 toalhas de rosto");
					break;
				
				/*default:
					System.out.println("Sua cesta será a Cesta ESPECIAL!");
					System.out.println("\n\t" + "Itens da CESTA ESPECIAL:");
					break;*/
			}
		}
		
		public void cadastro() {
			
			System.out.print("Nome: ");
			super.setNome(entrada.nextLine());
			
			System.out.print("\nIdade: ");
			super.setIdade(entrada.nextInt());
			entrada.nextLine();
			
			System.out.print("\nEndere�o: ");
			super.setEndereco(entrada.nextLine());
			
			System.out.print("\nCPF ou RG: ");
			super.setCpfRg(entrada.nextLine());
			
			System.out.print("\nTelefone: ");
			super.setTelefone(entrada.nextLine());
			
			System.out.print("\nRegi�o: ");
			super.setRegiao(entrada.nextLine());
			
			System.out.print("\nQuantidade de Familiares: ");
			this.setQuantidadeDeFamiliares(entrada.nextInt());
			
			System.out.print("\nHorario de Retirada da Cesta: ");
			this.setHorarioDeRetirada(entrada.nextInt());
			entrada.nextLine();
			
			
			
		}
		
		public String toString() {
			return "[ Nome: " + super.getNome() + "\t\tIdade: " + super.getIdade() + "\t\tEndere�o: " + super.getEndereco() + "\nCPF/RG: " + super.getCpfRg() + "\t\tTelefone: " + super.getTelefone() +
					"\tRegi�o: " + super.getRegiao() + "\nQuantidade de Familiares: " + this.getQuantidadeDeFamiliares() +"\tTipo de Cesta: " + this.tipoDeCesta + "\tHorario de Retirada da Cesta: " + this.getHorarioDeRetirada()+ "]\n";
 		}
}
