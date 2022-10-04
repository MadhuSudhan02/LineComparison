package com.bridgelabz.line;

import java.util.Scanner;

public class EqualityTwoLine {
    public static void main(String[] args) {
        System.out.println("Enter the co-ordinates for line 1");
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, g, h;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        double line_1 = CalculateLength.lengthOfLine(a, b, c, d);
        System.out.println("Enter the co-ordinates for line 2");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        double line_2 = CalculateLength.lengthOfLine(a, b, c, d);
        String s1 = line_1 + "";
        String s2 = Double.toString(line_2);
        System.out.println(s1 + "\t" +s2);
        System.out.println(s1.equals(s2));
    }
}
