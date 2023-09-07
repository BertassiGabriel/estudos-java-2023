package exercicios;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	Data dataUltimaVacinacao;
	int anoAtual = 2023;
	
	public void receberDados(String nomeRecebido, String racaRecebida, int idadeRecebida) {
		nome = nomeRecebido;
		raca = racaRecebida;
		idade = idadeRecebida;	
	}
	
	public void exibirDados() {
		System.out.println("Nome: " +nome);
		System.out.println("Raca: " +raca);
		System.out.println("Idade: " +idade);
	}
	
	public void calculaFilhote() {
		if (idade < 2) {
			System.out.println("Cachorro filhote");
		}
		else
			System.out.println("Cachorro adulto");
	}
	
	public int exibirDiasVividos(int idade) {
		int diasVividos = idade * 365;
		return diasVividos;
	}
	
}
