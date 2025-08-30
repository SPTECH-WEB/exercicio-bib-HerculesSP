package com.school.sptech;

public class main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Central", 2.5);
        Biblioteca b2 = new Biblioteca("Central2", 2.5);
        b1.registrarLivro(10);
        b1.transferir(b2, 4);
        System.out.println(b1.getQtdLivros()); // Saída esperada: 6
    }

}
