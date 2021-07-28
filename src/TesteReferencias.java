
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		//Funcionario g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		String nome = g1.getNome();
		
		Funcionario f = new Funcionario();
		f.setNome("Marcos");
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		f.setSalario(2500.0);

		Designer d = new Designer();
		f.setSalario(2500.0);
				
		System.out.println(nome);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());

	}

}
