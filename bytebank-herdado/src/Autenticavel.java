/*Contrato Autenticavel
Quem assina este contrato, precisa impementar:
metodos getSenha e autentica*/

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
