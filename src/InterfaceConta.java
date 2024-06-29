public interface InterfaceConta { //todo método da interface é público, então não precisa do public
    
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
}
