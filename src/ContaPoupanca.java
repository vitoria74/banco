public class ContaPoupanca extends Conta{

    private static int SEQUENCIAL = 0; // tem relação com a classe ContaCorrente somente

    public ContaPoupanca(){
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++; // controlar a contagem ao criar contas (conta 1, conta 2...)
    }
}

    
