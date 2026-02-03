package service;

import model.Conta;
import model.Usuario;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Usuario user){
        super(user);
    }
    
    @Override
    public void fazerPix(double valor, Conta conta){
        if(saldoDaConta < valor || conta.equals(""))throw new RuntimeException("Saldo insuficiente ou usuário não existe");
            this.saldoDaConta -= valor;
            super.saldoDaConta += valor;
            
        
    }
}
