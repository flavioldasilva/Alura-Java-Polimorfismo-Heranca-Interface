
//Editor de Video � um Funcion�rio, herda da classe Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do EDITOR DE VIDEO");
		//return super.getBonificacao() + 100.0;
		return 150.0;
	}

}
