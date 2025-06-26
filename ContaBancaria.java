package ListaCinco;

public class ContaBancaria {

	private String nome;
	private String numero;
	private double saldo;
	
	
	//Construtor padrao
	public ContaBancaria() {
	}
	
	//Construtor com parametros
	public ContaBancaria(String nome,String numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//Metodo get e set
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodo para sacar
		public void sacar(double valor) {
			if(valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque efetuado!");
		} else {
			System.out.println("Saldo insuficiente!");
			
			}
		}	

		//Metodo para depositar
		public void depositar(double valor) {
			if (valor > 0) {
				saldo += valor;
				System.out.println("Deposito efetuado!");
			}
			
		}
		
		//Metodo exibir informacoes
		public void exibirInfo() {
			System.out.println("Nome: " + nome);
			System.out.println("Conta: " + numero);
			System.out.println("Saldo: " + saldo);
			
		}
		
	}
