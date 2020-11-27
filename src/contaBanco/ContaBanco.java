package contaBanco;

public class ContaBanco {

	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	void status() {
		System.out.println("Conta: " + this.numConta);
		System.out.println("Tipo de conta: " + this.tipo);
		System.out.println("Usu�rio: " + this.dono);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status da conta: " + this.status);
	}

	// getters e setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = (float) d;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// M�todos especiais - contrutores
	public void Construtor() {
		setSaldo(0);
		setStatus(false);
	}
	
	//CONSTRUTOR PADR�O-> (vazia) (mesmo nome da classe)
	public ContaBanco() {
		super();
	}

	public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;

	}

	// m�todos espec�ficos (primeiro fazer depois dos outros m�todo)
	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if (t == "cc") {
			this.saldo =  50;
		} else if (t == "cp") {
			this.saldo =  150;
		}
	}

	public void fecharConta() {
		if (this.saldo> 0) {
			System.out.println("imposs�vel fechar conta com dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("imposs�vel fechar com d�bito");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}

	public void depositar(float v) {
		if (status == true) {

			this.setSaldo(this.getSaldo() + v);
			System.out.println("dep�sito realizado com sucesso");
		} else {
			System.out.println("Imposs�vel depositar com a conta fechada");
		}
	}

	public void sacar(double v) {
		if (status == true) {
			if ((this.saldo - v) >= 0) {
				setSaldo(getSaldo()- v);
				System.out.println("Saque de "+ v +" \nNovo saldo: "+saldo);
			} else {
				System.out.println("N�o � poss�vel sacar, saldo insuficiente");
			}
		}else {
			System.out.println("Imposs�vel sacar com a conta inativa");
		}

	}


	public void pagarMensalidade() {
		int v =0;
		if (tipo=="cc") {
			v = 12;
		}
		else if (tipo == "cp") {
			v =20;
		}
		if (status == true) {
			if(saldo > 0) {
				setSaldo(getSaldo() - v);
			}else {
				System.out.println("Imposs�vel pagar");
			}
		}
	}

}
