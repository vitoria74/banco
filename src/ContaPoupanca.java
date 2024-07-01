/**
 *Classe para lidar com a conta poupança. Herda a classe Conta.
 */

public class ContaPoupanca extends Conta{

    /**
     * Construtor da classe ContaPoupanca
     * @param cliente - Nome do titular
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    /**
     *  Método para imprimir as informações do extrato bancário da poupança
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANCA ===");
        super.imprimirAtributos();
    }
}

    
