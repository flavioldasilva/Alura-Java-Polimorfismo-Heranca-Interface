
//Gerente � um Funcionario, Gerente herda das classe Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do DESIGNER");
		return 200.0;
	}

}
