package br.com.munieri.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        sc.nextLine();
        String[] numArray = sc.nextLine().split(" ");

        BigInteger sum = BigInteger.valueOf(0);
        for (String num : numArray){
            if (!num.equals("")) {
                sum = sum.add(new BigInteger(num));
            }
        }

        System.out.println(sum);
    }
}
