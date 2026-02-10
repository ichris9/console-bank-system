package view;

import model.Conta;
import model.Cliente;
import service.ContaCorrente;

    public class ViewContaCorrente {
    
        public String viewToString(Cliente user, ContaCorrente cc){
            return "\n================="
                    +"nome: " + user.getNome()
                    +"cpf: "  + user.getCpf()
                    +"Saldo: "+ cc.getSaldoDaConta();
        }
        public void viewCC(Cliente user, ContaCorrente cc){
            System.out.println("\n=================="
                    + "\nnome: " + user.getNome()
                    + "\ncpf: " + user.getCpf()
                    + "\nsaldo: " + cc.getSaldoDaConta());
        }
        
        public void depositadoComSucesso(double valor, Conta conta){
            System.out.print("O valor de " + valor + " foi depositado na conta de: " + conta.cliente.getNome());
        }
}
