package com.SistemaBancario;

import model.Usuario;
import service.ContaCorrente;

public class Banco {

    public static void main(String[] args) {
        Usuario user = new Usuario("Christian","111.111-11");
        ContaCorrente cc = new ContaCorrente(user);
        
        
    }
}
