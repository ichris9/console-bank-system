package model;
public abstract class Conta {
    protected double saldoDaConta;
    
    public Conta(Usuario user){
        this.saldoDaConta = 0;
    }
    
    //getter
    public double getSaldoDaConta(){
        return this.saldoDaConta;
    }
    
    //métodos abstrato
    public abstract void fazerPix(double valor, Conta conta);
    
    
        
    
}
