package model;
public abstract class Conta {
    protected double saldoDaConta;
    public Cliente cliente;
    
    public Conta(Cliente user){
       this.saldoDaConta = 0;
       this.cliente = user;
    }
    
    //getter
    public double getSaldoDaConta(){
        return this.saldoDaConta;
    }
    
    //métodos abstrato
    public abstract void fazerPix(double valor, Conta conta);
    
    public abstract void depositarNaConta(double valor, Conta conta);
    
    public void alterarSaldo(double valor){
        this.saldoDaConta += valor;
    }    
    
        
    
}
