package com.local;

import java.util.Scanner;

public class Constantes {
    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a idade: ");
        Integer idade = scanner.nextInt();

        boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        if (podeTirarCarteira){
            System.out.println("Sim, ele(a) pode tirar carteira");
        } else{
            System.out.println("Não, ele(a) não pode tirar carteira");
        }
        scanner.close();

    }
}
