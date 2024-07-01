/**
 * Interface da classe Conta com os métodos que a Conta deve implementar
 */

public interface InterfaceConta { 

    /**
     * Método para sacar um valor da conta
     * @param valor - Valor a ser sacado da conta
     */
    void sacar(double valor);

    /**
     * Método para depositar um valor na conta
     * @param valor - Valor a ser depositado na conta
     */
    void depositar(double valor);

    /**
     * Método para transferir um valor de uma conta para outra
     * @param valor - Valor que será transferido
     * @param contaDestino - Conta que receberá o valor transferido
     */
    void transferir(double valor, Conta contaDestino);

    /**
     * Método para imprimir informações sobre o extrato bancário
     */
    void imprimirExtrato();
}
