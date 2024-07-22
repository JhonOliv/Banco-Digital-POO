package bancoDigital;

public class Banco {
	
public static void main(String[] args) {
		
		ServicosBanco sb = new ServicosBanco();
		sb.criarContaCliente("Jhonatan Silva", "43238116835", "Conta Corrente", 300.84);
		sb.criarContaCliente("Douglas Landim", "44455598801", "Conta Corrente", 500);
		sb.exibirConta();
		
		sb.depositoConta("43238116835", 50);
		sb.exibirConta();
		sb.saqueConta("43238116835", 140.35);
		sb.exibirConta();
		
		sb.transferenciaConta("43238116835", "44455598801", 100);
		sb.exibirConta();
	}

}
