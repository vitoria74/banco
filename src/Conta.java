import lombok.Data;

@Data

/**
 * Classe que implementa os métodos da Interface.
 */

public abstract class Conta implements InterfaceConta{ 

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia; 
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    /**
     * Construtor da classe Conta
     * @param cliente - Nome do titular
     */
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; 
        this.cliente = cliente;
    }

    /**
     * Método para depositar um valor na conta
     */
    @Override
    public void depositar(double valor) {
        saldo += valor;        
    }

    /**
     * Método para sacar um valor da conta
     */
    @Override
    public void sacar(double valor) {
        saldo -= valor;  
    }

    /*
     * Método para transferir um valor de uma conta para outra
     */
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);     
    }

    /**
     * Método para imprimir o nome do titular, número da agência, número da conta e o saldo
     */
    protected void imprimirAtributos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
