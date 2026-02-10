package service;

import model.Conta;
import model.Cliente;
import view.ViewContaCorrente;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente user){
        super(user);
    }
    
    @Override
    public void fazerPix(double valor, Conta conta){
        if(saldoDaConta < valor || conta.equals(""))throw new RuntimeException("Saldo insuficiente ou usuário não existe");
            this.saldoDaConta -= valor;
            super.saldoDaConta += valor;
    }
    @Override
    public void depositarNaConta(double valor, Conta conta){
       if(valor < 0){
           throw new IllegalArgumentException("Valor invalido! insira um valor válido acima de 0!");
       }conta.alterarSaldo(valor);
        
        //view
        ViewContaCorrente view = new ViewContaCorrente();
        view.depositadoComSucesso(valor, conta);
    }
}
