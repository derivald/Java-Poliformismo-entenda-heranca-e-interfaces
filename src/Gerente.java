
//Gerente eh um Funcionario, Gerente herda da classe Funcionario assina o contrato autenticável, eh um Autenticável
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamendo o método de bonificacao do GERENTE");
		return super.getBonificacao();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		
			if (this.senha == senha) {
				return true;

			} else {
				return false;
			}
		

	}
}
