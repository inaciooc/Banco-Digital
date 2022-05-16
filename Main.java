public class Main {
    public static void main(String[] args) {
        Cliente inacio = new Cliente();
        inacio.setNome("Inacio de Oliveira");

        ContaCorrente cc = new ContaCorrente(inacio);
        Conta poupanca = new ContaPoupanca(inacio);

        cc.depositar(250);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
