
//Gerente eh um Funcionario, Gerente herda da classe Funcionario
public class EditorVideo extends Funcionario{
	
	

	public double getBonificacao() {
		System.out.println("chamando o método de bonificação do editor de video");
		return super.getBonificacao() + 100;
	}
	
	
	
	
	
	

}
