package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(findMaximum(5,4,3));
        System.out.println(findGreatestCommonDivisor(1095, 292));
        findPrimeNumbers(20);
        System.out.println(isPrimeNumber(11));
    }

    private static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    private static int findGreatestCommonDivisor(int x, int y) {
        int result = x;
        while (y != 0) {
            int rest = result % y;
            result = y;
            y = rest;
        }
        return result;
    }

    private static void findPrimeNumbers(int max) {
        HashMap<Integer, Boolean> numbers = new HashMap<>(){{
            for (int prim = 2; prim < max + 1; prim++) {
                put(prim, false);
            }
        }};

        for(int prim = 2; prim < max + 1; prim++) {
            if (!numbers.get(prim)) {
                System.out.println(prim);
                int i = prim + prim;
                while( i <= max) {
                    numbers.put(i, true);
                    i = i + prim;
                }
            }
        }
    }

    private static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        if (n == 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= n - 1) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        return isPrime;
    }
}
