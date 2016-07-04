package br.com.munieri.algorithms.warmup;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class PlusMinus {

    public static void main(String[] args) {

        Map<String, Double> numbers = new LinkedHashMap();

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String[] line = sc.nextLine().split(" ");

        for (int i = 0; i < line.length; i++) {

            String type = "zeros";
            int number = Integer.parseInt(line[i]);

            if (number > 0) {
                type = "positive";
            } else if (number < 0) {
                type = "negative";
            }

            double count = numbers.getOrDefault(type, 0d);
            ++count;
            numbers.put(type, count);
        }

        for (Map.Entry<String, Double> entry : numbers.entrySet()) {
            if (entry.getKey().equals("positive")) {
                System.out.println(String.format("%.6f", entry.getValue() / size));
            } else if (entry.getKey().equals("negative")) {
                System.out.println(String.format("%.6f", entry.getValue() / size));
            } else if (entry.getKey().equals("zeros")) {
                System.out.println(String.format("%.6f", entry.getValue() / size));
            }
        }
    }
}
