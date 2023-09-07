package exercicios;

import exercicios.Data;

public class TestaVendedor {
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		
		vendedor.receberDados();
		
		Data data = new Data();
		data.dia = 27;
		data.mes = 4;
		data.ano = 1992;
		vendedor.dataNascimento = data;
		System.out.println("Data de Nascimento: " +vendedor.dataNascimento.dia+"/"+vendedor.dataNascimento.mes+"/"+vendedor.dataNascimento.ano);
		Data data2 = new Data();
		data2.dia = 30;
		data2.mes = 9;
		data2.ano = 1998;
		vendedor.dataExpedicao = data2;
		System.out.println("Data de Expedição: " +vendedor.dataExpedicao.dia+"/"+vendedor.dataExpedicao.mes+"/"+vendedor.dataExpedicao.ano);
		Endereco endereco = new Endereco();
		endereco.logradouro = "Rua Brasil";
		endereco.numero = "120";
		endereco.bairro = "Centro";
		endereco.cidade = "Osvaldo Cruz";
		endereco.estado = "São Paulo";
		endereco.pais = "Brasil";
		int cep = 17700000;
		
		vendedor.exibirDados();
	}
}
