package com.rocketseat.redirectUrlShortener;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner terinal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terinal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terinal.nextInt();

        try {
            Contador.contador(parametroUm, parametroDois);
        } catch (ParametrosInvaliddosException e) {
            System.out.println(e.getMessage());
        } finally {
            terinal.close();
        }

    }

}