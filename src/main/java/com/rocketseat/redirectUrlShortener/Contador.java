package com.rocketseat.redirectUrlShortener;

import java.util.Scanner;

public class Contador {
    public static void contador(int parametroUm, int parametroDois) throws ParametrosInvaliddosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvaliddosException("O primeiro parâmetro deve ser menor que o segundo");

        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
