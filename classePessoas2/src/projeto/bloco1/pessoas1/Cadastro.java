package projeto.bloco1.pessoas1;
import java.util.Scanner;
public class Cadastro extends Pessoas  {
	
			public static void main(String[] args) {
				Scanner scanner = new Scanner (System.in);
				
			Pessoas cadastro = new Pessoas();
			
			System.out.println(" ... Bem vindo ao sistema de doações X ...");
			System.out.println("\nDigite seu nome:");
			cadastro.setNome(scanner.nextLine());
		
			System.out.println("Idade: ");
			cadastro.setIdade(scanner.nextInt()); 
			
			scanner.nextLine();
			System.out.println("Insira seu endereço, caso não possua residência fixa digite x : ");
			cadastro.setEndereco(scanner.nextLine());

			
			System.out.println("\nRG ou CPF: ");
			cadastro.setCpfRg(scanner.nextLine()); 
			
			System.out.println("Insira um telefone para contato: ");
			cadastro.setTelefone(scanner.nextInt());
			
			scanner.nextLine();
			System.out.println("Insira a região: ");
			cadastro.setRegiao(scanner.nextLine()); 
			
			
			
			}
		}



