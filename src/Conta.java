public abstract class Conta implements InterfaceConta{ // tem que implementar os métodos da interface

    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1;

    protected int agencia; // protected pra ContaCorrente conseguir acessar
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; // controlar a contagem ao criar contas (conta 1, conta 2...)
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        
    }

    
}
