package view;

import model.Conta;
import java.util.Scanner;

public class ViewMain {
    public void primeiraViewMain(Conta conta){
        //instanciando scanner && atributos
        Scanner sc = new Scanner(System.in);
        int numLoginCadastro;
    
        System.out.println("\n+============================+");
        System.out.println("\nOla, " +conta.cliente.getNome());
        System.out.println("\n+============================+");
        System.out.println("");
        System.out.println("[O QUE DESEJA SR. ]" + conta.cliente.getNome());
        numLoginCadastro = sc.nextInt();
        sc.nextLine();
        
        switch(numLoginCadastro){
            case 1://Cadastro
                break;
             
            case 2://Login
                break;
        }
        sc.close();
    } 
}

