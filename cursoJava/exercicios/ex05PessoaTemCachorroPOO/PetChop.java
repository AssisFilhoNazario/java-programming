package ex05PessoaTemCachorroPOO;

public class PetChop {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ();
		pessoa.nome = "Zezinho";
		
		pessoa.cachorro = new Cachorro();

		pessoa.cachorro.nome = "Ralf";
		pessoa.cachorro.idade = 1;
		pessoa.cachorro.raca = "Vira-lata";
		pessoa.cachorro.sexo = 'M';
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(pessoa);
		
		
		
	}

}
