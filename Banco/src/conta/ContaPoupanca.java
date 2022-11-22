package conta;
public class ContaPoupanca extends ContaPadrao {
    public ContaPoupanca(int numero, String nomeTitular, String cpfTitular){
        super(numero, nomeTitular, cpfTitular);
    }
    public void reajustar(double percentual){
        saldo += saldo * percentual;
    }
    @Override
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void getTipoConta(){
        System.out.println("Conta pupança");
    }
}
