package view;

import model.Conta;
import model.Usuario;
import service.ContaCorrente;

    public class ViewContaCorrente {
    
        public String viewToString(Usuario user, ContaCorrente cc){
            return "\n================="
                    +"nome: " + user.getNome()
                    +"cpf: "  + user.getCpf()
                    +"Saldo: "+ cc.getSaldoDaConta();
        }
        public void viewCC(Usuario user, ContaCorrente cc){
            System.out.println("\n=================="
                    + "\nnome: " + user.getNome()
                    + "\ncpf: " + user.getCpf()
                    + "\nsaldo: " + cc.getSaldoDaConta());
        }
}
