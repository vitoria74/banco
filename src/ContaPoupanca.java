public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANCA ===");
        System.out.println(String.format("Agência: %d", super.agencia));
        System.out.println(String.format("Número: ", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}

    
