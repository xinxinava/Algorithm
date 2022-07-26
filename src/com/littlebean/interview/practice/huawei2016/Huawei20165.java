package com.littlebean.interview.practice.huawei2016;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Huawei20165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            Set<Character> set = new HashSet<>();
            StringBuilder ss = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i));
                    ss.append(s.charAt(i));
                }
            }
            System.out.println(ss.toString());
        }
    }
}
