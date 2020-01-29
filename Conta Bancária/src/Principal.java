
import java.util.Calendar;
import java.util.Date;

public class Principal {
	String nome;
	int conta;
	float saldo;
	Date dataDeAbertura;
	
	Principal(String pNome, int pConta, float pSaldo, Date pDataDeAbertura) {
		nome = pNome;
		conta = pConta;
		saldo = pSaldo;
		dataDeAbertura = pDataDeAbertura;
	}
	
	void realizaSaque(float s) {
		saldo = saldo - s;
	}
	float requisitaSaldo() {
		return saldo;
	}
	void realizaDeposito (float pValor) {
		saldo = saldo + pValor;
	}
	void realizaDeposito(float pValorNota, int pQuantNotas) {
		realizaDeposito(pValorNota*pQuantNotas);
	}
	void transferirOutraConta (float pValor, Principal pBeneficiado) {
		this.saldo -= pValor;
		pBeneficiado.saldo += pValor;
	}
	
	public static void main (String args[]){
		Principal cliente1, cliente2;
		Date data = (Calendar.getInstance().getTime());
		
		cliente1 = new Principal("Cliente 1", 0001, 500, data);
		cliente2 = new Principal("Cliente 2", 0002, 2000, data);
		cliente1.realizaDeposito(230);
		cliente2.realizaDeposito(50, 8);
		System.out.println("Nome do cliente:" + cliente1.nome);
		System.out.println("Saldo do cliente:" + cliente1.dataDeAbertura);
		System.out.println("Nome do cliente:" + cliente2.nome);
		System.out.println("Saldo do cliente:" + cliente2.dataDeAbertura);
		
		
	}
}

