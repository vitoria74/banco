public class Main {
    
    public static void main(String[] args) { // criando duas contas 

        Conta corrente = new ContaCorrente(); // polimorfismo: posso colocar como Conta, ContaCorrente, IConta....
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca();
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
