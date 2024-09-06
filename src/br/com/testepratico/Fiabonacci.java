package br.com.testepratico;

import java.util.Scanner;

public class Fiabonacci {
    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;

        if (num == 0 || num == 1) {
            return true;
        }

        while (b < num) {
            int prox = a + b;
            a = b;
            b = prox;
        }
        return b == num;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            System.out.print("Informe um número: ");
            int numeroInformado = scanner.nextInt();

            if (isFibonacci(numeroInformado)) {
                System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numeroInformado + " NÃO pertence à sequência de Fibonacci.");
            }
            scanner.close();
    }
}
