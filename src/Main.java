public class Main {
    
    public static void main(String[] args) {  

        Cliente vitoria = new Cliente();
        vitoria.setNome("Vitória");

        Conta corrente = new ContaCorrente(vitoria);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(vitoria);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
