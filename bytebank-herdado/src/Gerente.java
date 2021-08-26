
//Geremte é um funcionário, gerente herda da classe Funcionario, assina o contrato Autenticavel então é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		//return super.getBonificacao() + super.getSalario();
		return super.getSalario();
	}

}
