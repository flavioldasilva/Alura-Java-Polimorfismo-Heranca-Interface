
//N�o pode instanciar dessa classe pois � abstrata!
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	
	//Protected est� entre public e private ou seja publico para os filhos
	private double salario;
	
	/* Criando construtor
	 * 
	 * public Funcionario() {
	 * 
	 * }
	 * 
	 * caso voc� n�o crie um construtor, or default o java cria ele para voc�.
	 */
	
	//abstract em m�todo = m�todo sem corpo, n�o h� implementa��o aqui apenas nas classes filhos.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
