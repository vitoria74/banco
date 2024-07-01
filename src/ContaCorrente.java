/**
 * Classe para lidar com a conta corrente. Herda a classe Conta.
 */

public class ContaCorrente extends Conta{

    /**
     * Construtor de ContaCorrente
     * @param cliente - Nome do titular
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    /**
     *  Método para imprimir as informações do extrato bancário da conta corrente
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirAtributos();
    }
}
