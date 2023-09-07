package exercicios;

import java.util.Scanner;

import conteudo.Data;

public class Vendedor {
	String nome;
	int idade;
	double salario;
	String rg;
	exercicios.Data dataNascimento;
	exercicios.Data dataExpedicao;
	
	public void receberDados() {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerNumero = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		nome = scanner.next();
		System.out.println("Informe a idade: ");
		idade = scanner.nextInt();
		System.out.println("Informe o salário: ");
		salario = scanner.nextDouble();
		System.out.println("Informe o RG: ");
		rg = scanner.next();
	}
	
	public void exibirDados() {
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Salario: " +salario);
		System.out.println("RG: " +rg);
	}
}
