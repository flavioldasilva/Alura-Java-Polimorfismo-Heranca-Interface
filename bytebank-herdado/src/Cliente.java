
public class Cliente implements Autenticavel {

	// private int senha;

	// Salvando dados do AutentificacaoUtil
	private AutenticacaoUtil autentificador;

	// Criando construtor padrao para armazenar os dados.
	public Cliente() {
		this.autentificador = new AutenticacaoUtil();
	}
	
	//Sobrescrevendo com código mais limpo
	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autentificador.autentica(senha);
	}

}
