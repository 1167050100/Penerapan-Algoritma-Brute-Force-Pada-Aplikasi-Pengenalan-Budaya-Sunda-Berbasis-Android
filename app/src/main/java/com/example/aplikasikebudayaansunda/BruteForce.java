package com.example.aplikasikebudayaansunda;

public class BruteForce {
    public static int check(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int b;

        //Searching
        for (int a = 0; a <= (n - m); a++) {
            b = 0;
            while ((b < m) && (text.charAt(a + b) == pattern.charAt(b))) {
                b++;
            }
            if (b == m)
                return a;} return -1; }}