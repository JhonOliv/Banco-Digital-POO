package bancoDigital;

public class Conta extends Cliente {
	
	private String tipoConta;
	private double saldo;
	
	
	public Conta(String tipoConta, double saldo, String nome, String cpf) {
		super(nome, cpf);
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta tipoConta= " + tipoConta + ", saldo= " + String.format("%.2f", saldo) + ", Nome= " + getNome() + ", Cpf= "
				+ getCpf();
	}

	

	
	
	

}
