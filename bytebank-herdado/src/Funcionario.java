
//Não pode instanciar dessa classe pois é abstrata!
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	
	//Protected está entre public e private ou seja publico para os filhos
	private double salario;
	
	/* Criando construtor
	 * 
	 * public Funcionario() {
	 * 
	 * }
	 * 
	 * caso você não crie um construtor, or default o java cria ele para você.
	 */
	
	//abstract em método = método sem corpo, não há implementação aqui apenas nas classes filhos.
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
