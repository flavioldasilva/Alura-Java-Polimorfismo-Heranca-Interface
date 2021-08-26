
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.00, cp);
		
		System.out.println("Conta Corrente saldo " + cc.getSaldo());
		System.out.println("Conta Poupança sakdo " + cp.getSaldo());

	}

}
