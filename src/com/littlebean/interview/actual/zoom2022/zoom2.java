package com.littlebean.interview.actual.zoom2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zoom2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int q = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> NameMaps=new HashMap<>();
        Map<String, Integer> StuckMaps=new HashMap<>();
        int p = 0;
        int[] father = new int[q];
        int[] sum = new int[q];
        int[] count = new int[q];

        for (int qq = 0; qq < q; qq ++) {
            String s=scanner.nextLine();
            String[] ss=s.split(" ");

            if (ss[0].equals("1")) {
                if (!NameMaps.containsKey(ss[1])) {
                    NameMaps.put(ss[1], p++);
                }





            } else{

            }
        }
    }
}
