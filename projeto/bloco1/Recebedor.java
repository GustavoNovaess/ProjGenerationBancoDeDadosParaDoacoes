package projeto.bloco1;

import java.util.Scanner;

public class Recebedor extends PessoasClasse {

	
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
		}
		
		public int getHorarioDeRetirada() {
			return horarioDeRetirada;
		}
		
		public void setHorarioDeRetirada(int horarioDeRetirada) {
			this.horarioDeRetirada = horarioDeRetirada;
		}	
		
		
		//Método
		void tipoDeCesta (char cesta) {
			switch (cesta){
				case 'P':
					System.out.println("Sua cesta ser� a Cesta P!");
					System.out.println("\n\t" + "Itens da CESTA P:\n");
					System.out.println("ALIMENTOS\n");
					System.out.println("1x Saco de arroz\t\t2x sacos de feij�o\t\t1x pacote de sal\n1x pacote de a�ucar\t\t2x pacotes de macarr�o"
							+ "\t\t1x pacote de fuba\n2x caixas de leite\t\t1x pacote de caf�\t\t2x garrafas de �leo\n1x saco de farinha"
							+ "\t\t2x pacotes de extrato de tomate\n");
					System.out.println("PRODUTOS DE LIMPEZA / HIGIENE PESSOAL\n");
					System.out.println("2x sabonetes\t\t3x m�scaras de Pano\t\t3x m�scaras PFF2\n1x garrafa grande de �lcool em gel\t\t"
							+ "3x escovas de dente\t\t4x pastas de dente\n2x detergentes\t\t1x bucha de lavar lou�a\t\t1x pacote de sab�o em p�(0.5 kg)\n1x sab�o em pedra\t\t"
							+ "1 garrafa de �lcool 70\n");
					System.out.println("COBERTORES E TOALHAS\n");
					System.out.println("1x cobertor\t\t2x toalhas de banho\n1x toalha de rosto\n");
					break;
					
				case 'M':
					System.out.println("Sua cesta ser� a Cesta M!");
					System.out.println("\n\t" + "Itens da CESTA M:\n");
					System.out.println("ALIMENTOS\n");
					System.out.println("2x Saco de arroz\t\t4x sacos de feij�o\t\t1x pacote de sal\n2x pacote de a�ucar\t\t4x pacotes de macarr�o"
							+ "\t\t2x pacote de fuba\n4x caixas de leite\t\t2x pacote de caf�\t\t2x garrafas de �leo\n2x saco de farinha"
							+ "\t\t4x pacotes de extrato de tomate\n");
					System.out.println("PRODUTOS DE LIMPEZA / HIGIENE PESSOAL\n");
					System.out.println("4x sabonetes\t\t6x m�scaras de Pano\t\t6x m�scaras PFF2\n2x garrafa grande de �lcool em gel\t\t"
							+ "6x escovas de dente\t\t6x pastas de dente\n3x detergentes\t\t2x bucha de lavar lou�a\t\t2x pacote de sab�o em p�(0.5 kg)\n2x sab�o em pedra\t\t"
							+ "2 garrafa de �lcool 70\n");
					System.out.println("COBERTORES E TOALHAS\n");
					System.out.println("2x cobertor\t\t3x toalhas de banho\n2x toalha de rosto\n");
					break;
					
				case 'G':
					System.out.println("Sua cesta ser� a Cesta G!");
					System.out.println("\n\t" + "Itens da CESTA G:\n");
					System.out.println("ALIMENTOS\n");
					System.out.println("3x Saco de arroz\t\t6x sacos de feij�o\t\t2x pacote de sal\n4x pacote de a�ucar\t\t5x pacotes de macarr�o"
							+ "\t\t4x pacote de fuba\n5x caixas de leite\t\t2x pacote de caf�\t\t4x garrafas de �leo\n2x saco de farinha"
							+ "\t\t5x pacotes de extrato de tomate\n");
					System.out.println("PRODUTOS DE LIMPEZA / HIGIENE PESSOAL\n");
					System.out.println("8x sabonetes\t\t9x m�scaras de Pano\t\t9x m�scaras PFF2\n4x garrafa grande de �lcool em gel\t\t"
							+ "6x escovas de dente\t\t6x pastas de dente\n3x detergentes\t\t2x bucha de lavar lou�a\t\t2x pacote de sab�o em p�(0.5 kg)\n3x sab�o em pedra\t\t"
							+ "2 garrafa de �lcool 70\n");
					System.out.println("COBERTORES E TOALHAS\n");
					System.out.println("4x cobertor\t\t4x toalhas de banho\n2x toalha de rosto\n");
					break;
				
			}
		}
		

		public Recebedor cadastro() {
			
			Recebedor recebedor = new Recebedor();
			System.out.print("Nome: ");
			recebedor.setNome(entrada.nextLine());
			
			System.out.print("\nIdade: ");
			recebedor.setIdade(entrada.nextInt());
			entrada.nextLine();
			
			System.out.print("\nEndere�o: ");
			recebedor.setEndereco(entrada.nextLine());
			
			System.out.print("\nCPF ou RG: ");
			recebedor.setCpfRg(entrada.nextLine());
			
			System.out.print("\nTelefone: ");
			recebedor.setTelefone(entrada.nextLine());
			
			System.out.print("\nRegi�o: ");
			recebedor.setRegiao(entrada.nextLine());
			
			System.out.print("\nQuantidade de Familiares: ");
			recebedor.setQuantidadeDeFamiliares(entrada.nextInt());
			
			System.out.print("\nHorario de Retirada da Cesta (Das 12h �s 18h): ");
			recebedor.setHorarioDeRetirada(entrada.nextInt());
			entrada.nextLine();
			
			return recebedor;
			
		}

		public String toString() {
			return "[ Nome: " + super.getNome() + "\t\tIdade: " + super.getIdade() + "\t\tEndere�o: " + super.getEndereco() + "\nCPF/RG: " + super.getCpfRg() + "\t\tTelefone: " + super.getTelefone() +
					"\tRegi�o: " + super.getRegiao() + "\nQuantidade de Familiares: " + this.getQuantidadeDeFamiliares() +"\tTipo de Cesta: " + this.tipoDeCesta + "\tHorario de Retirada da Cesta: " + this.getHorarioDeRetirada()+ "h]\n";
 		}
}
