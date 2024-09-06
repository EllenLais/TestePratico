package br.com.testepratico;

import java.util.Scanner;

public class InverterString {

    public static String inverter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra que você quer inverter: ");
        String str = scanner.next();
        System.out.println(inverter(str));


        scanner.close();
    }
}
