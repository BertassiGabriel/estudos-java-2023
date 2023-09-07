package exercicios;

public class TestaCachorro {
	public static void main(String[] args) {
		
		//Cria um novo objeto cachorro do tipo Cachorro
		Cachorro cachorro = new Cachorro();
		
		//Chama o método que recebe os dados do cachorro
		cachorro.receberDados("Malu","Shitsu", 3);
		
		//Chama o método que exibe os dados
		cachorro.exibirDados();
		
		//Calcula se o cachorro é um filhote ou adulto
		cachorro.calculaFilhote();
		
		//Chama o método que retorna os dias vividos do exibe na tela
		System.out.println(cachorro.exibirDiasVividos(3));
		
		//Cria um novo objeto data do tipo Data
		Data data = new Data();
		
		//Popula os dados da data
		data.dia = 7;
		data.mes = 6;
		data.ano = 2019;
		cachorro.dataUltimaVacinacao = data;
		
		//Exibe a data da última vacinação
		System.out.println(cachorro.dataUltimaVacinacao.dia+"/"+cachorro.dataUltimaVacinacao.mes+"/"+cachorro.dataUltimaVacinacao.ano);
		
		
		if ((cachorro.anoAtual - data.ano) >  2) {
			System.out.println("O cachorro deve ser vacinado.");
		}
	}
}
