
//Geremte � um funcion�rio, gerente herda da classe Funcionario, assina o contrato Autenticavel ent�o � um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autentificador;

	public Gerente() {
		this.autentificador = new AutenticacaoUtil();
	}

	// Sobrescrevendo com c�digo mais limpo
	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autentificador.autentica(senha);
	}

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		// return super.getBonificacao() + super.getSalario();
		return super.getSalario();
	}

}
