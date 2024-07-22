package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class ServicosBanco {
	
	private List<Conta> dadosBanco;
	
	
	
	public ServicosBanco() {
		// TODO Auto-generated constructor stub
		dadosBanco = new ArrayList<Conta>();
		}
	
	public void criarContaCliente(String nomeCliente, String cpf, String tipoConta, double saldo) {
		dadosBanco.add(new Conta(tipoConta, saldo, nomeCliente, cpf));
	}
	
	public void exibirConta() {
		System.out.println(dadosBanco);
	}
	
	
	public void depositoConta(String cpf, double deposito) {
		if(!dadosBanco.isEmpty()) {
			for(Conta c : dadosBanco) {
				if(c.getCpf().equalsIgnoreCase(cpf)) {
					c.setSaldo(c.getSaldo() + deposito);
				}
			}
		}
	}
	
	public void saqueConta(String cpf, double saque) {
		if(!dadosBanco.isEmpty()) {
			for(Conta c : dadosBanco) {
				if(c.getCpf().equalsIgnoreCase(cpf)) {
					if (c.getSaldo() > saque) {
						c.setSaldo(c.getSaldo() - saque);
					}
				}
			}
		}
	}
	
	public void transferenciaConta(String cpfTitular, String cpfTransf, double vlTransf) {
		if(!dadosBanco.isEmpty()) {
			for(Conta c : dadosBanco) {
				if(c.getCpf().equalsIgnoreCase(cpfTitular)) {
					for (Conta conta : dadosBanco) {
						if(c.getCpf().equalsIgnoreCase(cpfTransf)) {}
							c.setSaldo(c.getSaldo() - vlTransf);
							conta.setSaldo(conta.getSaldo() + vlTransf);
					}
				}
			}
		}
	}
	
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