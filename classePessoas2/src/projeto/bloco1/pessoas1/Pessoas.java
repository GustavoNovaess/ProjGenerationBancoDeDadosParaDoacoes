package projeto.bloco1.pessoas1;

public class Pessoas {
	private String nome;
	private int idade;
	private String endereco;
	private String cpfRg;
	private int telefone;
	private String regiao;
	private char cestaE;
	
	
		

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;

		if (endereco == "x") {
			System.out.println("Se apresente no posto de doações X,  "
					+ "\nmais próximo de sua região, e faça a retirada da sua Cesta Especial");
		}
	}

	public String getCpfRg() {
		return cpfRg;
	}

	public void setCpfRg(String cpfRg) {
		this.cpfRg = cpfRg;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public char getCestaE() {
		return cestaE;
	}

	public void setCestaE(char cestaE) {
		this.cestaE = cestaE;
	}
}

