package br.com.munieri.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] numArray = sc.nextLine().split(" ");

        int sum = 0;
        for (String num : numArray){
            if (!num.equals("")) {
                sum += Long.parseLong(num);
            }
        }

        System.out.println(sum);
    }
}
