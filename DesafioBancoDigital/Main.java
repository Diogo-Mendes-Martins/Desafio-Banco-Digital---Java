package DesafioBancoDigital;

public class Main {

    public static void main(String[] args) {
        Cliente Diogo = new Cliente();
        Diogo.setNome("Diogo");

        Conta cc = new ContaCorrente(Diogo);
        Conta poupanca = new ContaPoupanca(Diogo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
