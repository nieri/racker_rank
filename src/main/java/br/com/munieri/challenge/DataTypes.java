package br.com.munieri.challenge;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");


        int inteiro = scan.nextInt();
        double decimal = scan.nextDouble();
        String frase = scan.next();

        System.out.println(i + inteiro);
        System.out.println(d + decimal);
        System.out.println(s + frase);

        scan.close();

    }
}
