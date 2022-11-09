package conta;
public class Executar {
    public static void main(String[] args) {
        ContaPadrao ContaPadrao;
        ContaPadrao = new ContaPoupanca(1,"test","1551");
        ContaPadrao.getTipoConta();
        ContaPadrao.depositar(100.0);
        boolean sacar = ContaPadrao.sacar(75.0);
        if(sacar)
            System.out.println("Saque efetuado.");
        else
            System.out.println("Saque não efetuado.");
        System.out.println(ContaPadrao.getSaldo());
    }
}
