package conta;
public abstract class ContaPadrao {
    private Cliente titular;
    private int numero;
    protected double saldo;
    public ContaPadrao(int numero, String nomeTitular, String cpfTitular){
        this.numero = numero;
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo = 0;
    }
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getNumero(){
        return numero;
    }
    public void getTipoConta(){
        System.out.println("Conta padrão");
    }
}
