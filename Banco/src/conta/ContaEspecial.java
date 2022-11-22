package conta;
public class ContaEspecial extends ContaPadrao {
    private double limite;
    public ContaEspecial(int numero, String nomeTitular, String cpfTitular, double limite){
        super(numero, nomeTitular, cpfTitular);
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    @Override
    public boolean sacar(double valor){
        if(valor <= this.saldo + this.limite){
            this.saldo -= valor;
            return true;
        }
        else
            return false;
    }
    @Override
    public void getTipoConta(){
        System.out.println("Conta especial");
    }
}
