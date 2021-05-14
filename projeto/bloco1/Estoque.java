package projeto.bloco1;

import java.util.ArrayList;

public class Estoque {

	private String nomeProduto;
	private int quantidade;
	
	
	public Estoque(String nomeProduto, int quantidade) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "\n[ "+this.nomeProduto + " " + this.quantidade + "x ]\n";
	}
	
	public ArrayList inicializarEstoqueAlimentos(ArrayList estoqueGeral) {
		Estoque estoque = new Estoque("Pacote de Arroz(5kg)",10);
		
		estoqueGeral.add(estoque);
		
		estoqueGeral.add(new Estoque("Pacote de Feijao(1kg)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Óleo(1L)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Fuba(500g)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Farinha(1kg)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Macarrão(500g)",10));
		
		estoqueGeral.add(new Estoque("Caixa de Leite(1L)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Sal(1kg)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Açúcar(1kg)",10));
		
		estoqueGeral.add(new Estoque("Extrato de Tomate(340g)",10));
		
		estoqueGeral.add(new Estoque("Pacote de Café(500g)",10));
		
		return estoqueGeral;
	}
	
	public ArrayList inicializarEstoqueCobertores(ArrayList estoqueGeral) {
		Estoque estoque = new Estoque("Cobertores",10);
		
		estoqueGeral.add(estoque);
		
		estoqueGeral.add(new Estoque("Toalhas de Banho",10));
		
		estoqueGeral.add(new Estoque("Toalhas de Rosto",10));
		
		return estoqueGeral;
	}
	
	public ArrayList inicializarEstoqueLimpeza(ArrayList estoqueGeral) {
		Estoque estoque = new Estoque("Sabonete",10);
		
		estoqueGeral.add(estoque);
		
		estoqueGeral.add(new Estoque("Máscara de Pano",10));
		
		estoqueGeral.add(new Estoque("Máscara PFF2",10));
		
		estoqueGeral.add(new Estoque("Álcool em Gel(500 ml)",10));
		
		estoqueGeral.add(new Estoque("Escova",10));
		
		estoqueGeral.add(new Estoque("Pasta de Dente",10));
		
		estoqueGeral.add(new Estoque("Detergente",10));
		
		estoqueGeral.add(new Estoque("Bucha de lavar louça",10));
		
		estoqueGeral.add(new Estoque("Sabão em Pó",10));
		
		estoqueGeral.add(new Estoque("Sabão em Pedra",10));
		
		estoqueGeral.add(new Estoque("Álcool 70",10));
		
		return estoqueGeral;
	}
}


